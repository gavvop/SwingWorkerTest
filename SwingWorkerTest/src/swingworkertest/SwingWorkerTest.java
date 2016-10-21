/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingworkertest;

import javax.swing.UIManager;

/**
 *
 * @author x421
 */
public class SwingWorkerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { }
        
        new TestFrame().setVisible(true);
    }
    
}
