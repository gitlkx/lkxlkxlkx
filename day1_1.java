public class day1_1 {
    public static  void main(String[] args){
        int n =0;
        for(int i=101;i<=200;i++){
            boolean isPrime = true;
            for( int j = 2; j< i; j++)
                {
                    if(j % i ==0)
                    {
                        isPrime = false;
                        break;
                    }
                }
            if(!(isPrime)){
                n+=i;
            }
        }
        System.out.println(n);
    }
}
