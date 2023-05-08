package ATM_Miniproject;

import java.util.*;
import java.text.*;
public class BankController {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  // for input support
        ArrayList<User> table=new ArrayList<>(); //storing user object 
        DateFormat df=new SimpleDateFormat("dd/MM/yy HH:mm:ss"); //date-time format
        Date dateobj=new Date();  //system date-time
        try 
        {
        	table.add(new User(47383839,"Arul" ,1289 ,500000000 ));
        	table.add(new User(19834663,"Jothi" ,2526 ,30000000 ));
        	table.add(new User(63866327,"Sachin" ,5673 ,127863240 ));
        	table.add(new User(78632523,"Ram", 8746,8999000 ));
        	table.add(new User(74126719,"Alex" ,3281 , 32823000));
        	table.add(new User(89618341,"Seetha" ,3282 ,600212));
        	table.add(new User(23709220, "Ramya", 8795,72940000 ));
        	table.add(new User(23788327,"Guna" ,8756 ,4334000 ));
        	table.add(new User(23782872, "Siva", 4747, 23902592));	
        	
        	
        	System.out.println("***********************************************");
        	System.out.println("\tWELCOME STATE BANK OF INDIA \n");
        	while(true)
        	{
        		System.out.println("--------------------------------------------");
        		System.out.println("For New User >> Press 1 -Open new Account");
        		System.out.println("Existing User>> Press 2 -go to login Page \n");
        		System.out.println("---------------------------------------------");
        		
        		int acc,c,found=0,pin,op;
        		User active=null;  //stores user active object
        		double amt;
       		     c=sc.nextInt();

        		switch(c) {
        		case 1:
        			System.out.println("    >>> SIGN UP <<");
        			System.out.println("( Note: Don't  use Space in Name)");
        			System.out.println("Enter First name:");
        			String new_name_f=sc.next();
        			System.out.println("Enter Last name");
        			String new_name_l=sc.next();
        			
        			
        			int random_acc=(int)(Math.random()*(99999999-10000000+1)+1000000);
        			int random_pin=(int)(Math.random()*(9999-1000+1)+1000);
        			
        			table.add(new User(random_acc,(new_name_f+" "+new_name_l),random_pin,0));
        			
        			System.out.println("\n>>New Account Created Successfully<<");
        			System.out.println("New Account No="+random_acc);
        			System.out.println("New pin No="+random_pin);
        			System.out.println("Login to access your new Account & Change your Pin");
        			break;
        			
        		case 2:
        			System.out.println(">> LOGIN  <<");
        			System.out.println("Enter Account Number:");
        			acc=sc.nextInt();
        			Iterator<User> i=table.iterator();
        			while(i.hasNext())
        			{
        				User ur=(User)i.next();
        				if(ur.getAccount_id()==acc)
        				{
        					found=1;
        	        		System.out.println("Enter Pin:");
                            pin=sc.nextInt();
                            if(ur.getPin()==pin)
                             {
 
                            	active=ur; 
                            	System.out.println("\n<Successfully Logged in at >"+df.format(dateobj));
                            	System.out.println("\n Welcome "+active.getName()+"**");
                            	found=2;
                            	break;
                             }
        				}
        			}
        			if(found==0)
        			{
        				System.out.println("\n!!INVALID ACCOUNT NUMBER!!");
        				System.out.println("!!PLEASE  TRY AGAIN LATER!!");
        				System.out.println("\n <Session ended at"+df.format(dateobj)+">\n");
        				System.exit(0);
        				
        			}
        			if(found==1)
        			{
        				System.out.println("\n!!INVALID PIN!!");
        				System.out.println("!!PLEASE  TRY AGAIN LATER!!");
        				System.out.println("\n <Session ended at"+df.format(dateobj)+">\n");
        				System.exit(0);
        				
        			}
        			while(true)
        			{
        				System.out.println("\n--------------------------------------");
        				System.out.println("SELECT OPERATION");
        				System.out.println("1-Update Pin");
        				System.out.println("2-Balance Enquiry");
        				System.out.println("3-Withdraw Money");
        				System.out.println("4-Deposit Money");
        				System.out.println("5-Logout");
        				System.out.println("\n----------------------------------------");
                         int ch=sc.nextInt();
                         switch(ch)
                         {
                         case 1: System.out.println("Enter Old Pin:");
                                 op=sc.nextInt();
                                 if(op==active.getPin())
                                 {
                     				System.out.println("Enter New Pin:");
                     				active.setPin(sc.nextInt());
                    				System.out.println(">> PIN UPDATED SUCCESSFULLY <<");
                                 }
                                 else
                                 {
                     				System.out.println("\n INVALD PIN!! ");
                                 }
                                 break;
                             
                         case 2:System.out.println("AVAILABLE BALANCE = RS."+active.getBalance());
                                break;
                              
                         case 3:System.out.println("\n Enter Amount to be Withdraw: Rs= ");
                                amt=sc.nextDouble();
                                if(amt>active.getBalance())
                    				System.out.println("\n INSUFFICIENT BALANCE");
                                else
                                {
                                    active.setBalance(active.getBalance()-amt);
                    				System.out.println(">> WITHDRAW SUCCESSFULLY <<");
                    				System.out.println("AVAILABLE BALANCE =RS."+active.getBalance());
                    			}
                                break;
                                
                         case 4:System.out.println("\n Enter Amount to be Deposited :Rs.");
                               amt=sc.nextDouble();
                               if(amt>1000000)
                               {
                   				System.out.println("\n Your amount exceeds limit.");
                				System.out.println("Maximum depositing amount at once = Rs. 1000000");
                               }
                               else {
                                   active.setBalance(active.getBalance()-amt);
                                   System.out.println(">> WITHDRAW SUCCESSFULLY <<");
                   				   System.out.println("AVAILABLE BALANCE =RS."+active.getBalance());
                               }
                               break;
                               
                         case 5:System.out.println("\n Thanks for using SBI,visit again :) ");
         				         System.out.println("\n Session Ended at "+df.format(dateobj)+">\n"); 
         				         System.exit(0);
         				         
         				       default:System.out.println("WRONG CHOICE!!\nPress between 1 to 5");
                            }  //end of inner switch
        			   }    //end of inner while
  				     default:System.out.println("WRONG CHOICE!!\nPress between 1 to 2");
        		       }    //end of outer switch
        			}     //end of outer while
        		}  //end of try
        
        catch(Exception e) 
              {
        	      System.out.println("\n !!  WARNING!!\n Please use correct input format");
        		  System.out.println("\n < Session Expired at"+df.format(dateobj)+">\n");
        		}//end of catch
        	}//end of main
        }//end of class