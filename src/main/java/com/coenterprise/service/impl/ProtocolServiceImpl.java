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
	@Transactional
	public void addProtocol(Protocol protocol) {
		protocolDao.addProtocol(protocol);
	}
	@Transactional
	public void editProtocol(Protocol protocol) {
		protocolDao.editProtocol(protocol);
	}
	@Transactional
	public Protocol getProtocol(int id) {
		return protocolDao.getProtocol(id);
	}
	@Transactional
	public void deleteProtocol(int id) {
		protocolDao.deleteProtocol(id);
	}
	@Transactional
	public List <Protocol> getProtocols() {
		return protocolDao.getProtocols();
	}
	@Transactional
	public List<String> getName() {
		return protocolDao.getName();
	}
	@Transactional
	public List<Integer> getId() {
		return protocolDao.getId();
	}
	@Transactional
	public List<Protocol> findAllProtocolName(String searchTerm) {
		return protocolDao.findAllProtocolName(searchTerm);
	}

}
