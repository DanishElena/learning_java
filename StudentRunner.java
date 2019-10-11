package com.helena;

//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных
//и вывести эти данные на консоль.

//1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

//Создать массив объектов.
// a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы

// 4. Задача с абитуриентами

// a) список абитуриентов, имеющих неудовлетворительные оценки;
//b) список абитуриентов, у которых сумма баллов выше заданной;
//c) выбрать заданное число n абитуриентов, имеющих самую высокую
//сумму баллов

public class StudentRunner {
    public static void main(String[] args)  {

        Student Elena = new Student(342, "Елена", "Викторовна", "Крутикова", 1993, "Шатрова 29-40", "8-982-123-45-67", "ЭТФ", 2, "ТК-15", new int[] { 4, 5, 5, 5, 5 });
        Student Maria = new Student(123, "Мария", "Юрьевна", "Бердникова", 1993, "Пушкарская 109-83", "8-982-123-34-34", "АДФ", 4, "АД-11", new int[] { 5, 5, 4, 3, 5 });
        Student Mikhail = new Student(102, "Михаил", "Владимирович", "Талыпов", 1987, "Качканарская 45-55", "8-982-983-20-04", "ЭТФ", 4, "AT-11", new int[] { 2, 4, 4, 3, 5 });
        Student Dmitry = new Student(54, "Дмитрий", "Алексанлрович", "Стариков", 1991, "Дедюкина 20-820", "8-982-345-34-23", "МТФ", 1, "М-09", new int[] { 3, 4, 4, 3, 5 });
        Student Margarita = new Student(156, "Маргарита", "Олеговна", "Якимова", 1993, "Мира 9-32", "8-982-323-38-98", "МТФ", 3, "М-07", new int[] { 3, 4, 2, 3, 5 });
        Student Anton = new Student(234, "Антон", "Андреевич", "Акинфиев", 1992, "Попова 23-432", "8-982-345-31-43", "АДФ", 4, "АД-11", new int[] { 4, 5, 4, 5, 5 });
        Student Julia = new Student(293, "Юлия", "Витальевна", "Жакова", 1993, "Нытвенская 39-45", "8-983-233-45-21", "МТФ", 3, "М-12", new int[] { 5, 5, 5, 5, 5 });

        StudentArray students=new StudentArray();
        students.addStudent(Elena);
        students.addStudent(Maria);
        students.addStudent(Mikhail);
        students.addStudent(Dmitry);
        students.addStudent(Margarita);
        students.addStudent(Anton);
        students.addStudent(Julia);
        students.showFacultyStudents("ЭТФ"); //студенты заданного факультета
        students.showGroupStudents("АД-11"); //студенты учебной группы
        students.yearOfBirthStudents(1992); //студенты, родившеся после заданного года;
        students.showFacultyCourse("ЭТФ",2); //списки студентов для каждого факультета и курса;
        students.showStudentsBadRating();
        students.showHighRatingStudents(3.5f);
        students.showNHighRatingStudents(3);
    }
}

