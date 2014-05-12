package com.coenterprise.service;

import java.util.List;

import com.coenterprise.entity.ParameterValue;
import com.coenterprise.proxy.TransferFormProxy;


public interface ParameterValueService {
	public ParameterValue addParameterValue(ParameterValue parameterValue);
	public void editParameterValue(ParameterValue parameterValue);
	public ParameterValue getParameterValue(int id);
	public void deleteParameterValue(int id);
	public List <ParameterValue>getParametersValue();
}
