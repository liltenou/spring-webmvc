package com.coenterprise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coenterprise.dao.ConsumerDao;
import com.coenterprise.dao.ParameterDao;
import com.coenterprise.dao.ProducerDao;
import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Consumer;
import com.coenterprise.entity.Producer;
import com.coenterprise.entity.Protocol;
import com.coenterprise.proxy.ParameterProxy;
import com.coenterprise.proxy.TransferFormProxy;
import com.coenterprise.service.ConsumerService;

@Service
@Transactional
public class ConsumerServiceImpl implements ConsumerService {
	@Autowired
	private ParameterDao parameterDao;

	@Autowired
	private ProtocolDao protocolDao;

	@Autowired
	private ConsumerDao consumerDao;

	@Autowired
	private ProducerDao producerDao;

	@Transactional
	public void addConsumer(TransferFormProxy transferProxy, Producer producer) {

		Protocol protocol = protocolDao.getProtocol(transferProxy
				.getProtocolIdFk());
//		Producer producer = producerDao.getProducer(transferProxy
//				.getProducerIdFk());

		// if(protocol == null){
		// throw some exception
		// }

		Consumer consumer = new Consumer();
		consumer.setProtocolIdFk(protocol);
		consumer.setProducerIdFk(producer);
		consumer.setName(transferProxy.getConsumerName());

		consumerDao.addConsumer(consumer);
	}

//	@Transactional
//	public void editConsumer(Consumer consumer) {
//		consumerDao.editConsumer(consumer);
//	}
	
	@Transactional
	public void editConsumer(TransferFormProxy proxy) {
		Consumer consumer = consumerDao.getConsumer(proxy.getId());
		consumer.setName(proxy.getConsumerName());
		consumerDao.editConsumer(consumer);
	}

	@Transactional
	public Consumer getConsumer(int id) {
		return consumerDao.getConsumer(id);
	}

	@Transactional
	public void deleteConsumer(int id) {
		consumerDao.deleteConsumer(id);
	}

	@Transactional
	public List<Consumer> getConsumers() {
		return consumerDao.getConsumers();
	}

	public List<Consumer> getParametersValue() {
		// TODO Auto-generated method stub
		return null;
	}


}
