package com.coenterprise.dao;

import com.coenterprise.entity.ParameterValue;
import com.coenterprise.proxy.TransferFormProxy;

import java.util.List;

//public interface ParameterValueDao extends AbstractDao<ParameterValue, String> {
//    void saveParameterValue(ParameterValue parameterValue);
//    List<ParameterValue> findParameterValues(String parameterValueName, Long parameterValueID);
//  ParameterValue findByName(String parameterValueName);
//
//}

public interface ParameterValueDao {
	public ParameterValue addParameterValue(ParameterValue parameterValue);

	public void addParameterValue(TransferFormProxy parameterValue);

	public void editParameterValue(ParameterValue parameterValue);

	public ParameterValue getParameterValue(int id);

	public void deleteParameterValue(int id);

	public List<ParameterValue> getParameterValues();

	public List<String> getName();

	public List<Integer> getId();
}
