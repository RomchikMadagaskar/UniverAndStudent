package org.example.enums;

public enum StudyProfile {
    PHYSICS("Физика"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика"),
    MATHEMATICS("Математика");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}


