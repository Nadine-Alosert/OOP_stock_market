import java.util.Scanner;
/*
   A subclass that has inherited 
   methods and variables from
   its superclass investment
   Some methods will be 
   overrriden
   */
public class share1 extends Investment
{
    private double maxEarningsForShare;//maximum expected earnings made by the workers per share
    private double minEarningsForShare;//minimum expected earnings made by the workers per share
    final double discountRate=5.732;//constants for calculations
    final double growthRate=3.159;//constants for calculations
  
        public share1(String name,String sym, int v, double o, double c, double eps, double ncp){//constructor
            super(name,sym,v,o,c,eps,ncp);
            //set max and min value to inform the user on any profits or losses
            maxEarningsForShare=eps*100;
            minEarningsForShare=eps/5;
        } //END constructor share1
        
        //setters and getters to access private variables
        public double setMaxEarningsForShare(double max){
                maxEarningsForShare = max;
                return maxEarningsForShare;
        }//END setMaxEarningsForShare
        
        public double getMaxEarningsForShare(){
                return maxEarningsForShare;
        }//END getMaxEarningsForShare
        
        public double setMinEarningsForShare(double min){
                minEarningsForShare = min;
                return minEarningsForShare;
        }//END setMinEarningsForShare
        
        public double getMinEarningsForShare(){
                return minEarningsForShare;
        }//END getMinEarningsForShare
        
        public int volumeChange(int i ){//Volume changes in value depending on month chosen
        int v= getVolume();
        if( (i==1)||(i==3)||(i==6)||(i==9)){
            
        for(int j=0; j<i; j++){ 
          v = v +20+i;
        }
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            volumeChange(i);
        }
        return v;
    }//END volumeChange
    
    public double openPriceChange(int i ){//starting price changes in value depending on month chosen
        double open;
        open = getOpen();
        if( (i==1)||(i==3)||(i==6)||(i==9)){
           open= ((i+1)*(open) + ((i*2)+open))/(discountRate-growthRate);//months chosen has to be one of these
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            openPriceChange(i);
        }
        return open;
    }//END openPriceChange
    
    public double closePriceChange(int i ){//closing price changes in value depending on month chosen
        double close;
        close=getClose();        
        if( (i==1)||(i==3)||(i==6)||(i==9)){
           close= ((i+1)*(close) + (close-(close/5)))/(discountRate-growthRate);//months chosen has to be one of these
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();    
            closePriceChange(i);
        }
        return close ;
    }//END closePriceChange
    
    public double EPSChange(int i){//earnings changes in value per months chosen at the same rate and this method gives advice to the user
       double EPS;
       double maxEPS = getMaxEarningsForShare();
       double minEPS = getMinEarningsForShare();
       EPS= getEPS(); 
       
        if( (i==1)||(i==3)||(i==6)||(i==9)){//months chosen has to be one of these 
           EPS= (EPS*10)/(i+1) ;
           
           if(EPS>maxEPS){
            System.out.println("GREEN LIGHT! " + " this means this share has exceeded expectations and youre making profit!");
            }
            else if(EPS<minEPS){
            System.out.println("RED LIGHT! " + " this means this share has exceeded expectations and you're making a loss!");
            }
            else{
                System.out.println("ORANGE LIGHT! " + " this means this share is within expectations. You're making minor profits or losses");
            }
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            EPSChange(i);
        }  
        return EPS;
    }//END EPSChange    
}//END class share1
