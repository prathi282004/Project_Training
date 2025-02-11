package JavaBasics;

interface Interface {
    void display();
}
    class Target implements Interface {
        String name;

        public void display() {
            name = "abc";
        }
    }

    class Code{
        public static void main(String[] args) {
            Target obj = new Target();
            obj.display();
            System.out.println("The name is : " + obj.name);
        }
    }

