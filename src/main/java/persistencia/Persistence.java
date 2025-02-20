/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.*;
import classe.Person;

public class Persistence {
    
    public static void writeObjectToFile(ArrayList<Person> people, File file)  throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Person person : people) {
                oos.writeObject(person);
            }
            oos.close();
            fos.close();
        }   
    }
    
    
    public static Person readObjectFromFile(File file) throws IOException, ClassNotFoundException {
        Person result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (Person) ois.readObject();
        }
        return result;
    }
}
