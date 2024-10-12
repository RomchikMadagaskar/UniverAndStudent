package org.example.comparator;

import org.example.Student;

public class StudentAvgExamScoreComparator implements StudentInerfaceComparator{
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getAvgExamScore(),o2.getAvgExamScore());
    }
}
