package com.coenterprise.dao;

import com.coenterprise.entity.Protocol;

import java.util.List;

//public interface ProtocolDao extends AbstractDao<Protocol, String> {
//    void saveProtocol(Protocol protocol);
//    List<Protocol> findProtocols(String protocolName, Long protocolID);
//  Protocol findByName(String protocolName);
//
//}

public interface ProtocolDao {
	public void addProtocol(Protocol protocol);
	public void editProtocol(Protocol protocol);
	public Protocol getProtocol(int id);
	public void deleteProtocol(int id);
	public List <Protocol> getProtocols();
	public List <String> getName();
	public List <Integer> getId();
}
