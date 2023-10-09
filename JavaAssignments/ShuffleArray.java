
// Q1-Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

package codeleet;
import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7};
     shuffle(arr);

    }
    public static void shuffle(int a[]){
       Random rand = new Random();
       int l = a.length;
       for(int i = l-1;i>0;i--){
           int index = rand.nextInt(i+1);
           int temp = a[i];
           a[i]=a[index];
           a[index]=temp;
       }
        System.out.println(Arrays.toString(a));
    }
}
