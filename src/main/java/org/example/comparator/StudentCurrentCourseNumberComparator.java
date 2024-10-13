package org.example.comparator;

import org.example.Models.Student;

public class StudentCurrentCourseNumberComparator implements StudentInerfaceComparator{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCurrentCourseNumber(),o2.getCurrentCourseNumber());
    }
}
