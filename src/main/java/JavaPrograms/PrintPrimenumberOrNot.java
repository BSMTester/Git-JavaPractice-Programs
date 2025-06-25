package JavaPrograms;

public class PrintPrimenumberOrNot {

        public static void main(String[] args) {
            int num = 3;
            int flag = 0;
            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag++;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(num + " is prime number");
                } else {
                    System.out.println(num + " is not prime number");
                }
            }else
                System.out.println(num+" is not prime number");
        }
    }
