package com.coenterprise.dao.impl;

import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Protocol;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProtocolDaoImpl extends AbstractDaoImpl<Protocol, String> implements ProtocolDao {

    protected ProtocolDaoImpl() {
        super(Protocol.class);
    }

    @Override
    public void saveProtocol(Protocol protocol) {
        saveOrUpdate(protocol);
    }

    @Override
    public List<Protocol> findProtocols(String protocolName) {
        return findByCriteria(Restrictions.like("protocolName", protocolName, MatchMode.START));
    }
}
