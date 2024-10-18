// 3. Write a program to print a table for number 15 with length 10.(use printf)
public class table_num {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            String result = String.format("15 * %d = %d\n", i, i*15);
            System.out.println(result);
        }
    }
}
