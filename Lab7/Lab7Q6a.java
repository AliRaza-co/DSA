import java.util.Random;

public class Lab7Q6a {
    public static int search(int n){
        Random r =new Random();
      
        int arr[]=new int[5];
      
    
        for(int i=0;i<5;i++){
            int rand= r.nextInt(9);
            arr[i]=rand;
            System.out.println(arr[i]+" ");
          }

          for(int i=0;i<5;i++){
            if (n==arr[i]) {
                System.out.println();
                return 1;
            }
          }
          System.out.println();
          return 0;
    }


    public static void main(String[] args) {
        System.out.println(search(10));
    }
}