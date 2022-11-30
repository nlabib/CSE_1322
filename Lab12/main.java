import java.util.*;
import java.io.*;

public class main{

	public static void main(String[] args) throws Exception {


		//creating BlueRayCollection object which will hold the collection list
		BlueRayCollection blueRayCollection=new BlueRayCollection();

		//Scanner object for taking input
		Scanner sca=new Scanner(System.in);

		//menu display loop
		while(true) {
			System.out.println("0. Quit");
			System.out.println("1. Add BlueRay to Collection");
			System.out.println("2. See Collection");
			int res=sca.nextInt();
			if(res==0)
				break;
			else if(res==1) {
				System.out.println("What is the title");
				String title=new Scanner(System.in).nextLine();
				System.out.println("What is the director");
				String director=new Scanner(System.in).nextLine();
				System.out.println("What is year of release");
				int year=sca.nextInt();
				System.out.println("What is the cost");
				double cost=sca.nextDouble();
				//adding prompted values to the list
				blueRayCollection.add(title, director, cost, year);
			}
			else {
				blueRayCollection.show_all();
			}
		}

	}

}
