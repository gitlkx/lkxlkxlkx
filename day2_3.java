public class day2_3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        //ab数组总长度
        int size = a.length+b.length;
        //创建新数组
        int array [] = new int[size];
        //新数组加上a
        for (int i = 0; i < a.length; i++) {
            array[i]=a[i];
        }
        //新数组加上b
        for (int j = a.length; j < size; j++) {
            array[j]=b[j-a.length];
        }
        //排序
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[i]) {
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.print("合并且排序后的数组为：");
        //输出
        for (int k = 0; k < size; k++) {
            System.out.print(array[k]);
            System.out.print(" ");
        }
     }
}