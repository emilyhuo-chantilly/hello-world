
public class Calculator {
     public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Error try again");
            System.exit(1);
        }
        else{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]); 
            String sign = args[1];
            int result = calcFunction(num1, sign, num2);
            System.out.println(result);       
        }
     }  
    public static int calcFunction(int num1, String sign, int num2) {
        int result = 0;
        if(sign.equals("+")) {
            result = num1 + num2;
        }
        else if(sign.equals("-")) {
            result = num1 - num2;
        }
        else if(sign.equals("x")) {
            result = num1 * num2;
        }
        else if(sign.equals("/")) {
            result = num1 / num2;
        }
        else {
            System.out.println("Please enter valid operator");
        }
        return result;
    }
}
