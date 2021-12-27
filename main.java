 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 AUTHOR NADINE ALOSERT
 This is a the main class 
 with class method main that 
 creates objects and isntances 
 This class displays subtitue 
 principle and 
 */
public class main{

    //main method, class method
    public static void main(String[]param){//start main method, a static class method
        
            //ask user for input of inital state of the market
            Scanner s = new Scanner(System.in);//for user keyboard input 
        
            System.out.println("Hello user!");//intro
        
            //get details of user and their inital state to store and update later
            System.out.println("Please state your name:");
            String userName = s.nextLine();
            
            System.out.println("Please state your current balance");//how much money the user has to invest/show gain of profit
            double balance = s.nextDouble();
            
            System.out.println("Please state your current number of owned shares");//initial number of shares owned
            int ownedShares = s.nextInt();// in this simulation there's max 3 shares
            
            user user1 = new user(balance,ownedShares,userName);//create variable user1 of type user to store user's profile details
            
            if(ownedShares==0){//no need to add names of shares since none owned
                
               System.out.println("Type in the data for any 3 company shares you're interested in");//move onto details of 3 shares
            }
            else if (ownedShares==1){//ask for name of only share
                
            System.out.println("Please state the names of currently owned shares");
            String ownedShareName1 = s.next();
            user1.listOfShares(ownedShareName1, "");//add 1 share name to arraylist of user's owned shares (and remove nothing indicated by empty String)
            
            }
            else if(ownedShares==2){//ask for name of each of the 2 shares owned
                
            System.out.println("Please state the first name of currently owned shares");
            String ownedShareName1 = s.next();
            //add first share name to arraylist of user's owned shares(and remove nothing indicated by empty String)
            user1.listOfShares(ownedShareName1, "");
            System.out.println("Please state the second name of currently owned shares");
            String ownedShareName2 = s.next();
            //add second share name to arraylist of user's owned sharesand remove nothing indicated by empty String)
            user1.listOfShares(ownedShareName2, "");
            
            }
            else if(ownedShares==3){// in this simulation there's max 3 shares
            System.out.println("Please state the first name of currently owned shares");
            String ownedShareName1 = s.next();
            //add first share name to arraylist of user's owned shares(and remove nothing indicated by empty String)
            user1.listOfShares(ownedShareName1, "");
            System.out.println("Please state the second name of currently owned shares");
            String ownedShareName2 = s.next();
            //add second share name to arraylist of user's owned sharesand remove nothing indicated by empty String)
            user1.listOfShares(ownedShareName2, "");
            System.out.println("Please state the third name of currently owned shares");
            String ownedShareName3 = s.next();
            //add third share name to arraylist of user's owned shares(and remove nothing indicated by empty String)
            user1.listOfShares(ownedShareName3, "");
            
            }
            
            else{
                System.out.println("Unrecognised value, or outside of bound- please try again");// in this simulation there's max 3 shares
                user1.listOfShares(null, null);
            }
            
            //display inital user profile
            System.out.println("And here is your profile");
            System.out.println("Username: "+ user1.getUsername());
            System.out.println("Current Balance: "+ user1.getBalance());
            System.out.println("Number of shares owned: "+ user1.getNoOfShares());
            System.out.println("Share Names: "+ user1.listOfShares("",""));
            
            Investment shareOne = new share1("","",0,0,0,0,0);//create object of type investment, showing subititution principle
            Investment shareTwo = new share2("","",0,0,0,0,0);//create object of type investment, showing subititution principle
            Investment shareThree = new share3("","",0,0,0,0,0);//create object of type investment, showing subititution principle
            
            System.out.println("Type in the data for any 3 company shares you're interested in");//move onto details of 3 shares
            
            for (int j=1; j<=3; j++){//for loop to enter inital info about each of the 3 shares
            
                System.out.println("Enter the details for company "+ j + "'s share");//ask for details of each share to be stored in market class
        
                System.out.println("Enter name of company");
                    String companyName = s.next();
                    
                System.out.println("Enter symbol for share");
                    String sym = s.next();
                    
                System.out.println("Enter volume of this share");
                    int v= s.nextInt();
                    
                System.out.println("Enter open priceof the Share(OP) ");
                    double OP= s.nextDouble();
                    
                System.out.println("Enter close price of the Share(CP) ");
                    double CP = s.nextDouble();
                    
                System.out.println("Enter earnings per share(EPS) ");
                    double EPS = s.nextDouble();
                    
                System.out.println("Enter net change percentage(NCP) ");
                    double NCP = s.nextDouble();
            
                if(j==1){//share1 details
                 shareOne = new share1(companyName,sym,v,OP,CP, EPS, NCP); //Fill in inital info about share1      
                  Market mar= new Market();//create variable mar to store info about share1
                  //set initial value of share1 to store in mar
                  mar.setNameOfShare(companyName);
                  mar.setSymbol(sym);
                  mar.setVolume(v);
                  mar.setOpeningPrice(OP);
                  mar.setClosingPrice(CP);
                  mar.setEPS(EPS);
                  mar.setNCP(NCP);
                  
                  System.out.println("Here are the inital details of the share provided");//display inital status of each share in the market
                  //get values set and print initial status of the shares given 
                  System.out.println("Name of share: "+ mar.getNameOfShare());
                  System.out.println("share symbol: " + mar.getSymbol());
                  System.out.println("Volume: "+ mar.getVolume());
                  System.out.println("Open: " + mar.getOpeningPrice());
                  System.out.println("Close: " + mar.getClosingPrice());
                  System.out.println("Earnings per share: "+ mar.getEPS());
                  System.out.println("Net change price: " + mar.getNCP());
                }
                else if (j==2){//share2 details
                shareTwo = new share2(companyName,sym,v,OP,CP, EPS, NCP);//Fill in inital info about share2 
                Market mar2= new Market(); //create variable mar2 to store info about share2
                  //set initial value of share1 to store in mar2
                  mar2.setNameOfShare(companyName);
                  mar2.setSymbol(sym);
                  mar2.setVolume(v);
                  mar2.setOpeningPrice(OP);
                  mar2.setClosingPrice(CP);
                  mar2.setEPS(EPS);
                  mar2.setNCP(NCP);
                  
                  
                  System.out.println("Here are the inital details of the share provided");//display inital status of each share in the market
                  //get values set and print initial status of the shares given 
                  System.out.println("Name of share: "+ mar2.getNameOfShare());
                  System.out.println("share symbol: " + mar2.getSymbol());
                  System.out.println("Volume: "+ mar2.getVolume());
                  System.out.println("Open: " + mar2.getOpeningPrice());
                  System.out.println("Close: " + mar2.getClosingPrice());
                  System.out.println("Earnings per share: "+ mar2.getEPS());
                  System.out.println("Net change price: " + mar2.getNCP());
                }
                else if(j==3){//share3 details
                 shareThree = new share3(companyName,sym,v,OP,CP, EPS, NCP);//Fill in inital info about share3 
                Market mar3= new Market(); //create variable mar3 to store info about share3
                  //set initial value of share1 to store in mar3
                  mar3.setNameOfShare(companyName);
                  mar3.setSymbol(sym);
                  mar3.setVolume(v);
                  mar3.setOpeningPrice(OP);
                  mar3.setClosingPrice(CP);
                  mar3.setEPS(EPS);
                  mar3.setNCP(NCP);
                  
                  System.out.println("Here are the inital details of the share provided");//display inital status of each share in the market
                  //get values set and print initial status of the shares given 
                  System.out.println("Name of share: "+ mar3.getNameOfShare());
                  System.out.println("share symbol: " + mar3.getSymbol());
                  System.out.println("Volume: "+ mar3.getVolume());
                  System.out.println("Open: " + mar3.getOpeningPrice());
                  System.out.println("Close: " + mar3.getClosingPrice());
                  System.out.println("Earnings per share: "+ mar3.getEPS());
                  System.out.println("Net change price: " + mar3.getNCP());
                }
            }
             
            
            //ask what to inspect and what time period
            System.out.println("Which share do you want to look at? share1/share2/share3? leave no gaps and type in all lowercase");
            String shareLook= s.next();
            
            if(shareLook.equals("share1")){//update values for each share over given time
              System.out.println("How many time in months you want to go to?");
                 int time= s.nextInt();  
                 int volume1 = shareOne.volumeChange(time);
                 double open1 = shareOne.openPriceChange(time);
                 double close1 = shareOne.closePriceChange(time);
                 double EPS1= shareOne.EPSChange(time);
                 double NCP1= shareOne.NCPChange(open1, close1);
                 
                 System.out.println("Share 1 at" + time + " months:");
                 System.out.println("volume: "+ volume1);
                 System.out.println("openPrice: £"+ open1);
                 System.out.println("closePrice: £"+ close1);
                 System.out.println("EPS: £"+ EPS1);
                 System.out.println("NCP: "+ NCP1+ " %");
            }
            else if(shareLook.equals("share2")){//update values for each share over given time
                 System.out.println("How many time in months you want to go to?");
                 int time= s.nextInt();
                 
                 int volume2 = shareTwo.volumeChange(time);
                 double open2 = shareTwo.openPriceChange(time);
                 double close2 = shareTwo.closePriceChange(time);
                 double EPS2= shareTwo.EPSChange(time);
                 double NCP2= shareTwo.NCPChange(open2, close2);
                 
                 System.out.println("Share 2 at" + time + " months:");
                 System.out.println("volume: "+ volume2);
                 System.out.println("openPrice: £"+ open2);
                 System.out.println("closePrice: £"+ close2);
                 System.out.println("EPS: £"+ EPS2);
                 System.out.println("NCP: "+ NCP2+ " %");
                }
            else if(shareLook.equals("share3")){//update values for each share over given time
                 System.out.println("How many time in months you want to go to?");
                 int time= s.nextInt();
                 
                 int volume3 = shareThree.volumeChange(time);
                 double open3 = shareThree.openPriceChange(time);
                 double close3 = shareThree.closePriceChange(time);
                 double EPS3= shareThree.EPSChange(time);
                 double NCP3= shareThree.NCPChange(open3, close3);
                 
                 System.out.println("Share 3 at" + time + " months:");
                 System.out.println("volume: "+ volume3);
                 System.out.println("openPrice: £"+ open3);
                 System.out.println("closePrice: £"+ close3);
                 System.out.println("EPS: £"+ EPS3);
                 System.out.println("NCP: "+ NCP3+ " %");
                }
                
             System.out.println("What share do you want to sell or buy?");
                
               
            System.exit(0);
    }//END MAIN METHOD
}//END MAIN CLASS


