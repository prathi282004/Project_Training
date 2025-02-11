package JavaBasics;

public class Inheritance {
    String name;
}
    class Find extends Inheritance {
        public void display() {
            name = "abc";
        }
    }
        class Java {
            public static void main(String[] args) {
                Find obj = new Find();
                obj.display();
                System.out.println("The name is : " + obj.name);
            }
        }
