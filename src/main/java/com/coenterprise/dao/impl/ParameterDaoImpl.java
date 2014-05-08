package com.coenterprise.dao.impl;

import com.coenterprise.dao.ParameterDao;
import com.coenterprise.entity.Parameter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public class ParameterDaoImpl extends AbstractDaoImpl<Parameter, String> implements ParameterService {
//
//    protected ParameterDaoImpl() {
//        super(Parameter.class);
//    }
//
//    @Override
//    public void saveParameter(Parameter parameter) {
//        saveOrUpdate(parameter);
//    }
//
//    @Override
//    public List<Parameter> findParameters(String parameterName, Long parameterID) {
//        return findByCriteria(Restrictions.like("parameterName", parameterName, MatchMode.START));
//    }
//
//	@Override
//	public Parameter findbyName(String name) {
//        return (Parameter) findByCriteria(Restrictions.like("name", name, MatchMode.START));
//	}
//} 

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
		Parameter parameterToUpdate = getParameter(parameter.getId());
		parameterToUpdate.setName(parameter.getName());
		parameterToUpdate.setProtocolIdFk(parameter.getProtocolIdFk());
		getCurrentSession().update(parameterToUpdate);
	}

	public Parameter getParameter(int id){
		Parameter parameter = (Parameter) getCurrentSession().get(Parameter.class, id);
		return parameter;
	}
	
	public void deleteParameter(int id){
		Parameter parameter = getParameter(id);
		if (parameter != null) getCurrentSession().delete(parameter);
	}
	
	@SuppressWarnings("unchecked")
	public List <Parameter> getParameters() {
		return getCurrentSession().createQuery("from Parameter").list();

	}
}