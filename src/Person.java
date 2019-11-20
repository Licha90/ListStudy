public class Person {

    private String name;

    private int testNumber;

    public Person(String name, int testNumber){

        this.name = name;

        this.testNumber = testNumber;
    }

    //重写equals方法  将Person放入set集合中去 去掉重复
    public boolean equals(Object obj){

        if (this == obj){

            return true;
        }

        if (obj instanceof Person){

            //obj还原回Person类型
            Person anotherPerson = (Person)obj;

            //this anotherPerson 比较对象中的name属性
            if (this.name.equals(anotherPerson.name)){

                return true;//如果名字一致 就是同一个对象
            }
        }

        return false;
    }

    //重写toString 方法 让对象打印输出的时候直接输出对象的属性 而不是hashCode码
    public String toString(){

        StringBuilder builder = new StringBuilder("{");

        builder.append(this.name);
        builder.append(",");
        builder.append(this.testNumber);
        builder.append("}");

        return new String(builder);
    }


    //重写hasCode方法
    public int hashCode(){
        //两个person对象name属性一致 需要hashCode返回值一致

        return this.name.hashCode();
    }

    public String getName(){

        return this.name;
    }

    public int getTestNumber(){

        return this.testNumber;
    }
}
