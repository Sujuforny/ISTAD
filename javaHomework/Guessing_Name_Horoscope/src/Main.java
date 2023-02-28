import java.util.Arrays;
import java.util.Scanner;

/**
 * this code write by Sieng pengny
 */

public class Main {
    public static void main(String[] args) {
        guestname();
    }

    private static void guestname(){
        int number1=0,number2=0,num1=0,num2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input your name here:");
        String name =scanner.nextLine();
        System.out.println(name);
        String Name = name.toUpperCase();
        System.out.println(Name);
        int result=0;
        for(int i=0;i<Name.length();i++){
            char a=Name.charAt(i);
            switch (a){
                case 'A':
                case 'J':
                case 'S':result +=1;
                    break;
                case 'B':
                case 'K':
                case 'T':result +=2;
                    break;
                case 'C':
                case 'L':
                case 'U':result +=3;
                    break;
                case 'D':
                case 'M':
                case 'V':result +=4;
                    break;
                case 'E':
                case 'N':
                case 'W':result +=5;
                    break;
                case 'F':
                case 'O':
                case 'X':result +=6;
                    break;
                case 'G':
                case 'P':
                case 'Y':result +=7;
                    break;
                case 'H':
                case 'Q':
                case 'Z':result +=8;
                    break;
                case 'I':
                case 'R':result +=9;
                    break;
                default:break;
            }
        }
        System.out.println(result);//int
        String Numberofname=Integer.toString(result);//convert int to string
        System.out.println(Numberofname);//string
        for (int i=0;i<Numberofname.length();i++){
            char Number =Numberofname.charAt(i);
            number1= Character.getNumericValue(Number);
            num1 +=number1;

        }
        String lastofnumber =Integer.toString(num1);
        if(lastofnumber.length()==1){
            System.out.println(num1);
        }
        else {
            for (int i=0;i<lastofnumber.length();i++){
                char onechar =lastofnumber.charAt(i);
                number2= Character.getNumericValue(onechar);
                num2 +=number2;

            }
            System.out.println(num2);
        }

    }

}

