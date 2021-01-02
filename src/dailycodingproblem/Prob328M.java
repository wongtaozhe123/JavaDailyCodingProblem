/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingproblem;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Asus
 */
public class Prob328M {
    //Facebook, implement Elo rating system
    //NOT USABLE, JAVA CANNOT TOO PRECISE IN DECIMAL, SHOW ALL 0, 0
    private int rank1;
    private int rank2;
    private int playerWin;
    
    private int rating1;
    private int rating2;
    private double exScore1;
    private double exScore2;
    Scanner scan=new Scanner(System.in);

    public int getRank1() {
        return rank1;
    }

    public void setRank1(int rank1) {
        this.rank1 = rank1;
    }

    public int getRank2() {
        return rank2;
    }

    public void setRank2(int rank2) {
        this.rank2 = rank2;
    }

    public int getPlayerWin() {
        return playerWin;
    }

    public void setPlayerWin(int playerWin) {
        this.playerWin = playerWin;
    }

    public int getRating1() {
        return rating1;
    }

    public void setRating1(int rating1) {
        this.rating1 = rating1;
    }

    public int getRating2() {
        return rating2;
    }

    public void setRating2(int rating2) {
        this.rating2 = rating2;
    }

    public double getExScore1() {
        return exScore1;
    }

    public void setExScore1(double exScore1) {
        this.exScore1 = exScore1;
    }

    public double getExScore2() {
        return exScore2;
    }

    public void setExScore2(double exScore2) {
        this.exScore2 = exScore2;
    }
    
    public void insertRankAndWin(){
        System.out.print("Rating of player 1: ");
        setRank1(scan.nextInt());
        System.out.print("Rating of player 2: ");
        setRank2(scan.nextInt());
        System.out.print("Which player win (1 or 2): ");
        setPlayerWin(scan.nextInt());
    }
    public void countTransformRating(){
        insertRankAndWin();
        int temp=getRank1()/400;
        setRating1((int) Math.pow(10, temp));
        temp=getRank2()/400;
        setRating2((int) Math.pow(10, temp));
        System.out.println(getRating1());
        System.out.println(getRating2());
    }
    public void countExpectedScore(){
        countTransformRating();
        setExScore1(getRating1()/(getRating1()+getRating2()));
        setExScore2(getRating2()/(getRating1()+getRating2()));
        System.out.println(getExScore1());
        System.out.println(getExScore2());
    }
    public void updateEloRating(){
        countExpectedScore();
        if(getPlayerWin()==1){
            int temp=(int) ((int)32*(1-getExScore1()));
            setRank1(getRank1()+temp);
            temp=(int) (32*(0-getExScore1()));
            setRank2(getRank2()+temp);
        }
        else{
            int temp=(int)(32*(0-getExScore1()));
            setRank1(getRank1()+temp);
            temp=(int) (32*(1-getExScore1()));
            setRank2(getRank2()+temp);
        }
        System.out.println("First player score: "+getRank1());
        System.out.println("Second player score: "+getRank2());
    }
    public static void main(String[] args){
        Prob328M read=new Prob328M();
        read.updateEloRating();
    }
}
