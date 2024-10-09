public class Mammal extends Animal{
    static int numberOfMammals;

    // Constructors
    public Mammal(){
        super();
        numberOfMammals++;
        System.out.println("Mammal constructor called");

    }

    public Mammal(String name){
        super(name);
        numberOfMammals++;
        System.out.println("Mammal constructor called with name called");
    }

    

    

    // Methods
    public void makeSound(){
        System.out.println("Mammal sound");
    }

    public String getAnimalType(){
        return "Mammal";
    }

    public int getNumberOfMammals(){
        return numberOfMammals;
    }
}
