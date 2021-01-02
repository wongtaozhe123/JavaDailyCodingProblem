/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingproblem;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Prob322M {
    //Flipkart, jumpr from 0 to int N, on ith jump can move exactly i places, find least number of jumps to get to N
    //Assuming only one ith jump
    private int n;
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    Scanner scan=new Scanner(System.in);
    public void acceptN(){
        System.out.print("Integer N: ");
        int n=scan.nextInt();
        setN(n);
    }
    public void countLeastJump(){
        acceptN();
        int leastJump=getN();
        int start=1;
        int jump=0;
        while(start*2<=getN()){
            jump=0;
//            int act=0;
            for(int y=0;y<getN();y++){
                if(y==start){
                    jump++;
                    y+=start;
                }
                else{
                    jump++;
//                    act++;
                }
            }
            if(jump<leastJump){
                leastJump=jump;
            }
            start++;
        }
        System.out.println("Least number of jumps to get to "+getN()+" is "+jump);
    }
    public static void main(String[] args){
        Prob322M read=new Prob322M();
        read.countLeastJump();
    }
}
