import java.util.ArrayList;
import java.util.LinkedList;

public class TestLink {

    public static void main(String[] args) {

        //LinkedList 2000000次

        LinkedList<String> linkedList = new LinkedList<String>();

        for (int i = 1; i <= 200000; i++){

            linkedList.addFirst("a");//23毫秒

//            linkedList.addLast("a");//11毫秒
        }
        long time1 = System.currentTimeMillis();

        System.out.println(time1);




        String x;

        for (String v: linkedList
             ) {
            x = v;
        }

        long time2 = System.currentTimeMillis();

        System.out.println(time2 - time1);



//          ArrayList 往前添加元素时间长.
//        ArrayList<String> arrayList =new ArrayList<String>();
//
//        for (int i = 1; i <= 500000; i++){
//
//            arrayList.add("a");
//        }//有20w个a
//
//        long time1 = System.currentTimeMillis();
//
//        for (String v: arrayList
//             ) {
//
//            //System.out.println(v);
//        }
//
//        long time2 = System.currentTimeMillis();
//
//        System.out.println("arrayList 向后追加元素的基本存放时间" + (time2 - time1));
    }
}
