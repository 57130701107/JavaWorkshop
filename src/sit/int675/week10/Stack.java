/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week10;

import java.util.LinkedList;
import java.util.List;
import javax.sound.midi.Soundbank;
import sit.int675.demo.BankAccount;
import sit.int675.week7.Circle;

/**
 *
 * @author Student Lab
 */
public class Stack<E> {

    List<E> data = null;

    public Stack() {
        data = new LinkedList<E>();
    }

    public void push(E x) {
        data.add(0, x);
    }

    public E pop() {
        if (data.isEmpty()) {
            System.out.println("Out of Stack");
            return null;
        } else {
            return data.remove(0);
        }
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public static void main(String[] args) {

//        Stack st = new Stack();
//        st.push("AAAA");
//        st.push(new Circle(1.5));
//        st.push(900);
//        st.push(90.5);
//        st.push(new BankAccount());
//        
//        while (!st.isEmpty()) {            
//            System.out.println(st.pop());
//        }
        
        Stack<String> st = new Stack<String>();
        st.push("AAAA");
        st.push("BBBB");
//        st.push(new Circle(1.5));
//        st.push(900);
//        st.push(90.5);
//        st.push(new BankAccount());
        
        while (!st.isEmpty()) {   
            String str = st.pop();
            System.out.println(str);
        }
    }

}
