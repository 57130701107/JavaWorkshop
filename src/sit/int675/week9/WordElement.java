/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week9;

/**
 *
 * @author Student Lab
 */
public class WordElement implements Comparable<WordElement>{
    
    private int count;
    private String word;
    
    public WordElement(String word,int count)
    {
        this.count = count;
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(WordElement o) {
        return this.word.compareTo(o.getWord());
    }
    
    public void increment()
    {
        count++;
    }
    
}
