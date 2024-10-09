import java.util.Scanner;
class Selection{
    public void Sort(int arr[])
{
    for(int i=0; i<arr.length-1; i++)
    {
       int min=i;
       for(int j=i+1; j<arr.length; j++)
       {
        if(arr[j]<arr[min])
        {
             min=j;
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
       }
    }

}

public static void main(String[] args) {
    Selection S=new Selection();
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
    S.Sort(arr);
    System.out.println("The sorted array is here ");
    for(int k=0; k<arr.length; k++)
    {
          System.out.print(arr[k]+" ");
    }

    
}
}