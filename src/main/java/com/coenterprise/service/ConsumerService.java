package com.coenterprise.service;

import java.util.List;

import com.coenterprise.entity.Consumer;
import com.coenterprise.entity.Producer;
import com.coenterprise.proxy.TransferFormProxy;


public interface ConsumerService {
	public void addConsumer(TransferFormProxy consumer, Producer producer);
	public void editConsumer(TransferFormProxy consumer);
	public Consumer getConsumer(int id);
	public void deleteConsumer(int id);
	public List <Consumer> getConsumers();
}
