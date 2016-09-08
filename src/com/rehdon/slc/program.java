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
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double symboleNo , eng, math, nep, optional1, sci, soc, eph, optional2;
        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("student symbole No :");
            symboleNo = input.nextDouble();
            System.out.println("please enter marks for this Roll no:");

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

            if (eng < 32 || math < 32 || nep < 32 || optional1 < 32 || sci < 32 || soc < 32 || eph < 32 || optional2 < 32);
            {
                System.out.println("you have failed");

            }
            double total = (eng + math + nep + optional1 + sci + soc + eph + optional2);
            double per = (total / 500) * 100;
            String grade = "";
            if (per >= 80) {
                grade = "Distinction";

            } else if (per < 80 && per >= 60) {
                grade = "First division";

            } else if (per < 60 && per >= 45) {
                grade = "Second division";
            } else {
                grade = "Third division ";
            }
            System.out.println("Total is " + total);
            System.out.println("percentage is " + per);
            System.out.println("Grade is " + grade);
            
            
             System.out.println("Do you want to continue[Y/N]");
            String choice=input.next();
            if (choice.equalsIgnoreCase("n")){
                System.exit(0);
            }
            
        }
    }
}
