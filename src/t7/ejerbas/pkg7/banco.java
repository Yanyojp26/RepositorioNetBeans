/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t7.ejerbas.pkg7;

/**
 *
 * @author tarde
 */
public class banco {

    private String nombre;
    int capital = 5200000;
    String direccion;

        
        banco(String nombre){
            this.nombre = nombre;
        }
        
        banco(String nombre, String direccion){
            this.nombre = nombre;
            this.direccion = direccion;
        }
        banco(String nombre, int capital, String direccion){
            this.nombre = nombre;
            this.capital = capital; 
            this.direccion = direccion;
        }
        
        void mostrarDatos(){
            System.out.println(nombre);
            System.out.println(capital + " €");
            System.out.println(direccion);
        }
        
}
