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
public class Prob331M {
//    LinkedIn, given string of xxyyxyxyxyy, determine how many times need change y to x before get all x -> all y
    private String str="xxxyxyyxyyy";
    private int times;

    public String getStr() {
        return str;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
    
    public void countTimesToFlipY(){
        setTimes(0);
        for(int x=str.length()-1;x>=0;x--){
            if(getStr().charAt(x)!='y'){
                for(int y=x;y>=0;y--){
                    if(str.charAt(y)=='y'){
                        setTimes(getTimes()+1);
                    }
                }
                break;
            }
        }
        System.out.println("Number of times to flip y in "+getStr()+" is "+getTimes());
    }
    public static void main(String[] args){
        Prob331M read=new Prob331M();
        read.countTimesToFlipY();
    }
}
