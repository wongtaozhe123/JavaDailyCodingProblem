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
public class Prob324E {
    //Amazon, given N mice & holes, find minimize num of steps for mouse to reach holes, mouse can only move one unit left or right
    private int[] mice=new int[]{1,4,9,15};
    private int[] hole=new int[]{10,-5,0,16};
    private int one,two,three=0;
    private int biggest=0;
    private int index;
    public int[] getMice(){
        return mice;
    }
    public int[] getHole(){
        return hole;
    }
    public void setOne(int one){
        this.one=one;
    }
    public int getOne(){
        return one;
    }
    public void setTwo(int two){
        this.two=two;
    }
    public int getTwo(){
        return two;
    }
    public void setThree(int three){
        this.three=three;
    }
    public int getThree(){
        return three;
    }
    public int getBiggest(){
        return biggest;
    }
    public void setBiggest(int biggest){
        this.biggest=biggest;
    }
    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index=index;
    }
    public void findMinimizeBiggestHole(){
        for(int x=0;x<mice.length;x++){
            int big=0;
            if(x==0){
                setOne(mice[x]-hole[x]);
                setTwo(mice[x]-hole[x+1]);
                if(getOne()<getTwo()){
                    big=getTwo();
//                    setBiggest(getTwo());
//                    setIndex(0);
                }
                else{
//                    setBiggest(getOne());
                    big=getOne();
//                    setIndex(0);
                }
                if(big>getBiggest()){
                    setBiggest(big);
                    setIndex(0);
                }
            }
            else if(x==mice.length-1){
                setOne(mice[x]-hole[x]);
                setTwo(mice[x]-hole[x-1]);
                if(getOne()<getTwo()){
                    big=getOne();
                    
                }
                else{
                    big=getTwo();
                }
                if(big>getBiggest()){
                    setBiggest(big);
                    setIndex(x);
                }
            }
            else{
                setOne(mice[x]-hole[x-1]);
                setTwo(mice[x]-hole[x]);
                setThree(mice[x]-hole[x+1]);
                if(getOne()<=getTwo()&&getOne()<=getThree()){
                    big=getOne();
                }
                else if(getTwo()<=getThree()&&getTwo()<=getOne()){
                    big=getTwo();
                }
                else if(getThree()<=getOne()&&getThree()<=getTwo()){
                    big=getThree();
                }
                if(big>getBiggest()){
                    setBiggest(big);
                    setIndex(x);
                }
            }
        }
        System.out.println("Largest difference between mice and hole: "+getBiggest());
        System.out.println("Return mouse at: "+mice[getIndex()]);
    }
    public static void main(String[] args){
        Prob324E read=new Prob324E();
        read.findMinimizeBiggestHole();;
    }
}
