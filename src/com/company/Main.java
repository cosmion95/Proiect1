package com.company;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        MediaAritmetica.main(args);
        ProgrammingByDoing.main(args);

       // System.out.println("Merge");


        //  -------Instructiunea SWITCH -----------------
	/*int MonthNumber = 7;
	String MonthName;
	switch (MonthNumber) {
        case 1: MonthName = "Ianuarie";
                break;
        case 2: MonthName = "Februarie";
                break;
        case 3: MonthName = "Martie";
                break;
        case 4: MonthName = "Aprilie";
                break;
        case 5: MonthName = "Mai";
                break;
        default: MonthName = "Numar de luna invalid.";
                break;
    }

        System.out.println(MonthName);*/




        // --------------Instructiunea FOR cu array
/*

    String[] listaNume = {"Ion", "Vasile", "Gheorghe"};
	for (String nume: listaNume) {
	    System.out.print(nume + ", ");
    }




        // -------- Instructiunea FOR cu IF BOOLEAN ARRAY BREAK CONTINUE

        int[] sir = {1,2,3,4,5};
        int val = 5;
        boolean found=false;
        for (int i=0; i<=sir.length; i++){
            if(sir[i] == val) {
                found = true;
                break;
            }
            else {
                continue;
            }
        }
        if(found){
            System.out.println("L-am gasit.");
        }
        else {
            System.out.println("Nu l-am gasit.");
        }
*/



//  -------------- FOR ARRAY cu matrice

/*        int[][] matrice = { {1,2}, {3, 4}, {5,6} };
        System.out.println(matrice[1][1]);

        for(int i=0; i<matrice.length; i++){
            for(int j=0; j<matrice[i].length; j++){
                System.out.println(matrice[i][j]);
            }
        }*/



// --------------------- ARRAYCOPY, copyOfRange
/*

        char[] copy = {'p','e','p','s','i','c','o','l','a'};
        char[] paste = new char[4];
        System.arraycopy(copy,5,paste,0,4);
        char[] pasteNew = java.util.Arrays.copyOfRange(copy,5,9);
        System.out.println(new String(pasteNew));
*/

//LOTERIE
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti un numar pana la 100: ");
        int numarIntrodus = input.nextInt();

        int numarRandom = (int)( Math.random() * 100);
        int unuRandom =  numarRandom / 10;
        int doiRandom = numarRandom % 10;
        System.out.println("Numarul loteriei este: " + numarRandom);

        int unuIntrodus = numarIntrodus / 10;
        int doiIntrodus = numarIntrodus % 10;

        if ( (unuRandom == unuIntrodus) && (doiRandom == doiIntrodus) ) {
            System.out.println("Felicitari, ai castigat 10.000 de euro.");
        }

        else if ( (unuRandom == doiIntrodus) && (doiRandom == unuIntrodus) ) {
            System.out.println("Felicitari, ai castigat 3000 de euro.");
        }

        else if ( (unuIntrodus == unuRandom || unuIntrodus == doiRandom) || ( doiIntrodus == unuRandom || doiIntrodus == doiRandom ) ) {
            System.out.println("Ai castigat 1000 euro.");
        }
        else {
            System.out.println("Nu ai castigat nimic.");
        }

*/

        //Exercitiul 3.21
     /*   Scanner input = new Scanner(System.in);
        System.out.print("Introduceti data dorita: ");
        double q = input.nextDouble();
        double numarLunaDorita = 0;
        boolean steag = true;
        while(steag) {
            System.out.print("Introduceti luna dorita: ");
            String lunaDorita = input.next();
            if (       lunaDorita.equals("ianuarie")
                    || lunaDorita.equals("februarie")
                    || lunaDorita.equals("martie")
                    || lunaDorita.equals("aprilie")
                    || lunaDorita.equals("mai")
                    || lunaDorita.equals("iunie")
                    || lunaDorita.equals("iulie")
                    || lunaDorita.equals("august")
                    || lunaDorita.equals("septembrie")
                    || lunaDorita.equals("octombrie")
                    || lunaDorita.equals("noiembrie")
                    || lunaDorita.equals("decembrie")
                    ) {
                switch (lunaDorita) {
                    case "ianuarie": numarLunaDorita = 13;
                        break;
                    case "februarie": numarLunaDorita = 14;
                        break;
                    case "martie": numarLunaDorita = 3;
                        break;
                    case "aprilie": numarLunaDorita = 4;
                        break;
                        case "mai": numarLunaDorita = 5;
                        break;
                    case "iunie": numarLunaDorita = 6;
                        break;
                    case "iulie": numarLunaDorita = 7;
                        break;
                    case "august": numarLunaDorita = 8;
                        break;
                    case "septembrie": numarLunaDorita = 9;
                        break;
                    case "octombrie": numarLunaDorita = 10;
                        break;
                    case "noiembrie": numarLunaDorita = 11;
                        break;
                    case "decembrie": numarLunaDorita = 12;
                        break;
                }
                      steag = false;
                     }
            else {
                System.out.println("Ati introdus o luna gresita.");
            }
        }

        System.out.print("Introduceti anul dorit: ");
        double anulDorit = input.nextDouble();
        if ( numarLunaDorita == 13 || numarLunaDorita == 14 ) {
            anulDorit = anulDorit -1;
        }
        double j = (int) anulDorit / 100;  // secolul
        double k =  anulDorit % 100;   // anul secolului, ex: anul '95 din secolul 19
        double formula1 = q + k + (k / 4) + (j / 4) + (j * 5);
        double formula2 = (26 * (numarLunaDorita + 1)) / 10;
        int formulaFinala = (int) ( formula1 + formula2 ) % 7;
        String ziua = "";
        switch (formulaFinala) {
            case 0: ziua = "sambata";
                    break;
            case 1: ziua = "duminica";
                break;
            case 2: ziua = "luni";
                break;
            case 3: ziua = "marti";
                break;
            case 4: ziua = "miercuri";
                break;
            case 5: ziua = "joi";
                break;
            case 6: ziua = "vineri";
                break;
        }
        System.out.println("Ziua din data respectiva este: " + ziua);
*/

        // Exercitiul 3.22   --- punctul dintr-un cerc
