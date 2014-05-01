package com.coenterprise.dao;

import com.coenterprise.entity.Protocol;

import java.util.List;

public interface ProtocolDao extends AbstractDao<Protocol, String> {
    void saveProtocol(Protocol protocol);
    List<Protocol> findProtocols(String ProtocolName);
}
