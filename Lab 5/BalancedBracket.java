public class BalancedBracket  {
     public void Balanced(String str)
     {
        Stack S=new Stack();
      for(int i=0; i<str.length();i++)
      {
           if(str.charAt(i)  =='{' ||str.charAt(i) =='['  || str.charAt(i) =='(')
           {
              
               S.push(str.charAt(i));

           }
          
           else if(str.charAt(i)  =='}')
           {
              if(S.pop() !='{')
              {
                System.out.println("Unbalanced Brackets ");
                return;
              }
           }
           else if(str.charAt(i)  ==')')
           {
              if(S.pop() !='(')
              {
                System.out.println("Unbalanced Brackets ");
                return;
              }
           }
           else if(str.charAt(i)  ==']')
           {
           
              if(S.pop() !='[')
              {
                System.out.println("Unbalanced Brackets ");
                 return;
              }
           }
           
        }

        if(S.pop() != ' ')
        {System.out.println("Unbalanced brakets");
        return;}
        
            System.out.println("Brackets are balanced ");
      

     }

    public static void main(String[] args) {
        String Str="({[]})";
        BalancedBracket B=new BalancedBracket();
        B.Balanced(Str);

        
    }
}
