import java.util.Scanner;

public class ChartSuggestor {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input the purpose of the chart
        System.out.println("Please type in the purpose of the chart:");
        System.out.println("P for comparing with the whole");
        System.out.println("B for showing the maximum value");
        System.out.println("D for frequency of items in each category");
        System.out.println("H for frequency of items within each category");
        System.out.println("S for showing how many in each category except that it looks different");

        // Read the user's input and convert it to uppercase
        String userInput = scan.nextLine().toUpperCase();

        String chartType = ""; // Initialize a variable to store the recommended chart type

        // Switch statement to suggest a chart type based on the user's input
        switch (userInput) {
            case "P":
                chartType = "Pie Chart";
                break;
            case "B":
                chartType = "Bar Chart";
                break;
            case "D":
                chartType = "Dot Chart";
                break;
            case "H":
                chartType = "Histogram";
                break;
            case "S":
                chartType = "Stem and Leaf";
                break;
            default:
                // Display error message for invalid input
                System.out.println("Invalid input. Please enter P, B, D, H, or S.");
                return;
        }

        // Print the recommended chart type based on the user's input
        System.out.println("Based on your input, we suggest using a " + chartType + ".");
    }
}
