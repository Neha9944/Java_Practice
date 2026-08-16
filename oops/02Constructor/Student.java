
public class Student {

    // instance variables
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("This is Default constructor.");
    }
    // Parametrized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("This is Prametrize constructor.");
    }
    void getDetails() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {

        Student std1 = new Student();

        Student std2 = new Student("Niharika", 25);
        std2.getDetails();

        Student std3 = new Student("Niharika", 25);
        std2.getDetails();

    }
}