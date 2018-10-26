package com.wv.mfaraji.mystruts.mavenapp.service;

import java.util.Map;


import com.wv.mfaraji.mystruts.mavenapp.dao.NoteDao;

import com.wv.mfaraji.mystruts.mavenapp.model.Note;

public class NoteService{
	//create an object of SingleObject
	private static NoteService instance = new NoteService();
	private Map<Integer, Note> notes;
	private NoteDao noteDao;	
	
	private NoteService() {
		this.noteDao = NoteDao.getInstance();
		this.notes = this.noteDao.getNotes();
	}
	
    //Get the only object available
    public static NoteService getInstance(){
       return instance;
    }
	
	public Map<Integer, Note> getNotes(){
		return this.notes;
	}
	
	public Note getNote(int id) {
		return this.notes.get(id);
	}
	
	public void addNote(Note note) {
		this.noteDao.addNote(note);
	}


}
