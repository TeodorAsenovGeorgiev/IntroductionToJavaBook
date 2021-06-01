package codexio;

public class Problem14_Dog {
    // Property-field definition
    private String name;
    private String owner;

    //Constructor definition
    public Problem14_Dog() {

    }

    //Constructor definition
    public Problem14_Dog(String name,String owner) {
        this.name = name;
        this.owner = owner;

    }

    //Property getter-method definition
    public String getName() {
        return this.name;
    }
    //Property setter- method definition
    public void setName(String name){
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //Method definition
    public void bark(){
        System.out.printf("Dog %s said: Wow-wow!%n",name);
    }

    public static void main(String[] args) {
        Problem14_Dog doggy = new Problem14_Dog("Nia","Zori");

        System.out.printf("%s is owner of dog %s",doggy.getOwner(),doggy.getName());

    }
}