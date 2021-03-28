import java.io.*;


public class gh{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] param = input.split(" ");

    int a = Integer.parseInt(param[0]);
    int b = Integer.parseInt(param[2]);
    calc(a,b,param[1]);
  }

    private static void calc(int x,int y, String c){
      switch(c){
        case "+":
          System.out.println(x+y);
          break;
        case "-":
          System.out.println(x-y);
          break;
        case "*":
          System.out.println(x*y);
          break;
        default :
          System.out.println(x/y + " ... " + x%y);
          break;
      }
    }
}
