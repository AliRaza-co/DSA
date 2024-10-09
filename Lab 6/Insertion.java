import java.util.Scanner;
public class Insertion {
    public void Insertion(int arr[])
    {
       for (int i=1; i<arr.length; i++)
       {
         int key=arr[i];
         int j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
          arr[j+1]=key;
       }
    }
   public static void main(String[] args) {
     Insertion I =new Insertion();
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the size of an array --> ");
    int size=obj.nextInt();
    int arr[]=new int[size];
    for(int i=0; i<size; i++)
    {
        System.out.print("Kindly enter the element at index "+i+" ");
        arr[i]=obj.nextInt();
    }
       System.out.println("The unsorted array is here ");
    for(int i=0; i<arr.length; i++)
    {
          System.out.print(arr[i]+" ");
    }
    System.out.println();
    I.Insertion(arr);
      System.out.println("The sorted array is here ");
    for(int i=0; i<arr.length; i++)
    {
          System.out.print(arr[i]+" ");
    }

    }
}

