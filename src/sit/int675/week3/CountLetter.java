/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week3;

/**
 *
 * @author Student Lab
 */
public class CountLetter {

    private String sentence;
    private int[] count = new int[26];

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int[] getCount() {
        return count;
    }

    public void count() {
        for (int i = 0; i < sentence.length(); i++) {
            char x = sentence.charAt(i);
            if (x >= 65 && x <= 65 + 25) {
                count[x - 65]++;
            }
        }
    }

    public String getResult(int itemPerLine) {
        StringBuilder sb = new StringBuilder();
        int x = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                sb.append((char) (i + 65) + ": " + count[i]);
                sb.append(x % itemPerLine == 0 ? "\n" : ",    ");
                x = x + 1;
            }
        }

        if ((x - 1) % itemPerLine != 0) {
            sb.delete(sb.length() - 5, sb.length() - 1);
        }
        return sb.toString();
    }
}
