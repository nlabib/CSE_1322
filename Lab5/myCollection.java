import java.util.Scanner;

public class myCollection{
	public static void main(String[] args){
		Scanner userin = new Scanner(System.in);
		Item[] items = new Item[5];
		System.out.println("Please enter B for Book or P for Periodical");
		char choice = userin.nextLine().charAt(0);
		choice = Character.toUpperCase(choice);
		for(int i = 0; i < 5; i++){
			System.out.println("Please enter B for Book or P for Periodical");
			 choice = userin.nextLine().charAt(0);
			choice = Character.toUpperCase(choice);
			if(choice == 'B'){
				System.out.println("Please enter the name of the Book");
				String name = userin.nextLine();
				System.out.println("Please enter the author of the Book");
				String author = userin.nextLine();
				System.out.println("Please enter the ISBN of the Book");
				int isbn = userin.nextInt();
				items[i] = new Book(name, isbn, author);
			}else{
				System.out.println("Please enter the name of the Periodical");
				String name = userin.nextLine();
				System.out.println("Please enter the issue number");
				int issueNumber = userin.nextInt();
				items[i] = new Periodical(name, issueNumber);
			}
			userin.nextLine();
			}
		System.out.println("Your Items");
		for(int i =0; i<5; i++){
			System.out.println(items[i].getListing());
		}
		}

	}


