/*
Class: CSE 1322L
Section: w2
Term: Fall 2022
Instructor: Kavitha Muppa
Name: Nasimul Labib
Lab#: Assignment4A
*/
public class StockItem{
    private String productDescription;
    private int id;
    private float price;
    private int quantity;
    static int counter = 0;
    
    public StockItem(){
        productDescription = " ";
        id = 0;
        price = 0.0f;
        quantity = 0;
	//this is a test
    }


    public StockItem(String pd, float p, int q){
        this.productDescription = pd;
        this.price = p;
        this.quantity = q;
        this.id = counter++;
    }
    //Getter
    public String getProductDescription(){
        return productDescription;
    }
    public int getId(){
        return id;
    }
    public float getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    

    // Setter
    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNewPrice(float p){
       if(p <= 0){
           System.out.println("Price is below 0. ");
       }
       else this.price = p;
    }
    public void lowerQuntatiy(int q){
       if(quantity <= 0){
           System.out.println("Quanity can't be zero");
       }
       else{this.quantity -= q;}
    }
    public void raiseQuntatiy(int q){
       this.quantity += q;
    }

    @Override
    public String toString(){
        String hello = "Milk: Item number: " + getId() +" is  "+getProductDescription() +" has price "+ getPrice() + " we currently have " +getQuantity()+" in stock";
        return hello;
    }

}
