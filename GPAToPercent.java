import java.util.Scanner;

public class GPAToPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for GPA input
        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = scanner.nextDouble();
        
        // Convert GPA to integer format for switch case
        int gpaKey = (int) (gpa * 10);
        
        String percentRange;
        
        // Switch statement to determine percent range
        switch (gpaKey) {
            case 40: percentRange = "100% to 95.0%"; break;
            case 39: percentRange = "< 95.0% to 94.0%"; break;
            case 38: percentRange = "< 94.0% to 93.0%"; break;
            case 37: percentRange = "< 93.0% to 92.0%"; break;
            case 36: percentRange = "< 92.0% to 91.0%"; break;
            case 35: percentRange = "< 91.0% to 90.0%"; break;
            case 34: percentRange = "< 90.0% to 89.0%"; break;
            case 33: percentRange = "< 89.0% to 88.0%"; break;
            case 32: percentRange = "< 88.0% to 87.0%"; break;
            case 31: percentRange = "< 87.0% to 86.0%"; break;
            case 30: percentRange = "< 86.0% to 85.0%"; break;
            case 29: percentRange = "< 85.0% to 84.0%"; break;
            case 28: percentRange = "< 84.0% to 83.0%"; break;
            case 27: percentRange = "< 83.0% to 82.0%"; break;
            case 26: percentRange = "< 82.0% to 81.0%"; break;
            case 25: percentRange = "< 81.0% to 80.0%"; break;
            case 24: percentRange = "< 80.0% to 79.0%"; break;
            case 23: percentRange = "< 79.0% to 78.0%"; break;
            case 22: percentRange = "< 78.0% to 77.0%"; break;
            case 21: percentRange = "< 77.0% to 76.0%"; break;
            case 20: percentRange = "< 76.0% to 75.0%"; break;
            case 19: percentRange = "< 75.0% to 74.0%"; break;
            case 18: percentRange = "< 74.0% to 73.0%"; break;
            case 17: percentRange = "< 73.0% to 72.0%"; break;
            case 16: percentRange = "< 72.0% to 71.0%"; break;
            case 15: percentRange = "< 71.0% to 70.0%"; break;
            case 14: percentRange = "< 70.0% to 69.0%"; break;
            case 13: percentRange = "< 69.0% to 68.0%"; break;
            case 12: percentRange = "< 68.0% to 67.0%"; break;
            case 11: percentRange = "< 67.0% to 66.0%"; break;
            case 10: percentRange = "< 66.0% to 65.0%"; break;
            case 0: percentRange = "< 65.0% to 0.0%"; break;
            default: percentRange = "Invalid GPA input. Please enter a value between 0.0 and 4.0.";
        }
        
        // Display the corresponding percent range
        System.out.println("The corresponding percent range is: " + percentRange);
        
        scanner.close();
    }
}
