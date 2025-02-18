package java_basics;

public class Polymorphism {
        void makeSound() {
            System.out.println("Sounds");
        }
    }

    class Dog extends Polymorphism  {
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    class Main {
        public static void main(String[] args) {
            Polymorphism obj = new Dog();
            obj.makeSound();
        }
    }


