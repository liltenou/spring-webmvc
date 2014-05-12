package com.coenterprise.proxy;

import com.coenterprise.entity.Protocol;

public class TransferFormProxy {

	private String producerName;
	private String consumerName;
	private String filename;
	private int protocolIdFk;
	private int consumerIdFk;
	private int producerIdFk;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getProtocolIdFk() {
		return protocolIdFk;
	}

	public void setProtocolIdFk(int protocolIdFk) {
		this.protocolIdFk = protocolIdFk;
	}

	public int getConsumerIdFk() {
		return consumerIdFk;
	}

	public void setConsumerIdFk(int consumerIdFk) {
		this.consumerIdFk = consumerIdFk;
	}

	public int getProducerIdFk() {
		return producerIdFk;
	}

	public void setProducerIdFk(int producerIdFk) {
		this.producerIdFk = producerIdFk;
	}

}
