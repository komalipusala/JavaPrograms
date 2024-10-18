import java.util.Scanner;
public class factorRough {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = io.nextInt();
        
        for(int i = 2; i  <= num/2; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        io.close();
    }
}
