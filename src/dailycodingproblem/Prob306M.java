/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingproblem;

/**
 *
 * @author Asus
 */
public class Prob306M {
    //Palantir,  given list of N numbers, and k away from sorted position, sort it
    private int[] arr=new int[]{1,3,2,5,4,6};
    private int k=1;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getK() {
        return k;
    }
    
    public void sort(){
        int x=0;
        while(x<arr.length-k){
            for(int y=x+1;y<=x+k;y++){
                if(arr[x]>arr[y]){
                    int z=arr[x];
                    arr[x]=arr[y];
                    arr[y]=z;
                }
            }
            x++;
        }
        
        for(int y=0;y<arr.length;y++){
            System.out.print(arr[y]+", ");
        }
    }
    public static void main(String[] args){
        Prob306M read=new Prob306M();
        read.sort();
    }
}
