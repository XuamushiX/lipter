/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.*;
/**
 *
 * @author User
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        InputStreamReader DATO= new InputStreamReader(System.in);
        BufferedReader DATO1 = new BufferedReader(DATO);
        
        
        
        
        String gen;
        
        int cont1=0,cont2=0,i=1,numest,cont3=0;
        
        
        
         try {
            
             System.out.println("ingrese el numero de personas");
            
             numest=Integer.parseInt(DATO1.readLine());
             
        while(i<=numest){
             System.out.println("ingrese el genero");
             gen=DATO1.readLine();
             
             if(gen.equals("mujer")){
            cont1=cont1+1;
             }else{
                 if(gen.equals("hombre")){
                     cont2=cont2+1;
                 }else{
                     if(gen.equals("hom")){
                         cont3=cont3+1;
                     }
                 }
             }
             i=i+1;
        }
             System.out.println(" "+cont1);
             System.out.println(" "+cont2);
             System.out.println(" "+cont3);
             
             
             
             
             
             
             
             
             
             
             
                                                                                                                                                                                                                                            
             
             
             
             
             
             
             
             
             
        } catch (Exception e) {
        }
        


// TODO code application logic here
    }
    
}
