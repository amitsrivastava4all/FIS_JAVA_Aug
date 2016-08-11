package com.fis.questions;

import java.util.ArrayList;

public class QuestionDTO {
	private int qno;
	private String name;
	private String desc;
	private ArrayList<AnswerDTO> optionList;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public ArrayList<AnswerDTO> getOptionList() {
		return optionList;
	}
	public void setOptionList(ArrayList<AnswerDTO> optionList) {
		this.optionList = optionList;
	}
	@Override
	public String toString() {
		return "QuestionDTO [qno=" + qno + ", name=" + name + ", desc=" + desc + ", optionList=" + optionList + "]\n";
	}
	
//	private String option1;
//	private String option2;
//	private String option3;
//	private String option4;
	//private String rightAns;
}
