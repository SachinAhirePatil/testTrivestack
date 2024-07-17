package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getCretedAt() {
		return CretedAt;
	}
	public void setCretedAt(String cretedAt) {
		CretedAt = cretedAt;
	}
	private String Title;
	private String Content;
	private String CretedAt;
}
