import java.util.*;
public class arrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array");
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size; i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(nums[i]);
        }
        // int[] arr=new int[5];
        // arr[0]=97;
        // arr[1]=98;
        // arr[2]=99;
        // arr[3]=99;
        // arr[4]=95;
        // System.out.println(arr[1]);
        // System.out.println(arr[0]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);;
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);
    }
}
