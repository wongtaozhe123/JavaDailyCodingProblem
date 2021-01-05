/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingproblem;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Prob347E {
    //Yahoo, given string length n and parameter k, move first k laters to end of the string
    private String n;
    private int k;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    Scanner scan=new Scanner(System.in);
    public void acceptInput(){
        System.out.println("String N: ");
        setN(scan.next());
        System.out.println("K letters(int): ");
        setK(scan.nextInt());
    }
    public void reverseString(){
        acceptInput();
        LinkedList<Character> a=new LinkedList<Character>();
        for (int x=0;x<getN().length();x++){
            a.add(getN().charAt(x));
        }
        for(int x=0;x<getK();x++){
            a.add(getN().charAt(x));
            a.remove(0);
        }
        System.out.print("Newly formed string is: ");
        for(int x=0;x<getN().length();x++){
            System.out.print(a.get(x));
        }
    }
    public static void main(String[] args){
        Prob347E read=new Prob347E();
        read.reverseString();
    }
}
