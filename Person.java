package com.company;

import java.util.Scanner;

public class Person {
    String name;
    String lastName;
    int YearOfBirth;
    public  void enterDane(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your last name:  ");
        lastName = scan.nextLine();
        System.out.println("Enter your birth year:  ");
        YearOfBirth = scan.nextInt();

        if(( name == " ")&&( lastName == " ")&&( YearOfBirth < 1900 )&&( YearOfBirth > 2020))
            enterDane();

    }
    public void Dane(){
        System.out.print("imie: ");
        System.out.println(name);
        System.out.print("nazwisko: ");
        System.out.println(lastName);
        System.out.print("Rok urodzenia: ");
        System.out.println(YearOfBirth);
    }
}
