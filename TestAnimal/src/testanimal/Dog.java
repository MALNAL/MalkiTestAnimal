/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testanimal;

/**
 *
 * @author S
 */
public class Dog extends Animal implements Land{

    private final int numberOfLegs = 4;
    
    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public void sayHello() 
    {
        System.out.println("wagging their tails");        
    }
  
    @Override
    public void sayHello(int mood) {
        if(mood == 1) //מצב רוח טוב
        {
            System.out.println("will bark loudly");
            MOOD_HAPPY = 1;
            MOOD_SCARE = 0;
        }            
        if(mood == 0) //מצב רוח רע
        {
            System.out.println("whooping");
            MOOD_SCARE = 1;
            MOOD_HAPPY = 0;            
        }            
    }
    
    @Override
    public int getNumberOfLegs()  {        
        return this.numberOfLegs;
    }
    
     
    
}
