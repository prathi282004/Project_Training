package java_basics;

public class Encapsulation {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
     class Name {
        public static void main(String[] args) {
            Encapsulation p = new Encapsulation();
            p.setName("Abc");
            System.out.println(p.getName());
        }
    }


