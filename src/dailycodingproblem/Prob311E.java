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
public class Prob311E {
    //Sumo Logic, find peak element in unsorted array in P(log N) time
    private int[] arr=new int[]{2,3,5,4,6,7,1};
    public int[] getArr(){
        return arr;
    }
    public void findPeak(){
        int mid=arr.length/2;
        while(mid>=0||mid<arr.length){
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                break;
            }
            else{
                if(arr[mid-1]>arr[mid+1]){
                    mid--;
                }
                else{
                    mid++;
                }
            }
        }
        System.out.println("Peak element of array is "+arr[mid]);
    }
    public static void main(String[] args){
        Prob311E read=new Prob311E();
        read.findPeak();
    }
}
