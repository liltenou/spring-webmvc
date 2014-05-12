package com.coenterprise.dao;

import com.coenterprise.entity.Parameter;

import java.util.List;
import java.util.Set;


public interface ParameterDao {
	public void addParameter(Parameter parameter);

	public void editParameter(Parameter parameter);

	public Parameter getParameter(int id);

	public void deleteParameter(int id);

	public Set<Parameter> getParameters();
}
