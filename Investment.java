import java.util.Scanner;
/*
 AUTHOR NADINE ALOSERT
 This is a super class that 
 demonstrates inheritance by 
 passing its variables and methods
 to its subclasses
 */
public class Investment
{
    // instance variables 
    private String nameOfShare;//name of share in the company
    private String symbol;//symbol of the share in the company
    private int timeInMonths;//selected by the user to determine which months to look at the status of the shares
    private int volume;//the number of shares provided for sale in the company
    private double open;//the starting price of a share
    private double close;//the closing price of a share
    private double EPS;//earnings per share
    private double NCP;//netChangePercentage;
        //prices are per units of 100,000(£)    
    public Investment(String name, String sym, int v, double o, double c, double eps, double ncp ){//inital stock market
        //take input received from main and store values in constructor
        nameOfShare = name;
        symbol=sym;
        timeInMonths=0;
        volume=v;
        open=o;
        close=c;
        EPS=eps;
        NCP= ncp;
    }//END of contructor Investment
    
    //setters and getters to access the private variables 
    public void setNameOfShare(String name){
            nameOfShare=name;
    }
    public String getNameOfShare(){
            return nameOfShare;
    }
    public void setSymbol(String s){
            symbol = s;
    }
    public String getSymbol(){
            return symbol;
    }
    
    public void setTimeInMonths(int time){
            timeInMonths=time;
    }
    public int getTimeInMonths(){
            return timeInMonths;
    }
    public void setVolume(int v){
        volume=v;
    }
    public int getVolume(){
        return volume;
    }
    public void setOpen(double o){
        open=o;
    }
    public double getOpen(){
        return open;
    }
     public void setClose(double c){
        close=c;
    }
    public double getClose(){
        return close;
    }
    public void setEPS(double eps){
        EPS=eps;
    }
    public double getEPS(){
        return EPS;
    }
    public void setNCP(double ncp){
        NCP=ncp;
    }
    public double getNCP(){
        return NCP;
    }
    
    public int volumeChange(int i){//Volume changes in value depending on month chosen
        if( (i==1)||(i==3)||(i==6)||(i==9))for(int j=0; j<i; j++){ 
        volume = volume +20;
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            volumeChange(i);
        }
        return volume;
    }//END volumeChange
    
    public double openPriceChange(int i){//starting price changes in value depending on month chosen
        
        if( (i==1)||(i==3)||(i==6)||(i==9)){
           open= (i*(open) + (i+open));//months chosen has to be one of these
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            openPriceChange(i);
        }
        return open;
    }//END openPriceChange
    
    public double closePriceChange(int i){//closing price changes in value depending on month chosen
        
        if( (i==1)||(i==3)||(i==6)||(i==9)){
           close= (i*(close) + (close-(close/10)));//months chosen has to be one of these
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
      
        if( (i==1)||(i==3)||(i==6)||(i==9)){//months chosen has to be one of these 
           EPS= (EPS*10)/i ;
        }
        else{
            System.out.println("Please re-enter the number of months passed");//retry until the given options is entered
            Scanner o = new Scanner(System.in);
            i = o.nextInt();
            EPSChange(i);
        }
        return EPS;
    }
    public double NCPChange(double o, double c){//only non overriden method
        //calulates net change from the starting and ending price in a period
        NCP= ((c-o)/c+o)*100;
        return NCP;
    }
    
}
