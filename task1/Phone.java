package JavaOOP.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number=number;
        this.model=model;
        this.weight=0.0d;
    }
    public Phone(String number) {
        this.number=number;
        this.model="";
        this.weight=0.0d;
    }
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
    public void receiveCall(String callName) {
        System.out.println("+" + callName + "- is ringing");
    }
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is ringing. Call from: +" + callerNumber);
    }

    public void sendMessage(String phoneNumber) {
        if (phoneNumber.length() == 0){
            System.out.println("Please input the number");
        } else {
            System.out.println("Sending message to number: +" + phoneNumber);
        }
    }
}

