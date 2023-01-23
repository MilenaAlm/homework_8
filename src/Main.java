import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] step = new int[3];
        for (int index = 0; index < step.length; index++)
            step[index] = index + 1;
        double[] d = {1.57, 7.654, 9.986};
        int[] weeks = new int[7];
        for (int index = weeks.length - 1; index >= 0; index--)
            weeks[index] = index + 1;

        System.out.println("Задача 2");
        for (int index = 0; index < step.length; index++) {
            System.out.print(step[index]);
            if (index != step.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = 0; index < d.length; index++) {
            System.out.print(d[index]);
            if (index != d.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = 0; index < weeks.length; index++) {
            System.out.print(weeks[index]);
            if (index != weeks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int index = step.length - 1; index >= 0; index--) {
            System.out.print(step[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = d.length - 1; index >= 0; index--) {
            System.out.print(d[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = weeks.length - 1; index >= 0; index--) {
            System.out.print(weeks[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int index = 0; index < step.length; index++) {
            if (step[index] % 2 == 1) {
                step[index]++;
            }
        }
            System.out.println(Arrays.toString(step));
            }

        }

