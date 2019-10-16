import java.util.*;

public class ArmstrongNumber {

//    It's a program to check if the number is ArmstrongNumber,
//    F.Ex.: number 153 is the Armstrong number because 153 = 1+ 125 + 27,
//    is equals to  1 ^ 3 + 5 ^ 3 + 3 ^ 3.



    public static boolean checkArmstrongNumber(String a){


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
