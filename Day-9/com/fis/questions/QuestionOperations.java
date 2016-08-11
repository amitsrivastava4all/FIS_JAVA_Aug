package com.fis.questions;

import java.util.ArrayList;

public class QuestionOperations {
	private ArrayList<QuestionDTO> questionList;
	public QuestionOperations(){
		questionList = new ArrayList<>();
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
	public boolean deleteQuestion(QuestionDTO questionDTO){
		boolean isDeleted = false;
		int index = this.searchQuestion(questionDTO);
		if(index>=0){
			questionList.remove(index);
			isDeleted = true;
		}
		return isDeleted;
	}
	public int searchQuestion(QuestionDTO questionDTO){
		int index = questionList.indexOf(questionDTO);
		return index;
	}
	public ArrayList<QuestionDTO> getList(){
		return questionList;
	}
	

}
