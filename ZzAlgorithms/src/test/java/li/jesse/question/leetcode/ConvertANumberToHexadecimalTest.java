package li.jesse.question.leetcode;

import org.junit.Test;

public class ConvertANumberToHexadecimalTest
{
    @Test
    public void testConvertANumberToHexadecimal()
    {
        System.out.println(ConvertANumberToHexadecimal.toHex(17));
        System.out.println(ConvertANumberToHexadecimal.toHex(26));
        System.out.println(ConvertANumberToHexadecimal.toHex(-1));
        System.out.println(ConvertANumberToHexadecimal.toHex(-2));
    }
}
