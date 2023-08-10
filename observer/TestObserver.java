/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class TestObserver {
    public static void  main(String[] args) {
        Score1 obj1 = new Score1();
	Score2 obj2 = new Score2();
	HeadQuater obj = new HeadQuater();              
	obj.register(obj1);              
	obj.register(obj2);              
	
        Scanner sc = new Scanner(System.in);
        while(true){
            String inp = sc.nextLine();
            if(inp.equals("")){
                break;
            }
            obj.setSomeData(inp);
            
        }
    }
}
