import java.sql.Time;
import java.util.Scanner;

public class main{

	public static int converter(String time) throws timeException{

		String input[] = time.split(":");
		if(input.length != 3){
			throw new timeException("Enter a valid time");
		}

		int hour = Integer.parseInt(input[0]);
		int min = Integer.parseInt(input[1]);
		int sec = Integer.parseInt(input[2]);

		if(hour <0 ){
			throw new timeException("Hours must be positive.");
		}
		else if(hour >23){
			throw new timeException("Hours must be below 24.");
		}
		else if(min < 0) {
			throw new timeException("Minutes must be positive.");
		}
		else if(min > 59){
			throw new timeException("Minutes must be below 60");
		}
		else if(sec < 0){
			throw new timeException("Seconds must be positive.");
		}
		else if(sec > 59){
			throw new timeException("Seconds must be less than 60.");
		}
		else{
			return hour * 60 * 60 + min * 60 + sec;
		}
	}

	public static void main(String[] args){
		Scanner userin = new Scanner(System.in);
		String userinput;
		int time1 = 0;
		int time2 = 0;
		int difference;
		try{
			System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
			userinput = userin.nextLine();
			time1 = converter(userinput);
			System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS) ");
			userinput = userin.nextLine();
			time2 = converter(userinput);

			if(time1 > time2){
				difference = time1 - time2;
			}
			else{
				difference = time2 - time1;
			}
			System.out.println("Difference in seconds: " + difference);
		}
		catch(timeException e){
			System.out.println(e.getMessage());
		}

	}

}
