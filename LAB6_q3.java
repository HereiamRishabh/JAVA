

class Plate {

    int length, width;

    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
    }
}

class Box extends Plate {

    int height;

    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called");
    }
}

class WoodBox extends Box {

    int thickness;

    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor called");
    }
}

public class q3{

    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox(10, 20, 30, 5);
        System.out.println("Length: " + woodBox.length);
        System.out.println("Width: " + woodBox.width);
        System.out.println("Height: " + woodBox.height);
        System.out.println("Thickness: " + woodBox.thickness);
    }
}