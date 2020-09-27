package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Exam", catalog = "TestingSystem")
public class Exam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ExamID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int examId;

	@Column(name = "Code")
	private String code;

	@Column(name = "Title")
	private String title;

	@JoinColumn(name = "CategoryID")
	@ManyToOne
	private CategoryQuestion categoryQuestion;

	@JoinColumn(name = "CreatorID")
	@ManyToOne
	private Account account;

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Exam() {
	}

}
