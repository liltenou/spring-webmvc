package com.coenterprise.service;

import com.coenterprise.entity.Protocol;

import java.util.List;

//public interface ProtocolService {
//
//    Protocol findByProtocolName(String protocolName);
//    void saveProtocol(Protocol protocol);
//    void deleteProtocol(String protocolName);
//    List<Protocol> findProtocols(String protocol, Long protocolID);
//}

public interface ProtocolService {

	public void addProtocol(Protocol protocol);
	public void editProtocol(Protocol protocol);
	public Protocol getProtocol(int id);
	public void deleteProtocol(int id);
	public List <Protocol> getProtocols();
	public List <String> getName();
	public List <Integer> getId();
}