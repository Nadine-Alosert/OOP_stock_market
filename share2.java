import java.util.Scanner;
/*
   A subclass that has inherited 
   methods and variables from
   its superclass investment
   Some methods will be 
   overrriden
   */
public class share2 extends Investment 
{
    private double maxValueForShare;//maximum expected price for a share
    private double minValueForShare;//minimum expected price for a share
    final double discountRate=6.21;//constants for calculations
    final double growthRate=2.25;//constants for calculations
  
        public share2(String name,String sym, int v, double o, double c, double eps, double ncp){//constructor for the class to initalise values
            super(name,sym,v,o,c,eps,ncp);//take user input and place as inital values 
            maxValueForShare= c*10;
            minValueForShare=o/5;
        }//END constructor share2
        
        //setter and getters for private variables 
        
        public double setMaxValueForShare(double max){
                maxValueForShare = max;
                return maxValueForShare;
        }//END setMaxValueForShare
        
        public double getMaxValueForShare(){
                return maxValueForShare;
        }//END getMaxValueForShare
        
        public double setMinValueForShare(double min){
                minValueForShare = min;
                return minValueForShare;
        }//END setMinValueForShare
        
        public double getMinValueForShare(){
                return minValueForShare;
        }//END getMinValueForShare
        
        public int volumeChange(int i){//the amount of shares per company
            int volume= getVolume();
        if( (i==1)||(i==3)||(i==6)||(i==9)){//values of volume of shares available changes depending on the months selected
       
        for(int j=0; j<i; j++){ 
          volume = volume +20+i;
        }
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            volumeChange(i);
        }
        return volume;
    }//END volumeChange
    
    public double openPriceChange(int i){//the starting value of each share in the company changes in value dependant on the months selected
        double open = getOpen();
        if( (i==1)||(i==3)||(i==6)||(i==9)){
           open= ((i+2)*(open) + ((i*3)+open))/(discountRate-growthRate);//months chosen has to be one of these
           //the simulator gives advice on when to buy or not
           if(open<getMinValueForShare()){
               System.out.println("This is cheaper than expected, it is recommended to buy now");
            }
            else if(open>getMaxValueForShare()){
                System.out.println("This is more expensive than expected, it is not recommended to buy now");
                System.out.println("This is a higher price than expected, it is recommended to sell now");
            }
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            openPriceChange(i);
        }
        return open;
    }//END openPriceChanges
    
    public double closePriceChange(int i){
        double close=getClose();
        if( (i==1)||(i==3)||(i==6)||(i==9)){
           close= ((i+2)*(close) + (close-(close/2.5)))/(discountRate-growthRate);//months chosen has to be one of these
           //the simulator gives advice on when to buy shares or not
           if(close<getMinValueForShare()){
               System.out.println("This is cheaper than expected, it is recommended to buy now");
            }
            else if(close>getMaxValueForShare()){
                System.out.println("This is share is worth more than expected, it is recommended to sell now but not recommended to buy now");
            }
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            closePriceChange(i);
        }
        return close ;
    }//END closePriceChange
    
    public double EPSChange(int i){//earnings changes in value per months chosen at the same rate
        double EPS= getEPS();
        if( (i==1)||(i==3)||(i==6)||(i==9)){//months chosen has to be one of these 
           EPS= (EPS*10)/(i+2) ;
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            EPSChange(i);
        }
        return EPS;
    }//END EPSchanges
          
}//END class share2
