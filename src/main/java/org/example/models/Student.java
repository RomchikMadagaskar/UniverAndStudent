package org.example.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlElement(name="studentName")
    private String fullName;

    @XmlElement(name="universityId")
    private String universityID;

    @XmlTransient
    private int currentCourseNumber;

    @XmlElement(name="avgScore")
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
