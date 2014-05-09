package com.coenterprise.service;

import java.util.List;

import com.coenterprise.entity.Parameter;
import com.coenterprise.proxy.ParameterProxy;

//public interface ParameterService extends AbstractDao<Parameter, String> {
//    void saveParameter(Parameter parameter);
//    List<Parameter> findParameters(String parameterName, Long parameterID);
//  Parameter findByName(String parameterName);
//
//}

public interface ParameterService {
	public void addParameter(ParameterProxy parameter);
	public void editParameter(ParameterProxy parameter);
	public Parameter getParameter(int id);
	public void deleteParameter(int id);
	public List <Parameter>getParameters();
	public List<String> getName();
}
