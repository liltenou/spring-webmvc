package com.coenterprise.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name = "PRODUCER")
@Entity
public class Producer {
	
//	@GeneratedValue(generator = "UniqueIDGenProducer")
//	@SequenceGenerator(name = "UniqueIDGenProducer", sequenceName = "ID_SEQ_PRODUCER", allocationSize = 1)
	@Id @Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name="NAME")private String name;
	
	@Column(name="FILENAME")private String filename;
	
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
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}


	
}