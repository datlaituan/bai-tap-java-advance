package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Question", catalog = "TestingSystem")
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "QuestionID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int questionId;

	@Column(name = "Content")
	private String content;

	@ManyToOne
	@JoinColumn(name = "CategoryID")
	private CategoryQuestion categoryQuestion;

	@ManyToOne
	@JoinColumn(name = "TypeID")
	private TypeQuestion typeQuestion;

	@OneToOne
	@JoinColumn(name = "CreatorID")
	private Account account;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public TypeQuestion getTypeQuestion() {
		return typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Question() {
	}

}
