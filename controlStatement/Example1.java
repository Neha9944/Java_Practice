package controlStatement;

public class Example1 {
    public static void main(String[] args) {
        int age = 20;

        //If statement
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }


        //if-else statement
        int num = 10;
    if(num > 0){
        System.out.println("Number is positive");
    }else{
        System.out.println("Number is negative");
    }

    //else-if statement
    int marks = 65;
    
    if(marks >= 75){
        System.out.println("Grade A");
    }else if(marks >= 60){
        System.out.println("Grade B");
    }else {
        System.out.println("Grade C");
    }

     //nested if-else
        int experience = 10;
        boolean isActive = true;
        
    if(experience >= 5){

        if(isActive){
            System.out.println("promoted");
        }else{
            System.out.println("Not promoted");
        }
        
    }
    }
    
}
