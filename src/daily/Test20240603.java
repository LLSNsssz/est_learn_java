package daily;

public class Test20240603 {
  public static void main(String[] args) {

    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
    }

    int num1 = 10, num2 = 20;
    char operator = '/';
    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
    }

    String color = "red";
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
    }

    int score = 99;
    switch (score / 10) {
      case 10, 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }

    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("Java");
        break;
      case "Python":
        System.out.println("Python");
        break;
      case "C++":
        System.out.println("C++");
        break;
      default:
        System.out.println("JavaScript");
        break;
    }
  }
}
