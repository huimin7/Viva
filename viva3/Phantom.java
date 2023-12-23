/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Chuimin
 */
public class Phantom {
    
    private double accuracy;
    private double critRate;
    private int damage;
    private int life=100;
            
    public Phantom(){
        this.accuracy=1.00;
        this.critRate=1.00;
    }
    
    public Phantom(double acc, double cRate){
        if(acc <0 || acc>1 || cRate <0 && cRate>1){
            System.out.println("Accuracy and critRate should be between 0 and 1");
        }else{
            this.accuracy=acc;
            this.critRate=cRate;
        }
        
    }
    
    public double getAccuracy(){
        return accuracy;
    }
    
    public double getCritRate(){
        return critRate;
    }
    
    public void setAccuracy(double acc){
        if(acc <0 || acc>1){
            System.out.println("Accuraccy should be between 0.00 and 1");
        }else{
            this.accuracy=acc;
        }
    }
    
    public void setCritRate(double cRate){
        if(cRate <0 && cRate>1){
             System.out.println("critRate should be between 0 and 1");
        }else{
            this.critRate=cRate;
        }

        }
    
    
    public int damage(BlackMage blackMage){
        double eAccuracy= this.accuracy * (1-blackMage.evasion);
        double eCritRate= critRate - blackMage.critResistance;
        
        double r=Math.random();
        
        if(r < eAccuracy){
            if(r < eCritRate){
                if(life<4){
                    return life;
                }else
                    return 4;
            }else{
                if(life<2){
                    return life;
                }else
                    return 2;
            }
        }else{
            return 0;
        }
        
    }
    
    public void performAttack(BlackMage blackMage){
        damage=damage(blackMage);
        life -= damage;
        
    }
   
    
    public String toString(){
        return "[NORM] Phantom has dealt "+ Integer.toString(damage) +" damage to the Black Mage ("+Integer.toString(life)+"/100)";
    }
    
    
    public static void main(String[] args) {
        
        Phantom phantom=new Phantom();
        BlackMage blackMage=new BlackMage();
        
        
        System.out.println("The epic battle begins!");
        
        while(phantom.life >0){
            
            phantom.performAttack(blackMage);
            System.out.println(phantom.toString());
        }
        
        System.out.println("The Black Mage is defeated....");
        
        
    }
    
}
