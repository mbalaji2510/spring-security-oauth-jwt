package com.infosys.springsecurity.oauth.jwt.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "role")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2450645244065374588L;
	
	@Id
	private String id;
	private String roleId;
	private String roleName;
	
	public Role() {
		
	}

	/**
	 * @param id
	 * @param roleId
	 * @param roleName
	 */
	public Role(String id, String roleId, String roleName) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.roleName = roleName;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleId=" + roleId + ", roleName=" + roleName + "]";
	}

}
