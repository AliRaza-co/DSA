import java.util.Scanner;
class SimpleRec{
     
    public  void PrintAscending(int current, int n){
        if (current>n) {
            return;
        }
        else
        {
            System.out.println(current+" ");
            PrintAscending(current + 1 , n);
        }
    }


    public  void printDes(int current){
        if(current<1){
            return;
        }
        else{
            System.out.println(current+" ");
            printDes(current-1);
        }
    }
}

public class Lab7Q1{
    public static void main(String[] args) {
     SimpleRec Sr=new SimpleRec();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter any number N:");
        
        int n=Sc.nextInt();

        System.out.println("Print numbers in Ascending order");
         Sr.PrintAscending(1,n);


         System.out.println("Numbers in descending ");
         Sr.printDes(n);

    }

}
