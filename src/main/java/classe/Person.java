/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.io.Serializable;

/**
 *
 * @author campos
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private float height;
    private float weight;
    
    public Person(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public float getHeight() {
        return height;
    }
    
    public void setHeight(float heitght) {
        this.height = height;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setName(float Weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
