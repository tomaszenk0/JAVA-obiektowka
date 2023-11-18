//Wykonaj poniższe czynności:
//Zdefiniuj klasę Person, która posiada następujące pola: firstName, lastName i age.Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
//Wiek osoby (age) nie powinien być ujemny. W przypadku podania wartości ujemnej dla wieku, ustaw wiek osoby na zero.Pola firstName i lastName nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null dla tych pól, ustaw odpowiednio pusty napis.Dodaj metodę toString(), która zwraca informacje o osobie w formacie: "Person: [firstName] [lastName], Age: [age].". Zwróć uwagę na wielkość liter i znaki interpunkcyjne.Dodaj metodę equals(), która porównuje dwie osoby na podstawie ich pól firstName, lastName i age. Dwie osoby są uważane za identyczne, jeśli wszystkie trzy pola są takie same.
public class Person
{
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = (firstName != null && !firstName.isEmpty()) ? firstName : "";
        this.lastName = (lastName != null && !lastName.isEmpty()) ? lastName : "";
        this.age = (age >= 0) ? age : 0;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Age: " + age + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }
}
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("", null, -5);

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println("Are persons equal? " + person1.equals(person2));
    }
}



//Wykonaj poniższe czynności:
//Zdefiniuj klasę Vehicle, która posiada następujące pola: brand, model i yearOfProduction.Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
//Rok produkcji (yearOfProduction) nie powinien być większy od aktualnego roku. W przypadku podania wartości większej, ustaw rok produkcji na aktualny rok.Pola brand i model nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null dla tych pól, ustaw odpowiednio pusty napis.
//Dodaj metodę toString(), która zwraca informacje o pojeździe w formacie: "Vehicle: [brand] [model], Year: [yearOfProduction].".Dodaj metodę equals(), która porównuje dwa pojazdy na podstawie ich pól brand, model i yearOfProduction.
public class Vehicle
{
    String brand;
    String model;
    int yearOfProduction;
    public Vehicle(String brand, String model, int yearOfProduction)
    {
        this.yearOfProduction=(yearOfProduction<=2023) ? yearOfProduction : 2023;
        this.brand=(brand!=null && !brand.isEmpty()) ? brand : "";
        this.model=(model!=null && !model.isEmpty()) ? model : "";


    }
    @Override
    public String toString() {
        return "Vehicle: " + brand + " " + model + ", Year " + yearOfProduction + ".";

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle pojazd = (Vehicle) obj;
        return yearOfProduction == pojazd.yearOfProduction &&
                brand.equals(pojazd.brand) &&
                model.equals(pojazd.model);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle pojazd1 = new Vehicle("ADADA", "A", 2000);
        Vehicle pojazd2 = new Vehicle("ADADA", "A", 2000);
        System.out.println(pojazd1.toString());
        System.out.println(pojazd2.toString());

        System.out.println("Are vehicles equal? " + pojazd1.equals(pojazd2));
    }
}
//Stwórz klasę Rectangle z prywatnymi polami width i height. Dodaj konstruktor, który przyjmuje długości boków jako argumenty. Dodaj metody dostępowe (gettery i settery) oraz metody area() i perimeter(), które obliczają pole powierzchni i obwód prostokąta
public class Rectangle
{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Gettery(umożliwia odczytanie wartości z zewnątrz klasy) i settery(Umożliwia modyfikację wartości pola z zewnątrz klasy.) dla pól width i height
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Metoda obliczająca pole powierzchni prostokąta
    public double area() {
        return width * height;
    }

    // Metoda obliczająca obwód prostokąta
    public double perimeter() {
        return 2 * (width + height);
    }
}
public class Main {
    public static void main(String[] args)
    {
        rectangle.setWidth(7);
        rectangle.setHeight(12);

        System.out.println("Nowe pole powierzchni: " + rectangle.area());
        System.out.println("Nowy obwód: " + rectangle.perimeter());
    }
    //Stwórz klasę Student z prywatnymi polami: firstName, lastName, indexNumber, yearOfStudy oraz gradeAverage. Dodaj konstruktor, który przyjmuje wszystkie pola jako argumenty. Dodaj metody dostępowe (gettery i settery) oraz metodę showInformation(), która wyświetla informacje o studencie.
    public class Student
    {
        private String firstName;
        private String lastName;
        private String indexNumber;
        private int yearOfStudy;
        private double gradeAverage;

        public Student(String firstName, String lastName, String indexNumber, int yearOfStudy, double gradeAverage) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.indexNumber = indexNumber;
            this.yearOfStudy = yearOfStudy;
            this.gradeAverage = gradeAverage;
        }

        // Gettery i settery dla pól klasy Student
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getIndexNumber() {
            return indexNumber;
        }

        public void setIndexNumber(String indexNumber) {
            this.indexNumber = indexNumber;
        }

        public int getYearOfStudy() {
            return yearOfStudy;
        }

        public void setYearOfStudy(int yearOfStudy) {
            this.yearOfStudy = yearOfStudy;
        }

        public double getGradeAverage() {
            return gradeAverage;
        }

        public void setGradeAverage(double gradeAverage) {
            this.gradeAverage = gradeAverage;
        }

        // Metoda showInformation() wyświetlająca informacje o studencie
        public void showInformation() {
            System.out.println("Student Information:");
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Index Number: " + indexNumber);
            System.out.println("Year of Study: " + yearOfStudy);
            System.out.println("Grade Average: " + gradeAverage);
        }
    }
    public class Main {
        public static void main(String[] args) {
            Student student = new Student("John", "Doe", "A12345", 2, 4.5);
            student.showInformation();

            // Możesz także użyć setterów do zmiany informacji o studencie
            student.setGradeAverage(4.8);
            student.setYearOfStudy(3);

            System.out.println("\nUpdated Student Information:");
            student.showInformation();
        }
    }




