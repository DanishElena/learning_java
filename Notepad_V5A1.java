package com.helena;

//Создать класс Notepad с внутренним классом или классами,
// с помощью объектов которого могут храниться несколько записей на одну дату.
import java.util.ArrayList;
import java.util.List;

public class Notepad_V5A1 {
    private int id;
    private String noteText;
    private String noteDate;

    public Notepad_V5A1(int id, String noteText, String noteDate) {
        this.id = id;
        this.noteDate = noteDate;
        this.noteText = noteText;

        setId(id);
        setNoteDate(noteDate);
        setNoteText(noteText);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(String noteDate) {
        this.noteDate = noteDate;
    }

    public String toString() {
        return id + ") " + noteText;
    }

    public static class NotesArray {
        private List<Notepad_V5A1> notesList = new ArrayList<>();


        public void addNotes(Notepad_V5A1 a) {
            notesList.add(a);
        }

        public void showNotes(String noteDate) {
            System.out.println("Список заметок за дату " + noteDate + ":");
            for (Notepad_V5A1 note : notesList) {
                if (note.getNoteDate() == noteDate) {
                    System.out.println(note.toString());
                }
            }
        }
    }

}
