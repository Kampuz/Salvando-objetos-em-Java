/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Main;

import java.util.ArrayList;

import Object.Object;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Object o1 = new Object("Quadrado", "Azul", 5, 5, 5);
        Object o2 = new Object("Retangulo", "Vermelho", 10, 5, 5);
        
        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add(o1);
        objectList.add(o2);
        
        System.out.println(objectList);
    }
}
