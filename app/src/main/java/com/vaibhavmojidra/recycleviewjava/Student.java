package com.vaibhavmojidra.recycleviewjava;

public class Student {
    private String Name;
    private int RollNo;

    public Student(String name, int rollNo) {
        Name = name;
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }
}
