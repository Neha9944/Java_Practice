 class Animal {
 public String name;
 
 public void eat(){
    System.out.println("Animal is eatting");
 }

 public void sleep(){
    System.out.println("Animal is sleeping");
 }
    
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
         
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();
    }
}
