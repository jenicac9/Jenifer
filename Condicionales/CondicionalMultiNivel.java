
package Condicionales;


public class CondicionalMultiNivel {
    public static void main(String[] args) {
        
        int n1 = 10; 
       int  n2 = 20; 
       int  n3 = 5; 
        
        if (n1>n2 && n1>n3){
        System.out.println("El primer numero es mayor.");  
        }else if (n2>n1 && n2>n3) {
        System.out.println("El segundo numero es mayor. ");            
        }else {
         System.out.println("El tercer numero es mayor.");   
        }
        
    }
    
}
