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
public class Prob339E {
    //Microsoft, given an array and number k, decide if any 3 elements in array can add up to k
    private int k;
    private int[] arr=new int[]{20,303,3,4,25};

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    Scanner scan=new Scanner(System.in);
    public void countK(){
        boolean veracity =false;
        System.out.println(arr.length);
        System.out.print("Insert k value: ");
        setK(scan.nextInt());
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr.length;y++){
                for(int z=0;z<arr.length;z++){
                    int temp=arr[x]+arr[y]+arr[z];
                    if(x!=y&&x!=z&&y!=z&&temp==getK()){
                        veracity=true;
                        break;
                    }
                }
                if(veracity){break;}
            }
            if(veracity){break;}
        }
        if(veracity){
            System.out.println("TRUE, there are sum to "+getK());
        }
        else{
            System.out.println("False, no sum to "+getK());
        }
    }
    public static void main(String[] args){
        Prob339E read=new Prob339E();
        read.countK();
    }
}
