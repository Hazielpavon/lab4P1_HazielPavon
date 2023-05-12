
package lab3p1_hazielpavon;

import java.util.Scanner;


public class Lab3P1_HazielPavon {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        boolean seguir = true; 
        
         while (seguir){ 
             
             System.out.println ("1. Conjuntos");             
             System.out.println ("2. Contra"); 
             System.out.println ("3. Salir");
             int opcion = sc.nextInt (); 
                
             switch (opcion) {
                 
                 
                 case 1: 
                 {
                     String conjunto1, conjunto2; 
                     
                     boolean igual = false; 
                     
                     System.out.println ("la sintaxis es, mayuscula = {a,b,c,...} ");
                     
                     System.out.println ("Ingrese el primer conjunto: "); 
                     conjunto1 = sc.next(); 
                     System.out.println ("ingrese su segunda conjunto: ");
                     conjunto2 = sc.next(); 
                     
                     
       
                   
                       for (int i = 0; i <conjunto1.length (); i++)  {
                              
                              char letra = conjunto1.charAt (i); 
                              
                              for (int b = 0; b <conjunto2.length (); b++)  {
                              
                              char letra2 = conjunto2.charAt (i);
                              
                              if (letra == letra2){
                                  
                                  igual = true; 
                              } else 
                                  igual = false; 
                                  
                         
                                }              
                                  
                              }
                              
                        if (igual ==true) {
                            
                            System.out.println (" Las cadenas son iguales"); 
                        } else 
                            System.out.println (" Las cadenas son diferentes");  
                       
                        
                              
                       }
                 break; 
                 
                 case 2: 
                     
                    String contra1, numeros1; 
                    boolean num = false;
                    boolean car = false; 
                    System.out.println (" Ingrese la contrasena") ; 
                    contra1 = sc.next(); 
                    
                    System.out.println ("Ingrese un numero"); 
                    numeros1 = sc.next();
                    
                    if (contra1.length() >= 8){
                    
                    
                    for (int i = 0; i < contra1.length(); i++){
                        char vali = contra1.charAt(i); 
                        int x = vali; 
                        
                        if (x >= 48 && x <= 57) {
                            num = true; 
                        }
                        
                        if (x >= 97 && x <= 122){
                           car = true; 
                        }
                    }
                        
                    } else {
                        System.out.println ("La contra es muy corta"); 
                    }
                    
                        if (num == true && car == true){
                            System.out.println ("La contra es segura"); 
                     
                        } else 
                        if (num == false && car == true){
                            System.out.println ("La contra no es segura porque no hay numeros");                           
                        }else 
                        if (num == true && car == false){
                            System.out.println ("La contra no es segura porque no hay caracteres"); 
                        }
                             
                        String nueva= ""; 
                        
                          for (int i = 0; i < contra1.length ();i++) { 
                             char b = contra1.charAt(i); 
                             
                                nueva += b; 
                                
                               if (i == contra1.length() ){
                                   nueva += numeros1;
                                   System.out.print (nueva);
                                   
                               } 
                               else 
                                   nueva += b; 
                                
                                   
                          }
                          
                    break; 
                    
         
             case 3:
                     
                     seguir = false; 
                       
                     
             default: 
                    
                System.out.println ("Ingrese un valor valido"); 
               
                
                break; 
             }
         }
         
}
}
    
    

