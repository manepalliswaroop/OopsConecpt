package com.epam.onboarding.mentoring.corejava;

import java.util.Objects;

public class Student {

    private int sno;
    private String name;
    private String college;

    public Student(int sno, String name, String college) {
        this.sno = sno;
        this.name = name;
        this.college = college;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getSno() == student.getSno() && Objects.equals(getName(), student.getName()) && Objects.equals(getCollege(), student.getCollege());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSno(), getName(), getCollege());
    }
}
