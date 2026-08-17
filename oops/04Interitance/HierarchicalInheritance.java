class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
        System.out.println("--------------------");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
        System.out.println("--------------------");
    
    }
}


public class HierarchicalInheritance{
    public static void main(String[] args) {
        
        Dog d1 = new Dog();

        d1.eat();
        d1.bark();

        Cat c1 = new Cat();

        c1.eat();
        c1.meow();
    }
}