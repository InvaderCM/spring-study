package com.spring.aop;

import java.util.List;

public class Boss {
    private String name;
    private String company;
    private List<Car> car;
    private List<String> hobbies;

    public Boss(String name, String company, List<Car> car, List<String> hobbies) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.hobbies = hobbies;
    }

    public Boss() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", car=" + car +
                ", hobbies=" + hobbies +
                '}';
    }
}
