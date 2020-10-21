/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingproblem;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class Prob305E {
    //Amazon, given linked list, remove consecutive nodes add up to zero
    
    public static void main(String[] args){
        Prob305E read=new Prob305E();
        LinkedList<Integer> num=new LinkedList<>();
        num.add(3);
        num.add(4);
        num.add(-7);
        num.add(5);
        num.add(-6);
        num.add(6);
        
        int index=0;
        while(index<num.size()){
            int sum=0;
            int temp=0;
            for(int x=index;x<num.size();x++){
                sum+=num.get(x);
                if(sum==0){
                    for(int y=index;y<=x;y++){
                        num.set(y, 0);
                    }
                    sum=0;
                    index=x;
                }
            }
            index++;
        }
        for (int x=0;x<num.size();x++) {
            if(num.get(x)!=0){
                System.out.println("The only consecutive with non zero sum is "+num.get(x));
            }
        }
    }
}
