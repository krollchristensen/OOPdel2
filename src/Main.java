//OPG 1
public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple", "iPhone 12", 799.99);
        phone.displayDetails();
        phone.changePrice(749.99);
        phone.displayDetails();
    }
}

//OPG 2
import java.util.Date;
import java.util.Random;

public class LibraryClasses {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date and time: " + date);

        Random random = new Random();
        System.out.println("Random numbers:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println(randomNumber);
        }
    }
}

//OPG 3
public class Student {
    String name;
    int age;
    String studentID;

    Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
    }

    public static void main(String[] args) {
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("Anna", 20, "2023A001");
        studentArray[1] = new Student("Brian", 22, "2023B002");
        studentArray[2] = new Student("Cecilie", 21, "2023C003");

        for (Student student : studentArray) {
            student.displayDetails();
            System.out.println();
        }
    }
}

//OPG 4 
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 9.99);
        book.displayDetails();
        book.setPrice(8.99);
        book.displayDetails();
    }
}
