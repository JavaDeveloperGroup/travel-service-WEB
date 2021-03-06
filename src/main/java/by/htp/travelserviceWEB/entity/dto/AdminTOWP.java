package by.htp.travelserviceWEB.entity.dto;

import java.io.Serializable;

import by.htp.travelserviceWEB.entity.Entity;
import by.htp.travelserviceWEB.entity.User;


public class AdminTOWP implements Entity, Serializable, User {
	
	private static final long serialVersionUID = -6191394259691941922L;
	
	private Integer adminId;
	private String login;
	private Integer roleId;
	
	public AdminTOWP() {}
	
	public AdminTOWP(Integer adminId, String login, Integer roleId) {
		this.adminId = adminId;
		this.login = login;
		this.roleId = roleId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "AdminTOWP [adminId=" + adminId + ", login=" + login + ", roleId=" + roleId + "]";
	}
	
	
}
