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
public class Prob312E {
    //WayFair, given 2*N board, can cover with how many dominoes and trominoes
    private int n;
    private int dom;

    public void setDom(int dom) {
        this.dom = dom;
    }

    public void setTro(int tro) {
        this.tro = tro;
    }
    private int tro;

    public int getN() {
        return n;
    }
    
    public void setN(int n){
        this.n=n;
    }
    
    public int getDom() {
        return dom;
    }

    public int getTro() {
        return tro;
    }

    Scanner scan=new Scanner(System.in);
    public void acceptInputN(){
        System.out.print("Specify length of board, N: ");
        setN(scan.nextInt());
        
    }
    public void findCover(){
        setN(getN()*2);
        while(getTro()<=getN()||(getN()-getTro())%2==0){
            setTro(getTro()+3);
        }
        setTro((getTro()-3)/3);
        setDom((getN()-(getTro()*3))/2);
        System.out.println("Basically, "+getTro()+" trominoes and "+getDom()+" dominoes");
        
    }
    public void findNumofWays(){
        int t=getN();
        int ways=0;
        while(t>=0){
            t-=6;
            ways++;
        }
        System.out.println("Total of "+ways+" way");
    }
    public static void main(String[] args){
        Prob312E read=new Prob312E();
        read.acceptInputN();
        read.findCover();
        read.findNumofWays();
    }
}
