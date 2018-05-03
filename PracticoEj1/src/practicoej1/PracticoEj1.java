/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicoej1;

/**
 *
 * @author alumno
 */
public class PracticoEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador= 1;
       System.out.println("Figura1:");
        do{
           System.out.print("* ");
           if(contador% 6 ==0)
               System.out.println();
           contador++;
       }while(contador<= 24);
        System.out.println();
        //figura 2
        System.out.println("Figura 2");
        
        
        contador=1;
        do{
           System.out.print("* ");
           if(contador% 6 ==0){
               System.out.println();
            } 
           if(contador==6 || contador ==18)
               System.out.print(' ');
           contador++;
       }while(contador<= 24);
        System.out.println();
        //Figura3
        contador=1;
        System.out.println("Figura 3");
        for(int contadorcol=1; contadorcol<= 5; contadorcol++){
            System.out.println();
            for(int contadorfila=1; contadorfila<=contadorcol; contadorfila++){
                
                System.out.print("* ");
            }
        }
            
        //Figura 4
        System.out.println();
        System.out.println("Figura 4");
        
        for(int contadorcol=1; contadorcol<= 5; contadorcol++){
            System.out.println();
            for(int contadorfila=1; contadorfila<=contadorcol; contadorfila++){
                
                System.out.print("* ");
            }
        }
        for(int contadorcol=4; contadorcol>= 1; contadorcol--){
            System.out.println();
            for(int contadorfila=1; contadorfila<=contadorcol; contadorfila++){
                
                System.out.print("* ");
            }
        }
    }
    
}
