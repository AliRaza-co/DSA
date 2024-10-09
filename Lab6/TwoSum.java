import java.util.Scanner;
class TwoSum{
       public void BubbleSort(int arr[])
       {
         for(int i=0; i<arr.length-1; i++)
         {
            for(int j=0; j<arr.length-1-i; j++)
            {
               if(arr[j]>arr[j+1])
               {
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
            }
         }
          
       }
      public void Sum(int sum, int arr[])
    {
      for(int i=0; i<arr.length; i++)
      {
         int left=i;
         int right=arr.length-1;
         while(left<right)
         {
            int mid=(left+right)/2;
            if(arr[i]+arr[mid]==sum)
            {
       System.out.println("yes "+arr[i]+"+"+arr[mid]+" is ="+sum);
        return;
            }
            else if (arr[i]+arr[mid]<sum) 
            {
               left=mid+1;
            }
            else if (arr[i]+arr[mid]>sum) 
            {
               right=mid-1;
            }
         }
      }
      System.out.println("No, there are no any two numbers whose sum is equal to required number  "+sum);

    }
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       TwoSum S=new TwoSum();
       System.out.print("Enter the size of an array ");
       int size=obj.nextInt();
       int arr[]=new int[size];
       for (int i=0; i<arr.length; i++)
       {
          System.out.print("Enter the element at index "+i+" ");
         arr[i]=obj.nextInt();
       } 
       System.out.print("Enter the number whose sum you wanna find ");
       int sum=obj.nextInt();
       System.out.println("Unsorted array is here ");
       for(int i=0; i<arr.length; i++)
       {
         System.out.print(arr[i]+" ");
       }
       System.out.println();
       S.BubbleSort(arr);
       System.out.println("sorted array is here ");
       for(int i=0; i<arr.length; i++)
       {
         System.out.print(arr[i]+" ");
       }
       System.out.println();
       S.Sum(sum, arr);

    }
}
