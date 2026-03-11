package week_1;
// Realization
// Interface  - bản thiết kế
public interface Drawable {
    // Constants
    String DEFAUT_COLER = "black";

    // Abstract methods
    void draw();
    void resize(double factor);

    // default method (java 8+)
    default void display(){
        System.out.println("Displaying with coler: " + geColer());

    }
}
