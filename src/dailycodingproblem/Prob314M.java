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
public class Prob314M {
    //Spotify, given listeners and radio towers, find broadcast range max
    private int[] listeners=new int[]{1,5,11,20};
    private int[] towers=new int[]{4,8,15};
    private int range;

    public int[] getListeners() {
        return listeners;
    }

    public void setListeners(int[] listeners) {
        this.listeners = listeners;
    }

    public int[] getTowers() {
        return towers;
    }

    public void setTowers(int[] towers) {
        this.towers = towers;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
    public void findMinRange(){
        for(int x=0;x<listeners.length;x++){
            int temp=0;
            int shortest=listeners[x]-towers[0];
            if(shortest<0){
                shortest*=-1;
            }
            for(int y=0;y<towers.length;y++){
                temp=listeners[x]-towers[y];
                if(temp<0){
                    temp*=-1;
                }
                if(temp<shortest){
                    shortest=temp;
                }
            }
            if(shortest>getRange()){
                setRange(shortest);
            }
        }
        System.out.println("The minimum range needed to be cover is "+getRange());
    }
    public static void main(String[] args){
        Prob314M read=new Prob314M();
        read.findMinRange();
    }
}
