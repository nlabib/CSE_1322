import java.util.*;
import java.io.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file name for 1st file:");
		String f1 = sc.next();
		System.out.print("Enter the file name for second file");
		String f2 = sc.next();
		System.out.println("");		
		int lnum = 1;
		try {
			Scanner l1 = new Scanner(new File(f1));
			Scanner l2 = new Scanner(new File(f2));

			String line1, line2;

			// scan each line till the end of file
			while (l1.hasNextLine() && l2.hasNextLine()) {
				line1 = l1.nextLine();
				line2 = l2.nextLine();

				// if both are not equal then print in given format
				if (!line1.equals(line2)) {
					System.out.println("Line " + lnum);
					System.out.println("< " + line1);
					System.out.println("> " + line2);
				}
				lnum++;
			}

			// to check if total lines of both files are different
			if ((l1.hasNextLine() && !l2.hasNextLine()) || (!l1.hasNextLine() && l2.hasNextLine())) {
				System.out.println("Files have different number of lines");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
