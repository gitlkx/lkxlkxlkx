public class day3_1 {
    public static int max(int a, int b) {
        int c = 0;
        if (a > b) {
            c = a;
        } else if (a < b) {
            c = b;
        }
        return c;
    }

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
////        List<String> list2 = new ArrayList<>();
////        list.add("a");
////        list.add("b");
////        list.add("c");
////        list.add("d");
////        list.add("e");
////        list.remove("b");
////        list.addAll(list2);
////        for(int i = 0;i<list.size();i++) {
////            System.out.println(list.get(i));
////        }
//        List<Dog> dog = new ArrayList<>();
//        dog.add()
//
//        Map<String,String> map = new HashMap<>();
//        map.put("a","a");
//        map.put("b","b");
//        Map<String,String> map2 = new HashMap<>();
//        map2.put("c","c");
//        map2.put("d","d");
//        map.putAll(map2);
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            String mapKey = entry.getKey();
//            String mapValue = entry.getValue();
//            System.out.println(mapKey+";"+mapValue);
//        }
        int a = 10;
        int b = 20;
        int c = max(a,b);
        System.out.println(c);

    }
}
