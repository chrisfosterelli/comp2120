/* COMP2120 Seminar 4 Assignment
 * PreformAnalysis.java - Main class to preform analysis
 * Christopher Foster
 * October 3, 2012 */

public class PreformAnalysis {

	/* Main method */
	public static void main(String args[]) {
		// Create the data structures
		// COMP2120 -> 10 Questions
		// 	    -> 14 Participants
		// CHEM0500 -> 13 Questions
		// 	    ->  1 Participant
		// ENGL1100 ->  1 Question
		// 	    -> 15 Participants
		char[][][] answers = {
			{ // COMP2120
				{'F','T','F','F','T','F','F','T','F','T'}, // Answer key
				{'F','T','T','F','T','F','T','T','F','T'},
				{'F','T','F','T','F','T','T','T','F','F'},
				{'F','T','T','F','T','T','T','T','T','T'},
				{'T','T','F','F','T','F','F','T','T','T'},
				{'T','T','F','T','T','T','F','F','T','F'},
				{'T','T','T','T','T','T','T','T','T','T'},
				{'F','T','F','F','F','T','F','T','F','T'},
				{'T','F','T','F','T','F','T','F','T','F'},
				{'T','T','T','F','F','T','T','F','T','F'},
				{'F','F','F','F','F','F','F','F','F','F'},
				{'T','F','T','T','F','T','T','F','T','F'},
				{'F','T','F','F','T','T','F','F','F','T'},
				{'F','T','F','T','F','T','F','T','F','T'},
				{'T','F','T','F','T','T','F','T','F','T'}
			},
			{ // CHEM0500
				{'T','F','T','T','F','F','T','T','F','T','F','T','T'}, // Answer key
				{'F','T','T','F','T','T','T','T','F','T','F','F','F'}
			},
			{ // ENGL110
				{'F'}, // Answer key
				{'F'},
				{'T'},
				{'F'},
				{'T'},
				{'T'},
				{'F'},
				{'T'},
				{'F'},
				{'T'},
				{'F'},
				{'T'},
				{'T'},
				{'F'},
				{'T'},
				{'T'}
			}
		};

		int[][] students = {
			{ // COMP2120
				1080, 1340, 1341, 1401, 1462, 
				1463, 1464, 1512, 1618, 1619, 
				1687, 1700, 1712, 1837
			},
			{ // CHEM0500
				1100
			},
			{ // ENGL1100
				1600, 1233, 1321, 1230, 1284,
				1231, 4123, 4908, 4984, 2111,
				9898, 1232, 1231, 3333, 4444
			}
		};

		// Create the TestAnalysis objects for each class
		TestAnalysis comp2120 = new TestAnalysis(students[0], answers[0]);
		TestAnalysis chem0500 = new TestAnalysis(students[1], answers[1]);
		TestAnalysis engl1100 = new TestAnalysis(students[2], answers[2]);

		// Calculate and render the analytics
		System.out.println("========================================");
		System.out.println("==             COMP2120               ==");
		System.out.println("========================================\n");
		System.out.println("= Student Marks =");
		System.out.println(comp2120.analyseStudentMarks());
		System.out.println("= Question Statistics =");
		System.out.println(comp2120.analyseQuestionStats());
		System.out.println("= Information =");
		System.out.println("Number of Questions: " + comp2120.getQuestions());
		System.out.println("Number of Participants: " + comp2120.getParticipants());
		System.out.println();

		System.out.println("========================================");
		System.out.println("==             CHEM0500               ==");
		System.out.println("========================================\n");
		System.out.println("= Student Marks =");
		System.out.println(chem0500.analyseStudentMarks());
		System.out.println("= Question Statistics =");
		System.out.println(chem0500.analyseQuestionStats());
		System.out.println("= Information =");
		System.out.println("Number of Questions: " + chem0500.getQuestions());
		System.out.println("Number of Participants: " + chem0500.getParticipants());
		System.out.println();

		System.out.println("========================================");
		System.out.println("==             ENGL1100               ==");
		System.out.println("========================================\n");
		System.out.println("= Student Marks =");
		System.out.println(engl1100.analyseStudentMarks());
		System.out.println("= Question Statistics =");
		System.out.println(engl1100.analyseQuestionStats());
		System.out.println("= Information =");
		System.out.println("Number of Questions: " + engl1100.getQuestions());
		System.out.println("Number of Participants: " + engl1100.getParticipants());
		System.out.println();

		System.out.println("\nAnalytics report complete.");
	}
}
