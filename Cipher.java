package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by kaz on 4/14/17.
 */
public class Cipherlvl {

    public static void errorHandling(){
        System.out.println("Wrong password.");
        enterPass();
    }


    public static void hint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You look for more hints and find that the button about the hint is clickable.");
        sc.nextLine();
        System.out.println("You click the button and are greeted with a small glimsp of text.");
        sc.nextLine();
        System.out.println("QRSNHYG - R13");
        sc.nextLine();
        System.out.println("This is text disappears from the screen after a while and the login terminal appears.");
    }

    public static void enterPass(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Password");
        String Pass = sc.nextLine();
        if(Pass.equalsIgnoreCase("DEFAULT")){
            System.out.println("Welcome administrator!");
            sc.nextLine();
            System.out.println("1/3 Terminals activated on network.");
            sc.nextLine();
            System.out.println("To shows options type \"--help\".");
            sc.nextLine();
            System.out.println("To complete this challenge use this terminal to activate the other terminals on the network.");
        } else {
            errorHandling();
        }

    }

    public static void Chc(){
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("login")){
            enterPass();
        } if else(choice.equalsIgnoreCase("hint")){
            hint();
        } else {
            Chc();
        }

    }

    public static void intro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Going down the tunnel you finally reach a room with a terminal.");
        sc.nextLine();
        System.out.println("Above the terminal you can see other terminals without keyboards.");
        sc.nextLine();
        System.out.println("You attempt to use the machine but are met with a login screen asking for a password.");
        sc.nextLine();
        System.out.println("You see a hint for the password it be only one word.");
        sc.nextLine();
        System.out.println("\"Cipher!\"");
        sc.nextLine();
        System.out.println("Puzzle #2: Enter the password for the terminal.");
        sc.nextLine();
        System.out.println("You try to login to the terminal.");
        sc.nextLine();
        Chc();

    }

}
