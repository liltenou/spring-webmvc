package com.coenterprise.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.persistence.DiscriminatorType;
//import javax.persistence.DiscriminatorValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Table(name = "CONSUMER")
@Entity
public class Consumer {


	// @GeneratedValue(generator = "UniqueIDGenConsumer")
	// @SequenceGenerator(name = "UniqueIDGenConsumer", sequenceName =
	// "ID_SEQ_CONSUMER", allocationSize = 1)
	@Id	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NAME") private String name;

	@ManyToOne @JoinColumn(name = "PROTOCOL_ID_FK", referencedColumnName="ID")
	private Protocol protocolIdFk;
	
	@ManyToOne @JoinColumn(name = "PROCUDER_ID_FK", referencedColumnName="ID")
	private Producer producerIdFk;

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
}
