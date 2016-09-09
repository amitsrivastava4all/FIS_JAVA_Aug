package com.srivastava.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.srivastava.ws.domainobject.Person;
import com.srivastava.ws.vo.PersonVO;

@WebService
public class PersonWebService {
	@WebMethod
	public PersonVO getPersons(){
		PersonHelper ph = new PersonHelper();
		return ph.preparePerson();
	}

}
