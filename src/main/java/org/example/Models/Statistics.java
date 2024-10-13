package org.example.Models;

public class Statistics {

    private String trainingProfile;
    private double avgExamScore;
    private int totalStudProf;
    private int totalUniverProf;
    private String univerName;

    public Statistics() {
    }

    public String getTrainingProfile() {
        return trainingProfile;
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

    public void setTrainingProfile(String trainingProfile) {
        this.trainingProfile = trainingProfile;
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
