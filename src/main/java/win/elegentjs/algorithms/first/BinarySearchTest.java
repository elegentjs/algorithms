package win.elegentjs.algorithms.first;

/**
 * 第一个算法（二分查找法）
 * 需要满足的前提条件：数组有序
 */
public class BinarySearchTest {

    /**
     * 二分查找法
     * 从有序列表中查找跟目标元素一致的下标，如果查不到返回-1
     * @param list 集合
     * @param target 目标元素
     * @return 匹配元素的下标
     */
    public int binarySearch(int[] list, int target) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target < list[middle]) {
                high = middle - 1;
            } else if (target > list[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] list = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int index = new BinarySearchTest().binarySearch(list, 11);

        System.out.println("find 11 in list, index: " + index);
    }
}
