package com.coenterprise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name = "PARAMETER_VALUE")
@Entity
public class ParameterValue {

	
//	@GeneratedValue(generator = "UniqueIDGenParamValue")
//	@SequenceGenerator(name = "UniqueIDGenParamValue", sequenceName = "ID_SEQ_PARAM_VALUE", allocationSize = 1)
	@Id @Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="NAME") private String name;
	
	@ManyToOne @JoinColumn(name = "CONSUMER_ID_FK", referencedColumnName="ID")
	private Consumer consumerIdFk;
	@ManyToOne @JoinColumn(name = "PARAMETER_ID_FK", referencedColumnName="ID")
	private Parameter parameterIdFk;
	
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
	public Consumer getConsumerIdFk() {
		return consumerIdFk;
	}
	public void setConsumerIdFk(Consumer consumerIdFk) {
		this.consumerIdFk = consumerIdFk;
	}
	public Parameter getParameterIdFk() {
		return parameterIdFk;
	}
	public void setParameterIdFk(Parameter parameterIdFk) {
		this.parameterIdFk = parameterIdFk;
	}
	
	

}