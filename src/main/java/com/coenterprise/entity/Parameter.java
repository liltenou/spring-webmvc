package com.coenterprise.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "PARAMETER")
@Entity
public class Parameter {

	@Id
	// @GeneratedValue(generator = "UniqueIDGenProParam")
	// @SequenceGenerator(name = "UniqueIDGenProParam", sequenceName =
	// "ID_SEQ_PRO_PARAM", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name = "PROTOCOL_ID_FK", referencedColumnName="ID")
	private Protocol protocolIdFk;

	@OneToMany(mappedBy="parameterIdFk", fetch = FetchType.EAGER)
	private Set<ParameterValue> paramValues;
	
	public Set<ParameterValue> getParamValues() {
		return paramValues;
	}

	public void setParamValues(Set<ParameterValue> paramValues) {
		this.paramValues = paramValues;
	}

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


}