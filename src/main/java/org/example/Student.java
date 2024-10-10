package org.example;

public class Student {
    private String fullName;
    private String universityID;
    private int currentCourseNumber;
    private float avgExamScore;

    public String getFullName() {
        return fullName;
    }

    public String getUniversityID() {
        return universityID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public Student() {
    }
    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", universityID='" + universityID + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }
}
