import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public Scanner scanner = new Scanner(System.in);
    //Utwórz program, który tworzy jednowymiarową tablicę 30 liczb całkowitych. Następnie poproś użytkownika, aby podał dowolną liczbę. Program powinien wyświetlić informację, czy podana liczba znajduje się w tablicy, a także ile razy się w niej pojawia.
    public static void main(String[] args) {
        int[] numbers = new int[30];
        Scanner scanner = new Scanner(System.in);

        // Wypełnienie tablicy liczbami całkowitymi (dla przykładu)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100); // Zakres losowanych liczb można zmienić
        }
        // Wyświetlenie tablicy (do celów informacyjnych)
        System.out.println("Tablica liczb:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nowa linia po wyświetleniu tablicy

        // Prośba o podanie liczby przez użytkownika
        System.out.print("Podaj liczbę do wyszukania: ");
        int searchNumber = scanner.nextInt();

        // Sprawdzenie, czy liczba znajduje się w tablicy i zliczenie wystąpień
        int count = 0;
        boolean found = false;

        for (int num : numbers) {
            if (num == searchNumber) {
                found = true;
                count++;
            }
        }
        // Wyświetlenie wyniku wyszukiwania
        if (found) {
            System.out.println("Liczba " + searchNumber + " znajduje się w tablicy.");
            System.out.println("Występuje " + count + " razy w tablicy.");
        } else {
            System.out.println("Liczba " + searchNumber + " nie znajduje się w tablicy.");
        }
        }
    }
public class Main {
    //Napisz statyczną metodę countZeros, która przyjmuje tablicę liczb całkowitych jako argument i zwraca liczbę wystąpień zera w tablicy. Na przykład, dla tablicy [0, 1, 2, 0, 3, 0, 4], funkcja powinna zwrócić 3. Stwórz przypadek testowy.
    public static void main(String[] args)
    {

        int[] testArray = {5, 0, 0, 0, 3};
        int zera = countZeros(testArray);
        System.out.println("Najmniejsza liczba w tablicy to: " + zera);


    }
    public static int countZeros(int tab[])
    {
        int policz=0;
        for(int i=0; i< tab.length; i++)
        {
            if(tab[i]==0)
            {
                policz++;
            }
        }
        return policz;
    }

}
    //Napisz program, który tworzy jednowymiarową tablicę 20 liczb całkowitych, a następnie oblicza i wyświetla ilość liczb parzystych i nieparzystych w tablicy.
    public void zad9() {
        int[] numbers = new int[20];
        // Wypełnienie tablicy liczbami całkowitymi (dla przykładu)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100); // Zakres losowanych liczb można zmienić
        }
        // Wyświetlenie tablicy
        System.out.println("Tablica liczb:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nowa linia po wyświetleniu tablicy
        int iloscparzystych = 0;
        int iloscnieparzystych = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                iloscparzystych++;
            }
            if (numbers[i] % 2 != 0) {
                iloscnieparzystych++;
            }
        }
    }

//Napisz statyczną metodę minimumValue, która przyjmuje listę tablicową liczb całkowitych jako argument i zwraca najmniejszą liczbę w liście tablicowej. Przyjmij, że lista tablicowa zawsze będzie miała co najmniej jeden element. Stwórz przypadek testowy.
    import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(5);
        numbersList.add(3);
        numbersList.add(9);
        numbersList.add(2);
        numbersList.add(7);

        int min = minimumValue(numbersList);
        System.out.println("Najmniejsza liczba w liście: " + min);


    }
    public static int minimumValue(ArrayList<Integer> list)
    {
        int min = list.get(0); // Początkowo przyjmujemy, że pierwszy element jest najmniejszy

        // Przeszukujemy listę w poszukiwaniu najmniejszej liczby
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) < min)
            {
                min = list.get(i);
            }
        }

        return min; // Zwracamy najmniejszą znalezioną liczbę
    }
}
//Napisz statyczną metodę reverseArray, która przyjmuje listę tablicową liczb całkowitych jako argument i zwraca nową listę tablicową, ale z odwróconym porządkiem elementów. Na przykład, dla [1, 2, 3, 4, 5], funkcja powinna zwrócić [5, 4, 3, 2, 1]. Stwórz przypadek testowy.1
import java.util.ArrayList;
        import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Przypadek testowy
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        ArrayList<Integer> reversedList = reverseArray(numbersList);

        System.out.println("Lista przed odwróceniem: " + numbersList);
        System.out.println("Lista po odwróceniu: " + reversedList);
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<>(list); // Tworzenie kopii oryginalnej listy

        Collections.reverse(reversed); // Odwrócenie kolejności elementów w liście

        return reversed;
    }
}
