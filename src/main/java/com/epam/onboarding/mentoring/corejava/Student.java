package com.epam.onboarding.mentoring.corejava;

import java.util.Objects;

public class Student {

    private int Sno;
    private String Name;
    private String college;

    public Student(int sno, String name, String college) {
        Sno = sno;
        Name = name;
        this.college = college;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
