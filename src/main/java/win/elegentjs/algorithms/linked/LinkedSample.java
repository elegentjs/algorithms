package win.elegentjs.algorithms.linked;

/**
 * 双向链表示例
 */
public class LinkedSample {


    public static void main(String[] args) {
        DoubleLinked linked = new DoubleLinked();

        // 连续新增5个结点，并遍历
        linked.add("a").add("b").add("c").add("d").add("e").print();

        // 删除首个数据结点，并遍历
        linked.del("a").print();

        // 删除尾结点，并遍历
        linked.del("e").print();

        // 删除中间结点，并遍历
        linked.del("c").print();
    }
}

/**
 * 双向链表实现，采用哨兵模式
 */
class DoubleLinked {
    // 头结点，也是哨兵结点，特点：无数据，它的next指向第一个数据结点
    private Node head = new Node(null);

    /**
     * 添加数据结点至链表的最后
     */
    public DoubleLinked add(String data) {
        Node lastNode = findLastNode();
        Node newNode = new Node(data);

        lastNode.next = newNode;
        newNode.prev = lastNode;

        return this;
    }

    /**
     * 查找目标结点，name相同即认为是目标结点
     */
    public Node search(String data) {
        Node current = head;
        while (current != null) {
            if (data.equals(current.name)) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    public DoubleLinked del(String data) {
        Node target = search(data);

        if (target == null) {
            throw new IllegalStateException("删除失败，未能找到匹配的目标结点");
        }

        Node pNode = target.prev;
        Node nextNode = target.next;

        pNode.next = nextNode;

        if (nextNode != null) {
            nextNode.prev = pNode;
        }

        return this;
    }

    public void print() {
        System.out.print("遍历当前链表：");
        Node current = head;
        while (current != null) {
            if (current.name != null) {
                System.out.print("node: " + current.name  + ", ");
            }
            current = current.next;
        }

        System.out.println();
    }

    /**
     * 查找当前链表尾结点，即结点的next是NULL就是尾结点
     */
    private Node findLastNode() {
        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        return lastNode;
    }




}