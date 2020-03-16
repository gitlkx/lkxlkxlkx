import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 第三天作业
 */
public class day3task1 {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        list1.add(new Student("张三", 18, 80, 1));
        list1.add(new Student("李四", 19, 100, 1));
        list1.add(new Student("王五", 17, 59, 1));
        list2.add(new Student("赵六", 18, 85, 2));
        list2.add(new Student("刘七", 19, 93, 2));
        list2.add(new Student("孙八", 17, 55, 2));
        /**
         * 第一题，先将list1加入到list3
         */
        boolean b = (list3.addAll(list1));
        /**
         * 再先将list2加入到list3
         */
        b = (list3.addAll(list2));
        /**
         * 循环输出list3
         */
        for (Student x : list3) {
            System.out.println("新的列表：" + x.getName() + "," + x.getAge() + "岁," + x.getAchievement() + "分," + x.getStudentClass()+"班");
        }
        System.out.println("....................");
        /**
         * 第二题
         */
        //临时变量用于排序
        Student temp ;
        for(int i=0;i<list3.size()-1;i++) {
            for(int j=i+1;j<list3.size();j++){
                if(list3.get(i).getAchievement()>list3.get(j).getAchievement())
                {
                    temp=list3.get(j);
                    list3.set(j,list3.get(i));
                    list3.set(i,temp);
                }
            }
        }
        for (Student x : list3) {
            System.out.println("排序后：" + x.getName() + "," + x.getAge() + "岁," + x.getAchievement() + "分," + x.getStudentClass()+"班");
        }
        System.out.println("....................");
        /**
         * 第三题
         */
        for (int i = 0; i < list3.size(); i++){
            if(list3.get(i).getAchievement()<60){
                System.out.println("这个人居然不及格："+list3.get(i).getName() + "," +list3.get(i).getAge() + "岁," + list3.get(i).getAchievement() + "分," + list3.get(i).getStudentClass()+"班");
            }
        }
        System.out.println("....................");
        /**
         * 第四题
         */
        for (int i = 0; i < list3.size(); i++){
            if(list3.get(i).getName()=="张三"){
                System.out.println("我帮你查到张三的信息了："+list3.get(i).getName() + "," +list3.get(i).getAge() + "岁," + list3.get(i).getAchievement() + "分," + list3.get(i).getStudentClass()+"班");
            }
        }
        System.out.println("....................");
        /**
         * 第五题
         */
        for (int i = 0; i < list3.size(); i++){
            if(list3.get(i).getAge()<=18){
                System.out.println("删除大于18岁："+list3.get(i).getName() + "," +list3.get(i).getAge() + "岁," + list3.get(i).getAchievement() + "分," + list3.get(i).getStudentClass()+"班");
            }
        }
        System.out.println("....................");
        /**用map写一次
         * map
         */

    }
}