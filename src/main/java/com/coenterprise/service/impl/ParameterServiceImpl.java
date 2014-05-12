package com.coenterprise.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coenterprise.dao.ParameterDao;
import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Parameter;
import com.coenterprise.entity.Protocol;
import com.coenterprise.proxy.ParameterProxy;
import com.coenterprise.service.ParameterService;


@Service
@Transactional
public class ParameterServiceImpl implements ParameterService {
	@Autowired
	private ParameterDao parameterDao;

	@Autowired
	private ProtocolDao protocolDao;

	@Transactional
	public void addParameter(ParameterProxy parameterProxy) {

		Protocol protocol = protocolDao.getProtocol(parameterProxy
				.getProtocolIdFk());
		

		// if(protocol == null){
		// throw some exception
		// }

		Parameter parameter = new Parameter();
		parameter.setProtocolIdFk(protocol);
		parameter.setName(parameterProxy.getName());

		parameterDao.addParameter(parameter);
	}

	@Transactional
	public void editParameter(ParameterProxy proxy) {
		Parameter parameter = parameterDao.getParameter(proxy.getId());
		parameter.setName(proxy.getName());
		parameterDao.editParameter(parameter);
	}

	@Transactional
	public Parameter getParameter(int id) {
		return parameterDao.getParameter(id);
	}

	@Transactional
	public void deleteParameter(int id) {
		parameterDao.deleteParameter(id);
	}

	@Transactional
	public Set<Parameter> getParameters() {
		return parameterDao.getParameters();
	}

	public List<String> getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
