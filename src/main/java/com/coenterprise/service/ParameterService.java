package com.coenterprise.service;

import java.util.List;
import java.util.Set;

import com.coenterprise.entity.Parameter;
import com.coenterprise.proxy.ParameterProxy;

public interface ParameterService {
	public void addParameter(ParameterProxy parameter);

	public void editParameter(ParameterProxy parameter);

	public Parameter getParameter(int id);

	public void deleteParameter(int id);

	public Set<Parameter> getParameters();

	public List<String> getName();
}
