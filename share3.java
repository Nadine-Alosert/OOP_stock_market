import java.util.Scanner;
/*
   A subclass that has inherited 
   methods and variables from
   its superclass investment
   Some methods will be 
   overrriden
   */
public class share3 extends Investment 
{
    final double discountRate=7.3524;//constants for calculations
    final double growthRate=1.9523;//constants for calculations
  
        public share3(String name,String sym, int v, double o, double c, double eps, double ncp){
            super(name,sym,v,o,c,eps,ncp);
        }//END constructor share3    
        
       public int volumeChange(int i){
        int  volume= getVolume();  
        
        if( (i==1)||(i==3)||(i==6)||(i==9)){
      
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
    
    public double openPriceChange(int i){
        
        double open=getOpen();
        //each month different rate of change to imitate the sudden dips and peaks in a stockmarket
        //below shows different calulations dependant on the month chosen
        if(i==1){
           open= ((i+3)*(open) + ((i*4)+open))/(discountRate-growthRate);//months chosen has to be one of these
        }
        else if(i==3){
            open = (i*2*open)/(discountRate-growthRate);
        }
        else if(i==6){
            open = (open/(i+2))*(discountRate-growthRate);
        }
        else if(i==9){
            open = (((i*3)+open) + (i+open))/(discountRate-growthRate);
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            openPriceChange(i);
        }
        return open;
    }//END openPriceChange
    
    public double closePriceChange(int i){
        double close=getClose();
        //each month different rate of change to imitate the sudden dips and peaks in a stockmarket
        //below shows different calulations dependant on the month chosen
        if( (i==1)||(i==3)||(i==6)||(i==9)){
           close= ((i+3)*(close) + (close-(close/1.25)))/(discountRate-growthRate);//months chosen has to be one of these
        }
        else if(i==3){
            close = ((i*2)/(discountRate-growthRate))+close;
        }
        else if(i==6){
            close= (close/(i+2))*(discountRate-growthRate);
        }
        else if(i==9){
            close = (((i*3)+close)*(close*1.25))/(discountRate-growthRate);
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
        
        double EPS = getEPS();
        if( (i==1)||(i==3)||(i==6)||(i==9)){//months chosen has to be one of these 
           EPS= (EPS*10)/(i+3) ;
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            EPSChange(i);
        }
        return EPS;
    }//END EPSChange  
}//END class Share3
