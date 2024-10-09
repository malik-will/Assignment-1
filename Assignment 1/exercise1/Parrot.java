public class Parrot extends Bird{

    public Parrot(){
        super();
        System.out.println("Parrot Constructor Called");
    }

    public Parrot(String name){
        super(name);
        System.out.println("Parrot Constructor wth name called");
    }

    
    public void makeSound(){
        System.out.println("Squak!");
    }

    
    public String getAnimalType(){
        return "The bird is a Parrot";

    }
    
}