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
public class Prob315E {
    //Google, perform check on Toeplitz matrix, ***THE MATRIX HAS SAME NUMBER OF ROW AND COLUMN
    private int[][] arr=new int[][]{{1,2,3,4,8},
        {5,1,2,3,4},
        {4,5,1,2,3},
        {7,4,5,1,2}};
    
    public int[][] getArr(){
        return arr;
    }
    public void veracityMatrix(){
        
        boolean veracity=true;
        boolean one=true;
        if(arr.length==arr[0].length){
            int x=2;
            int y=0;
            int tempx=x;
            int tempy=y;
            while(veracity){
                if(tempx==3){
                    tempx-=x;
                    if(tempy==3){
                        tempx=0;
                        tempy=y+1;
                        y++;
                    }
                    else{
                        tempy=0;
                    }
                    x++;
                }
                if(tempy==3){
                    tempx=0;
                    tempy=y+1;
                    y++;
                }
               if(tempx==0&&tempy==3){
                    veracity=false;
                }
                if(veracity){
                    if(arr[tempx][tempy]==arr[tempx+1][tempy+1]){
                        tempx++;
                        tempy++;
                    }
                    else{
                        veracity=false;
                        one=false;
                    }
                }
            }
        }
        else{
            int x=2;
            int y=0;
            int tempx=x;
            int tempy=y;
            while(veracity){
                if(tempx==3){
                    tempx-=x;
                    if(tempx<0){
                        tempx=0;
                        tempy=y+1;
                        y++;
                    }
                    if(tempy==4){
                        tempx=0;
                        tempy=y+1;
                        y++;
                    }
                    else{
                        tempy=y;
                    }
                    x++;
                }
                if(tempy==4){
                    tempx=0;
                    tempy=y+1;
                    y++;
                }
                if(tempx==0&&tempy==4){
                    veracity=false;
                }
                if(veracity){
                    if(arr[tempx][tempy]==arr[tempx+1][tempy+1]){
                        tempx++;
                        tempy++;
                    }
                    else{
                        veracity=false;
                        one=false;
                    }
                }
            }
        }
        if(one){
            System.out.println("The matrix is a Toeplitz matrix");
        }
        else{
            System.out.println("The matrix is NOT a Toeplitz matrix");
        }
    }
    public static void main(String[] args){
        Prob315E read=new Prob315E();
        read.veracityMatrix();
    }
}
