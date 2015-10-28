package com.uujob.mobile.controller.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="corporation_test")
public class Corporation {
	@Id
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name = "system-increment", strategy = "increment")
	private int id;
	@Column
	private String name;
	@Column 
	private String introduction;
	@Column
	private boolean beginRecruitment;
	@Column
	private Date deadLine;
	@Column
	private int RecruitmentStatus;
	@Column
	private String WebSiteLink;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public boolean isBeginRecruitment() {
		return beginRecruitment;
	}
	public void setBeginRecruitment(boolean beginRecruitment) {
		this.beginRecruitment = beginRecruitment;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public int getRecruitmentStatus() {
		return RecruitmentStatus;
	}
	public void setRecruitmentStatus(int recruitmentStatus) {
		RecruitmentStatus = recruitmentStatus;
	}
	public String getWebSiteLink() {
		return WebSiteLink;
	}
	public void setWebSiteLink(String webSiteLink) {
		WebSiteLink = webSiteLink;
	}
	
	
}
