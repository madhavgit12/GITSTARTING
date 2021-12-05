import java.util.Scanner;
public class printno{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print(n);
    }
    
    public static void print(int n){
        if( n == 0){
            System.out.println("1");
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    System.out.println("hello my name is madhav i am here to learn git and github")
    
}
