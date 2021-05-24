package win.elegentjs.algorithms.stack;

/**
 * 演示顺序栈（基于数组的实现）
 */
public class ArrayStackSample {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        String item = stack.peek();
        System.out.println("栈顶元素是：" + item);

        item = stack.pop();
        System.out.println("出栈元素是：" + item);

        item = stack.peek();
        System.out.println("栈顶元素是：" + item);


    }
}

class ArrayStack {

    private String[] contents;
    private int available;
    private int count;

    public ArrayStack(int available) {
        this.available = available;
        contents = new String[available];
    }

    /**
     * 执行压栈
     */
    public boolean push(String item) {
        if (count == available) {
            return false;
        }

        contents[count++] = item;
        return true;
    }

    /**
     * 执行出栈
     */
    public String pop() {
        if (count == 0) {
            return null;
        }

        return contents[-- count];
    }

    /**
     * 取栈顶元素
     */
    public String peek() {
        if (count == 0) {
            return null;
        }

        return contents[count - 1];
    }


}
