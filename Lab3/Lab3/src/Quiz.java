import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
	static ArrayList<Question> q1 = new ArrayList<Question>();
	Scanner uin = new Scanner(System.in);
	public void add_question(){
		System.out.print("What is the question Text?\n");
		String question = uin.nextLine();
		System.out.println("What is the answer?\n");
		String qans = uin.nextLine();
		System.out.println("How Difficult(1-3)");


	}
}
