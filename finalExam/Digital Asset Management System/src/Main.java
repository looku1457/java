import java.util.Arrays;

public class Main {
    public static void main() {
        System.out.println("hello world");

        Inspector inspector1 = new Inspector();
        Student student1 = new Student(1,0,0,0);
        int[] devices = student1.getCurrentDeviceNum();
        System.out.println(devices[0]);
        inspector1.confiscate(student1);
        int[] devices2 = student1.getCurrentDeviceNum();
        System.out.println(devices2[0]);
    }
}