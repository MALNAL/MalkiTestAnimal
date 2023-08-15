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
public class Cat extends Animal implements Land{
    
    private final int numberOfLegs = 4;
    
    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }    
    
    @Override
    public void sayHello() {
        System.out.println("meow~");
    }
  
    @Override
    public void sayHello(int mood) {
        if(mood == 1) //מצב רוח טוב
        {
            System.out.println("purr, purr");
            MOOD_HAPPY = 1;
            MOOD_SCARE = 0;
        }            
        if(mood == 0) //מצב רוח רע
        {
            System.out.println("hiss");
            MOOD_SCARE = 1;
            MOOD_HAPPY = 0;
        }            
    }
    
    @Override
    public int getNumberOfLegs()  {        
        return this.numberOfLegs;
    }
}
