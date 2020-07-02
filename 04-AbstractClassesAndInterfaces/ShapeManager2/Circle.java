// STUB CODE: Dave Ghidiu

public class Circle implements Shape {
    
    private int size;
    
    public Circle() {
        size = 0;
    }
    
    public Circle(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public double getArea() {
        
        return -1; // must change this method

    }
    
    public double getPerimeter() {
        
        return -1; // must change this method
        
    }
    
    public String toString() {
        
        return "This CIRCLE has a radius of " + size + ", a circumference of " + getPerimeter() + ", and an area of " + getArea();
        
    }
    
    public int compareTo(Shape s) {
        
        return 0; // must change this method
    }
    
}
