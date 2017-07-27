/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author fabio
 */
import java.util.Scanner;
public class PruebaLibros {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int resp=0;
        while(resp==0){
        System.out.println("digite que accion desea realizar:\n");
        System.out.println("1. añadir libro\n");
        System.out.println("2. borrar libro\n");
        System.out.println("3. ver lista de libros\n");
        resp=leer.nextInt();
        if(resp==1){
            System.out.println("digite el libro que va a ingresar");
            String libroI=leer.next();
            ConjuntoLibros obj1=new ConjuntoLibros();
            if(obj1.comprobarLibro(libroI)==false){
                System.out.println("digite el autor, num paginas y calificacion");
                
                String Autor=leer.next();
                int numPag=leer.nextInt();
                int calificacion=leer.nextInt();
                obj1.añadirLibro(libroI,Autor,numPag,calificacion);
            }else{
                System.out.println("ya existe el libro");
            }
            
            resp=0;
        }
        if(resp==2){
            System.out.println("digite el libro que va a borrar");
            
            String libroI=leer.next();    
            ConjuntoLibros obj1=new ConjuntoLibros();
            if(obj1.comprobarLibro(libroI)==true){
                obj1.borrarLibro(libroI);
            }else{
                System.out.println("no existe el libro");
            }
            
            resp=0;
        }
        if(resp==3){
            
            
            resp=0;
        }
        
    }
    }

    
}
