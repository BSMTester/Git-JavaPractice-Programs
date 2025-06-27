package JavaPrograms;

public class PrintReverseNumber {
    public static void main(String[] args){
        int num = 243568;
        int temp =0;
        int rnum = 0;
        while(num > 0){
            temp = num % 10;
            rnum = rnum *10 + temp;
            num = num / 10;
        }
        System.out.println(rnum+" is reverse number");
    }
}
