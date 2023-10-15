import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        //zad1
        System.out.println(generateRandomInt());
        //zad2
        System.out.println(generateRandomDouble());
        //zad3
        piramida();
        //zad4
        boolean randomBoolean = generateRandomBoolean();
        System.out.println("Losowa wartosc logiczna: " + randomBoolean);
        //zad5
        int[] numbers = new int[10];
        System.out.println("Podaj 10 liczb:");

        for (int i = 0; i < 10; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        reverse(numbers);
        //zad6
        int[] number = new int[20];
        generateRandomNumbers(number, 1, 100);
        double average = calculateAverage(numbers);

        System.out.println("Losowe liczby:");
        for (int num : number)
        {
            System.out.print(num + " ");
        }
        System.out.println("\nSrednia wartosc: " + average);


    }
//Zad 1. Napisz metodę generateRandomInt, która generuje i zwraca losową liczbę całkowitą.
    public static int generateRandomInt()
    {
        Random random = new Random();
        return random.nextInt();
    }
//zad2 generateRandomDouble, która generuje i zwraca losową liczbę zmiennoprzecinkową z zakresu od 0.0 do 1.0
    public static double generateRandomDouble()
    {
        return random.nextDouble(0.0, 1.0);
    }
//zad3 Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą n. Używając klasy StringBuilder, zbuduj i wypisz piramidę o wysokości n, gdzie każdy poziom piramidy składa się z podanego znaku. Na przykład dla znaku * i n=3
    public static void piramida()
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj znak");
    String znak=scanner.next();
    System.out.println("Podaj wysokosc");
    int wysokosc = scanner.nextInt();
    for(int i=0;i<wysokosc;i++)
        {
         int liczbaspacji = wysokosc - i -1;
         int liczbaznakow = 2*i + 1;
         StringBuilder sb = new StringBuilder();

         while(liczbaspacji-- > 0)
         {
            sb.append(' ');
         }
         while(liczbaznakow-- > 0)
         {
            sb.append(znak);
         }
         System.out.println(sb.toString());
        }
    }
//zad4 generateRandomBoolean, która generuje i zwraca losową wartość logiczną (true lub false)
    public static boolean generateRandomBoolean()
    {
        return random.nextBoolean();
    }
//zad5 Napisz program, który tworzy tablicę jednowymiarową 10 liczb całkowitych, a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia
   public static void reverse(int[] tab)
 {
    System.out.println("Odwrocone liczby:");
    for (int i = tab.length - 1; i >= 0; i--)
    {
        System.out.println(tab[i]);
    }
 }
 //zad6 Utwórz program, który tworzy jednowymiarową tablicę 20 liczb losowych z przedziału od 1 do 100, a następnie oblicza i wyświetla ich średnią wartość
 public static void generateRandomNumbers(int[] tab, int min, int max)
 {
     for (int i = 0; i < tab.length; i++)
     {
         tab[i] = random.nextInt(max - min + 1) + min;
     }
 }
    public static double calculateAverage(int[] tab)
    {
        int suma = 0;
        for (int num : tab)
        {
            suma += num;
        }
        return (double) suma / tab.length;
    }


}