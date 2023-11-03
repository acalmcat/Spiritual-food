public class Loop_sum {
    public static void main(String[] args) {
        //用while求1-100的和
        int sum=0;
        int  i=1;
        /*
        while(i<=100){
            sum=sum+i;
            i++;
        }
         */

        for(i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
  }
