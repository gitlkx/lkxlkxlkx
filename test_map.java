import java.util.HashMap;

public class test_map {
    public static void main(String[] args){
        HashMap<Integer,Student> student1 = new HashMap<>();
        HashMap<Integer,Student> student2 = new HashMap<>();
        student1.put(0,new Student("张三", 18, 80, 1));
        student1.put(1,new Student("李四", 19, 100, 1));
        student1.put(2,new Student("王五", 17, 59, 1));
        student2.put(3,new Student("赵六", 18, 85, 2));
        student2.put(4,new Student("刘七", 19, 93, 2));
        student2.put(5,new Student("孙八", 17, 55, 2));
        /**
         * 第一题，合并
         */
        HashMap<Integer,Student> student3 = new HashMap<>();
        student3.putAll(student1);
        student3.putAll(student2);
        /**
         * 输出
         */
        System.out.println("合并后为：");
        for(int i = 0;i<student3.size();i++){
            System.out.println(student3.get(i).getName()+" "+student3.get(i).getAge()+"岁"+student3.get(i).getAchievement()+"分"+student3.get(i).getStudentClass()+"班");
        }
        System.out.println(".......................................");
        /**
         * 第二题
         */
        HashMap<Integer,Student> student4 = new HashMap<>();
        for(int i = 0;i<student3.size();i++){
            for(int j = 0;j<student3.size();j++){
                if(student3.get(j).getAchievement()>student3.get(i).getAchievement()){
                    student4 = student3;
//                    student3=
                }
            }
        }
    }
}
