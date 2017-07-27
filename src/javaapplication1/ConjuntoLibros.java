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
public class ConjuntoLibros {
    
  Libro[] conjunto=new Libro[10];
  
  public void añadirLibro(String titulo, String Autor, int NumPag, int Calificacion){
      Libro libro=new Libro();
      libro.setTitulo(titulo);
      libro.setAutor(Autor);
      libro.setNumPag(NumPag);
      libro.setCalificacion(Calificacion);
     
      for (int i = 0; i < conjunto.length; i++) {
          if(conjunto[i]==null){
              conjunto[i]=libro;
              break;
          }else{
              
              break;
          }
      }
 
  }
  public void borrarLibro(String titulo){
       for (int i = 0; i < conjunto.length; i++) {
           if(conjunto[i]!=null){
           if(titulo.equals(conjunto[i].titulo)){
               conjunto[i]=null;
           }
          }
      }
  }
  public boolean comprobarLibro(String titulo){
       for (int i = 0; i < conjunto.length; i++) {
           if(conjunto[i]!=null){
           if(titulo.equals(conjunto[i].titulo)){
              return true; 
      }
           } 
          
      }
       return false;
  }
  
 public String listaLibros(int contLibros){
     String librosC="";
     
     for (int j = 0; j < contLibros; j++) {
      int calM=0;
     int pos=0;
         for (int i = 0; i < conjunto.length; i++) {
         if(conjunto[i]!=null){
             if(conjunto[i].Calificacion>calM){
                 calM=conjunto[i].Calificacion;
                 pos=i;
             }
         }
     }
     librosC=librosC+"titulo: "+conjunto[pos].titulo+"\n";
    
 }
     return librosC;
}
}
