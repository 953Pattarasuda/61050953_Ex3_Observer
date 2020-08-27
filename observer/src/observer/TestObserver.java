/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author user
 */
import java.util.Observer;

public class TestObserver {
    public static void main(String[] args) {
	Observer obj1 = new Marketing();
        Observer obj2 = new Senior();
        MyObservable observable = new MyObservable();
        observable.addObserver(obj1);
        observable.addObserver(obj2);
        observable.setSomeData(8);
	observable.setSomeData(9);
        
    }
}
