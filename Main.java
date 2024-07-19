import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Main result = new Main();
        System.out.println("Input:");
        String expression = input.nextLine();
        String answer = result.calc(expression);
        System.out.println("Output:\n" + answer);
    }
}
class Main {
    public static String calc(String input){
        String exception="throws Exception";
        int result=0;
        String[] inputSplit = input.split(" ");
        if (inputSplit.length !=3){
            return exception;
        }
        Integer a;
        Integer b;
        a = Integer.valueOf(inputSplit[0]);
        b = Integer.valueOf(inputSplit[2]);
        if ((a<1)||(b>10)||(a<1)||(b>10)){
            return exception;
        }
        String sign = inputSplit[1];
        switch (sign){
            case "+"->result = a+b;
            case "-"->result = a-b;
            case "*"->result = a*b;
            case "/"->result = a/b;
            default->{
                return exception;
            }
        }
        return String.valueOf(result);
    }
}





