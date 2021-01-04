/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingproblem;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Prob334E {
    //Twitter, given 4 number between 1 to 9, check if possible to get 24 by using +-*/() among the 4 numbers
    private int[] arr=new int[4];

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    Scanner scan=new Scanner(System.in);
    
    public void acceptInput(){
        System.out.println("Insert 4 numbers between 1 and 9: ");
        for(int x=1;x<5;x++){
            System.out.print("Number "+x+": ");
            arr[x-1]=scan.nextInt();
        }
    }
    public void check24(){
        acceptInput();
        boolean veracity=false;
        String oarr[]=new String[3];
        Dictionary op=new Hashtable();
        op.put(0,"+");
        op.put(1, "-");
        op.put(2, "*");
        op.put(3,"/");
        
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                for(int z=0;z<4;z++){
                    int sum=arr[0];
                    sum=countSum(x,sum,arr[1]);
                    sum=countSum(y,sum,arr[2]);
                    sum=countSum(z,sum,arr[3]);
                    if(sum==24){
                        veracity=true;
                        oarr[0]=op.get(x).toString();
                        oarr[1]=op.get(y).toString();
                        oarr[2]=op.get(z).toString();
                        break;
                    }
                    if(veracity){break;}
                }
                if(veracity){break;}
            }
            if(veracity){break;}
        }
        if(veracity){
            System.out.println("24 CAN be formed with the 4 number inserted with: ");
            System.out.println(oarr[0]+", "+oarr[1]+", "+oarr[2]);
        }
        else{
            System.out.println("24 CANNOT be foremd with the 4 number inserted");
        }
    }
    public int countSum(int x,int sum,int temp){
        Dictionary op=new Hashtable();
        op.put(0,"+");
        op.put(1, "-");
        op.put(2, "*");
        op.put(3,"/");
        if(op.get(x)=="+"){
            sum+=temp;
        }
        else if(op.get(x)=="-"){
            sum-=temp;
        }
        else if(op.get(x)=="*"){
            sum*=temp;
        }
        else{
            sum/=temp;
        }
        return sum;
    }
    public static void main(String[] args){
        Prob334E read=new Prob334E();
        read.check24();
    }
}
