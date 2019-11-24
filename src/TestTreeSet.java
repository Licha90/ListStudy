import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        TreeSet<Person> personSet = new TreeSet<Person>();
        personSet.add(new Person("小明",1,21));
        personSet.add(new Person("小明",2,32));
        personSet.add(new Person("小明",3,13));
        personSet.add(new Person("小明",4,12));
        personSet.add(new Person("小明",5,34));

        System.out.println(personSet.size());//1
        System.out.println(personSet);

        TreeSet<String> stringSet = new TreeSet<String>();
//        personSet.add(new Person("小明",1));
//        personSet.add(new Person("小明",2));
//        personSet.add(new Person("小明",3));
//        personSet.add(new Person("小明",4));
//        personSet.add(new Person("小明",5));
//
//        stringSet.add("b");
//        stringSet.add("C");
//        stringSet.add("A");
//        stringSet.add("c");
//        stringSet.add("a");
//        stringSet.add("B");
//        stringSet.add("a");
//        stringSet.add("B");
//
//        System.out.println(stringSet.size());//6    set家族如果有相同的对象 拒绝存入
//        System.out.println(stringSet);//集合本身有自己的排布顺序


    }
}
