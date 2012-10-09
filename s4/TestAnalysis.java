/* COMP2120 Seminar 4 Assignment
 * TestAnalysis.java - Test Analysis Class
 * Christopher Foster
 * October 2, 2012 */

public class TestAnalysis {
	
	/* Instance variables */
	private int[] students;
	private char[][] answers;

	/* Constructor */
	public TestAnalysis(int[] studentNumbers, char[][] studentAnswers) {
		this.students = studentNumbers;
		this.answers = studentAnswers;
	}

	/* toString method */
	public String toString() {
		// Print out the student marks by default
		return this.analyseStudentMarks();
	}

	/* Returns the number of participants */
	public int getParticipants() {
		return this.students.length;
	}

	/* Returns the number of questions */
	public int getQuestions() {
		return this.answers[0].length;
	}

	/* Returns string with results of student mark analysis */
	public String analyseStudentMarks() {
		String analysis = new String("Student #\t\tCorrect\n");

		// Iterate through the answer sets
		// this.answers[0] is the key, so ignore it
		for (int i = 1; i < this.answers.length; i++) {
			int correct = 0;

			// Iterate through the answers in the set
			for (int j = 0; j < this.answers[i].length; j++) {
				// Compare their answer to the key
				if (this.answers[i][j] == this.answers[0][j]) {
					correct += 1;
				}
			}

			// Append the student number
			analysis += (this.students[i-1] + "\t\t\t");
			// Append the number of correct answers
			analysis += (correct + "/" + this.answers[i].length + "\n");
		}
		return analysis;
	}

	/* Returns string with results of per question analysis */
	public String analyseQuestionStats() {
		String analysis = new String("Question\t\tAnswer\t\tCorrect\t\tIncorrect\n");

		// Iterate over the answer key
		for (int i = 0; i < this.answers[0].length; i++) {
			int correct = 0;

			// Iterate over the answer sets
			// Ignore this.answers[0] as it is the answer key
			for (int j = 1; j < this.answers.length; j++) {
				// Compare the key to their answer
				if (this.answers[0][i] == this.answers[j][i]) {
					correct += 1;
				}
			}

			// Append the question number (add one for readability)
			analysis += ((i+1) + "\t\t\t");
			// Append the correct answer from the answer key
			analysis += (this.answers[0][i] + "\t\t");
			// Append the number of correct answers
			analysis += (correct + "\t\t");
			// Append the calculated number of incorrect answers
			analysis += (((this.answers.length-1)-correct) + "\n");
		}

		return analysis;
	}
}
