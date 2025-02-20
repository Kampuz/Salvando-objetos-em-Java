/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package main;

import persistencia.Persistence;
import classe.Person;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author campos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        
        Person person1 = new Person("Joao", 20, 170, 85);
        Person person2 = new Person("Maria", 20, 170, 85);
        
        File file = new File("person.bin");
        
        Persistence.writeObjectToFile(person1, file);
        Persistence.writeObjectToFile(person2, file);
        
        Person p = Persistence.readObjectFromFile(file);
        
        System.out.println(p);
    }
}
