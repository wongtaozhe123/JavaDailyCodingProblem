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
public class Prob340E {
    //Google, given set of 2d arrays, find two closest points
    private int arr[][]=new int[][]{{1,1},{-1,-1},{3,4},{6,1},{-1,-6},{-4,-3},{0,0}};
    private int first;
    private int second;

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void countDistance(){
        setFirst(arr[0][0]-arr[0][1]);
        int index1=0;
        setSecond(arr[1][0]-arr[1][1]);
        int index2=1;
        for(int x=0;x<arr.length;x+=2){
            int sum1=arr[x][0]-arr[x][1];
            if(sum1<0){sum1*=-1;}
            if(sum1<getFirst()){
                setFirst(sum1);
                index1=x;
            }
//            System.out.println(sum1);
            if(x+1<arr.length){
                int sum2=arr[x+1][0]-arr[x+1][1];
                if(sum2<0){sum2*=-1;}
                if(sum2<getSecond()){
                    setSecond(sum2);
                    index2=x+1;
                }
//                System.out.println(sum2);
            }
            
        }
        System.out.println(arr[index1][0]+", "+arr[index1][1]);
        System.out.println(arr[index2][0]+", "+arr[index2][1]);
    }
    public static void main(String[] args){
        Prob340E read=new Prob340E();
        read.countDistance();
    }
}
