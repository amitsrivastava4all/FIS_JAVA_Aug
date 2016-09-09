package com.srivastava.ws.vo;

import java.util.ArrayList;
import java.util.List;

import com.srivastava.ws.domainobject.Person;

public class PersonVO {
	private List<Person> person = new ArrayList<Person>();

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PersonVO [person=" + person + "]";
	}
	
}
