public class Inspector {
    int totalPhoneCnt = 0;
    int totalTabletCnt = 0;
    int totalLaptopCnt = 0;
    int totalAiCnt = 0;

    public void confiscate(Student student) {
        int[] devices = student.getCurrentDeviceNum();
        student.setCurrentDeviceNum(devices[0], devices[1], devices[2], devices[3]);

        totalPhoneCnt += devices[0];
        totalTabletCnt += devices[1];
        totalLaptopCnt += devices[2];
        totalAiCnt += devices[3];
    }
}
