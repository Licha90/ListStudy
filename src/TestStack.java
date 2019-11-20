import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack);

        System.out.println(stack.peek());//查找栈顶的元素

        System.out.println(stack);

        System.out.println(stack.search("b"));
    }
}
