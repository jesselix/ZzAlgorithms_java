package li.jesse.question.leetcode;

import org.junit.Test;

public class RemoveElementTest
{
    @Test
    public void testRemoveElement()
    {
        int[] array = {1, 1, 2, 3, 4, 1, 5};

        System.out.println(RemoveElement.removeElement(array, 1));
    }
}
