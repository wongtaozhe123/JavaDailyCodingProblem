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
public class Prob295M {
    //Stitch Fix, given input k, return kth row in Pascal triangle
    Scanner scan=new Scanner(System.in);
    private int k;
    private int[] arr= new int[100];
    public int getK(){
        return k;
    }
    public void setK(int k){
        this.k=k;
    }
    public int[] getArr(){
        return arr;
    }
    public void setArr(int arr[]){
        this.arr=arr;
    }
    public void getkvalue(){
        System.out.print("Input value k: ");
        setK(scan.nextInt());
    }
    public void combinationPascal(){
        getkvalue();
        int mul=1;
        for(int x=2;x<=getK()-1;x++){
            mul*=x;
        }
        System.out.println(mul);
        int x=0;
        while(x<=getK()){
            int temp=x;
            int a = countR(temp);
            arr[x]=mul/a;
            x++;
        }
        for(int y=0;y<=getK()-1;y++){
            System.out.print(arr[y]+", ");
        }
    }
    public int countR(int x){
        int temp=1;
        for(int y=x;y>=1;y--){
            temp*=y;
        }
        int temp2 = 1;
        for(int y=getK()-1-x;y>0;y--){
            temp2*=y;
        }
        return temp*temp2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prob295M read=new Prob295M();
        read.combinationPascal();
    }
    
}
