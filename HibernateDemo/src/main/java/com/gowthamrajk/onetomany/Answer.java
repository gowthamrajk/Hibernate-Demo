package com.gowthamrajk.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "answerid")
	private int answerId;
	
	@Column(name = "answerdescription")
	private String answerDescription;
	
	@Column(name = "postedby")
	private String postedBy;

	public Answer() { }
	
	public Answer(String answerDescription, String postedBy) {
		this.answerDescription = answerDescription;
		this.postedBy = postedBy;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswerDescription() {
		return answerDescription;
	}

	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	@Override
	public String toString() {
		
		return "Answer Details => Answer ID : " + answerId + ", Description : " + answerDescription 
				+ ", Posted By : " + postedBy;
	}
}