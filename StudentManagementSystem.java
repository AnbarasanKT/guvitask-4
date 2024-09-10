
// Custom Exception for Age Validation
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception for Name Validation
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    // Attributes of the Student class
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        if (!isNameValid(name)) {
            throw new NameNotValidException("Name cannot contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to validate name
    private boolean isNameValid(String name) {
        // Regular expression to check if name contains only letters and spaces
        return name.matches("[a-zA-Z ]+");
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}


