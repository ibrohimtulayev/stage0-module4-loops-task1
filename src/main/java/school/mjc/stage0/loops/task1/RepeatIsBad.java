package school.mjc.stage0.loops.task1;

public class Main {
    public void repeatIsBad() {
        printMessage(20);
    }

    private void printMessage(int remainingTimes) {
        if (remainingTimes > 0) {
            System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
            remainingTimes--;
            printMessage(remainingTimes);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.repeatIsBad();
    }
}

