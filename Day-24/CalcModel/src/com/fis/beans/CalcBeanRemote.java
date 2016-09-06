package com.fis.beans;

import javax.ejb.Remote;

@Remote
public interface CalcBeanRemote {
	
	public int add(int x, int y);

}
