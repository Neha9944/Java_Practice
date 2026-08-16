
public class Student {

    //instance variable
  String name;
  int age;

  //method
  void getDetails(){
    System.out.println("Student's name : " + name);
    System.out.println("Student's age : " + age);
    System.out.println("------------------");
  }

  public static void main(String[] args) {
    
    //object creation
    Student std1 = new Student();
    std1.name = "Niharika";
    std1.age = 25;

    Student std2 = new Student();
    std2.name = "Ankit";
    std2.age = 27;

    //method calling
    std1.getDetails();
    std2.getDetails();



  }
    
}