package com.yu.test.domain;

import com.yu.test.annotation.Supper;

@Supper
public class SupperUser extends User{
    private String addres;

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "SupperUser{" +
                "addres='" + addres + '\'' +
                "} " + super.toString();
    }
}
