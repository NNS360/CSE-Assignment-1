package assignment01;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("CSE 131 Grade for: ");
		String name = in.nextLine();
		System.out.print("Average assignment grade: ");
		double averageAssignmentGrade = in.nextDouble();
		System.out.print("Number of extension points: ");
		double extensionPoints = in.nextDouble();
		System.out.print("Number of studios attended: ");
		double studiosAttended = in.nextDouble();
		System.out.print("Average quiz grade: ");
		double averageQuizGrade = in.nextDouble();
		System.out.print("Studio preps completed: ");
		double studioPrepsCompleted = in.nextDouble();
		System.out.print("Average exam grade: ");
		double averageExamGrade = in.nextDouble();
		
		double weightedAssignmentGrade = ((averageAssignmentGrade*.30*100)/100.0);
		double weightedExtensionGrade = ((extensionPoints/40)*10.0);
		double weightedStudioGrade = ((studiosAttended/8)*10.0);
		double weightedQuizGrade = ((averageQuizGrade*.02)*100.0);
		double weightedStudioPrepGrade = ((studioPrepsCompleted*.2*100)/100.0);
		double weightedExamGrade = ((averageExamGrade*.45)*100.0);
		
		
		double roundOff1 = (Math.round(weightedQuizGrade)/100.0);
		double roundOff2 = (Math.round(weightedExamGrade)/100.0);
		
		double TotalGrade = (weightedAssignmentGrade + weightedExtensionGrade + weightedStudioGrade + roundOff1 + weightedStudioPrepGrade + roundOff2);
		
		boolean courseReview = (Math.random() > 0.5);
		
		System.out.println("      ");
		System.out.println("Results: ");
		System.out.println("      ");
		System.out.println("Weighted assignment grade (out of 30): " + weightedAssignmentGrade + "%");
 		System.out.println("Weighted extension grade (out of 10): " + weightedExtensionGrade + "%");
		System.out.println("Weighted studio grade (out of 10): " + weightedStudioGrade + "%");
		System.out.println("Weighted quiz grade (out of 2): " + roundOff1 + "%");
		System.out.println("Weighted studio prep grade (out of 2): " + weightedStudioPrepGrade + "%");
		System.out.println("Weighted exam grade (out of 45): " + roundOff2 + "%");
		System.out.println("Completed course review: " + courseReview);
		System.out.println("Total Grade: " + TotalGrade + "%");
	}

}
