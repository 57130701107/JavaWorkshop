/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author Student Lab
 */
public class TestEvent extends JFrame{

    JScrollBar jsred = new JScrollBar(JScrollBar.HORIZONTAL);
    JScrollBar jsblue = new JScrollBar(JScrollBar.HORIZONTAL);
    JScrollBar jsgreen = new JScrollBar(JScrollBar.HORIZONTAL);
    JLabel jlb = new JLabel();
    JFrame jf;
    public TestEvent() throws HeadlessException {
        super("Test Event");
        JPanel jp1 = new JPanel();
        jp1.setLayout(new BoxLayout(jp1,BoxLayout.Y_AXIS));
        jp1.add(jsred);
        jp1.add(jsgreen);
        jp1.add(jsblue);
        
        
        jsred.setMinimum(0);
        jsred.setMaximum(255);
        jsgreen.setMinimum(0);
        jsgreen.setMaximum(255);
        jsblue.setMinimum(0);
        jsblue.setMaximum(255);
        this.add(jp1,BorderLayout.NORTH);
        this.add(jlb,BorderLayout.SOUTH);
        jf = this;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(600,400));
        setVisible(true);
        
        //MyListener x = new MyListener();
        MyListener x = new MyListener(this,jsred,jsgreen,jsblue,jlb);
        this.addMouseListener(x);
        this.addMouseMotionListener(x);
        
        jsred.addAdjustmentListener(x);
        jsgreen.addAdjustmentListener(x);
        jsblue.addAdjustmentListener(x);
    }
    
    public static void main(String[] args) {
        new TestEvent();
    }
}
