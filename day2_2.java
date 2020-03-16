public class day2_2 {
    //第二题，去除5
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        //获取数组长度
        int size = array.length;
        //创建新数组
        int[] array2 = new int[size];
        //用来临时储存
        int temporary = 0;
        for (int i = 0; i < array.length; i++) {
            //判断非5的写入数组array2
            if (array[i] != 5) {
                array2[temporary] = array[i];
                temporary++;
            }
        }
        System.out.print("去除5后的新数组为： ");
        for (int i = 0; i < array2.length; i++) {
            //因为数组过长，多余的空位不输出
            if (array2[i] == 0) {
                continue;
            }
            System.out.print(array2[i]);
            System.out.print(" ");
        }
    }
}