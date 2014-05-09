package org.wf.score.account.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.wf.core.dao.entity.BaseEntity;

@Entity
@Table(name = "user", catalog = "account")
public class User extends BaseEntity implements Serializable  {

	private static final long serialVersionUID = 3117962409520767344L;
	
	private String name;
	
	private String code;
	
	private String salt;
	
	private String password;
	
	private Boolean isDisabled;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

}
