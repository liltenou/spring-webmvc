package com.coenterprise.dao;

import com.coenterprise.entity.Consumer;

import java.util.List;


public interface ConsumerDao {
	public void addConsumer(Consumer consumer);

	public void editConsumer(Consumer consumer);

	public Consumer getConsumer(int id);

	public void deleteConsumer(int id);

	public List<Consumer> getConsumers();

	public List<String> getName();

	public List<Integer> getId();


}
