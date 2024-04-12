package railway;

public class Passenger {
    private String name;
    private int age;
    private char gender;
    private String berthPreference;
    private String berthType; // New attribute for berth type

    public Passenger(String name, int age, char gender, String berthPreference) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berthPreference = berthPreference;
        this.berthType = ""; // Initialize berth type as empty string
    }

    // Getter and setter methods for berthType
    public String getBerthType() {
        return berthType;
    }

    public void setBerthType(String berthType) {
        this.berthType = berthType;
    }

    // Other getter methods for existing attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getBerthPreference() {
        return berthPreference;
    }

    // Override toString() method to provide passenger details
    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", berthPreference='" + berthPreference + '\'' +
                ", berthType='" + berthType + '\'' +
                '}';
    }
}
