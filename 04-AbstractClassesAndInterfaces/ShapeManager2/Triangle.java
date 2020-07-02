// STUB CODE: Dave Ghidiu

public class Triangle implements Shape {
    
    private int size;
    
    public Triangle() {
        size = 0;
    }
    
    public Triangle(int size) {
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
        
        return "This TRIANGLE has a side of " + size + ", a perimeter of " + getPerimeter() + ", and an area of " + getArea();
        
        
    }
    
    public int compareTo(Shape s) {
        
        return 0; // must change this method

    }
    
}
