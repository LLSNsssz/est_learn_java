package lang.wrapper;

import java.util.Scanner;

public class Weekly1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
            String command = sc.nextLine();
            if (Integer.parseInt(command) < 5 && Integer.parseInt(command) > 0) {
                System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                int num1 = sc.nextInt();
                System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                int num2 = sc.nextInt();
                sc.nextLine();
                if (command.contains("1") || command.contains("덧셈")) {
                    System.out.println(num1 + "+" + num2 + "=" + num1 + num2);
                } else if (command.contains("2") || command.contains("뺄셈")) {
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                } else if (command.contains("3") || command.contains("곱셈")) {
                    System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
                } else if (command.contains("4") || command.contains("나눗셈")) {
                    System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
                }
            } else if (command.contains("0") || command.contains("종료")) {
                System.out.println("계산을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 입력이 아닙니다.");

            }
        }
    }
}

