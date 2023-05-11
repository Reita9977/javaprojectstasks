class Task1 {
    public static void main(String[] args) {
        var person = new Person();
        person.initialize();
        person.print();

        System.out.println();

        var staffMember = new Staff();
        staffMember.initialize();
        staffMember.print();

        // Salary.shouldReceiveBonus(0);
    }
}

class Person {
    String firstName;
    String lastName;
    String street;
    String city;
    String zipCode;

    Person() {
    }

    void initialize() {
        var in = System.console();

        System.out.println("Enter your first name: ");
        firstName = in.readLine();
        System.out.println("Enter your last name: ");
        lastName = in.readLine();
        System.out.println("Enter your street: ");
        street = in.readLine();
        System.out.println("Enter your city: ");
        city = in.readLine();
        System.out.println("Enter your zip code: ");
        zipCode = in.readLine();
    }

    void print() {
        System.out.println("\n======//======");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Street: " + street);
        System.out.println("City: " + city + ", " + zipCode);
    }
}

class Staff extends Person implements Salary {
    String education;
    String position;

    Staff() {
        super();
    }

    void initialize() {
        super.initialize();
        var in = System.console();

        System.out.println("Enter your education: ");
        education = in.readLine();
        System.out.println("Enter your position: ");
        position = in.readLine();
    }

    void print() {
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

    @Override
    public int salaryToPay(int hours, int rate) {
        return hours * rate;
    }

}

interface Salary {
    // should override
    int salaryToPay(int hours, int rate);

    // may override
    default int salaryForOvertime(int hoursOvertime, int rateOvertime) {
        return hoursOvertime * rateOvertime;
    }

    // can't override
    // can be called like this: Salary.shouldReceiveBonus(yearsOfExperience)
    static boolean shouldReceiveBonus(int yearsOfExperience) {
        if (yearsOfExperience > 3) {
            return true;
        }
        return false;
    }
}
