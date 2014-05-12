package com.coenterprise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coenterprise.dao.ParameterDao;
import com.coenterprise.dao.ProducerDao;
import com.coenterprise.dao.ProtocolDao;
import com.coenterprise.entity.Producer;
import com.coenterprise.proxy.ParameterProxy;
import com.coenterprise.proxy.TransferFormProxy;
import com.coenterprise.service.ProducerService;


@Service
@Transactional
public class ProducerServiceImpl implements ProducerService {
	@Autowired
	private ParameterDao parameterDao;

	@Autowired
	private ProtocolDao protocolDao;
	
	@Autowired
	private ProducerDao producerDao;

	@Transactional
	public Producer addProducer(TransferFormProxy transferFormProxy) {


		// if(producer == null){
		// throw some exception
		// }

		Producer producer = new Producer();
		producer.setName(transferFormProxy.getProducerName());
		producer.setFilename(transferFormProxy.getFilename());

		producerDao.addProducer(producer);
		
		return producer;
	}

	@Transactional
	public void editProducer(Producer producer) {
		producerDao.editProducer(producer);
	}

	@Transactional
	public Producer getProducer(int id) {
		return producerDao.getProducer(id);
	}

	@Transactional
	public void deleteProducer(int id) {
		producerDao.deleteProducer(id);
	}

	@Transactional
	public List<Producer> getProducers() {
		return producerDao.getProducers();
	}

	public void addProducer(ParameterProxy producer) {
		// TODO Auto-generated method stub
		
	}

	public List<Producer> getParametersValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
