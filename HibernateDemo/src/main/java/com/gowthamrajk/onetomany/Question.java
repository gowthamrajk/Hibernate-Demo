package com.gowthamrajk.onetomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "questionid")
	private int questionId;
	
	@Column(name = "questionname")
	private String questionName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "questionid")
	private List<Answer> answers = new ArrayList<>();

	public Question() { }
	
	public Question(String questionName) {
		this.questionName = questionName;
	}

	public int getId() {
		return questionId;
	}

	public void setId(int questionId) {
		this.questionId = questionId;
	}

	public String getQname() {
		return questionName;
	}

	public void setQname(String questionName) {
		this.questionName = questionName;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}


	@Override
	public String toString() {
		
		return "Question Details => Question ID : " + questionId + ", Question Name : " + questionName 
				+ "\nList of answers : \n" + answers;
	}
}