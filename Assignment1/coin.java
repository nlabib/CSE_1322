public class coin{

private int quantityOnHand;
private float denomination;
private float weight;

public coin(float d, float w){
	this.denomination = d;
	this.weight = w;
}

public float getTotalWeight(){
	float total = (float) quantityOnHand * weight;
	return total;
}
public float getTotalValue(){
	float total = denomination * quantityOnHand;
	return total;
}

public void increaseQuantity(int i){
	 if(quantityOnHand <= 0){
	 	quantityOnHand = 0;
	 }
	 else{
	 	quantityOnHand += i; 
	}
} 

public void decreaseQuantity(int i){
	if(quantityOnHand <= 0){
		quantityOnHand = 0;
	}else{
	 quantityOnHand -= i; 
	}
}

public int getQuantityOnHand(){
	return quantityOnHand;
}

public String printPretty(float amount){
	return("$" + String.format("%4.2f", amount));
}

@Override
public String toString(){
	String print = "$" + getTotalValue + " in " + printPretty;
	return print;
}



}