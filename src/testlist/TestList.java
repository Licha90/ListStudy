package testlist;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        //listStudy


        ArrayList<Integer> liste1 = new ArrayList<Integer>();
        liste1.add(10);
        liste1.add(20);
        liste1.add(30);
        liste1.add(40);
        liste1.add(50);

        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        liste2.add(10);
        liste2.add(20);
        liste2.add(30);

        //事先准备好一个空的数组--->接受返回值
        Integer[] x = new Integer[liste1.size()];

        liste1.toArray(x);//参数  把liste1里面的元素挨个的装到x数组里面去

        System.out.println(x.length);

//        List newList = liste1.subList(2,4);//找寻子集元素  从index 2 到 4
//
//        System.out.println(newList);

//        int value = liste1.set(2,300);
//
//        System.out.println(value);

//        liste1.addAll(liste2);// a U b
//
//        liste1.removeAll(liste2);// a compliment b
//
//        liste1.retainAll(liste2);// a intersection b


        //将list2集合中的的所有元素添加到list中去
//        liste1.addAll(liste2);
//
//        liste1.addAll(2,liste2);//在list1中的第二个元素后面插入list2
        //list1.addAll(Collection < ? extends E > c)
        //将list2集合中的全部元素存入list1集合中
        //list1集合存在泛型 Integer
        //list2集合存在泛型 String
//
//        int index = liste1.indexOf(100);寻找100在liste1中的位置
//
//        System.out.println(index);
//
//        liste1.clear();

        //ArrayList
//        ArrayList<String> list = new ArrayList<String>();//表示集合里面只能存这个元素String

//        //ArrayList 有效可重复的
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
//
//        int size = list.size();//这样每一次循环都就不会调一次size();
//
//        for (int i = 0; i < size; i++){
//
//            list.remove(0);
//
//            System.out.println(list);
//        }

//        System.out.println(list.size());//有效元素
//        System.out.println(list.get(5));//6 的话 -- IndexOutOfBoundException
//
//        System.out.println(list);//相当于循环输出数组 [a, b, c, d, e, a]
//
//        for (int i = 0; i <list.size(); i++){//循环输出数组 a b c d e a
//
//            String value = list.get(i);
//
//            System.out.print(value + " ");
//        }
    }
}
