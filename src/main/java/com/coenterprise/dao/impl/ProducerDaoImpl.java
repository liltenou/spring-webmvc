package com.coenterprise.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coenterprise.dao.ProducerDao;
import com.coenterprise.entity.Producer;

@Repository
public class ProducerDaoImpl implements ProducerDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public Producer addProducer(Producer producer) {
		
		int id = (Integer) getCurrentSession().save(producer);
		producer.setId(id);
		return producer;
	}

	
	public void editProducer(Producer producer) {
		Producer producerToUpdate = getProducer(producer.getId());
		producerToUpdate.setName(producer.getName());
		producerToUpdate.setFilename(producer.getFilename());
		getCurrentSession().update(producerToUpdate);
	}

	public Producer getProducer(int id) {
		Producer producer = (Producer) getCurrentSession().get(Producer.class,
				id);
		return producer;
	}

	public void deleteProducer(int id) {
		Producer producer = getProducer(id);
		if (producer != null)
			getCurrentSession().delete(producer);
	}

	@SuppressWarnings("unchecked")
	public List<Producer> getProducers() {
		return getCurrentSession().createQuery("from Producer").list();

	}

	public List<String> getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getId() {
		// TODO Auto-generated method stub
		return null;
	}
}