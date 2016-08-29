package com.fis.dto;

public class UserDTO {
	private RoleDTO roleDTO;
	private String userid;
	private String password;
	
	public RoleDTO getRoleDTO() {
		return roleDTO;
	}
	public void setRoleDTO(RoleDTO roleDTO) {
		this.roleDTO = roleDTO;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [roleDTO=" + roleDTO + ", userid=" + userid + ", password=" + password + "]";
	}
	
	
	

}
