package com.google.intentpractise;

import java.io.Serializable;

public class Employee implements Serializable {

    private String id, name, adress, salary, job;

    public Employee(String id, String name, String adress, String salary, String job) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
