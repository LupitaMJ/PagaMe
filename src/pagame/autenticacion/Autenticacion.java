/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagame.autenticacion;

import pagame.domain.Usuario;
public class Autenticacion {
    private Usuario[] usuario;
    private int numUsuario;
    
    public Autenticacion(){
    this.usuario = new Usuario[100];
    numUsuario = 0;
}
    
    public void registrar(String nombre, String clave, String tipo){
        usuario[numUsuario] = new Usuario(nombre, clave, tipo);
        
    }
    public boolean verificar(String nombre, String clave){
        for (int i= 0; i<numUsuario; i++){
            if ((usuario [i].getNombre() == nombre)&&
                    (usuario[i].getClave()== clave)){
            return true;
          }
       }
            return false ;
    }
}
