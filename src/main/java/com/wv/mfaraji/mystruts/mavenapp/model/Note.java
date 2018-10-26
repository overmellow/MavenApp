package com.wv.mfaraji.mystruts.mavenapp.model;

public class Note {
	private int Id;
	private String title;
	
	public Note() {}
	
	public Note(int id, String title) {
		Id = id;
		this.title = title;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Note [Id=" + Id + ", title=" + title + "]";
	}		
}
