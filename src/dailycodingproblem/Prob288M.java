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
public class Prob288M {
    //Salesforce, given input x find difference between ascending &  descending order of x
    Scanner scan = new Scanner(System.in);
    private int x;
    private int[] arr = new int[10];
    private int ten = 10;
    private int index = 0;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int[] getArr(){
        return arr;
    }
    public void setArr(int[] arr){
        this.arr=arr;
    }
    public int getTen(){
        return ten;
    }
    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public void kaprekars(){
        System.out.print("Input x: ");
        setX(scan.nextInt());
        
        //divide number into 1 digit
        int temp=getX();
        while(temp>0){
            if(temp>0){
                arr[getIndex()]=temp%getTen();
                setIndex(getIndex()+1);
            }
            temp/=getTen();
        }
        
        //sort array
        for(int x=0;x<getIndex();x++){
            for(int y=0;y<getIndex();y++){
                if(arr[x]<arr[y]){
                    temp=arr[x];
                    arr[x]=arr[y];
                    arr[y]=temp;
                }
            }
        }
        
        int biggest = 0, smallest = 0;
        for(int x=0;x<getIndex();x++){
                smallest = smallest*10+arr[x];
                biggest = biggest*10+arr[getIndex()-1-x];
        }
        System.out.println(biggest+" - "+smallest+" = "+(biggest-smallest));
    }
    public static void main(String[] args){
        Prob288M read = new Prob288M();
        read.kaprekars();
    }
}
