import java.util.Scanner;

import java.time.YearMonth;

public class zad5 {

    public static void main(String[] args)
    {
        System.out.println("Podaj liczbe z zakresu 1-12 (miesiace)");
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        switch (x)
        {
            case 1:
            YearMonth yMon = YearMonth.of(2023, 1);
            int noDays = yMon.lengthOfMonth();
            
            System.out.println("Styczen: " + noDays);
            break;

            case 2:
            yMon = YearMonth.of(2023, 2);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Luty: " + noDays);
            break;

            case 3:
            yMon = YearMonth.of(2023, 3);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Marzec: " + noDays);
            break;

            case 4:
            yMon = YearMonth.of(2023, 4);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Kwiecien: " + noDays);
            break;

            case 5:
            yMon = YearMonth.of(2023, 5);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Maj: " + noDays);
            break;

            case 6:
            yMon = YearMonth.of(2023, 6);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Czerwiec: " + noDays);
            break;

            case 7:
            yMon = YearMonth.of(2023, 7);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Lipiec : " + noDays);
            break;

            case 8:
            yMon = YearMonth.of(2023, 8);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Sierpien: " + noDays);
            break;

            case 9:
            yMon = YearMonth.of(2023, 9);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Wrzesien: " + noDays);
            break;

            case 10:
            yMon = YearMonth.of(2023, 10);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Pazdziernik: " + noDays);
            break;

            case 11:
            yMon = YearMonth.of(2023, 11);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Listopad: " + noDays);
            break;

            case 12:
            yMon = YearMonth.of(2023, 12);
            noDays = yMon.lengthOfMonth();
            
            System.out.println("Grudzien: " + noDays);
            break;










            default:
            System.out.println("Blad");
        }


    }





}