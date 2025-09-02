import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class RandomStudentPicker {
    public static void main(String[] args) {
        String fileName = "students.txt"; // Make sure it's in your project folder

        try {
            // Read all lines from file into a list
            List<String> students = Files.readAllLines(Paths.get(fileName));

            if (students.isEmpty()) {
                System.out.println("No students found in the file!");
                return;
            }

            // Generate random index
            Random rand = new Random();
            int randomIndex = rand.nextInt(students.size());

            // Print selected student
            System.out.println("Selected student: " + students.get(randomIndex));

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
