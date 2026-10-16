public class inheritance{
    public static void main(String args[]){
        Animal a=new Animal();
        a.eat();
        Dog d=new Dog();
        d.eat();
        d.bark();
        
    }
}

class Animal{        //base class (parent)
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{          //child class (derived class) syntax me extends keyword use hota
    void bark(){
        System.out.println("barking...");
    }
}