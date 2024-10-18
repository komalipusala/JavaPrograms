public class Commandline_Arg {
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Please provide atleast one argument for 'num'.");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int length = 5;
        if(args.length >= 2){
            length = Integer.parseInt(args[1]);

        }

        System.out.println("Number: "+num);
        System.out.println("Length: "+length);
    }
    
}
