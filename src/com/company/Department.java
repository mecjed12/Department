package com.company;

public class Department {
    String Abteilung = "";


    public Department(String departmerts) {
        this.Abteilung = departmerts;
    }

    @Override
    public String toString() {
        return Abteilung;
    }
}
