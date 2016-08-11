package com.fis.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionView {
	static Scanner scanner = new Scanner(System.in);
	private QuestionOperations questionOperations = new QuestionOperations();
	
	public void sortByQno(){
		
		
		
	}
	
	public void sortByQname(){
		questionOperations.sortByName();
		System.out.println("After Sort By Name ");
		this.print();
	}
	
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
		System.out.println("Enter the Question NO to Search");
		int qno = scanner.nextInt();
		System.out.println("Enter the Question Name to Search");
		scanner.nextLine();
		String question = scanner.nextLine();
		int index = questionOperations.searchQuestion(qno, question);
		System.out.println(index>=0?"Found":"Not Found");
	}
	public void deleteQuestion(){
		System.out.println("Enter the Question NO to Delete");
		int qno = scanner.nextInt();
		System.out.println("Enter the Question Name to Delete");
		scanner.nextLine();
		String question = scanner.nextLine();
		boolean isDeleted = questionOperations.deleteQuestion(qno, question);
		System.out.println(isDeleted?"Record Deleted...":"Record Not Deleted , Not Found...");
		this.print();
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
			System.out.println("5. Sort By Qno");
			System.out.println("6. Sort by Qname");
			System.out.println("7. Exit");
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
				view.sortByQno();
				break;
			case 6:
				view.sortByQname();
				break;
			case 7:
				System.out.println("Thanks for Using");
				break outer;
			default:
				System.out.println("Invalid Choice , Try Again");
			}
		}
	}

}
