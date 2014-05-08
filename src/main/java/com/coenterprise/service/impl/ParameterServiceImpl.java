package com.coenterprise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coenterprise.dao.ParameterDao;
import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Parameter;
import com.coenterprise.entity.Protocol;
import com.coenterprise.proxy.ParameterProxy;
import com.coenterprise.service.ParameterService;

//@Service("parameterService")
//@Transactional(readOnly = true)
//public class ParameterServiceImpl implements ParameterService {
//
//    @Autowired
//    private ParameterDao parameterDao;
//
//    @Override
//    public Parameter findByParameterName(String parameterName) {
//        return parameterDao.findByName(parameterName);
//    }
//
//    @Override
//    @Transactional(readOnly = false)
//    public void saveParameter(Parameter parameter) {
//        parameterDao.saveParameter(parameter);
//    }
//
//    @Override
//    @Transactional(readOnly = false)
//    public void deleteParameter(String parameterName) {
////        Parameter parameter = parameterDao.findById(parameterName);
//    	 Parameter parameter = parameterDao.findByName(parameterName);
//        if (parameter != null) {
//            parameterDao.delete(parameter);
//        }
//    }
//
//    @Override
//    public List<Parameter> findParameters(String parameter, Long parameterID) {
//        return parameterDao.findParameters(parameter, parameterID);
//    }
//
//}


@Service
@Transactional
public class ParameterServiceImpl implements ParameterService {
	@Autowired
	private ParameterDao parameterDao;
	
	@Autowired
	private ProtocolDao protocolDao;
	
	public void addParameter(ParameterProxy parameterProxy){
		
		Protocol protocol = protocolDao.getProtocol(parameterProxy.getProtocolIdFk());
		
//		if(protocol == null){
//			throw some exception
//		}
		
		Parameter parameter = new Parameter();
		parameter.setProtocolIdFk(protocol);
		parameter.setName(parameterProxy.getName());
		
		parameterDao.addParameter(parameter);
	}
	public void editParameter(Parameter parameter) {
		parameterDao.editParameter(parameter);
	}
	public Parameter getParameter(int id) {
		return parameterDao.getParameter(id);		
	}
	public void deleteParameter(int id) {
		parameterDao.deleteParameter(id);
	}
	public List <Parameter>getParameters() {
		return parameterDao.getParameters();
	}
}
