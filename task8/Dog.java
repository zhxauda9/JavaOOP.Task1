package JavaOOP.task8;

public class Dog extends Animal{
    protected String breed;
    public Dog(String name,String food,boolean isFeed,String noise, String location, String breed) {
        super(name,food,isFeed,noise,location);
        this.breed = breed;
    }
    public Dog(String name,String noise, String location, String breed) {
        super(name,noise,location);
        this.breed = breed;
    }
    public Dog(String name, String location, String breed) {
        super(name,location);
        this.breed = breed;
    }
    public Dog(String name,String breed) {
        super(name);
        this.breed = breed;
    }
    public void makeNoise(String name, String noise,String breed) {
        System.out.println(breed+" dog "+name+ "says"+noise);
    }
    public void eat(String name,boolean isFeed,String breed) {
        if(isFeed){
            System.out.println(breed+" dog "+name+" is fed");
        }
        else{
            System.out.println(breed+" dog "+name+" is eating " + food);
        }
    }
    public void sleep(String name, String breed) {
        System.out.println(breed+" dog "+name+" is sleeping");
    }
}
