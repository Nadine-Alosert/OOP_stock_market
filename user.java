import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
AUTHOR:NADINE ALOSERT
This is a class to diplay the 
user's/investor's balance, 
number of shares they have and
options to whether they want top
sell their stocks or buy more stocks.
 */
public class user
{
    // instance variables - replace the example below with your own
    private String user;//user name
    private double balance;//how much money the user has
    private int noOfShares;//how many shares the user has
    private List <String>sharesOwned;//list of shares owned by the user at a time
  
   //contructor to initalise variables
    public user(double bal, int no,String username){
        user=username;
        balance = bal;
        noOfShares= no;
    }//END constructor user
    
    //level 3 
    public List listOfShares(String a,String b){//Arraylist containing a record of shares owned, bought or sold from the user
    List <String>sharesOwned = new ArrayList<String>();
    sharesOwned.add(a);//first argument to add to list
    sharesOwned.remove(b);//second argument to remove from list
    return sharesOwned;//returns list
    }//END listOfShares
   
    //setters and getters to access private variables
    
    public String getUsername(){
        return user;
    }

    public String setUsername(String u){
        user =u;
        return user;
    }
    
    public double getBalance(){
        return balance;
    }

    public double setBalance(double b){
        balance = b;
        return balance;
    }
    
     public int getNoOfShares(){
        return noOfShares;
    }

    public int setNoOfShares(int no){
        noOfShares=no;
        return noOfShares;
    }
}//END class user

   
