/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import Objects.Exchange;
import Objects.Machine;
import Objects.Product;

/**
 *
 * @author Nelson Mendes
 */
public class VendingMachineLogic {
    
    private static final double _1P = 0.01;
    private static final double _2P = 0.02;
    private static final double _5P = 0.05;
    private static final double _10P = 0.1;
    private static final double _20P = 0.2;
    private static final double _50P = 0.5;
    private static final double L1 = 1;
    private static final double L2 = 2;
    
    public static void BuyProduct(Product p, Machine m){
        m.removeProduct(p);
    }
    
    public static boolean HasExchange(double exchange, Machine m){
        boolean endLoop = false;
        double _1P = m._1P;
        double _2P = m._2P;
        double _5P = m._5P;
        double _10P = m._10P;
        double _20P = m._20P;
        double _50P = m._50P;
        double L1 = m.L1;
        double L2 = m.L2;
        
        while(!endLoop && exchange > 0){
            if(exchange >= VendingMachineLogic.L2){
                exchange = Round(exchange-VendingMachineLogic.L2);
                L2 = Round(L2-VendingMachineLogic.L2);
                
                if(L2 == 0) {endLoop=true;}
                else {endLoop=false; continue;}
            }
            if(exchange >= VendingMachineLogic.L1){
                exchange = Round(exchange-VendingMachineLogic.L1);
                L1 = Round(L1-VendingMachineLogic.L1);
                
                if(L1 == 0) {endLoop=true;}
                else {endLoop=false; continue;}
            }
            if(exchange >= VendingMachineLogic._50P){
                exchange = Round(exchange-VendingMachineLogic._50P);
                _50P = Round(_50P-VendingMachineLogic._50P);
                
                if(_50P == 0) {endLoop=true;}
                else {endLoop=false; continue;}
            }
            if(exchange >= VendingMachineLogic._20P){
                exchange = Round(exchange-VendingMachineLogic._20P);
                _20P = Round(_20P-VendingMachineLogic._20P);
                
                if(_20P == 0) {endLoop=true;}
                else {endLoop=false; continue;}
            }
            if(exchange >= VendingMachineLogic._10P){
                exchange = Round(exchange-VendingMachineLogic._10P);
                _10P = Round(_20P-VendingMachineLogic._10P);
                
                if(_10P == 0) {endLoop=true;}
                else {endLoop=false; continue;}
            }
            if(exchange >= VendingMachineLogic._5P){
                exchange = Round(exchange-VendingMachineLogic._5P);
                _5P = Round(_5P-VendingMachineLogic._5P);
                
                if(_5P == 0) {endLoop=true;}
                else {endLoop=false; continue;}
                
            }
            if(exchange >= VendingMachineLogic._2P){
                exchange = Round(exchange-VendingMachineLogic._2P);
                _2P = Round(_2P-VendingMachineLogic._2P);
                
                if(_2P == 0) {endLoop=true;}
                else {endLoop=false; continue;}
            }
            if(exchange >= VendingMachineLogic._1P){
                exchange = Round(exchange-VendingMachineLogic._1P);
                _1P = Round(_1P-VendingMachineLogic._1P);
                
                if(_1P == 0) {endLoop=true;}
                else {endLoop=false;}
            }
        }
        return exchange == 0;
    }
    
    public static Exchange GiveExchange(double exchange, Machine m){
        Exchange ex = new Exchange();
        
        while(exchange > 0){
            if(exchange >=VendingMachineLogic.L2){
                exchange = Round(exchange-VendingMachineLogic.L2);
                m.L2 = Round(m.L2-VendingMachineLogic.L2);

                ex.exchangeL2 = Round(ex.exchangeL2 + VendingMachineLogic.L2);
                continue;
            }
            if(exchange >= VendingMachineLogic.L1){
                exchange = Round(exchange-VendingMachineLogic.L1);
                m.L1 = Round(m.L1-VendingMachineLogic.L1);

                ex.exchangeL1 = Round(ex.exchangeL1 + VendingMachineLogic.L1);
                continue;
            }
            if(exchange >=  VendingMachineLogic._50P){
                exchange = Round(exchange- VendingMachineLogic._50P);
                m._50P = Round(m._50P- VendingMachineLogic._50P);

                ex.exchange50P = Round(ex.exchange50P + VendingMachineLogic._50P);
                continue;
            }
            if(exchange >= VendingMachineLogic._20P){
                exchange = Round(exchange-VendingMachineLogic._20P);
                m._20P = Round(m._20P-VendingMachineLogic._20P);

                ex.exchange20P = Round(ex.exchange20P + VendingMachineLogic._20P);
                continue;
            }
            if(exchange >= VendingMachineLogic._10P){
                exchange = Round(exchange-VendingMachineLogic._10P);
                m._10P = Round(m._10P-VendingMachineLogic._10P);

                ex.exchange10P = Round(ex.exchange10P + VendingMachineLogic._10P);
                continue;
            }
            if(exchange >= VendingMachineLogic._5P){
                exchange = Round(exchange-VendingMachineLogic._5P);
                m._5P = Round(m._5P-VendingMachineLogic._5P);

                ex.exchange5P = Round(ex.exchange5P + VendingMachineLogic._5P);
                continue;
            }
            if(exchange >= VendingMachineLogic._2P){
                exchange = Round(exchange-VendingMachineLogic._2P);
                m._2P = Round(m._2P-VendingMachineLogic._2P);

                ex.exchange2P = Round(ex.exchange2P + VendingMachineLogic._2P);
                continue;
            }
            if(exchange >= VendingMachineLogic._1P){
                exchange = Round(exchange-VendingMachineLogic._1P);
                m._1P = Round(m._1P-VendingMachineLogic._1P);

                ex.exchange1P = Round(ex.exchange1P + VendingMachineLogic._1P);
            }
        }
        return ex;
    }
    
    private static double Round(double value){
        return Math.round(value * 100.0 ) / 100.0;
    }
}
