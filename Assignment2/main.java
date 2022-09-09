import java.util.ArrayList;
import java.util.Random;

public class main{
	 public static double inchesToMM(double inches){
		double mili = inches * 25.4;
		return mili;
	}
	public static double last3YearinInches(ArrayList<Double> av){
		if(av.size() <= 3){
			return 100;
		}else{
			double sum = 0;
			int size = av.size();
			for(int i = (size - 1);  i >= (av.size() - 3); i--){
				double temp = (double) av.get(i);
				sum += temp;
			}

			double average = sum / 3;
			return average;
		}
	}
	public static void fire(ArrayList<Double> av, Tree tree){
		double last3yearav = last3YearinInches(av);
		if(last3yearav < .5){
			System.out.println("Oh no we had a\n" + "fire! ");
			tree.setMyChar('|');
		}else{
			tree.setMyChar('V');
		}
	}
	public static double inchRain(ArrayList<Double> rain){
		Random rainRandom = new Random();
		double rainwater = rainRandom.nextDouble(0,2.0);
		rain.add(rainwater);
		return rainwater;
	}
	public static void main(String[] args){
		Tree tree = new Tree(0);
		ArrayList<Double> rainFall = new ArrayList<Double>();

		for(int i = 0; i < 20; i++){
			System.out.println("Year: " + i);
			double rainfallinch = inchRain(rainFall);
			double rainfallmm = inchesToMM(rainfallinch);
			System.out.println("Rain this year: " + rainFall+"inches" + " or " + rainfallmm + "mm ");
			tree.grow(rainfallmm);
			tree.drawMe();
			fire(rainFall, tree);
		}



	}


}
