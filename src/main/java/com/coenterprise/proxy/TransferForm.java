package com.coenterprise.proxy;

import java.util.HashMap;
import java.util.Map;

public class TransferForm {
	
	private String producerName;
	private String consumerName;
	private String filename;
	private int protocolIdFk;
	private int producerIdFk;
	private int consumerIdFk;
	private int parameterIdFk;

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

	public int getProducerIdFk() {
		return producerIdFk;
	}

	public void setProducerIdFk(int producerIdFk) {
		this.producerIdFk = producerIdFk;
	}

	public int getConsumerIdFk() {
		return consumerIdFk;
	}

	public void setConsumerIdFk(int consumerIdFk) {
		this.consumerIdFk = consumerIdFk;
	}

	public int getParameterIdFk() {
		return parameterIdFk;
	}

	public void setParameterIdFk(int parameterIdFk) {
		this.parameterIdFk = parameterIdFk;
	}

	
	
	private Map<String, String> transferMap = new HashMap<String, String>();

	public Map<String, String> getTransferMap() {
		return transferMap;
	}

	public void setTransferMap(Map<String, String> transferMap) {
		this.transferMap = transferMap;
	}

}
