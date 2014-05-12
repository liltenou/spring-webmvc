package com.coenterprise.dao;

import com.coenterprise.entity.Producer;

import java.util.List;

//public interface ProducerDao extends AbstractDao<Producer, String> {
//    void saveProducer(Producer producer);
//    List<Producer> findProducers(String producerName, Long producerID);
//  Producer findByName(String producerName);
//
//}

public interface ProducerDao {
	public Producer addProducer(Producer producer);

	public void editProducer(Producer producer);

	public Producer getProducer(int id);

	public void deleteProducer(int id);

	public List<Producer> getProducers();

	public List<String> getName();

	public List<Integer> getId();
}
