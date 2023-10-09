//Q2- Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
package codeleet;

public class RomanConvertor {
    public static void main(String[] args) {
      romanCovertor(1011);
    }
    public static void romanCovertor(int n){
        if(n==0){
            System.out.println("Invalid Input");
            return;
        }
        System.out.print("Roman Number of "+n+" is : ");
        while(n>0){
            if(n>=1000){
                System.out.print("M");
                n=n-1000;
            } else if (n>=900) {
                System.out.print("CM");
                n=n-900;
            }
            else if(n>=500){
                System.out.print("D");
                n=n-500;
            } else if (n>=400) {
                System.out.print("CD");
                n=n-400;
            } else if (n>=100) {
                System.out.print("C");
                n=n-100;
            }
            else if(n>=90){
                System.out.print("XC");
                n=n-90;
            } else if (n>=50) {
                System.out.print("L");
                n=n-50;
            } else if (n>=40) {
                System.out.print("XL");
                n=n-40;
            } else if (n>=10) {
                System.out.print("X");
                n=n-10;
            } else if (n>=9) {
                System.out.print("IX");
                n=n-9;
            } else if (n>=5) {
                System.out.print("V");
                n=n-5;
            }
            else if(n>=4){
                System.out.print("IV");
                n=n-4;
            } else if (n>=1) {
                System.out.print("I");
                n=n-1;
            }
        }
    }
}
