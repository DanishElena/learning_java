package com.helena;

public class NotesRunner {
    public static void main(String[] args)  {

    Notepad_V5A1 note1 = new Notepad_V5A1(342, "Сходить в магазин", "20.10.2019");
    Notepad_V5A1 note2 = new Notepad_V5A1(123, "Позвонить родственникам", "10.10.2019");
    Notepad_V5A1 note3 = new Notepad_V5A1(102, "Съездить в центр", "20.10.2019");
    Notepad_V5A1 note4 = new Notepad_V5A1(54, "Выбрать подарки", "10.10.2019");
    Notepad_V5A1 note5 = new Notepad_V5A1(156, "Проверить почтовый ящик", "20.10.2019");
    Notepad_V5A1 note6 = new Notepad_V5A1(234, "Приготовить поесть", "21.10.2019");
    Notepad_V5A1 note7 = new Notepad_V5A1(293, "Сходить на танцы", "05.10.2019");

        Notepad_V5A1.NotesArray notes = new Notepad_V5A1.NotesArray();
    notes.addNotes(note1);
    notes.addNotes(note2);
    notes.addNotes(note3);
    notes.addNotes(note4);
    notes.addNotes(note5);
    notes.addNotes(note6);
    notes.addNotes(note7);

    notes.showNotes("20.10.2019");
    notes.showNotes("10.10.2019");
    notes.showNotes("21.10.2019");
    notes.showNotes("05.10.2019");
}
}

