/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rehdon.slc;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class marksheet {

    double total = 800;

    double symboleNo, eng, math, nep, optional1, sci, soc, eph, optional2;

    Scanner input = new Scanner(System.in);

    public void entry() {
        System.out.println("student symboleNo :");
        symboleNo = input.nextDouble();

        System.out.println("English:");
        eng = input.nextDouble();
        System.out.println("Math:");
        math = input.nextDouble();
        System.out.println("Nepali:");
        nep = input.nextDouble();
        System.out.println("Account:");
        optional1 = input.nextDouble();
        System.out.println("science:");
        sci = input.nextDouble();
        System.out.println("social:");
        soc = input.nextDouble();
        System.out.println("environment:");
        eph = input.nextDouble();
        System.out.println("env.science/o.math:");
        optional2 = input.nextDouble();
    }

    public boolean isFail() {

        return (eng < 32 || math < 32 || nep < 32 || optional1 < 32 || sci < 32 || soc < 32 || eph < 32 || optional2 < 32);

    }

    public double getTotal() {
        return (eng + math + nep + optional1 + sci + soc + eph + optional2);
    }

    public double getPercentage() {
        return (getTotal() / total) * 100;

    }

    public String getGrade() {
        double per = getPercentage();
        String grade = "grade";

        if (per >= 80) {
            grade = "Distinction";

        } else if (per < 80 && per >= 60) {
            grade = "First division";

        } else if (per < 60 && per >= 45) {
            grade = "Second division";
        } else {
            grade = "Third division ";
        }
        return grade;

    }

}
