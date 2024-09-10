import java.util.Scanner;
public class NameOfWeekdays {

    public class WeekdayFinder {
        public static void main(String[] args) {
            // Array to store names of weekdays starting from Sunday
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            // Create a Scanner object to read input from the console

            // Prompt the user for the day position

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter the day position (0 for Sunday to 6 for Saturday): ");
                // Read the user input
                int dayPosition = scanner.nextInt();

                // Print the corresponding day name
                System.out.println("The day is: " + weekdays[dayPosition]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle the case where the index is out of bounds
                System.out.println("Error: Day index out of range. Please enter a number between 0 and 6.");
            } catch (Exception e) {
                // Handle any other exceptions (e.g., input mismatch)
                System.out.println("Error: Invalid input. Please enter a valid integer.");
            }
            // Close the scanner to free up resources
        }
    }
}
