package com.coenterprise.proxy;

public class ParameterProxy {

	private int id;

	private int protocolIdFk;

	private String name;

	private String protocolName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProtocolName() {
		return protocolName;

	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public int getProtocolIdFk() {
		return protocolIdFk;
	}

	public void setProtocolIdFk(int protocolIdFk) {
		this.protocolIdFk = protocolIdFk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
