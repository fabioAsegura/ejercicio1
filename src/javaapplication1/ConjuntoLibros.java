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
          if(conjunto[i]!=null){
          }else{
              conjunto[i]=libro;
          }
      }
      
      
  }
  public void borrarLibro(String titulo){
      
  }
  public boolean comprobarLibro(String titulo){
      
  }
  public Libro[] ListaLibros(){
      
  }
}
