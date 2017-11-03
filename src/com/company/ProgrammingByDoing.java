package com.company;
import java.util.Scanner;
public class ProgrammingByDoing {

    public static void main (String[] args) {

        // Ex. 13 --- My schedule
/*

        String curs1 = "English III";
        String curs2 = "Precalculus";
        String curs3 = "Music";
        String curs4 = "Biotehnology";
        String curs5 = "Tehnology";
        String curs6 = "Latin";
        String curs7 = "History";
        String curs8 = "Business";

        String prof1 = "Lapan";
        String prof2 = "Gideon";
        String prof3 = "Davis";
        String prof4 = "Palmer";
        String prof5 = "Garcia";
        String prof6 = "Barnett";
        String prof7 = "Johannessen";
        String prof8 = "James";

        System.out.println("+-----------------------------------+");
        System.out.println("| 1 |     " + curs1 + " |       " + prof1 + " |");
        System.out.println("| 2 |     " + curs2 + " |      " + prof2 + " |");
        System.out.println("| 3 |           " + curs3 + " |       " + prof3 + " |");
        System.out.println("| 4 |    " + curs4 + " |      " + prof4 + " |");
        System.out.println("| 5 |       " + curs5 + " |      " + prof5 + " |");
        System.out.println("| 6 |       " + curs5 + " |     " + prof6 + " |");
        System.out.println("| 7 |           " + curs6 + " | " + prof7 + " |");
        System.out.println("| 8 |         " + curs7 + " |       " + prof8 + " |");
        System.out.println("+-----------------------------------+");
*/


        //Ex. 15 The forgetful machine
/*

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me a word!");
        keyboard.next();

        System.out.println("Give me a second word!");
        keyboard.next();

        System.out.println("Great, now your favorite number?");
        keyboard.next();

        System.out.println("And now your second favorite number...");
        keyboard.next();

        System.out.println("Whew!  Wasn't that fun?");

*/

        //Ex 16 Name age and salary
/*

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello. Whats your name?");
        String name = keyboard.next();
        System.out.println("\nHi " + name + "! How old are you?");
        byte age = keyboard.nextByte();
        System.out.println("\nSo you're " + age + ", eh? That's not old at all! \nHow much do you make, " + name + "?");
        double salary = keyboard.nextDouble();
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
*/


        //Ex 17 More user input of data
/*

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.print("\nFirst name: ");
        String firstName = keyboard.next();
        System.out.print("Last name: ");
        String lastName = keyboard.next();
        System.out.print("Grade (9-12): ");
        byte grade = keyboard.nextByte();
        System.out.print("Student ID: ");
        int studId = keyboard.nextInt();
        System.out.print("Login: ");
        String login = keyboard.next();
        System.out.print("GPA (0.0 - 4.0): ");
        double gpa = keyboard.nextDouble();

        System.out.println("\nYour information: ");

        System.out.println("     Login: " + login);
        System.out.println("     ID: " + studId);
        System.out.println("     Name: " + lastName + ", " + firstName);
        System.out.println("     GPA: " + gpa);
        System.out.println("     Grade: " + grade);
*/

        //Ex 18 Age in five years
        /*Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        String name = keyboard.nextLine();
        System.out.print("Hi, " + name + "! How old are you? ");
        int age = keyboard.nextInt();
        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old? ");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
*/

        //Ex 20 BMI
       /* Scanner keyboard = new Scanner(System.in);
        System.out.print("Your height(feet only):");
        int heightFeet = keyboard.nextInt();
        System.out.print("Your height(inches only):");
        int heightInches = keyboard.nextInt();
        System.out.print("Your weight in pounds: ");
        int weightPounds = keyboard.nextInt();

        double heightMeters = ( heightInches * 0.0254 ) + ( heightFeet * 0.3048 );
        double weightKg = weightPounds * 0.45359237;

        double bmi = weightKg / ( Math.pow(heightMeters, 2) );
        System.out.println("Your BMI is: " + bmi);
*/

       //Ex 26 Space Boxing
/*
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your current earth weight: ");
        int weight = keyboard.nextInt();
        System.out.println("I have information for the following planets:");
        System.out.println("  1. Venus   2. Mars   3. Jupiter");
        System.out.println("  4. Saturn  5. Uranus 6. Neptune");

        System.out.print("Wich planet are you visiting: ");
        byte planetNumber = keyboard.nextByte();

        if (planetNumber == 1) {
            System.out.println("Your weight would be " + (weight * 0.78) + " on that planet.");
        }
        else if (planetNumber == 2) {
            System.out.println("Your weight would be " + (weight * 0.39) + " on that planet.");
        }
        else if (planetNumber == 3) {
            System.out.println("Your weight would be " + (weight * 2.65) + " on that planet.");
        }
        else if (planetNumber == 4) {
            System.out.println("Your weight would be " + (weight * 1.17) + " on that planet.");
        }
        else if (planetNumber == 5) {
            System.out.println("Your weight would be " + (weight * 1.05) + " on that planet.");
        }
        else if (planetNumber == 6) {
            System.out.println("Your weight would be " + (weight * 1.23) + " on that planet.");
        }*/


        //Ex 27 A little quiz
/*

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Are you ready for a quiz? (yes to start)");
        String yesNo = keyboard.next();
        byte counter = 0;

        if ( yesNo.equals("yes") ) {

            System.out.println("\nQ1) What is the capital of Alaska?");
            System.out.println("1) Melbourne");
            System.out.println("2) Anchorage");
            System.out.println("3) Juneau\n");
            byte answer1 = keyboard.nextByte();

            if( answer1 == 3 ) {
                System.out.println("\nThat's right!");
                counter++;
            }
                else {
                System.out.println("\nSorry. Capital of Alaska is Juneau.");
                }

            System.out.println("\nQ2) Can you store the value 'cat' in a variable of type int?");;
            System.out.println("1) Yes");
            System.out.println("2) No\n");
            byte answer2 = keyboard.nextByte();

            if ( answer2 == 2 ) {
                System.out.println("\nThat's right!");
                counter++;
            }
            else {
                System.out.println("\nSorry, 'cat' is a string. ints can only store numbers.");
            }

            System.out.println("\nQ3) What is the result of 9+6/3?");
            System.out.println("1) 5");
            System.out.println("2) 11");
            System.out.println("3) 15/3\n");
            byte answer3 = keyboard.nextByte();

            if( answer3 == 2 ) {
                System.out.println("\nThat's right!");
                counter++;
            }
            else {
                System.out.println("\nSorry, the result is 11.");
            }

            System.out.println("\nOverall, you got " + counter + " of 3 correct.");
            System.out.println("Thanks for playing!");

        }

        else {
            System.exit(0);
        }
*/

       /* for ( int i=0; i<80; i++ )
        {
            if ( i%10 == 0 )
                System.out.print(" Mr. Mitchell is cool. \r");

            Thread.sleep(200);
        }

*/





























    }
    }

