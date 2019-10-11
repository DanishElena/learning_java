package com.helena;

import java.util.ArrayList;
import java.util.List;


public class StudentArray {
    private List<Student> studentsList = new ArrayList<>();


    public void addStudent(Student a) {
        studentsList.add(a);
    }

    public void showFacultyStudents(String faculty) {
        System.out.println("Список студентов факультета " + faculty + ":");
        for (Student student : studentsList) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());
            }
        }
    }

    public void showGroupStudents(String group) {
        System.out.println("Список студентов группы " + group + ":");
        for (Student student : studentsList) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.toString());
            }
        }
    }

    public void yearOfBirthStudents(int year) {
        System.out.println("Список студентов, родившихся после " + year + " года:");
        for (Student student : studentsList) {
            if (student.getYearBirth() > (year)) {
                System.out.println(student.toString());
            }
        }
    }

    public void showFacultyCourse(String faculty, int course) {
        System.out.println("Список студентов факультета " + faculty + " курса " + course + ":");
        for (Student student : studentsList) {
            if (student.getCourse() == course && student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());
            }
        }
    }

    public void showStudentsBadRating() {
        System.out.println("Список студентов, имеющих неудовлетворительные оценки:");
        for (Student student : studentsList) {
            for (int i : student.getRating()) {
                if (i < 3) {
                    System.out.println(student.toString());
                    break;
                }
            }
        }
    }

    public int avarageRating(int[] rating) {
        int result = 0;
        for (int i : rating) {
            result += i;
        }
        return result / rating.length;
    }

    public void showHighRatingStudents(float average) {
        System.out.println("Список студентов, имеющих средний балл выше заданного:");
        for (Student student : studentsList) {
            if (avarageRating(student.getRating()) > average) {
                System.out.println(student.toString());
            }
        }
    }

    public int sum(int[] rating) {
        int result = 0;
        for (int i : rating) {
            result += i;
        }
        return result;
    }


    public void showNHighRatingStudents(int n) {
        System.out.println("Список " + n + " студентов, имеющих самую высокую сумму баллов:");
        for (int i = 0; i < studentsList.size() - 1; i++) {
            for (int j = 0; j < studentsList.size() - 1; j++) {
                if (sum(studentsList.get(i).getRating()) < sum(studentsList.get(j).getRating())) {
                    Student tmp = studentsList.get(i);
                    studentsList.set(i, studentsList.get(j));
                    studentsList.set(j, tmp);
                }
            }
        }

        for (int k = studentsList.size() - 1; k > n; k--) {
                System.out.println(studentsList.get(k).toString());
        }
    }
}

