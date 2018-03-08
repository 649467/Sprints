
/* Created by InteliJ Idea

 *User: Nicholas Gaultney
 *Date: 3/8/2018
 *Time: 10:47 AM
 *Contact: nmgaultney@gmail.com
 */

abstract public class stockDividend {
    private String stockName;
    private double sharePrice;
    private int numShares;
    private double shareDividend;

    public String getStockName(){
        return stockName;
    }

    public double getSharePrice(){
        return sharePrice;
    }

    public int getNumShares(){
        return numShares;
    }

    public double getShareDividend(){
        return shareDividend;
    }

    public void setStockName(String newStockName){
        stockName = newStockName;
    }

    public void setSharePrice(double newSharePrice){
        sharePrice = newSharePrice;
    }

    public void setNumShares(int newNumShares){
        numShares = newNumShares;
    }

    public void setShareDividend(double newShareDividend){
        shareDividend = newShareDividend;
    }

    public double totalDividend(){
        return (numShares * shareDividend);
    }

}
