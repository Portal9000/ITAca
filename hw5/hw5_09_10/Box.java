package by.itacademy.homework.hw5.hw5_09_10;

import java.io.Serializable;

public class Box implements Serializable {
    private final int x, y, z;
    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int volume() {
        return x * y * z;
    }

    @Override
    public String toString() {
        return "Box[" + x + ", " + y + ", " + z + ']';
    }
}
