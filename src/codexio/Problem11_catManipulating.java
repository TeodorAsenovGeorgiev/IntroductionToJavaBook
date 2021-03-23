package codexio;

public class Problem11_catManipulating {
    public static class Cat{
        private String name;
        private  String color;

        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getColor(){
            return this.color;
        }
        public void setColor(String color){
            this.color = color;
        }
        //Default Constructor
        public Cat(){
            this.name = "Unnamed";
            this.color="gray";

        }
        // Constructor with parameters
        public Cat(String name, String color){
            this.name = name;
            this.color = color;
        }

        //Method sayMiau
        public void sayMiau(){
            System.out.printf("Cat %s said: Miauuuuu!%n",name);
        }


    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.name = "Alfred";
        myCat.color = "Green";
        myCat.sayMiau();
        System.out.printf("My cat: %s is %s",myCat.name, myCat.color);

        System.out.println();

        Cat sysCat = new Cat();
        System.out.printf("The color of cat %s is %s",sysCat.name,sysCat.color);

        System.out.println();

        Cat momCat = new Cat("Mac", "White");
        System.out.printf("The color of cat %s is %s",momCat.name,momCat.color);
    }
}
