package com.coenterprise.dao;

import com.coenterprise.entity.Parameter;

import java.util.List;

//public interface ParameterService extends AbstractDao<Parameter, String> {
//    void saveParameter(Parameter parameter);
//    List<Parameter> findParameters(String parameterName, Long parameterID);
//  Parameter findByName(String parameterName);
//
//}

public interface ParameterDao {
	public void addParameter(Parameter parameter);
	public void editParameter(Parameter parameter);
	public Parameter getParameter(int id);
	public void deleteParameter(int id);
	public List <Parameter>getParameters();
}
