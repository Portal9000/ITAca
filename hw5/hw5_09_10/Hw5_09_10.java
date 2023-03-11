package by.itacademy.homework.hw5.hw5_09_10;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Hw5_09_10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Box> boxes = new ArrayList<>() {{
            add(new Box(2, 3, 4));
            add(new Box(10, 20, 30));
            add(new Box(11, 2, 3));
            add(new Box(1, 18, 3));
            add(new Box(1, 1, 13));
        }};
        int volumeMax = boxes.get(0).volume();

        FileOutputStream fos = new FileOutputStream("c:\\Users\\User\\IdeaProjects\\Test\\src\\by\\itacademy\\homework\\hw5\\hw5_09_10\\Boxes");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(boxes);
        oos.close();

        FileInputStream fis = new FileInputStream("c:\\Users\\User\\IdeaProjects\\Test\\src\\by\\itacademy\\homework\\hw5\\hw5_09_10\\Boxes");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boxes = (ArrayList) ois.readObject();
        ois.close();

        Map<Integer, List<Box>> map = boxes
                .stream()
                .collect(groupingBy(Box::volume, toList()));
        System.out.println(map);

        for (int i = 0; i < boxes.size(); i++) {
            if (boxes.get(i).volume() > volumeMax) {
                volumeMax = boxes.get(i).volume();
            }
        }

        BufferedWriter br = null;
        try{
            br = new BufferedWriter(new FileWriter(new File("c:\\Users\\User\\IdeaProjects\\Test\\src\\by\\itacademy\\homework\\hw5\\hw5_09_10\\OUTPUT.txt")));
            br.write(Integer.toString(volumeMax));
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}