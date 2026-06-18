package baseball;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] deck = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 100; i++) {
            int rIdx = rd.nextInt(9);
            int temp = deck[0];
            deck[0] = deck[rIdx];
            deck[rIdx] = temp;
        }

        int[] com = {deck[0], deck[1], deck[2]};

        while (true) {
            System.out.print("정수 3개 입력: ");
            int[] user = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

            int strike = 0, ball = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        int dummy = (i == j) ? strike++ : ball++;
                    }
                }
            }

            System.out.println("-> " + strike + ":S " + ball + ":B");
            if (strike == 3) {
                System.out.println("게임 종료!");
                break;
            }
        }
    }
}


//public class Baseball {
//    static int[] ar = new int[3];
//
//    public static void generateNum() {
//        Random random = new Random();
//        boolean eq = true;
//        do {
//            for (int i = 0; i < ar.length; i++) {
//                ar[i] = random.nextInt(9) + 1;
//            }
//
//            if ((ar[0] != ar[1]) && (ar[1] != ar[2])
//                    && (ar[2] != ar[0])) {
//                eq = false;
//            }
//        } while (eq);
//
////        for (int i = 0; i < ar.length; i++) {
////            System.out.print(ar[i] + " ");
////        }
//    }
//
//
//    public static void main(String[] args) {
//        // 1. 3개의 중복되지 않는 난수 생성.
//        generateNum();
//        // 2. Game
//        Scanner sc = new Scanner(System.in);
//        boolean end = false;
//        do {
//            System.out.print("Input number...");
//            int[] inp = new int[3];
//            for (int i = 0; i < inp.length; i++) {
//                inp[i] = sc.nextInt();
//            }
//
//            // 3. check game end.
//            int strike = 0;
//            int ball = 0;
//            // strike check
//            for (int i = 0; i < ar.length; i++) {
//                if (ar[i] == inp[i]) {
//                    strike++;
//                }
//            }
//            // ball check
//            for (int i = 0; i < ar.length; i++) {
//                for (int j = 0; j < ar.length; j++) {
//                    if (ar[i] == inp[j] && i != j) {
//                        ball++;
//                    }
//                }
//            }
//
//            System.out.println("Strike : " + strike + ", ball : " + ball);
//
//            if (strike == 3) {
//                System.out.println("Game Over!!!");
//                end = true;
//            }
//        } while (!end);
//    }
//}
