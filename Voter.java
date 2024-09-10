public class Voter {


    // Custom Exception Class for Voter Age Validation
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Voter Class
    class Voter {
        // Attributes of the Voter class
        private String voterId;
        private String name;
        private int age;

        // Parameterized constructor
        public Voter(String voterId, String name, int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age for voter");
            }
            this.voterId = voterId;
            this.name = name;
            this.age = age;
        }

        // Method to display voter information
        public void displayInfo() {
            System.out.println("Voter ID: " + voterId + ", Name: " + name + ", Age: " + age);
        }
    }

}
