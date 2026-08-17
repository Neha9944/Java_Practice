
 class InnerStudent {
    private String name;
    private int age;
    private double marks;

    InnerStudent(String stdName, int stdAge, int stdMarks){
        this.name = stdName ;
        this.age = stdAge;
        this.marks = stdMarks;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getMarks(){
        return marks;
    }

    public void setAge(int stdAge){
        if(stdAge >= 5 && stdAge <= 100){
            age = stdAge;
        }else{
            System.out.println("Invalid age");
        }
    }
    
    public void setMarks(int stdMarks){
        if(stdMarks >= 0 && stdMarks <= 100){
            marks = stdMarks;
        }else{
            System.out.println("Invalid Marks");
        }
    }

    public void getStdDetails(){
        System.out.println("Student Name : " +name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
    }
    
}


public class Student {
    public static void main(String[] args) {
        InnerStudent  std1 = new InnerStudent("Niharika", 30, 70);

        std1.getStdDetails();

        std1.setMarks(95);
        std1.setAge(25);

        System.out.println("Updated age : " + std1.getAge());
        System.out.println("Updated marks : "+ std1.getMarks());

        std1.setAge(4);
        
    }
}