/*

        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti punctul x: ");
        byte punctX2 = input.nextByte();
        System.out.print("Introduceti punctul y: ");
        byte punctY2 = input.nextByte();
        byte punctX1 = 0;
        byte punctY1 = 0;
        double distanta = Math.pow(
                                    (
                                        Math.pow(punctX2 - punctX1, 2) +
                                        Math.pow(punctY2 - punctY1, 2)
                                    ),
                                  0.5);
        if (distanta <=10) {
            System.out.println("Merge");
        }
*/

        //Exercitiul 3.24 ---- pick a random card
/*

        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suite = {"Clubs", "Diamonds", "Hearts", "Spades"};
        int randomRank = (int) (Math.random() * 13);
        int randomSuite = (int) (Math.random() * 4);
        System.out.print("The card you picked is " + rank[randomRank] + " of " + suite[randomSuite]);
*/


        //Exercitiul 3.25 --- punctul de intersectie
/*

        Scanner input = new Scanner(System.in);
        System.out.print("Linia 1, introduceti coordonatele de inceput: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Linia 1, introduceti coordonatele de final: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Linia 2, introduceti coordonatele de inceput: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Linia 2, introduceti coordonatele de final: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = ( a * x1 ) - ( b * y1 );
        double f = ( c * x3 ) - ( d * y3 );

        double x = ( e * d - b * f ) / ( a * d - b * c );
        double y = ( a * f - e * c ) / ( a * d - b * c );

        if ( (a * d - b * c) == 0 ) {
            System.out.println("Linile sunt paralele.");
        }
        else {
            System.out.println("Linile se intersecteaza in punctul: " + x + ", " + y);
        }
*/



        //Exercitiul 3.26 ---- operatorii and / or / or but not both(^)
/*

        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti o cifra: ");
        int x = input.nextInt();
        System.out.print(x + " este divizibil cu 5 si 6? ");
        if ( ( ( x % 5) == 0) && ( ( x % 6 ) == 0 ) ) {
            System.out.print("Adevarat");
        }
        else {
            System.out.print("Fals");
        }
        System.out.print("\n" + x + " este divizibil cu 5 sau 6? ");
        if ( ( ( x % 5) == 0) || ( ( x % 6 ) == 0 ) ) {
            System.out.print("Adevarat");
        }
        else {
            System.out.print("Fals");
        }
        System.out.print("\n" + x + " este divizibil cu 5 sau 6, dar nu cu ambii? ");
        if ( ( ( x % 5) == 0) ^ ( ( x % 6 ) == 0 ) ) {
            System.out.print("Adevarat");
        }
        else {
            System.out.print("Fals");
        }
*/

        //Exercitiul 3.27 Punct intr-un triunghi dreptunghic
/*

        Scanner input = new Scanner(System.in);
        double x1 = 0;
        double y1 = 0;
        System.out.print("Introduceti coordonatele punctului: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = 200;
        double y3 = 0;
        double x4 = 0;
        double y4 = 100;

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = ( a * x1 ) - ( b * y1 );
        double f = ( c * x3 ) - ( d * y3 );

        double x = ( e * d - b * f ) / ( a * d - b * c );
        double y = ( a * f - e * c ) / ( a * d - b * c );

        if ( (a * d - b * c) == 0 ) {
            System.out.println("Punctul este in triunghi");
        }
        else {
            System.out.println("Punctul nu este in triunghi");
        }

*/












    }
}
