interface Calculator {
    void calculate(int value);
}

class Square implements Calculator {
    int result;
    
    public void calculate(int value) {
        result = value * value;  // Square the value
        System.out.print("Square: " + result + " ");
    }
}

class Cube extends Square {
    public void calculate(int value) {
        result = value * value * value;  // Cube the value
        super.calculate(value);         // Call Square's calculate method
        System.out.print("Cube: " + result + " ");
    }
}

public class Out3 {
    public static void main(String[] args) {
        Calculator obj = new Cube();
        obj.calculate(3);
    }
}
