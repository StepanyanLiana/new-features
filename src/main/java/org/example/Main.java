package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Thread t = new Thread(() -> System.out.println("hello"));
        t.start();

        Student man = new Student("Mane");
        Student lia = new Student("Lia");
        List<Student> students = List.of(man, lia);
      //  students.sort(Comparator.comparing(o -> o.name));

        // List<Student> result = new ArrayList<>();
        // for (Student student : students) {
        //  if (student.name.contains("a")) {
        // result.add(student); }

        List<Student> a = students.stream()
                .filter(student -> student.name.contains("a"))
                .toList();

        students.forEach(System.out::println);


        var student = new Student("asd");
        var i = 1;
        var s = 'a';

    }

    public static class Student {
        public String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
