package org.example.models;

import org.example.enums.StudyProfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics {

    @XmlElement(name="universityProfile")
    private StudyProfile profile;

    @XmlElement(name="avgScore")
    private double avgExamScore;

    @XmlTransient
    private int totalStudProf;

    @XmlTransient
    private int totalUniverProf;

    @XmlTransient
    private String univerName;

    public Statistics() {
    }

    public StudyProfile getProfile() {
        return profile;
    }

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public int getTotalStudProf() {
        return totalStudProf;
    }

    public int getTotalUniverProf() {
        return totalUniverProf;
    }

    public String getUniverName() {
        return univerName;
    }
    //
    public void setProfile(StudyProfile profile) {
        this.profile = profile;
    }

    public void setAvgExamScore(double avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public void setTotalStudProf(int totalStudProf) {
        this.totalStudProf = totalStudProf;
    }

    public void setTotalUniverProf(int totalUniverProf) {
        this.totalUniverProf = totalUniverProf;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }
}
