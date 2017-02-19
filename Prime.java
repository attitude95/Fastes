/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author chandu_boss
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        long t=in.nextLong();
        long flag=0;
       // long startTime=System.nanoTime();
        
        for(int i=2;i<=Math.sqrt(t);i++){
            if(t%i==0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(t+" is a prime no. ");
        }
        else{
            System.out.println(t+" isn't a prime no.");
        }
       // Thread.sleep(1000);

        //long endTime=System.nanoTime();
        //long elapsedTime=endTime-startTime;
        //System.out.println(elapsedTime);
    
    }
    
}
