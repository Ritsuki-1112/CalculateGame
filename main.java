import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.Random;


public class main{
  public static void main(String args[]){
    ran game = new ran();
    Random A = new Random();
    String x;
    int score = 0;
    int Result;



    System.out.println("~計算レベルチェック~");

    System.out.print("レベルを選んでください(1~2)　-> ");
    Scanner L = new Scanner(System.in);
    int level = L.nextInt();

    System.out.print("問題数を設定してください　-> ");
    Scanner Q = new Scanner(System.in);
    int problem = Q.nextInt();

    System.out.println("レベル:" + level + " 問題数:" + problem);
    System.out.println("１を入力するとスタートします");
    Scanner s = new Scanner(System.in);
    int start = s.nextInt();


    if(start == 1){
      for(int i = 0; i < problem; i++){

        if(level == 1){
          game.number1 = A.nextInt(10);
          game.number2 = A.nextInt(10);
          game.enzann = A.nextInt(3);
          game.calc(game.number1,game.number2,game.enzann);
          x = game.sw(game.enzann);
          System.out.print(game.number1 + x + game.number2 + " = ");
        }else{
          game.number1 = A.nextInt(15);
          game.number2 = A.nextInt(15);
          game.enzann = A.nextInt(3);
          game.calc(game.number1,game.number2,game.enzann);
          x = game.sw(game.enzann);
          System.out.print(game.number1 + x + game.number2 + " = ");
        }

        int ANS = s.nextInt();//回答入力


        if(game.check(ANS) != 1){
          System.out.println("残念！");
        }else{
          System.out.println("正解！");
          score++;
        }


      }


      Result = game.result(score,problem);

      System.out.println(problem + "問中" + score + "問正解！");
      switch(Result){
        case 0:
         System.out.println("Exelent!");
         break;
        case 1:
         System.out.println("Good!");
         break;
        case 2:
         System.out.println("Great!");
         break;
      }

    }


  }
}
