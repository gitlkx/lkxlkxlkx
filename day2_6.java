public class day2_6 {
    public static void main(String[] args) {
        String a = "Hello World!";
        //用于计数
        int sum = 0;
        //如果字符串还有l，进入循环
        while(a.indexOf('l')!=-1){
            //获取l的下标
            int b = a.indexOf('l');
            //根据下标将字符串分为两半
            String head = a.substring(0,b);
            String tail = a.substring(b+1);
            //合并两半字符串
            a = head.concat(tail);
            //计数加1
            sum++;
        }
        System.out.print("一共出现了：");
        System.out.print(sum);
        System.out.print("次");
    }
}