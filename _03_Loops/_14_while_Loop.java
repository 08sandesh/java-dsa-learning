package _03_Loops;

public class _14_while_Loop {
    public static void main(String[] args){
        //  while loop
        //  Usecase : Generally used when conditions are more than one

        //  while loop syntax :

        //  initialization ;
        //  while(condition) {
        //  body/work ;
        //  increment/decrement 
        //  }

        int i = 1;
        while(i <= 10){
            System.out.print(i + " ");
            i++;
        }

        //  for loop as while loop :
        int j = 1;
        for(; j <= 10 ;){
            System.out.print(j + " ");
            j++;
        }
    }
}

