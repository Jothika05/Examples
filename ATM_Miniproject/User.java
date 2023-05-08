package ATM_Miniproject;
//database of user
public class User {
      private int account_id;
      private String name;
      private int pin;
      private double balance;
      
     public User(int id,String n,int p,double b)
       {
    	this.account_id=id;
    	this.name=n;
    	this.pin=p;
    	this.balance=b;
    	
    	}
//setter
    public void setPin(int pin) {
		this.pin = pin;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
 //getter   
	public int getAccount_id() {
		return account_id;
	}

	public String getName() {
		return name;
	}

	public int getPin() {
		return pin;
	}
	public double getBalance() {
		return balance;
	}

	
	

	
    

	

}
