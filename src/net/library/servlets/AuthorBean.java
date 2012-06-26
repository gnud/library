package net.library.servlets;

import java.io.Serializable;

public class AuthorBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6963385627836976868L;
	private String id = "";
	private String name = "";
	private String surename = "";
	private String fullname = "";
	private String author_id = "";
	

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void setSurename(String surename) {
		this.surename = surename; 
	}

	public String getSurename() {
		return surename; 
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return String.format("%s %s", this.name, this.surename);
	}

	/**
	 * Doesn't do anything
	 * @param fullname the fullname to set
	 */
	protected void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param author_id the author_id to set
	 */
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	/**
	 * @return the author_id
	 */
	public String getAuthor_id() {
		return author_id;
	}
	
	
}
