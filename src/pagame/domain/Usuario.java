/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagame.domain;

public class Usuario {
 private String nombre;  
 private String clave; 
 private String tipo; 
 
 public Usuario (String nombre, String clave, String tipo){
     this.nombre = nombre;
     this.clave = clave;
     this.tipo = tipo;
 }
     public String getNombre(){
         return nombre;
     }
     public String getClave(){
         return clave;
}

public String getTipo(){
         return tipo;
}
}