package com.fis.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuestionOperations {
	private ArrayList<QuestionDTO> questionList;
	public QuestionOperations(){
		questionList = new ArrayList<>();
	}
	
	public void sortByName(){
		Collections.sort(questionList);  // this will use Comparable
	}
	
	public void sortById(){
//		Collections.sort(questionList, new Comparator<QuestionDTO>() {
//		public int compare(QuestionDTO first, QuestionDTO second){
//			return ((Integer)first.getQno()).compareTo((Integer)second.getQno());
//		}
//		});
		Collections.sort(questionList,(first,second)->((Integer)first.getQno()).compareTo((Integer)second.getQno()));
		//Collections.sort(questionList,new SortById());  // this will use Comparator
	}
	
	public boolean addQuestion(QuestionDTO questionDTO){
		boolean isAdded = false;
		//ArrayList<AnswerDTO> answer =new ArrayList<>();
		questionList.add(questionDTO);
		return isAdded;
	}
	public AnswerDTO addOption(String option , boolean isCorrect){
		AnswerDTO answerDTO = new AnswerDTO();
		answerDTO.setOption(option);
		answerDTO.setCorrect(isCorrect);
		return answerDTO;
		
	}
	public boolean deleteQuestion(int qno, String question){
		boolean isDeleted = false;
		int index = this.searchQuestion(qno, question);
		if(index>=0){
			questionList.remove(index);
			isDeleted = true;
		}
		return isDeleted;
	}
	public int searchQuestion(int qno, String question){
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setQno(qno);
		questionDTO.setName(question);
		int index = questionList.indexOf(questionDTO);
		return index;
	}
	public ArrayList<QuestionDTO> getList(){
		return questionList;
	}
	

}
