/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task73;

/**
 *
 * @author ASUS
 */
public class Commission extends Hourly{
    // instance //
    private double totalSales;
    private double rateE;
    
    // constructor //
    public Commission (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double rateE){
        super (eName, eAddress, ePhone, socSecNumber, rate);
        this.rateE = rateE;
    }
    
    // method //
    public void addSales (double totalSales){
        this.totalSales = totalSales;
    }
    
    @Override
    public double pay (){
        double payment = super.pay() + (this.totalSales * rateE);
        totalSales = 0;
        return payment;
    }
    
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
