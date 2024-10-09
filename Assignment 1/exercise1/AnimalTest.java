import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> Animal_list = new ArrayList<>();
        ArrayList<Mammal> Mammal_list = new ArrayList<>();
        ArrayList<Bird> Bird_list = new ArrayList<>();
        ArrayList<Dog> Dog_list = new ArrayList<>();

        Animal animal1 = new Animal("Poppa"){
            public String getAnimalType(){
                return "Unknown animal";
            }

            public void makeSound(){
                System.out.println("Named Animal sound");
            }

        };
        Animal animal2 = new Animal("Kevin"){
            public String getAnimalType(){
                return "Unknown animal";
            }

            public void makeSound(){
                System.out.println("Named Animal sound");
            }

        };
        Animal animal3 = new Animal(){
            public String getAnimalType(){
                return "Unknown animal";
            }

            public void makeSound(){
                System.out.println("Unknown Animal sound");
            }

        };
        Animal animal4 = new Animal(){
            public String getAnimalType(){
                return "Unknown animal";
            }

            public void makeSound(){
                System.out.println("Unknown Animal sound");
            }

        };
        ArrayList<Parrot> Parrot_list = new ArrayList<>();


        Animal_list.add(animal1);
        Animal_list.add(animal2);
        Animal_list.add(animal3);
        Animal_list.add(animal4);

        Mammal mammal1 = new Mammal("Joseph the Spiny Ant Eater");
        Mammal mammal2 = new Mammal("Michael the platypus");
        Mammal mammal3 = new Mammal();
        Mammal mammal4 = new Mammal();
        Mammal_list.add(mammal1);
        Mammal_list.add(mammal2);
        Mammal_list.add(mammal3);
        Mammal_list.add(mammal4);

        Bird bird1 = new Bird("ZAZU");
        Bird bird2 = new Bird("Mango");
        Bird bird3 = new Bird();
        Bird bird4 = new Bird();
        Bird_list.add(bird1);
        Bird_list.add(bird2);
        Bird_list.add(bird3);
        Bird_list.add(bird4);


        Dog dog1 = new Dog("November");
        Dog dog2 = new Dog("Diego");
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog_list.add(dog1);
        Dog_list.add(dog2);
        Dog_list.add(dog3);
        Dog_list.add(dog4);

        Parrot parrot1 = new Parrot("September");
        Parrot parrot2 = new Parrot("Zumba");
        Parrot parrot3 = new Parrot();
        Parrot parrot4 = new Parrot();
        Parrot_list.add(parrot1);
        Parrot_list.add(parrot2);
        Parrot_list.add(parrot3);
        Parrot_list.add(parrot4);




        System.out.println("\n"+"Mammals making sounds");
        for(Mammal mam : Mammal_list){
           mam.makeSound();
        }

        System.out.println("\n"+"Birds making sounds");
        for(Bird bir : Bird_list){
           bir.makeSound();
        }

        System.out.println("\n"+"Dogs making sounds");
        for(Dog d : Dog_list){
           d.makeSound();
        }

        System.out.println("\n"+"Parrots making sounds");
        for(Parrot par : Parrot_list){
           par.makeSound();
        }

        System.out.println("Total number of animals: " + Animal.getNumberOfAnimals());
        System.out.println("Total number of mammals: " + Mammal.getNumberOfMammals());
        System.out.println("Total number of birds: " + Bird.getNumberOfBirds());
    
    }
}
