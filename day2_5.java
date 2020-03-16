public class day2_5 {
    //字符串第二题
    public static void main(String[] args) {
        String a = "1,2,3,4,5,6,7";
        String[] b = a.split(",");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            System.out.print(' ');
        }
    }
}
