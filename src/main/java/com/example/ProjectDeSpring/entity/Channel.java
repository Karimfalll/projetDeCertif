package com.example.ProjectDeSpring.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "channel")
public class Channel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idchannel;
	private int iduser;
	private String name;
	private Date date;
	
	
	public Channel() {
		super();
		
	}


	public Channel(int idchannel, int iduser, String name, Date date) {
		super();
		this.idchannel = idchannel;
		this.iduser = iduser;
		this.name = name;
		this.date = date;
	}


	public int getIdchannel() {
		return idchannel;
	}


	public void setIdchannel(int idchannel) {
		this.idchannel = idchannel;
	}


	public int getIduser() {
		return iduser;
	}


	public void setIduser(int iduser) {
		this.iduser = iduser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
