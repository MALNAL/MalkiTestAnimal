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
public abstract class Animal {
    private boolean mammals; //יונקים
    private boolean carnivorous;
    
    public int MOOD_HAPPY = 0; //שמח
    public int MOOD_SCARE = 0; //מפחד
    
    private int mood; //מצב רוח

    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;    
        this.mood = mood;
        //אתחול משתנים מצבי רוח
    }
    
    public  void sayHello()
    {
//        if(mood == 1)
//            System.out.println("happy");
//        if(MOOD_SCARE == 1)
//            System.out.println("scare");
    } 
    
    public abstract void sayHello(int mood);
    
    public  boolean isMammals()
    {
        return this.mammals;
    }
    
    public  void setMammals(boolean mammals)
    { 
        this.mammals = mammals;
    }
    
    public  boolean isCarnivorous()
    {
        return this.carnivorous;
    }
    
    public  void setCarnivorous(boolean carnivorous)
    {
        this.carnivorous = carnivorous;
    }
    
    
}
