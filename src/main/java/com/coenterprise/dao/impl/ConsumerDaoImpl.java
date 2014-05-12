package com.coenterprise.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coenterprise.dao.ConsumerDao;
import com.coenterprise.entity.Consumer;

@Repository
public class ConsumerDaoImpl implements ConsumerDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addConsumer(Consumer consumer) {
		getCurrentSession().save(consumer);
	}

	public void editConsumer(Consumer consumer) {
		// Consumer consumerToUpdate = getConsumer(consumer.getId());
		// consumerToUpdate.setName(consumer.getName());
		// consumerToUpdate.setProtocolIdFk(consumer.getProtocolIdFk());
		// consumerToUpdate.setProducerIdFk(consumer.getProducerIdFk());
		// getCurrentSession().update(consumerToUpdate);
		getCurrentSession().update(consumer);
	}

	public Consumer getConsumer(int id) {
		Consumer consumer = (Consumer) getCurrentSession().get(Consumer.class,
				id);
		return consumer;
	}

	public void deleteConsumer(int id) {
		Consumer consumer = getConsumer(id);
		if (consumer != null)
			getCurrentSession().delete(consumer);
	}

	@SuppressWarnings("unchecked")
	public List<Consumer> getConsumers() {
		return getCurrentSession().createQuery("from Consumer").list();

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