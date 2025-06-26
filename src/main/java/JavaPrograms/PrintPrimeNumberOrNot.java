package JavaPrograms;

public class PrintPrimeNumberOrNot {
    public static void main(String[] args){
        int num = 5;
        int flag = 0;
        if (num <= 1){
            flag++;
        }else {
            for(int i=2;i<num;i++){
                if(num % i == 0){
                    flag++;
                    break;
                }
            }
            }
        if(flag == 0)
            System.out.println(num+" is prime Number");
        else
            System.out.println(num+" is not prime Number");
    }
}
