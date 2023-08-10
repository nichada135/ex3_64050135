/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author sarun
 */
public class Score2 implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
	 "score2 " + 
                ((HeadQuater)o).getSomeData());
    }
}
