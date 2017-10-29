package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Merge");


        //  -------Instructiunea SWITCH -----------------
/*
	int MonthNumber = 7;
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

        System.out.println(MonthName);
*/




        // --------------Instructiunea FOR cu array
/*

    String[] listaNume = {"Ion", "Vasile", "Gheorghe"};
	for (String nume: listaNume) {
	    System.out.print(nume + ", ");
    }
*/




        // -------- Instructiunea FOR cu IF BOOLEAN ARRAY BREAK CONTINUE
/*

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








    }
}
