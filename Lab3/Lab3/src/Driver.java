import java.util.Scanner;

public class Driver{
	public static void main(String[] args){
		Quiz newquiz = new Quiz();
		boolean exit = false;
		int userinput = 0;
		Scanner userin = new Scanner(System.in);
		while(userinput != 5){
			System.out.println("1. Add a question to the quiz");
			System.out.println("2. Remove a question from the quiz");
			System.out.println("3. Modify a question in the quiz");
			System.out.println("4. Take the quiz");
			System.out.println("5. Quit");
			System.out.println("What would you like to do?");
			userinput = userin.nextInt();
			switch(userinput){
				case 1:
				{
					newquiz.addQuestion();
					break;
				}
				case 2:{
					newquiz.removeQuestions();
					break;
				}
				case 3:{
					newquiz.modifyQuestions();
					break;
				}
				case 4: {
					newquiz.giveQuiz();
					break;
				}
				case 5:{
					userinput = 5;
					break;
				}
			}
		}

	}
}
