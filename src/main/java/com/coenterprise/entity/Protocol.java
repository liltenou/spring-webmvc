package com.coenterprise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
import java.util.Set;

@Table(name = "PROTOCOL")
@Entity
public class Protocol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "PROTOCOL")
	private String protocol;

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "protocolIdFk", fetch = FetchType.EAGER)
	private Set<Parameter> parameters;

	public Set<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(Set<Parameter> parameters) {
		this.parameters = parameters;
	}

	@OneToMany(mappedBy = "protocolIdFk", fetch = FetchType.EAGER)
	private Set<Consumer> consumers;

	public Set<Consumer> getConsumers() {
		return consumers;
	}

	public void setConsumers(Set<Consumer> consumers) {
		this.consumers = consumers;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
