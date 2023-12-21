package JavaOOP.task8;

public class Task8 {
    /*Create the Animal class and the Dog, Cat, Horse classes extending it.
    The Animal class contains food, location variables and makeNoise, eat, sleep methods.
    The makeNoise method, for example, might print "Such an animal is sleeping" to the console.
            Dog, Cat, Horse override the makeNoise, eat methods.
    Add variables to the Dog, Cat, Horse classes that characterize only these animals.
    Create a Veterinary class, in which define the void treatAnimal(Animal animal) method.
    Let this method print out the food and location of the animal that came to the reception.
    In the main method, create an array of type Animal, in which write down the animals of all the types you have.
    In the cycle, send them to the vet.
*/
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Aqtos","meet",true,"Gav-Gav!","in yard","Tazy"),
                new Cat("Рыжик","Meow-Meow!","at home","Orange"),
                new Horse("Spirit","in farm",true)
        };

        Veterinary vet = new Veterinary();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
