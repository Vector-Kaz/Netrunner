package com.company;

import java.util.Scanner;

/**
 * Created by kaz on 4/13/17.
 */
public class keypadPadlvl {

    public static void intro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to NetRun-R");
        System.out.println(" Type \"netrunner\" to begin ");

        String startGame = sc.nextLine();

        if (startGame.equalsIgnoreCase("netrunner")) {
            System.out.println("You stand in a dark alley above you can see rapidly flashing LEDs");
            sc.nextLine();
            System.out.println("In front of stands a door that has several buttons your phone shows you that your destination is beyond the door.");
            sc.nextLine();
            System.out.println("");
            System.out.println("1st Objective: Unlock the door.");
        } else

            sc.nextLine();
        System.out.println("Examine the door by typing \"examine door\"");

        String startDoorLevel = sc.nextLine();

        if (startDoorLevel.equalsIgnoreCase("examine door")) {
            doorLevel();
        } else {
            errorHandling();
        }
    }

    public static void introerror(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You didn't type \"netrunner\"");
        sc.nextLine();
        System.out.println("Type \"netrunner\" to continue.");

    }

    public static void doorPuzzle() {
        System.out.println("00110001");
        System.out.println("00110010");
        System.out.println("00110111");
        System.out.println("00110100");

    }

    public static void doorLevel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You examine the door and a pattern of data displays onto the door in marquee format.");
        sc.nextLine();
        System.out.println("The data is transmitted to your phone.");
        sc.nextLine();
        System.out.println("You look at your phone and a notification of a new message appears.");
        sc.nextLine();
        doorPuzzle();
        System.out.println("You notice a keypad below the marquee with 4 small lights signaling a 4 digit pin code.");
        System.out.println("To interact with the keyboard type \"use keypad\"");
        String keyPad = sc.nextLine();
        sc.nextLine();
        if (keyPad.equalsIgnoreCase("use keypad")) {
            usekeyPad();
        } else {
            errorHandlingkeypad();
        }
    }

    public static void usekeyPad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You read a small marquee on the side of the door and notice a keypad.");
        System.out.println("You motion towards the keypad and see that it needs a 4 digit pin code.");
        sc.nextLine();
        System.out.println("Enter a 4 digit pin code.");
        String code = sc.nextLine();
        if (code.equalsIgnoreCase("1247")) {
            Solution();
        } else {
            errorHandlingSolution();
        }

    }

    public static void Solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("The door slides open, showing you to a tunnel with arrows made of LEDS pointing you deeper into the tunnel");
        sc.nextLine();
        System.out.println("Well Done you have past the first level.");
        //System.exit(0);
    }

    public static void errorHandlingSolution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nothing Happened");
        sc.nextLine();
        System.out.println("Type in a 4 digit pin.");
        String exit = sc.nextLine();
        if (exit.equalsIgnoreCase("1247")) {
            Solution();
        } else if (exit.equalsIgnoreCase("")) {
            System.out.println("The keypad lets out a solid screeching tone then stops.");
            sc.nextLine();
            errorHandlingSolution();
        } else {
            System.out.println("The keypad lets out a solid screeching tone then stops.");
            errorHandlingSolution();
        }
    }

    public static void errorHandlingkeypad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nothing Happened.");
        sc.nextLine();
        System.out.println("Use the keypad to continue.");
        String exit = sc.nextLine();
        if (exit.equalsIgnoreCase("use keypad")) {
            usekeyPad();
        } else {
            errorHandlingkeypad();
        }
    }

    public static void errorHandling() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nothing Happened.");
        sc.nextLine();
        System.out.println("Examine the door to continue.");
        String startGame = sc.nextLine();
        sc.nextLine();
        if (startGame.equalsIgnoreCase("examine door")) {
            doorLevel();
        } else {
            errorHandling();
        }
    }


}




