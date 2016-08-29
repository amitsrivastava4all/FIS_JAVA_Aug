package com.fis.dto;

import java.util.ArrayList;

public class RoleDTO {
	
	private int roleId;
	private String roleName;
	private ArrayList<RightDTO> rightList;
	
	
	
	public ArrayList<RightDTO> getRightList() {
		return rightList;
	}
	public void setRightList(ArrayList<RightDTO> rightList) {
		this.rightList = rightList;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "RoleDTO [roleId=" + roleId + ", roleName=" + roleName + ", rightList=" + rightList + "]";
	}
	

}
