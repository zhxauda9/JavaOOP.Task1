package JavaOOP.task8;

public class Animal {
    protected String name;
    protected String food;
    protected boolean isFeed;
    protected String noise;
    protected String location;

    public Animal(String name,String food,boolean isFeed,String noise, String location) {
        this.name=name;
        this.food = food;
        this.isFeed=isFeed;
        this.noise=noise;
        this.location = location;
    }
    public Animal(String name,String noise, String location) {
        this.name=name;
        this.food = "";
        this.isFeed=true;
        this.noise=noise;
        this.location = location;
    }
    public Animal(String name,String noise) {
        this.name=name;
        this.food = " ";
        this.isFeed=true;
        this.noise=noise;
        this.location = " ";
    }
    public Animal(String name) {
        this.name=name;
        this.food = " ";
        this.isFeed=true;
        this.noise=" ";
        this.location = " ";
    }

    public void makeNoise(String name, String noise) {
        System.out.println(name+"says"+noise);
    }

    public void eat(String name,boolean isFeed) {
        if(isFeed){
            System.out.println(name+" is fed");
        }
        else{
        System.out.println(name+" is eating " + food);
        }
    }

    public void sleep(String name) {
        System.out.println(name+" is sleeping");
    }
}