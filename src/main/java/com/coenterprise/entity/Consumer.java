package com.coenterprise.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.persistence.DiscriminatorType;
//import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Table(name = "CONSUMER")
@Entity
public class Consumer {

	// @GeneratedValue(generator = "UniqueIDGenConsumer")
	// @SequenceGenerator(name = "UniqueIDGenConsumer", sequenceName =
	// "ID_SEQ_CONSUMER", allocationSize = 1)
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "PROTOCOL_ID_FK", referencedColumnName = "ID")
	private Protocol protocolIdFk;

	@ManyToOne
	@JoinColumn(name = "PRODUCER_ID_FK", referencedColumnName = "ID")
	private Producer producerIdFk;

	@OneToMany(mappedBy = "consumerIdFk", fetch = FetchType.EAGER)
	private Set<ParameterValue> paramValues;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Protocol getProtocolIdFk() {
		return protocolIdFk;
	}

	public void setProtocolIdFk(Protocol protocolIdFk) {
		this.protocolIdFk = protocolIdFk;
	}

	public Producer getProducerIdFk() {
		return producerIdFk;
	}

	public void setProducerIdFk(Producer producerIdFk) {
		this.producerIdFk = producerIdFk;
	}

	public Set<ParameterValue> getParamValues() {
		return paramValues;
	}

	public void setParamValues(Set<ParameterValue> paramValues) {
		this.paramValues = paramValues;
	}

}
