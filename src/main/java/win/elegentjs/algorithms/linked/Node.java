package win.elegentjs.algorithms.linked;

/**
 * 链表结点，包含数据属性name和两个指针prev, next。
 */
public class Node {

    public Node prev;

    public Node next;

    public String name;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
