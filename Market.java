import java.util.Scanner;
/*
   AUTHOR Nadine Alosert
   This is a class that displays the 
   different shares within different 
   companies with their price-earning
   ratio,volume,rank,  and their share price
   
   */
public class Market 
{
    // instance variables 
    private String nameOfShare;//name of share in the company
    private String symbol;//symbol of the share in the company
    private int volume;//the number of shares provided for sale in the company
    private double openingPrice;//the starting price of a share
    private double closingPrice;//the closing price of a share
    private double EPS;//earnings per share
    private double NCP;//netChangePercentage;
    
    public Market (){//initalise values of private variables in class constructor
        nameOfShare= "";
        symbol = "";
        volume = 0;
        openingPrice = 0;
        closingPrice = 0;
        EPS = 0;
        NCP = 0;
    }//END CONSTRUCTOR FOR MARKET
    
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
    
    public void setVolume(int v){
        volume=v;
    }
    
    public int getVolume(){
        return volume;
    }
    public void setOpeningPrice(double o){
        openingPrice=o;
    }
    public double getOpeningPrice(){
        return openingPrice;
    }
     public void setClosingPrice(double c){
        closingPrice=c;
    }
    public double getClosingPrice(){
        return closingPrice;
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
    
    

}
