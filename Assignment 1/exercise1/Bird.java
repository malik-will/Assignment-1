public class Bird extends Animal{
    static int numberofBirds=0;

    public Bird(){
        super();
        numberofBirds++;
        System.out.println("Bird Constructor called");
    }
    
    public Bird(String name){
        super(name);
        numberofBirds++;
        System.out.println("Bird Constructor with name called");
    }

    public void makeSound() {
        System.out.println("Bird sound");
    }

    public String getAnimalType() {
        return "Bird";
    }

    public int getNumberOfAnimals() {
        return numberofBirds;
    }

}