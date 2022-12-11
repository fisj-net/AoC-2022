import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day02 {

    private static Integer part1(List<String> lines) {
        Integer points = 0;
        for (String line : lines) {
            if (line.contains("X")) {
                points += 1;
                if (line.contains("A")) {
                    points += 3;
                } else if (line.contains("C")) {
                    points += 6;
                }
            } else if (line.contains("Y")) {
                points += 2;
                if (line.contains("A")) {
                    points += 6;
                } else if (line.contains("B")) {
                    points += 3;
                }
            } else {
                points += 3;
                if (line.contains("B")) {
                    points += 6;
                } else if (line.contains("C")) {
                    points += 3;
                }
            }
        }
        return points;
    }

    private static Integer part2(List<String> lines) {
        Integer points = 0;
        for (String line : lines) {
            if (line.contains("X")) {
                if (line.contains("A")) {
                    points += 3;
                } else if (line.contains("B")) {
                    points += 1;
                } else {
                    points += 2;
                }
            } else if (line.contains("Y")) {
                if (line.contains("A")) {
                    points += 4;
                } else if (line.contains("B")) {
                    points += 5;
                } else {
                    points += 6;
                }
            } else {
                if (line.contains("A")) {
                    points += 8;
                } else if (line.contains("B")) {
                    points += 9;
                } else {
                    points += 7;
                }
            }
        }
        return points;
    }
    
    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        Integer p1 = 0;
        Integer p2 = 0;
        try {
            Scanner scanner = new Scanner(new FileReader("day02.txt"));
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            p1 = part1(lines);
            p2 = part2(lines);
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        }
        System.out.println(p1 + " " + p2);
    }
}