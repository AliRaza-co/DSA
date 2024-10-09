class Recarr{

    public void ArrAscending(char[]arrr, int index){
        if (index>=arrr.length) {
            return;
        }
        else{
            System.out.println(arrr[index]+" ");
            ArrAscending(arrr,index+1);
        }
    }


    public void ArrDescending(char[]arr, int index){
        if (index<0) {
            return;
        }
        else{
            System.out.println(arr[index]+" ");
            ArrDescending(arr, index-1);
        }
    }
}


public class Lab7Q1B {
public static void main(String[] args) {
    Recarr re=new Recarr();
    char[] chararr={'A','B','C','D','E','F'};
      
      System.out.println("aRRAY IN FORWARD DIRECTION:");
      re.ArrAscending(chararr, 0);

      System.out.println("array in backward direction:");
      re.ArrDescending(chararr, chararr.length-1);
}    
}
