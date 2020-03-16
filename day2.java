public class day2 {
    //第一题排序
    public static void main(String[] args) {
        int[] array = {1, 23, 6, 74, 8, 19, 104};
        //冒泡排序
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                //比较大小
                if (array[j] < array[i]) {
                    //交换位置
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.print("排序后的数组为：");
        //输出
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
    }
}