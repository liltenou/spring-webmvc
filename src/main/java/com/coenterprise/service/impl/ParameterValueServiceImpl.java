package com.coenterprise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coenterprise.dao.ConsumerDao;
import com.coenterprise.dao.ParameterDao;
import com.coenterprise.dao.ParameterValueDao;
import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Parameter;
import com.coenterprise.entity.ParameterValue;
import com.coenterprise.entity.Protocol;
import com.coenterprise.proxy.ParameterProxy;
import com.coenterprise.proxy.TransferFormProxy;
import com.coenterprise.service.ParameterService;
import com.coenterprise.service.ParameterValueService;


@Service
@Transactional
public class ParameterValueServiceImpl implements ParameterValueService {
	@Autowired
	private ParameterDao parameterDao;

	@Autowired
	private ProtocolDao protocolDao;
	
	@Autowired
	private ParameterValueDao parameterValueDao;
	
	@Autowired
	private ConsumerDao consumerDao;

	@Transactional
	public void addParameterValue(ParameterProxy parameterProxy, TransferFormProxy transferForm) {

		Protocol protocol = protocolDao.getProtocol(parameterProxy
				.getProtocolIdFk());
		


		// if(protocol == null){
		// throw some exception
		// }

		ParameterValue parameterValue = new ParameterValue();
		parameterValue.setProtocolIdFk(protocol);
		parameterValue.setName(parameterProxy.getName());

		parameterValueDao.addParameterValue(parameterValue);
	}

	@Transactional
	public void editParameterValue(ParameterValue parameterValue) {
		parameterValueDao.editParameterValue(parameterValue);
	}

	@Transactional
	public ParameterValue getParameterValue(int id) {
		return parameterValueDao.getParameterValue(id);
	}

	@Transactional
	public void deleteParameterValue(int id) {
		parameterValueDao.deleteParameterValue(id);
	}

	@Transactional
	public List<ParameterValue> getParameterValues() {
		return parameterValueDao.getParameterValues();
	}

	public List<ParameterValue> getParametersValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public ParameterValue addParameterValue(ParameterValue parameterValue) {
		return parameterValueDao.addParameterValue(parameterValue);
		
	}
}
