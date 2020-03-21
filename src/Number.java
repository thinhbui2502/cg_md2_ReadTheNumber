import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Which number do you need to read?");

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String result = "";
        //Lấy số hàng trăm
        int hundreds = inputNumber / 100;
        //Lấy số hàng chục
        int tens = (inputNumber % 100) / 10;
        //Lấy số hàng đơn vị
        int ones = inputNumber % 10;
        boolean trueNumber = false;
        boolean num = false;

        if (inputNumber >= 10 && inputNumber < 20) {
            num = true;
        }

        if (inputNumber < 1000) {
            trueNumber = true;
        }

        if (trueNumber) {
            switch (hundreds) {
                case 0:
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
                    break;
                default:
                    result = "out of ability";
            }
        }

        if (hundreds != 0) {
            result += " " + "hundred" + " " + "and" + " ";
        }

        switch (tens) {
            case 0:
                break;
            case 1:
                num = true;
                tens = inputNumber % 10;
                break;
            case 2:
                result += "twenty";
                break;
            case 3:
                result += "thirty";
                break;
            case 4:
                result += "forty";
                break;
            case 5:
                result += "fifty";
                break;
            case 6:
                result += "sixty";
                break;
            case 7:
                result += "seventy";
                break;
            case 8:
                result += "eighty";
                break;
            case 9:
                result += "ninety";
                break;
            default:
                result = "out of ability";
        }
        if (!num) {
            if (tens != 0) {
                result += " ";
            }
            switch (ones) {
                case 0:
                    break;
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
                default:
                    result = "out of ability";
            }
        }

        if (num) {
            switch (tens) {
                case 0:
                    result += "ten";
                    break;
                case 1:
                    result += "eleven";
                    break;
                case 2:
                    result += "twelve";
                    break;
                case 3:
                    result += "thirteen";
                    break;
                case 4:
                    result += "fourteen";
                    break;
                case 5:
                    result += "fifteen";
                    break;
                case 6:
                    result += "sixteen";
                    break;
                case 7:
                    result += "seventeen";
                    break;
                case 8:
                    result += "eighteen";
                    break;
                case 9:
                    result += "nineteen";
                    break;
                default:
                    result = "out of ability";
            }
        }
        System.out.printf("%d is: %s", inputNumber, result);
    }
}

