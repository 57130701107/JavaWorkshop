/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week9;

import java.util.Comparator;

/**
 *
 * @author Student Lab
 */
public class WordElementCompareByCount implements Comparator<WordElement>{

    @Override
    public int compare(WordElement o1, WordElement o2) {
//        return o2.getCount() - o1.getCount();
        
        if(o2.getCount()==o1.getCount())
        {
            return o1.getWord().compareTo(o2.getWord());
        }
        else{
           return o2.getCount() - o1.getCount(); 
        }
    }
    
}
