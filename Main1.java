import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects;
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        double totalScore = SubjectScores(scanner,numSubjects);
        double averageScore = Average(totalScore,numSubjects);
        char finalGrade = FinalGrade(averageScore);
        displayResult(finalGrade);
        scanner.close();
    }

    // Method to get scores for each subject
    private static double SubjectScores(Scanner scanner, int numSubjects) {
        double totalScore = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the score for Subject " + i + "(Out of 100 marks) :");
            double score = scanner.nextDouble();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                i--;
                continue;
            }

            totalScore = totalScore + score;
        }
        return totalScore;
    }

    private static double Average(double totalScore, int numSubjects) {
        return totalScore / numSubjects;
    }

    private static char FinalGrade(double averageScore) {
        if (averageScore >=90) {
            return 'A';
        } else if (averageScore>=80) {
            return 'B';
        } else if (averageScore>= 70){
            return 'C';
        } else if (averageScore >=60){
            return 'D';
        } else {
            return 'F';
        }
    }

    private static void displayResult(char finalGrade) {
        System.out.println("\nFinal Grade: " + finalGrade);
        if (finalGrade == 'A' || finalGrade == 'B' || finalGrade == 'C') {
            System.out.println("Congratulations You Passed.");
        } else {
            System.out.println("Sorry, You Failed.");
        }
    }
}
