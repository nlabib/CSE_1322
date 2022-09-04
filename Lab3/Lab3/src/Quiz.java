import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
	private static ArrayList<Question> questionSets = new ArrayList<Question>();
	Scanner uin = new Scanner(System.in);
	public void addQuestion(){
		System.out.print("What is the question Text?\n");
		String q = uin.nextLine();
		System.out.print("What is the answer?\n");
		String qans = uin.nextLine();
		System.out.print("How Difficult(1-3)\n");
		int dif = uin.nextInt();
		Question question = new Question(q, qans, dif);
		questionSets.add(question);
	}
	//Loops throug all the question then removes the questions
	public void removeQuestions(){
		System.out.println("Choose the question to remove?");
		for(int i = 0; i < questionSets.size(); i++){
			System.out.println((i+": " + questionSets.get(i).getQuestionText()));
		}
		//Takes input from use and removes the question set form the list of questions.
		int removeq = uin.nextInt();
		questionSets.remove(removeq);
	}

	public void modifyQuestions(){
		System.out.println("Which question would you like to modify? ");
		for(int i = 0; i < questionSets.size(); i++){
			System.out.println((i+": " + questionSets.get(i).getQuestionText()));
		}
		int mq = uin.nextInt();
		System.out.print("What is the question Text?\n");
		String q = uin.nextLine();
		System.out.print("What is the answer?\n");
		String qans = uin.nextLine();
		System.out.print("How Difficult(1-3)\n");
		int dif = uin.nextInt();
		questionSets.get(mq).setQuestionText(q);
		questionSets.get(mq).setQuestionText(qans);
		questionSets.get(mq).setLvlOfDif(dif);
	}

	private static int answerCorrect  = 0;

	public static int getAnswerCorrect(){
		return answerCorrect;
	}

	public void giveQuiz(){
		//Quiz loop
		for(int i =0; i< questionSets.size(); i++){
			System.out.println(questionSets.get(i).getQuestionText());
			String user_answer = uin.nextLine();
			if(user_answer.equals(questionSets.get(i).getQuestionAnswer())){
				System.out.println("You got the Answer correct");
				answerCorrect++;
			}
			else{
				System.out.println("Incorrect Answer");
			}
		}
		// Prints how many they got correct
		System.out.println("You got " + getAnswerCorrect() + " correct out of " + questionSets.size());
	}
}
