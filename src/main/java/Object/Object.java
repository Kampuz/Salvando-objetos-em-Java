/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.io.Serializable;

/**
 *
 * @author campos
 */
public class Object implements Serializable {
    private String name;
    private String color;
    private int length;
    private int height;
    private int depth;
    
    public Object(String name, String color, int length, int height, int depth) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.height = height;
        this.depth = depth;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    public int getDepth() {
        return this.depth;
    }
    
    @Override
    public String toString() {
        return "Name= " + this.name + 
                "\nColor= " + this.color + 
                "\nLength= " + this.length + 
                "\nHeight= " + this.height + 
                "\nDepth= " + this.depth + "\n\n";
    }
}
