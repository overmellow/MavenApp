package com.wv.mfaraji.mystruts.mavenapp.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.wv.mfaraji.mystruts.mavenapp.model.Note;
import com.wv.mfaraji.mystruts.mavenapp.service.NoteService;

public class NoteAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private NoteService noteService;
	private Map<Integer, Note> notes;
	private Note newNote;
		
	public NoteAction() {
		this.noteService = NoteService.getInstance();
		this.setNewNote(new Note());
	}

	public String getAllNotes() {
		setNotes(this.noteService.getNotes());
        return SUCCESS;
    }
	
	public String getNote() {
		setNotes(this.noteService.getNotes());			
        return SUCCESS;
    }
	
	public String createNewNote() {
		this.noteService.addNote(this.newNote);
        return SUCCESS;
    }
	
	public NoteService getNoteService() {
		return noteService;
	}

	public void setNoteService(NoteService noteService) {
		this.noteService = noteService;
	}

	public Map<Integer, Note> getNotes() {
		return this.notes;
	}

	public void setNotes(Map<Integer, Note> notes) {
		this.notes = notes;
	}

	public Note getNewNote() {
		return newNote;
	}

	public void setNewNote(Note newNote) {
		this.newNote = newNote;
	}	
}
