//Q3- Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)
package codeleet;

public class PangramChecker {
    public static void main(String[] args) {
        String str = "Pack my box with five dozen liquor jugs";
        if(isPangram(str)){
            System.out.println("Pangram");
        }
        else {
            System.out.println("Not a Pangram");
        }
    }
    public static boolean isPangram(String str){
      int index=0;
      boolean arr[] = new boolean[26];
      for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          if(ch>='A' && ch<='Z'){
              index= ch-'A';
          }
          else if(ch>='a' && ch<='z'){
              index=ch-'a';
          }
          else{
              continue;
          }
          arr[index] =true;
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]==false)
              return false;
      }
      return true;
    }
}
