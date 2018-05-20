package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Is Roblox better than Fortnite?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("No"))
		// 4.  if the user's answer is correct
		JOptionPane.showMessageDialog(null, "The correct answer is No");
		// -- add one to their score 
		score++;
	
	JOptionPane.showMessageDialog(null, "Your score is"+ score);
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	
	answer = JOptionPane.showInputDialog("Are you a human?");
		if(answer.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "The correct answer is Yes");
		score++;
	}
	
	JOptionPane.showMessageDialog(null, "Your final score is"+ score );
	// 6.  After all the questions have been asked, print the user's score 
	
	}
}	



