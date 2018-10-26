package com.wv.mfaraji.mystruts.mavenapp.dao;

import java.util.HashMap;
import java.util.Map;

import com.wv.mfaraji.mystruts.mavenapp.model.Note;

public class NoteDao {
	//create an object of SingleObject
	private static NoteDao instance = new NoteDao();

    //make the constructor private so that this class cannot be
    //instantiated
    private NoteDao(){
		this.notes = new HashMap<>();
		this.notes.put(1, new Note(1, "shopping"));
		this.notes.put(2, new Note(2, "buying"));
		this.notes.put(3, new Note(3, "playing"));
    }

    //Get the only object available
    public static NoteDao getInstance(){
       return instance;
    }
	   
	private Map<Integer, Note> notes;
	
	public Map<Integer, Note> getNotes() {
		return this.notes;
	}
	
	public void addNote(Note note) {
		this.notes.put(note.getId(), note);
	}

}
