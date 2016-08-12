package com.fis.questions;

import java.util.ArrayList;
import java.util.Comparator;

class SortById implements Comparator<QuestionDTO>{
	@Override
	public int compare(QuestionDTO first , QuestionDTO second){
		Integer firstQuesNo = first.getQno(); // AutoBoxing
		// INternally it is convert Primitive into Wrapper (Java 5)
		Integer secondQuesNo = second.getQno();
		return firstQuesNo.compareTo(secondQuesNo);
		//return ((Integer)first.getQno()).compareTo((Integer)second.getQno());
	}
}
public class QuestionDTO implements Comparable<QuestionDTO> {
	private int qno;
	private String name;
	private String desc;
	private ArrayList<AnswerDTO> optionList;
	
//	@Override
//	public int compareTo(Object o ){
//		QuestionDTO questionDTO = (QuestionDTO)o;
//		return this.name.compareTo(questionDTO.name);
//	}
	@Override
	public int compareTo(QuestionDTO questionDTO ){
		// Ascii Order
		//return this.name.compareTo(questionDTO.name); // Asc Order
		//return this.name.compareToIgnoreCase(questionDTO.name);
		return questionDTO.name.compareToIgnoreCase(this.name); // Desc Order
	}
	
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
	public boolean equals(Object o){
		boolean isMatch = false;
		if(o instanceof QuestionDTO){
			QuestionDTO questionDTO = (QuestionDTO)o;  // Downcasting
			if(this==questionDTO){
				isMatch = true;
			}
			else
				{
				if(this.qno == questionDTO.qno 
						&& this.name.equals(questionDTO.name)){
					isMatch=true;
				}
			}
		}
		return isMatch;
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
