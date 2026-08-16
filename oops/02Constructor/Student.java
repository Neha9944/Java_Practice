
public class Student {

    //instance variables
    String name;
    int age;

    // Default constructor
    Student(){
        System.out.println("This is Default constructor.");
    }
     // Parametrized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;

         System.out.println("This is Prametrize constructor.");
    }

    void getDetails(){
        
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        
        Student s1 = new Student();

        Student s2 = new Student("Niharika",25);
            s2.getDetails();

        Student s3 = new Student("Niharika",25);
            s3.getDetails();

    }
}