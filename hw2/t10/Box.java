package by.hw2.t10;
public class Box {
    private int x, y, z;
    private String kindOfBox;
    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        if (x == y && y ==z) {
            kindOfBox = "Куб";
        } else {
            kindOfBox = "Обычная коробка";
        }
    }
    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        kindOfBox = "Конверт";
    }
    public Box(int x) {
        this.x = x;
        kindOfBox = "Да и не короб это вовсе.";
    }
    public void print () {
        System.out.println(kindOfBox);
    }
}