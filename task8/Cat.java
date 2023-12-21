package JavaOOP.task8;

public class Cat extends Animal{
    protected String color;
    public Cat(String name,String food,boolean isFeed,String noise, String location, String color) {
        super(name,food,isFeed,noise,location);
        this.color = color;
    }
    public Cat(String name,String noise, String location, String color) {
        super(name,noise,location);
        this.color = color;
    }
    public Cat(String name, String location, String color) {
        super(name,location);
        this.color = color;
    }
    public Cat(String name,String color) {
        super(name);
        this.color = color;
    }
    public void makeNoise(String name, String noise,String color) {
        System.out.println(color+" cat "+name+ "says"+noise);
    }
    public void eat(String name,boolean isFeed,String color) {
        if(isFeed){
            System.out.println(color+" cat "+name+" is fed");
        }
        else{
            System.out.println(color+" cat "+name+" is eating " + food);
        }
    }
    public void sleep(String name, String color) {
        System.out.println(color+" cat "+name+" is sleeping");
    }
}
