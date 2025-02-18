import java.util.*;
public class searchindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int size =sc.nextInt();
        int number[]=new int[size];
        System.out.println("enter the element of the array");
        for(int i=0;  i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to search in array");
        int search=sc.nextInt();

        for(int i=0;i<size;i++){
            if(number[i]==search){
                System.out.println("element found at index"+i);
            }else{
                System.out.println("element not found");
            }
        }
    }
}
