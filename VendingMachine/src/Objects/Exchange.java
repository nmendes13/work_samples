/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

/**
 *
 * @author Nelson Mendes
 */
public class Exchange {
    public double exchange1P =0;
    public double exchange2P =0;
    public double exchange5P =0;
    public double exchange10P =0;
    public double exchange20P =0;
    public double exchange50P =0;
    public double exchangeL1 =0;
    public double exchangeL2 =0;
    
    @Override
    public String toString()
    {
        StringBuilder description = new StringBuilder();
        
        description.append("> Change to receive:\r\n");
        if(exchange1P > 0)
            description.append("> " + (exchange1P/0.01) + " x £0.01 = £"+exchange1P +"\r\n");
        if(exchange2P > 0)
            description.append("> " + (exchange2P/0.02) + " x £0.02 = £"+exchange2P +"\r\n");
        if(exchange5P > 0)
            description.append("> " + (exchange5P/0.05) + " x £0.05 = £"+exchange5P +"\r\n");
        if(exchange10P > 0)
            description.append("> " + (exchange10P/0.1) + " x £0.10 = £"+exchange10P +"\r\n");
        if(exchange20P > 0)
            description.append("> " + (exchange20P/0.2) + " x £0.20 = £"+exchange20P +"\r\n");
        if(exchange50P > 0)
            description.append("> " + (exchange50P/0.5) + " x £0.50 = £"+exchange50P +"\r\n");
        if(exchangeL1 > 0)
            description.append("> " + (exchangeL1/1) + " x £1 = £"+exchangeL1 +"\r\n");
        if(exchangeL2 > 0)
            description.append("> " + (exchangeL2/2) + " x £2 = £"+exchangeL2 +"\r\n");
        
        
        return description.toString();
    }
}
