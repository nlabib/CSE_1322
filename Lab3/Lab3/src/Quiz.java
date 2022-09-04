import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
	static ArrayList<Question> questionSets = new ArrayList<Question>();
	Scanner uin = new Scanner(System.in);
	public void addQuestion(){
		System.out.print("What is the question Text?\n");
		String q = uin.nextLine();
		System.out.println("What is the answer?\n");
		String qans = uin.nextLine();
		System.out.println("How Difficult(1-3)\n");
		int dif = uin.nextInt();
		Question question = new Question(q, qans, dif);
		questionSets.add(question);
	}

	public void removeQuestions(){
		for()
	}
}
