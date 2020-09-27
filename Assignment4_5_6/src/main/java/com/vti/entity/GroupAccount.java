package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "GroupAccount", catalog = "TestingSystem")
public class GroupAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@MapsId("GroupID")
	@JoinColumn(name = "GroupID")
	private Group group;

	@ManyToOne
	@MapsId("AccountID")
	@JoinColumn(name = "AccountID")
	private Account account;

	@Column(name = "JoinDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date joinDate;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public GroupAccount() {
	}

}
