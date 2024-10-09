public abstract class Animal implements SoundsMaker{
    static int numberOfAnimals = 0;
    private String name;

    public Animal(){
        numberOfAnimals++;
        System.out.println("Animal Consturctor called");
        this.name = "Unknown Animal";
    }

    public Animal(String name){
        this.name=name;
        numberOfAnimals++;
        System.out.println("Animal Constructor with name called ");

    }

     abstract String getAnimalType();

     public int getNumberOfAnimals(){
        return numberOfAnimals;
     }
}
