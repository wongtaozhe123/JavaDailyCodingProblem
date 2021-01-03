/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycodingproblem;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class Prob330H {
    //Dropbox, give 2-CNF formula, find way to satisfy formula to become true
    private int[][] arr=new int[][] {{-3,-2},{2,3},{-2,3},{-3,-1}};

    public int[][] getArr() {
        return arr;
    }
    
    public void identifyBool(){
        boolean one=true,two=true,three=true;
        boolean index=false;
        for(int x=1;x<2;x++){
            for(int y=0;y<2;y++){
                for(int z=0;z<2;z++){
                    boolean temp1,temp2,temp3;
                    Dictionary map=new Hashtable();
                    if(x==0){temp1=true;}else{temp1=false;}
                    if(y==0){temp2=true;}else{temp2=false;}
                    if(z==0){temp3=true;}else{temp3=false;}
                    map.put(1,temp1);
                    map.put(2,temp2);
                    map.put(3, temp3);
                    map.put(-1,!temp1);
                    map.put(-2, !temp2);
                    map.put(-3,!temp3);
                    for(int a=0;a<arr.length;a++){
                        if(a==0){
                            index=(boolean)map.get(arr[a][0])||(boolean)map.get(arr[a][1]);
                        }
                        else{
                            index=index&&((boolean)map.get(arr[a][0])||(boolean)map.get(arr[a][1]));
                        }
                    }
                    if(index){
                        one=temp1;
                        two=temp2;
                        three=temp3;
                        break;
                    }
                }if(index){break;}
            }
            if(index){break;}
        }
        System.out.println("a: "+one);
        System.out.println("b: "+two);
        System.out.println("c: "+three);
    }
    public static void main(String[] args){
        Prob330H read=new Prob330H();
        read.identifyBool();
    }
}
