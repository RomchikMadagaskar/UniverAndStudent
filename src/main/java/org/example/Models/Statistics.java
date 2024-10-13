package org.example.Models;

import org.example.enums.StudyProfile;

public class Statistics {

    private StudyProfile profile;
    private double avgExamScore;
    private int totalStudProf;
    private int totalUniverProf;
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
