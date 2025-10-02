import java.util.*;
public class TicTacToe{
  public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    int [] row1= {0,0,0};
    int [] row2= {0,0,0};
    int [] row3= {0,0,0};
    while(true){
    System.out.print("Enter Row no.: ");
    int row = sc.nextInt();
    System.out.print("Enter Column no.: ");
    int col = sc.nextInt()-1;
    System.out.print("Enter 1 for Circle and 2 for Cross: ");
    int num = sc.nextInt();
    int [] temp={0,0,0};
    if (row ==1){
      if(row1[col] ==0){
        row1[col] = num;
        temp=row1;
      }else{
        System.out.println("Already taken");
        continue;
      }
    } else if(row==2){
       if(row2[col] ==0){
        row2[col] = num;
        temp=row2;
      }else{
        System.out.println("Already taken");
        continue;
      }
    }else if(row==3){
       if(row3[col] ==0){
        row3[col] = num;
        temp=row3;
      }else{
        System.out.println("Already taken");
        continue;
      }
    }
    else{
      System.out.println("invalid input");
    } 
    System.out.println(Arrays.toString(row1));
    System.out.println(Arrays.toString(row2));
    System.out.println(Arrays.toString(row3));

    
    if (temp[0]==temp[1] && temp[0] == temp[2]&& temp[0]!=0){
      if(temp[0]==1){
        System.out.println("Winner is Player 1");
        break;
      }else{
        System.out.println("Winner is Player 2");
        break;
      }
    }
     else if (row1[col]==row2[col] && row1[col] == row3[col] && row1[0]!=0){
      if(row1[col]==1){
        System.out.println("Winner is Player 1");
        break;
      }else{
        System.out.println("Winner is Player 2");
        break;
      }
    }
     else if (row1[0]==row2[1] && row1[0] == row3[2] && row1[0]!=0){
      if(row1[0]==1){
        System.out.println("Winner is Player 1");
        break;
      }else{
        System.out.println("Winner is Player 2");
        break;
      }
    }
    else if (row3[0]==row2[1] && row3[0] == row1[2] && row1[2]!=0){
      if(row1[0]==1){
        System.out.println("Winner is Player 1");
        break;
      }else{
        System.out.println("Winner is Player 2");
        break;
      }
    } 
    } 
  }
}
