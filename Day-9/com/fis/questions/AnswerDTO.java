package com.fis.questions;

public class AnswerDTO {
 private String option;
 private boolean isCorrect;
public String getOption() {
	return option;
}
public void setOption(String option) {
	this.option = option;
}
public boolean isCorrect() {
	return isCorrect;
}
public void setCorrect(boolean isCorrect) {
	this.isCorrect = isCorrect;
}
@Override
public String toString() {
	return "AnswerDTO [option=" + option + ", isCorrect=" + isCorrect + "]";
}
 
}
