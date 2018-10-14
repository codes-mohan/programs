/*



class Account
{
    private int accId;
    private double balance;
    
    Account(int id,double bal)
    {
        accId = id;
        balance = bal;
    }
    public void deposit(double amt)
    {
        if(amt < 0)
            System.out.println("Invalid Deposit Operation");
        else
            balance+=amt;
    }
    public void withdraw(double amt)
    {
        if(amt > balance)
            System.out.println("Invalid Withdraw Operation");
        else
            balance-=amt;
    }
    public void display()
    {
        System.out.println("\n *** Account : "+this.accId+"***");
        System.out.println("Account ID : "+accId);
        System.out.println("Balance : "+balance);
    }
}
public class BankDemo {
    
    
    public BankDemo() {
    }
  
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
        // TODO code application logic here
        Account acc[] = new Account[3];
        acc[0] = new Account(1,1000.00);
        acc[1] = new Account(2,2000.00);
        acc[2] = new Account(3,3000.00);
        ArrayList arr = new ArrayList(10);
        arr.add(acc[0]);
        arr.add(acc[1]);
        arr.add(acc[2]);
        Iterator iterator = arr.iterator();
        while(iterator.hasNext())
        {
            Account a = (Account) iterator.next();
            a.display();
        }
        
    }
    
}



/*





*/