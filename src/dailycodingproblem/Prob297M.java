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
public class Prob297M {
    //Amazon, find least combo of drinks bartender don't need memorize
    private int[][] custFav=new int[][]{{0,1,3,6},{1,4,7,-1},{2,4,7,5},{3,2,5,-1},{5,8,-1,-1}};
    private int[] drinks=new int[8];
    private int[] freq=new int[8];
    private int[] combo=new int[8];
    private int count;
    public int[][] getCustFav(){
        return custFav;
    }
    public void setCustFav(int custFav[][]){
        this.setCustFav(custFav);
    }
    public int[] getDrinks() {
        return drinks;
    }
    public int[] getFreq() {
        return freq;
    }
    public int[] getCombo() {
        return combo;
    }
    public int getCount(){
        return count;
    }
    public void setDrinks(int[] drinks) {
        this.drinks = drinks;
    }
    public void setFreq(int[] freq) {
        this.freq = freq;
    }
    public void setCombo(int[] combo) {
        this.combo = combo;
    }
    public void setCount(int count){
        this.count=count;
    }
    public void findDrinksMoreThanOne(){
        int temp=0;
        for(int x=0;x<5;x++){
            for(int y=0;y<4;y++){
                temp=custFav[x][y];
                int index=0;
                for(int a=0;a<5;a++){
                    for(int b=0;b<4;b++){
                        if(temp==custFav[a][b]){
                            index++;
                            break;
                        }
                    }
                }
                for(int c=0;c<=getCount();c++){
                    if(temp==drinks[c]||temp==-1){
                        index=0;
                    }
                }
                if(index>1){
                    drinks[getCount()]=temp;
                    freq[getCount()]=index;
                    setCount(getCount()+1);
                }
            }
        }
    }
    public void findDrinks(){
        findDrinksMoreThanOne();
        int biggest=freq[0];
        int big=0;
        
        for(int x=0;x<=getCount();x++){
            for(int y=x;y<getCount();y++){
                if(biggest<freq[x]){
                    biggest=freq[x];
                    big=drinks[x];
                }
            }
        }
        int secBig=0;
        for(int x=0;x<getCount();x++){
            int index=0;
            if(biggest+freq[x]>=5&&freq[x]!=biggest){
                for(int a=0;a<5;a++){
                    for(int b=0;b<4;b++){
                        if(big==custFav[a][b]||drinks[x]==custFav[a][b]){
                            index++;
                        }
                    }
                }
            }
            if(index==5){
                secBig=drinks[x];
                break;
            }
        }
        
        System.out.println(big+", "+secBig);
    }
    public static void main(String[] args){
        Prob297M read=new Prob297M();
        read.findDrinks();
    }
    
}
