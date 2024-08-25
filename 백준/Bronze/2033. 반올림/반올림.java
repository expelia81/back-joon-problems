import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int num=10;

        while(N>num){

            if(N%num >= num/2){
                N=N+num;
            }

            N=N-(N%num);
            num=num*10;
        }

        System.out.println(N);
    }
}