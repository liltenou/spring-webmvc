package com.coenterprise.dao.impl;

import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Protocol;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public class ProtocolDaoImpl extends AbstractDaoImpl<Protocol, String> implements ProtocolDao {
//
//    protected ProtocolDaoImpl() {
//        super(Protocol.class);
//    }
//
//    @Override
//    public void saveProtocol(Protocol protocol) {
//        saveOrUpdate(protocol);
//    }
//
//    @Override
//    public List<Protocol> findProtocols(String protocolName, Long protocolID) {
//        return findByCriteria(Restrictions.like("protocolName", protocolName, MatchMode.START));
//    }
//
//	@Override
//	public Protocol findbyName(String name) {
//        return (Protocol) findByCriteria(Restrictions.like("name", name, MatchMode.START));
//	}
//} 

@Repository
public class ProtocolDaoImpl implements ProtocolDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
    private Session getCurrentSession() {
    	return sessionFactory.getCurrentSession();
    }
    
	public void addProtocol(Protocol protocol) {
		getCurrentSession().save(protocol);
	}
	
	public void editProtocol(Protocol protocol) {
		Protocol protocolToUpdate = getProtocol(protocol.getId());
		protocolToUpdate.setName(protocol.getName());
		protocolToUpdate.setProtocol(protocol.getProtocol());
		getCurrentSession().update(protocolToUpdate);
	}

	public Protocol getProtocol(int id){
		Protocol protocol = (Protocol) getCurrentSession().get(Protocol.class, id);
		return protocol;
	}
	
	public void deleteProtocol(int id){
		Protocol protocol = getProtocol(id);
		if (protocol != null) getCurrentSession().delete(protocol);
	}
	
	@SuppressWarnings("unchecked")
	public List  getProtocols() {
		return getCurrentSession().createQuery("from Protocol").list();

	}
	
	@SuppressWarnings("unchecked")
	public List<String> getName() {
		return getCurrentSession().createQuery("select name from Protocol").list();
	}

//	public List<Protocol> getName(String protocols) {
//		// TODO Auto-generated method stub
//		return getCurrentSession().createQuery("from Protocol").list();
//	}
}