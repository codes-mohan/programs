
import java.util.logging.Level;
import java.util.logging.Logger;




public class pizzaOnline {
    private float totalSales;
    float order(pizza pizza){
        float amount= pizza.calculateprice();
        return amount;
    }
    float getTotalSales(){
        int sales=vegpizza.vegcount+nonvegpizza.nonvegcount;
        return sales;
    }
public static void main(String args[]) 
{
    
    pizzaOnline po=new pizzaOnline();
    vegpizza vp1=new vegpizza(9,"PLAIN");
    nonvegpizza nvp1=new nonvegpizza(12,"DELUXE");
    vegpizza vp2=new vegpizza(6,"SUPREME");
    @SuppressWarnings("unused")
	nonvegpizza nvp3=new nonvegpizza(6,"DEUXE");
    Float price=po.order(vp1);
    System.out.println("price of first order= " +price);
    price=po.order(nvp1);
    System.out.println("priceof second order= " +price);
    price=po.order(vp2);
    System.out.println("price of third order= "+price);
    System.out.println("total sales till now= "+po.getTotalSales());

}
}

abstract class pizza{

	abstract float calculateprice();
        public boolean validate(int size,String type){
            if((size==6||size==9||size==12)&&(type=="PLAIN"||type=="DELUXE"||type=="SUPREME"))
                return true;
            else
                return false;
            
        }
}

class vegpizza extends pizza{
static int  vegcount=0;	
    private int size;
        String type;
          float price=0;

        public vegpizza(int size,String type) {
           vegcount++;
            boolean b=super.validate(size, type);
            if(b){
                this.size=size;
           this.type=type;
            }
            else{
           
               try {
                   throw new InvalidPizzaException("invalid");
               } catch (InvalidPizzaException ex) {
                  System.out.print("error");
               }
          }
            
}
        @Override
        public float calculateprice(){
  
switch(type)
{
    case "PLAIN":
        price=size*50;
        break;
    case "DELUXE":
        price=(size*50)+100;
        break;
    case "SUPREME":
        price=(size*50)+150;
        break;
}

return price;
}
}
        

class nonvegpizza extends pizza{
    static int nonvegcount;
private int size;
        String type;
float price=0;
        public nonvegpizza(int size,String type) {
            nonvegcount++;
            boolean b=super.validate(size, type);
            if(b){
                this.size=size;
           this.type=type;
            }
            else{
                
                try {
                    throw new InvalidPizzaException("invalid");
                } catch (InvalidPizzaException ex) {
                    Logger.getLogger(nonvegpizza.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
           
           
}
public float calculateprice(){
    
switch(type)
{
    case "PLAIN":
        price=size*100;
        break;
    case "DELUXE":
        price=(size*100)+150;
        break;
    case "SUPREME":
        price=(size*100)+200;
        break;
}
return price;
}	
}

@SuppressWarnings("serial")
class InvalidPizzaException extends Exception{
    public InvalidPizzaException(String message)
    {
      System.out.println(message);
    }
}

