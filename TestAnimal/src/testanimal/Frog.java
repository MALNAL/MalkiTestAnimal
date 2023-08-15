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
public class Frog extends Animal implements Water, Land{

    private final int numberOfLegs = 4;
    
    
    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }       

    @Override
    public void sayHello(int mood) {
         if(mood == 1) //מצב רוח טוב
        {
            System.out.println("quack quack quack");
            MOOD_HAPPY = 1;
            MOOD_SCARE = 0;
        }            
        if(mood == 0) //מצב רוח רע
        {
            System.out.println("plop into the water");
            MOOD_SCARE = 1;
            MOOD_HAPPY = 0;            
        }
    }

    @Override 
    public boolean hasGills() { //זימים
        return true;
    }

    @Override
    public boolean hasLayesEggs() {
        return true;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    
}
