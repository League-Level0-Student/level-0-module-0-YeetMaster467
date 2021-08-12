package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String answer = JOptionPane.showInputDialog("What computer language is this program written in?");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equalsIgnoreCase("Java")) {
					score += 1;
				}else {
					score -= 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		String answer2 = JOptionPane.showInputDialog("When was the original Xbox realeased?");
		if(answer2.equals("2001")) {
			score += 1;
		}else {
			score -= 1;
		}
		String answer3 = JOptionPane.showInputDialog("What kind of animal is a squid?");
		if(answer3.equalsIgnoreCase("Mollusk")) {
			score += 1;
		}else {
			score -= 1;
		}
		String answer4 = JOptionPane.showInputDialog("Are marshmelloes vegan?");
		if(answer4.equalsIgnoreCase("No")) {
			score += 1;
		}else {
			score -= 1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		JOptionPane.showMessageDialog(null, "Your score was a " + score + " out of a possible 4.");
		// After all the questions have been asked, tell the user their final score 
		
	}
}
