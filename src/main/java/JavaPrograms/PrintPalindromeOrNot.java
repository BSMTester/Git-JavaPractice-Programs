package JavaPrograms;

public class PrintPalindromeOrNot {
    public static void main(String[] args){
        int num = 122;
        int temp = 0;
        int mod = 0;
        int flag = num;
        while(num > 0){
            mod = num % 10;
            temp = (temp*10)+mod;
            num =  num / 10;
        }
        if(flag == temp){
            System.out.println(flag+" is palindrome");
        }else{
            System.out.println(flag+" is not a palindrome");
        }
    }
}
