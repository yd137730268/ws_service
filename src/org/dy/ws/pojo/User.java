package org.dy.ws.pojo;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private Date birth;

	public User() {

	}

	public User(int id, String string, Date date) {
		this.id = id;
		this.name = string;
		this.birth = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof User && arg0 != null && this.name != null
				&& this.name.equals(((User) arg0).getName())) {
			return true;
		}
		return false;
	}

}
