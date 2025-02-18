package java_basics;

public class Constructor {
    String name;

    Constructor() {
        name = "abc";
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println("The name is : " + obj.name);
    }
}
