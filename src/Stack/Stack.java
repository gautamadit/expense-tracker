package Stack;

public class Stack {
    char[] arr;
    int top;
    int size;

    Stack(int size){
        this.size = size;
        top = -1;
        arr = new char[size];
    }

    void push(char val){
        if(top == size-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        top--;
    }
   public static boolean balance(String arr){
        Stack stack=new Stack(arr.length());
       for (char ch :arr.toCharArray()) {
           if (ch == '(') {
               stack.push(ch);
           } else if (ch == ')') {
               if (stack.isEmpty()) {
                   return false; // Unmatched closing parenthesis
               }
               stack.pop();
           }
       }

       return stack.isEmpty();
   }


    boolean isEmpty(){
        return top == -1;
    }
}

class DriverCode{
    public static void main(String[] args) {
      String[] arr={
              "()",
              "((())"
      };
      for(String str:arr){
          System.out.println("input"+str+"-->Balanced"+ Stack.balance(str));
      }

    }
}