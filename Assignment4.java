package Assignments;
import java.util.*;
public class Assignment4{
    public static void main(String args[]) {
        int arr[] = {22,56,84,92,54,88,42,12,63};
        
        sort(arr);
     
    }
    static void sort(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}