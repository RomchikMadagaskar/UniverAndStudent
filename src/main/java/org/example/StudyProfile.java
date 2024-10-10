package org.example;

public enum StudyProfile {
    MEDICINE("Медицина"),
    MANAGMENT("Менеджмент"),
    PROGRAMMING("Программирование"),
    PHILOLOGY("Филология");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}


