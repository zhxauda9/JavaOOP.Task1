package JavaOOP.task8;

public class Horse extends Animal {
    protected boolean horseshoe;

    public Horse(String name, String food, boolean isFeed, String noise, String location, boolean horseshoe) {
        super(name, food, isFeed, noise, location);
        this.horseshoe = horseshoe;
    }

    public Horse(String name, String noise, String location, boolean horseshoe) {
        super(name, noise, location);
        this.horseshoe = horseshoe;
    }

    public Horse(String name, String location, boolean horseshoe) {
        super(name, location);
        this.horseshoe = horseshoe;
    }

    public Horse(String name, boolean horseshoe) {
        super(name);
        this.horseshoe = horseshoe;
    }

    public Horse(String name) {
        super(name);
        this.horseshoe = false;
    }
    public void makeNoise(String name, String noise, String color, boolean horseshoe) {
        System.out.println(color + " cat " + name + "says" + noise);
    }

    public void eat(String name, boolean isFeed, boolean horseshoe) {
        if (isFeed) {
            if (horseshoe) {
                System.out.println("Horse with horseshoe" + name + " is fed");
            } else {
                System.out.println("Horse" + name + "is fed");
            }
        } else {
            if (horseshoe) {
                System.out.println("Horse with horseshoe" + name + " is eating " + food);
            } else {
                System.out.println("Horse" + name + " is eating " + food);
            }
        }
    }

    public void sleep(String name, boolean horseshoe) {
        if (horseshoe) {
            System.out.println(name + " horse with horseshoes is sleeping");
        } else {
            System.out.println(name + "horse is sleeping");
        }
    }
}
