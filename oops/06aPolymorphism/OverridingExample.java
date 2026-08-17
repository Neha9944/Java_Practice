class Animal{
    void sound(){
        System.out.println("Animal makes Sound.");
    }
}

class Dogs extends Animal{

      @Override
    void sound(){
        System.out.println("Dog's bark.");
    }
}

class Cats extends Animal {
    @Override
    void sound(){
        System.out.println("Cat's meow.");
    }
    
}

class OverridingExample{
    public static void main(String[] args) {
        
        Animal d = new Dogs();
        Animal c = new Cats();

        d.sound();
        c.sound();
    }


}