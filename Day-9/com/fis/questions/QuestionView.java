package com.fis.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionView {
	static Scanner scanner = new Scanner(System.in);
	private QuestionOperations questionOperations = new QuestionOperations();
	public void addNewQuestion(){
		System.out.println("Enter the Question No");
		int questionNo = scanner.nextInt();
		System.out.println("Enter the Question ");
		scanner.nextLine();
		String question = scanner.nextLine();
		ArrayList<AnswerDTO> answerList = new ArrayList<>();
		for(int i =1 ; i<=4 ; i++){
		boolean isCorrectAns = false;
			System.out.println("Enter the Option"+i);
		String option = scanner.nextLine();
		System.out.println("Enter is it Correct Y/N");
		String isCorrect = scanner.nextLine();
		if(isCorrect.equalsIgnoreCase("Y")){
			isCorrectAns = true;
		}
		answerList.add(questionOperations.addOption(option, isCorrectAns));
		}
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setQno(questionNo);
		questionDTO.setName(question);
		questionDTO.setOptionList(answerList);
		questionOperations.addQuestion(questionDTO);
		
	}
	public void searchQuestion(){
		
	}
	public void deleteQuestion(){
		
	}
	public void print(){
		questionOperations.getList().forEach((question)->System.out.println(question));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuestionView view = new QuestionView();
		outer:
		while(true){
			System.out.println("1. Add New Question");
			System.out.println("2. Search Question");
			System.out.println("3. Delete Question");
			System.out.println("4. Print Questions");
			System.out.println("5. Exit");
			System.out.println("Enter the Choice ");
			int choice = scanner.nextInt();
			switch(choice){
			case 1:
				view.addNewQuestion();
				break;
			case 2:
				view.searchQuestion();
				break;
			case 3:
				view.deleteQuestion();
				break;
			case 4:
				view.print();
				break;
			case 5:
				System.out.println("Thanks for Using");
				break outer;
			default:
				System.out.println("Invalid Choice , Try Again");
			}
		}
	}

}
