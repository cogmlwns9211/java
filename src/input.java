import java.util.Scanner;

public  class input{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int a=sc.nextInt();
        System.out.println("입력하신 숫자: "+a);
        sc.close();
    }
}
