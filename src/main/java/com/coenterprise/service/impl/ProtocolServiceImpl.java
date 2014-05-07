package com.coenterprise.service.impl;

import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Protocol;
import com.coenterprise.service.ProtocolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service("protocolService")
//@Transactional(readOnly = true)
//public class ProtocolServiceImpl implements ProtocolService {
//
//    @Autowired
//    private ProtocolDao protocolDao;
//
//    @Override
//    public Protocol findByProtocolName(String protocolName) {
//        return protocolDao.findByName(protocolName);
//    }
//
//    @Override
//    @Transactional(readOnly = false)
//    public void saveProtocol(Protocol protocol) {
//        protocolDao.saveProtocol(protocol);
//    }
//
//    @Override
//    @Transactional(readOnly = false)
//    public void deleteProtocol(String protocolName) {
////        Protocol protocol = protocolDao.findById(protocolName);
//    	 Protocol protocol = protocolDao.findByName(protocolName);
//        if (protocol != null) {
//            protocolDao.delete(protocol);
//        }
//    }
//
//    @Override
//    public List<Protocol> findProtocols(String protocol, Long protocolID) {
//        return protocolDao.findProtocols(protocol, protocolID);
//    }
//
//}


@Service
@Transactional
public class ProtocolServiceImpl implements ProtocolService {
	@Autowired
	private ProtocolDao protocolDao;
	
	public void addProtocol(Protocol protocol){
		protocolDao.addProtocol(protocol);
	}
	public void editProtocol(Protocol protocol) {
		protocolDao.editProtocol(protocol);
	}
	public Protocol getProtocol(int id) {
		return protocolDao.getProtocol(id);		
	}
	public void deleteProtocol(int id) {
		protocolDao.deleteProtocol(id);
	}
	public List getProtocols() {
		return protocolDao.getProtocols();
	}
	public List <String> getName() {
		return protocolDao.getName();
	}
}
