package win.elegentjs.algorithms.leetcode;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class TowSumsTest {

    private TowSums towSums = new TowSums();

    @Test
    public void testTwoSum() {
        int[] sums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int target = 10;

        int[] result = towSums.twoSum(sums, target);
        System.out.println(Arrays.toString(result));

        int[] expect = new int[]{5, 3};
        int[] actual = result;

        Assert.assertArrayEquals("验证结果不一致", expect, actual);

    }
}