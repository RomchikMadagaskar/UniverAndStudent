package org.example;


public class RunApp {
    public static void main(String[] args) {
        University university=new University();
        university.setId("VUZ-01");
        university.setFullName("PTU N67 g. Igevsk");
        university.setShortName("PTU");
        university.setYearOfFoundation(1951);
        university.setMainProfile(StudyProfile.PROGRAMMING);

        System.out.println(university);

        Student student=new Student();
        student.setAvgExamScore(5);
        student.setCurrentCourseNumber(4);
        student.setFullName("Mask Ilon Bedrosovich");
        student.setUniversityID("M2000");
        System.out.println(student);
    }
}