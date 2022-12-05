import java.io.File;
import java.io.FileNotFoundException;
import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day01 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        List<Integer> elves = new ArrayList<Integer>();
        Integer index = 0;
        Integer counter = 0;
        try {
            Scanner scanner = new Scanner(new File("day01.txt"));
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            for (String line : lines) {
                if (line.isEmpty()) {
                    elves.add(index);
                    elves.set(index, counter);
                    index++;
                    counter = 0;
                } else {
                    counter += Integer.parseInt(line);
                }
            }
            Collections.sort(elves, Collections.reverseOrder());
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        }
        System.out.println(elves.get(0)); // Part 1
        System.out.println(elves.get(0) + elves.get(1) + elves.get(2)); // Part 2
    }
}
