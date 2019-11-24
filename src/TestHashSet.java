import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    public static void main(String[] args) {

//        Person p1 = new Person("猴子");
//
//        Person p2 = new Person("猴子");

//        System.out.println(p1.equals(p2));

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add(new String("猴子"));
        stringHashSet.add(new String("猴子"));
        stringHashSet.add(new String("猴子"));
        stringHashSet.add(new String("猴子"));
        stringHashSet.add(new String("猴子"));

        System.out.println("String 集合的size " + stringHashSet.size());


        HashSet<Person> personSet = new HashSet<Person>();

        personSet.add(new Person("猴子1",1,1));
        personSet.add(new Person("猴子2",2,2));
        personSet.add(new Person("猴子3",3,3));
        personSet.add(new Person("猴子4",4,4));
        personSet.add(new Person("猴子5",5,5));
        System.out.println("Person 集合的size " + personSet.size());//5

        System.out.println(personSet);

//        System.out.println(personSet.iterator().next().getTestNumber());
        //获取personSet的第一个数字
        //set集合 发现重复的元素就会拒绝存入  他只会存储重复元素中的第一个




//        HashSet<String> set = new HashSet<String>();

//        set.add("b");
//        set.add("a");
//        set.add("B");
//        set.add("c");
//        set.add("A");
//        set.add("C");
//
//        //获取一个迭代器对象 通过set集合获取
//        Iterator<String> it = set.iterator();//iterator接口 多态的效果
//        //判断下一个位置是否有元素 有才能取
//        //不知道次数 所以用while
//        while (it.hasNext()){
//
//            String value = it.next();
//
//            System.out.println("取得的元素 "+ value);
//
//        }
//
//
//        System.out.println(set);
//        //无序：我们使用集合存放的元素的顺序 集合内取出来的顺序不一致
//
//        set.remove("b");
//
//        System.out.println(set);
    }
}
