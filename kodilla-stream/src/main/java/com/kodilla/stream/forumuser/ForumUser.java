package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postNumber;

    public ForumUser(int idNumber, String username, char sex, LocalDate birthDate, int postNumber) {
        this.idNumber = idNumber;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postNumber = postNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{ " +
                "idNumber= " + idNumber +
                ", username='" + username + '\'' +
                ", sex= " + sex +
                ", birthDate= " + birthDate +
                ", postNumber= " + postNumber +
                '}';
    }
}
