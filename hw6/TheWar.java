package by.itacademy.homework.hw6;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TheWar {
    private static final Random RANDOM = new Random();
    private static int leftHand, rightHand, leftLeg, rightLeg, body, head;
    private static int leftHandCons1, rightHandCons1, leftLegCons1, rightLegCons1, bodyCons1, headCons1;
    private static int leftHandCons2, rightHandCons2, leftLegCons2, rightLegCons2, bodyCons2, headCons2;
    private static int countOfRobotsForWin = 20;
    private static int countOfDetailsForRobot = 6;
    private static int countOfPlayers = 2;
    private static int timeForOneDetail = 500;    // ms
    private static String winMessageCus1 = "First country Win!";
    private static String winMessageCus2 = "Second country Win!";
    private static boolean stop = false;
    private static int countOfDetailsForConsumer1, countOfRobotsForConsumer1;
    private static int countOfDetailsForConsumer2, countOfRobotsForConsumer2;
    public static void main(String[] args) throws InterruptedException {
        produce();
        try {
            ExecutorService threadPool = Executors.newFixedThreadPool(2);
            Callable<String> consume1 = () -> {
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()) {
                    if (stop) {
                        current.interrupt();
                    }
                    if (leftHand > 0 && leftHandCons1 == 0) {
                        leftHandCons1++;
                        leftHand--;
                        countOfDetailsForConsumer1++;
                    }
                    if (rightHand > 0 && rightHandCons1 == 0) {
                        rightHandCons1++;
                        rightHand--;
                        countOfDetailsForConsumer1++;
                    }
                    if (leftLeg > 0 && leftLegCons1 == 0) {
                        leftLegCons1++;
                        leftLeg--;
                        countOfDetailsForConsumer1++;
                    }
                    if (rightLeg > 0 && rightLegCons1 == 0) {
                        rightLegCons1++;
                        rightLeg--;
                        countOfDetailsForConsumer1++;
                    }
                    if (body > 0 && bodyCons1 == 0) {
                        bodyCons1++;
                        body--;
                        countOfDetailsForConsumer1++;
                    }
                    if (head > 0 && headCons1 == 0) {
                        headCons1++;
                        head--;
                        countOfDetailsForConsumer1++;
                    }
                    if (countOfDetailsForConsumer1 == countOfDetailsForRobot) {
                        countOfRobotsForConsumer1++;
                        zeroingCountOfDetailsForCons1();
                    }
                    if (countOfRobotsForConsumer1 == countOfRobotsForWin) {
                        stop = true;
                        break;
                    }
                }
                winMessageCus2 = "";
                return winMessageCus1 + winMessageCus2;
            };
            Callable<String> consume2 = () -> {
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()) {
                    if (stop) {
                        current.interrupt();
                    }
                    if (leftHand > 0 && leftHandCons2 == 0) {
                        leftHandCons2++;
                        leftHand--;
                        countOfDetailsForConsumer2++;
                    }
                    if (rightHand > 0 && rightHandCons2 == 0) {
                        rightHandCons2++;
                        rightHand--;
                        countOfDetailsForConsumer2++;
                    }
                    if (leftLeg > 0 && leftLegCons2 == 0) {
                        leftLegCons2++;
                        leftLeg--;
                        countOfDetailsForConsumer2++;
                    }
                    if (rightLeg > 0 && rightLegCons2 == 0) {
                        rightLegCons2++;
                        rightLeg--;
                        countOfDetailsForConsumer2++;
                    }
                    if (body > 0 && bodyCons2 == 0) {
                        bodyCons2++;
                        body--;
                        countOfDetailsForConsumer2++;
                    }
                    if (head > 0 && headCons2 == 0) {
                        headCons2++;
                        head--;
                        countOfDetailsForConsumer2++;
                    }
                    if (countOfDetailsForConsumer2 == countOfDetailsForRobot) {
                        countOfRobotsForConsumer2++;
                        zeroingCountOfDetailsForCons2();
                    }
                    if (countOfRobotsForConsumer2 == countOfRobotsForWin) {
                        stop = true;
                        break;
                    }
                }
                winMessageCus1 = "";
                return winMessageCus1 + winMessageCus2;
            };
            Future<String> consumer1 = threadPool.submit(consume1);
            Future<String> consumer2 = threadPool.submit(consume2);
            System.out.println(consumer1.get() + consumer2.get());
            threadPool.shutdown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void produce() throws InterruptedException {
        Integer numberOfDetail;
        for (int i = 0; i < (countOfRobotsForWin * countOfDetailsForRobot * countOfPlayers); i++) {
            Thread.sleep(timeForOneDetail);
            numberOfDetail = 1 + RANDOM.nextInt(countOfDetailsForRobot);
            while (true) {
                switch (numberOfDetail) {
                    case 1:
                        if (leftHand < (countOfRobotsForWin * countOfPlayers)) {
                            leftHand++;
                        } else {
                            numberOfDetail++;
                            continue;
                        }
                        break;
                    case 2:
                        if (rightHand < (countOfRobotsForWin * countOfPlayers)) {
                            rightHand++;
                        } else {
                            numberOfDetail++;
                            continue;
                        }
                        break;
                    case 3:
                        if (leftLeg < (countOfRobotsForWin * countOfPlayers)) {
                            leftLeg++;
                        } else {
                            numberOfDetail++;
                            continue;
                        }
                        break;
                    case 4:
                        if (rightLeg < (countOfRobotsForWin * countOfPlayers)) {
                            rightLeg++;
                        } else {
                            numberOfDetail++;
                            continue;
                        }
                        break;
                    case 5:
                        if (body < (countOfRobotsForWin * countOfPlayers)) {
                            body++;
                        } else {
                            numberOfDetail++;
                            continue;
                        }
                        break;
                    case 6:
                        if (head < (countOfRobotsForWin * countOfPlayers)) {
                            head++;
                        } else {
                            numberOfDetail = 1;
                            continue;
                        }
                        break;
                }
                break;
            }
        }
    }
    private static void zeroingCountOfDetailsForCons1() {
        leftHandCons1 = 0;
        rightHandCons1 = 0;
        leftLegCons1 = 0;
        rightLegCons1 = 0;
        bodyCons1 = 0;
        headCons1 = 0;
        countOfDetailsForConsumer1 = 0;
    }
    private static void zeroingCountOfDetailsForCons2() {
        leftHandCons2 = 0;
        rightHandCons2 = 0;
        leftLegCons2 = 0;
        rightLegCons2 = 0;
        bodyCons2 = 0;
        headCons2 = 0;
        countOfDetailsForConsumer2 = 0;
    }
}