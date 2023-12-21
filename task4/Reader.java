package JavaOOP.task4;

class Reader {
    public String fullName;
    public int card_num;
    public String faculty;
    public String birthdate;
    public String phone;
    public int numberOfbooks;

    public Reader(String fullName, int card_num, String faculty, String birthdate, String phone, int numberOfbooks) {
        this.fullName = fullName;
        this.card_num = card_num;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.phone = phone;
        this.numberOfbooks = numberOfbooks;
    }

    public String takebooks() {
        String info = fullName + " took " + numberOfbooks + " books: ";
        return info;
    }

    public String returnbooks() {
        String info = fullName + " returned " + numberOfbooks + " books: ";
        return info;
    }
}


