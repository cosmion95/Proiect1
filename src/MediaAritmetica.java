import java.util.Arrays;


public class MediaAritmetica {

    public static void main (String[] args) {



        // ------ Media aritmetica a doua numere

      /*  int a = 2;
        int b = 3;
        int c = (a * b) / 2;
        System.out.println(c);
*/




        // ---------- Media aritmetica a N numere
        /*
        int[] sir = {2,5,7,9};
        double suma = 0;
        for(int i=0;i<sir.length;i++){
            suma += sir[i];
        }
        double medieAritmetica = suma / sir.length;
        System.out.println(medieAritmetica);
*/




        // ------------ Media aritmetica a N numere pana ce numarul citit e 0
/*

        int[] sir = {2,5,0,7,9,0};
        int i;
        double suma = 0;
        for(i=0;i<sir.length;i++){
            suma += sir[i];
            if (sir[i] == 0) {
                break;
            }
        }
        double medieAritmetica = suma / i;
        System.out.println(medieAritmetica);

*/
// -------------------- MIN MAX, SUMA si SIRUL DUBLAT
        /*
        int[] sir = {2,5,0,7,9};
        int[] sirDublat = new int[sir.length];
        Arrays.sort(sir);
        System.out.println(sir[0]);
        System.out.println(sir[sir.length - 1]);
        int suma = 0;
        for(int i=0;i<sir.length;i++){
            suma += sir[i];
            sirDublat[i] = sir[i] * 2;
        }
        System.out.println(sir.length);
        System.out.println(suma * 2);
        System.out.println(sirDublat[4]);
*/

// --------------- Conversia din Fahrenheit in Celsius


        /*
        double tempF = 90;
        double tempC = (tempF - 32) / 1.8;
        System.out.println("Temp in grade Fahrenheit: " + tempF);
        System.out.println("Temp in grade Celsius: " + tempC);
*/



    }
}
