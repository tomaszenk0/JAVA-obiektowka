import java.util.Scanner;
public class Main
{
    //zad1
    //Napisz prostą aplikację kalkulatora tekstowego, która przyjmuje dwa liczby od użytkownika jako wejście i wykonuje podstawowe operacje matematyczne (dodawanie, odejmowanie, mnożenie, dzielenie). Wyświetl wyniki na ekranie.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj 2 liczbę");
        double liczba2 = scanner.nextDouble();
        System.out.println("Wynik dodawania to " + (liczba1 + liczba2));
        System.out.println("Wynik odejmowania to " + (liczba1 - liczba2));
        System.out.println("Wynik mnożenia to " + (liczba1 * liczba2));
        System.out.println("Wynik dzielenia to " + (liczba1 / liczba2));


        //zad2
        //Napisz program, który wczytuje ze standardowego wejścia dwa łańcuchy znaków, a następnie wypisuje je w kolejnych wierszach na standardowym wyjściu.
        System.out.println("Podaj ciąg");
        String ciag1 = scanner.nextLine();
        System.out.println("Podaj ciąg");
        String ciag2 = scanner.nextLine();
        System.out.println(ciag1);
        System.out.println(ciag2);
        //zad3
        //Napisz program, który wczytuje ze standardowego wejścia cztery liczby wymierne, a następnie wypisuje ich sumę na standardowym wyjściu.
        double liczba1 = scanner.nextDouble();
        double liczba2 = scanner.nextDouble();
        double liczba3 = scanner.nextDouble();
        double liczba4 = scanner.nextDouble();
        System.out.println("Wynik dodawania to" + (liczba1 + liczba2 + liczba3 + liczba4));*/
        //zad4
        //Stwórz program do obliczenia pola kwadratu. Dane pobierz od użytkownika, wynik wyświetl na standardowym wyjściu.
        /*System.out.println("Podaj a");
        int a = scanner.nextInt();
        System.out.println("Pole kwadratu to: " + (a*a));


        //zad5
        //Napisz program, który przyjmuje trzy liczby całkowite jako argumenty i zwraca największą z nich. Zastosuj instrukcje warunkowe do porównania liczb.
        if (args.length != 3) {
            System.out.println("Podaj trzy liczby całkowite");
            return;
        }
        int liczba1, liczba2, liczba3;
        try
        {
            liczba1 = Integer.parseInt(args[0]);
            liczba2 = Integer.parseInt(args[1]);
            liczba3 = Integer.parseInt(args[2]);

        } catch (NumberFormatException e)
        {
            System.out.println("Wszystkie argumenty muszą być liczbami całkowitymi.");
            return;
        }
        int najwieksza = liczba1;
        if (liczba2 > najwieksza)
        {
           najwieksza = liczba2;
        }

        if (liczba3 > najwieksza)
        {
            najwieksza = liczba3;
        }
     System.out.println("Największa liczba to: " + najwieksza);

        //zad 6
        // Napisz program, który na podstawie podanego jako argument numeru dnia tygodnia (od 1 do 7) wypisze nazwę tego dnia tygodnia. Dla przykładu, jeżeli użytkownik poda liczbę 1, program powinien wypisać “Poniedziałek”. Jeżeli podana liczba nie jest z zakresu od 1 do 7, program powinien wyświetlić komunikat “Niepoprawny numer dnia tygodnia”.
        System.out.println("Podaj dzień tygodnia ");
        int dzien = scanner.nextInt();
        if(dzien>7)
        {
            System.out.println("zły dzień tygodnia ");
        }
        switch(dzien) {
            case 1:
                System.out.println("Pon");
                break;
            case 2:
                System.out.println("Wt");
                break;
            case 3:
                System.out.println("Sr");
                break;
            case 4:
                System.out.println("Czw");
                break;
            case 5:
                System.out.println("Pt");
                break;
            case 6:
                System.out.println("Sob");
                break;
            case 7:
                System.out.println("Nd");
                break;
            default:
                System.out.println("niepoprawny dzień tygodnia");
        }

        //zad7
        //Napisz program, który będzie sprawdzał, czy podany rok jest rokiem przestępnym. Rok jest przestępny, jeśli jest podzielny przez 4, ale nie jest podzielny przez 100, chyba że jest podzielny przez 400
        System.out.println("Podaj rok ");
        int rok = scanner.nextInt();
        if(rok%4==0&& rok%400!=0)
        {
            System.out.println(" rok nie jest przystepny");

        }
        else
            System.out.println(" rok  jest przystepny");
        //zad8
        //Napisz program sprawdzający czy podane liczby z klawiatury mogą stanowić poprawna godzinę w formacie 24-godzinnym.
        //Przykładowe wejście:
        //Podaj godzinę: 22
        //Podaj minuty: 12
        //Podaj sekundy: 33
        //Przykładowe wyjście:
        //Poprawna godzina!

        System.out.println("Podaj godzinę");
        int godzina = scanner.nextInt();
        System.out.println("Podaj minuty");
        int minuty = scanner.nextInt();
        System.out.println("Podaj sekundy");
        int sekundy = scanner.nextInt();
        if(godzina<=24 && minuty>=0|| minuty<=59&& sekundy>=0|| sekundy<=59)
        {
            System.out.println("poprawna godzina");
        }
        else {
            System.out.println("Niepoprawna godzina");
        }

        //zad9
        //Napisz program, który oblicza sumę cyfr dowolnej wprowadzonej liczby. Program powinien akceptować liczbę jako input od użytkownika.
        System.out.println("Podaj liczbę:");

            String liczba = scanner.nextLine();
          int suma = 0;
           for (char cyfra : liczba.toCharArray())
           {
                suma += Character.getNumericValue(cyfra);
           }
            System.out.println("Suma cyfr liczby to: " + suma);
        //zad10
        //Stwórz program, który przyjmie od użytkownika liczbę całkowitą i zwróci tę liczbę w odwrotnej kolejności. Na przykład, dla liczby 12345, wynik powinien wynosić 54321. Możesz ograniczyć program tylko do liczb dodatnic
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();
        int odwroconaliczba=0;
        while(liczba!=0)
        {
            int cyfra=liczba%10;  //daje nam ostatnią cyfrę w liczbie.
            odwroconaliczba=odwroconaliczba*10+cyfra; //0*10+cyfra uzyskana wyżej
            liczba /=10; //liczba wpisana przez użytkownika uzyskujemy nową i przechodzimy spowrotem do pętli
        }
        System.out.println("odwrócona liczba"+ odwroconaliczba);

        //zad11
        //Napisz program, który sprawdzi, czy podana liczba jest liczbą Armstronga. Liczba Amstronga to taka, której suma jej cyfr podniesionych do potęgi równiej liczbie cyfr w tej liczbie, jest równa samej liczbie. (Liczba 153 jest liczbą Armstronga)
        // równiej liczbie cyfr w tej liczbie, jest równa samej liczbie.

        // (Liczba 153 jest liczbą Armstronga).

      System.out.println("Podaj liczbę:");

       String liczba = scanner.nextLine();
       int suma = 0;
        int n = liczba.length();
        for (char cyfra : liczba.toCharArray()) {
            suma += Math.pow(Character.getNumericValue(cyfra), n);
       }
       if (suma == Integer.parseInt(liczba)) {
            System.out.println(liczba + " jest liczbą Armstronga.");
        } else {
            System.out.println(liczba + " nie jest liczbą Armstronga.");
       }

        //ZAD_12: Napisz program wczytujący kolejne liczby całkowite (różnych znaków) z
        // klawiatury i kończący się gdy ich suma przekroczy 100. W java najprostszym sposobem
        int suma = 0;
        while (suma <= 100) {
            System.out.println("Podaj liczbę całkowitą:");
            int liczba = scanner.nextInt();
            suma += liczba;
        }
        System.out.println("Suma liczb przekroczyła 100.");
    }
}

