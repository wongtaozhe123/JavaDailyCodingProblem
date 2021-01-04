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
public class Prob338M {
    //Facebook, given integer, find next bigger integer with same numnber of 1-bits if converted into binary
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    Scanner scan=new Scanner(System.in);
    public void getNextBigInt(){
        System.out.print("Input a number: ");
        setN(scan.nextInt());
        String sn=Integer.toBinaryString(getN());
        int one=0;
        for(int x=0;x<sn.length();x++){
            if(sn.charAt(x)=='1'){
                one++;
            }
        }
        boolean veracity=true;
        int temp=getN()+1;
        while(veracity){
            String st=Integer.toBinaryString(temp);
            int temp1=0;
            for(int x=0;x<st.length();x++){
                if(st.charAt(x)=='1'){
                    temp1++;
                }
            }
            if(temp1==one){
                veracity=false;
            }
            else{temp++;}
        }
        System.out.println("Next biggest integer with same number of 1-bits is: "+temp);
    }
    public static void main(String[] args){
        Prob338M read=new Prob338M();
        read.getNextBigInt();
    }
}
