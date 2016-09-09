package com.srivastava.ws;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.srivastava.ws.domainobject.Person;
import com.srivastava.ws.vo.PersonVO;

public class PersonHelper {
	public PersonVO preparePerson(){
		PersonVO pv = new PersonVO();
		List<Person> personList = new ArrayList<Person>();
		Person p = new Person();
		p.setName("Amit");
		p.setAge(25);
		Calendar cal = Calendar.getInstance();
	    cal.set(1990, 1, 9); 
	    p.setDob(cal.getTime());
	    p.setAddress("India");
	    personList.add(p);
	    p = new Person();
		p.setName("Mike");
		p.setAge(23);
		cal = Calendar.getInstance();
	    cal.set(1992, 11, 29); 
	    p.setDob(cal.getTime());
	    p.setAddress("USA");
	    personList.add(p);
	    p = new Person();
		p.setName("Tom");
		p.setAge(23);
		cal = Calendar.getInstance();
	    cal.set(1992, 11, 29); 
	    p.setDob(cal.getTime());
	    p.setAddress("UK");
	    personList.add(p);
	    p = new Person();
		p.setName("John");
		p.setAge(23);
		cal = Calendar.getInstance();
	    cal.set(1992, 11, 29); 
	    p.setDob(cal.getTime());
	    p.setAddress("USA");
	    personList.add(p);
	     pv.setPerson(personList);
	     return pv;
	    
		
	}

}
