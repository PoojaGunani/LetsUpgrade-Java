package com.employee;

public class Main {

    public static void main(String[] args) {
        prentclass[] pc = new prentclass[3];
        for (int i = 0; i < 3; i++) {
            pc[i] = new prentclass();
            pc[i].getDetails();
            pc[i].DisplayDetails();
        }
    }
}
