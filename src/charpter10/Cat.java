package charpter10;

public class Cat {
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
        this.name = "U`nnamed";
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
