package com.coenterprise.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coenterprise.dao.ParameterValueDao;
import com.coenterprise.entity.ParameterValue;
import com.coenterprise.proxy.TransferFormProxy;

@Repository
public class ParameterValueDaoImpl implements ParameterValueDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public ParameterValue addParameterValue(ParameterValue parameterValue) {
		int id = (Integer) getCurrentSession().save(parameterValue);
		parameterValue.setId(id);
		return parameterValue;
	}

	public void editParameterValue(ParameterValue parameterValue) {
		ParameterValue parameterValueToUpdate = getParameterValue(parameterValue
				.getId());
		parameterValueToUpdate.setName(parameterValue.getName());
		parameterValueToUpdate
				.setConsumerIdFk(parameterValue.getConsumerIdFk());
		parameterValueToUpdate.setParameterIdFk(parameterValue
				.getParameterIdFk());
		getCurrentSession().update(parameterValueToUpdate);
	}

	public ParameterValue getParameterValue(int id) {
		ParameterValue parameterValue = (ParameterValue) getCurrentSession()
				.get(ParameterValue.class, id);
		return parameterValue;
	}

	public void deleteParameterValue(int id) {
		ParameterValue parameterValue = getParameterValue(id);
		if (parameterValue != null)
			getCurrentSession().delete(parameterValue);
	}

	@SuppressWarnings("unchecked")
	public List<ParameterValue> getParameterValues() {
		return getCurrentSession().createQuery("from ParameterValue").list();

	}

	public List<String> getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addParameterValue(TransferFormProxy parameterValue) {
		// TODO Auto-generated method stub

	}
}