import java.util.*;

public class ArmstrongNumber {

//    Napisz program który sprawdzi czy jest to liczba Armstronga,
//    czyli jeśli jest równa sześcianowi każdej cyfry.
//    Na przykład 153 jest liczbą Armstronga,
//    ponieważ 153 = 1+ 125 + 27, co jest równe 1 ^ 3 + 5 ^ 3 + 3 ^ 3.
//    Musisz napisać program, aby sprawdzić, czy podany numer jest numerem Armstronga, czy nie.


    public static boolean checkArmstrongNumber(String a){

//        System.out.println(a.length());
        int tekst_dl = a.length();
        String[] tekst_parts = a.split("");
        int tekst_parts_dl = tekst_parts.length;

        System.out.println(Double.valueOf(a));
        int suma=0;
        double podstawa = 0;

        for (int i = 0; i <tekst_dl ; i++) {
            podstawa = Double.valueOf(tekst_parts[i]);
            suma+=Math.pow(podstawa,3);
            System.out.println(podstawa+"="+Math.pow(podstawa,3));

        }

        System.out.println(suma);

        if (suma == Double.valueOf(a)){return true;} else {return false;}


    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz ciag calkowitych znakow liczbowych");
        String text_input = scanner.next();

        try{
            int liczba = Integer.valueOf(text_input);
            System.out.println("Czy liczba "+liczba+" jest liczbą Armstronga ?\n"+checkArmstrongNumber(text_input));

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
            System.out.println("Wprowadzono ciąg, który nie jest liczbą całkowitą");
        }


    }



}
