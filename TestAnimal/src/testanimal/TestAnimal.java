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
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat c1 = new Cat(true, true, 1);
        //c1.sayHello();
        c1.sayHello(1);
        System.out.println(c1.MOOD_HAPPY + " " + c1.MOOD_SCARE);
        
        Dog d1 = new Dog(true,false, 0);
        d1.sayHello(0);
        System.out.println(d1.MOOD_HAPPY + " " + d1.MOOD_SCARE);
        
        Frog f1 = new Frog(false, false, 0);
        System.out.println("hasGills " + f1.hasGills());
    }
    
}
