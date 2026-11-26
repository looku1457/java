public class Student {
    boolean hasPhone;
    boolean hasTablet;
    boolean hasLaptop;
    boolean hasAi;
    int phoneCnt;
    int tabletCnt;
    int laptopCnt;
    int aiCnt;
    int currentPhoneCnt;
    int currentTabletCnt;
    int currentLaptopCnt;
    int currentAiCnt;

    public Student(int phoneCnt, int tabletCnt, int laptopCnt, int aiCnt) {
        if (phoneCnt > 0) {
            this.hasPhone = true;
            this.phoneCnt = phoneCnt;
            this.currentPhoneCnt = phoneCnt;
        } else {
            this.hasPhone = false;
            this.phoneCnt = 0;
            this.currentPhoneCnt = 0;
        }

        if (tabletCnt > 0) {
            this.hasTablet = true;
            this.tabletCnt = tabletCnt;
            this.currentTabletCnt = tabletCnt;
        } else {
            this.hasTablet = false;
            this.tabletCnt = 0;
            this.currentTabletCnt = 0;
        }

        if (laptopCnt > 0) {
            this.hasLaptop = true;
            this.laptopCnt = laptopCnt;
            this.currentLaptopCnt = laptopCnt;
        } else {
            this.hasLaptop = false;
            this.laptopCnt = 0;
            this.currentLaptopCnt = 0;
        }

        if (aiCnt > 0) {
            this.hasAi = true;
            this.aiCnt = aiCnt;
            this.currentAiCnt = aiCnt;
        } else {
            this.hasAi = false;
            this.aiCnt = 0;
            this.currentAiCnt = 0;
        }
    }

    public int[] getCurrentDeviceNum() {
        return new int[] {currentPhoneCnt, currentTabletCnt, currentLaptopCnt, currentAiCnt};
    }

    public void setCurrentDeviceNum(int phone, int tablet, int laptop, int ai) {
        currentPhoneCnt -= phone;
        currentTabletCnt -= tablet;
        currentLaptopCnt -= laptop;
        currentAiCnt -= ai;
    }

    public void startStudy() {

    }

    public void stopStudy() {

    }

}
