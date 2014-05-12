package com.coenterprise.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coenterprise.dao.ParameterDao;
import com.coenterprise.entity.Parameter;

@Repository
public class ParameterDaoImpl implements ParameterDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addParameter(Parameter parameter) {
		getCurrentSession().save(parameter);
	}

	public void editParameter(Parameter parameter) {
		// Parameter parameterToUpdate = getParameter(parameter.getId());
		// parameterToUpdate.setName(parameter.getName());
		// parameterToUpdate.setProtocolIdFk(parameter.getProtocolIdFk());
		getCurrentSession().update(parameter);
	}

	public Parameter getParameter(int id) {
		Parameter parameter = (Parameter) getCurrentSession().get(
				Parameter.class, id);
		return parameter;
	}

	public void deleteParameter(int id) {
		Parameter parameter = getParameter(id);
		if (parameter != null)
			getCurrentSession().delete(parameter);
	}

	@SuppressWarnings("unchecked")
	public Set<Parameter> getParameters() {
		return (Set<Parameter>) getCurrentSession().createQuery("from Parameter").list();

	}
}