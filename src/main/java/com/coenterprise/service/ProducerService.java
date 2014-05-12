package com.coenterprise.service;

import java.util.List;

import com.coenterprise.entity.Producer;
import com.coenterprise.proxy.TransferFormProxy;


public interface ProducerService {
	public Producer addProducer(TransferFormProxy producer);
	public void editProducer(Producer producer);
	public Producer getProducer(int id);
	public void deleteProducer(int id);
	public List <Producer>getParametersValue();
}
