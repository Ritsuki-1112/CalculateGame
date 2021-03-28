
public class ran{
  int number1;
  int number2;
  int enzann;
  int ans;

 public void calc(int a,int b,int c){

    switch(c){
      case 0:
       ans = a + b;
       break;
      case 1:
       ans = a - b;
       break;
      case 2:
       ans = a * b;
       break;
    }
  }


 public int check(int a){
    if(a == ans){
      return 1;
    }else{
      return 0;
    }
  }

 public String sw(int a){
     if(a == 0){
       return "+";
     }else if(a == 1){
       return "-";
     }else{
       return "x";
     }
  }


 public int result(int s,int p){
     if(s == p){
       return 0;
     }else if(s < p/3){
       return 1;
     }else{
       return 2;
     }
 }



}
