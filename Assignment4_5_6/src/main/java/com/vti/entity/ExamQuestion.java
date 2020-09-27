package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "ExamQuestion", catalog = "TestingSystem")
public class ExamQuestion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@MapsId
	@JoinColumn(name = "ExamID")
	@ManyToOne
	private Exam exam;

	@MapsId
	@JoinColumn(name = "QuestionID")
	@ManyToOne
	private Question question;
}
