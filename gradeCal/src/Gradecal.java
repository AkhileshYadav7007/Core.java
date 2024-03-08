import java.util.Scanner;

public class Gradecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        
        double totalScore = 0;

        
        for (int i = 1; i <= numSubjects; ) {
            System.out.print("Enter the score for Subject " + i + ": ");
            double score = scanner.nextDouble();

            
            if (score >= 0 && score <= 100) {
                totalScore += score;
                i++; 
            } else {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
            }
        }

       
        double averageScore = totalScore / numSubjects;

        
        System.out.println("\nFinal Grade: " + calculateFinalGrade(averageScore));

       
        scanner.close();
    }


    public static String calculateFinalGrade(double averageScore) {
        if (averageScore >= 60) {
            return "Congratulations You Pass: :)";
        } else {
            return "Congratulations You Fail: !!";
        }
    }
}
