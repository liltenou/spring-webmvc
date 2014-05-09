package com.coenterprise.service;

import java.util.List;

import com.coenterprise.entity.Protocol;


public interface ProtocolService {

	public void addProtocol(Protocol protocol);
	public void editProtocol(Protocol protocol);
	public Protocol getProtocol(int id);
	public void deleteProtocol(int id);
	public List <Protocol> getProtocols();
	public List <String> getName();
	public List <Integer> getId();
	public List<Protocol> findAllProtocolName(String searchTerm);


}