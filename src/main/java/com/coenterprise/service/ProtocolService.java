package com.coenterprise.service;

import com.coenterprise.entity.Protocol;

import java.util.List;

public interface ProtocolService {

    Protocol findByProtocolName(String protocolName);
    void saveProtocol(Protocol user);
    void deleteProtocol(String userName);
    List<Protocol> findProtocols(String protocol);
}
