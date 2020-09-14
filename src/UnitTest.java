import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void testStringReversalWithOddStringLength(){
        String input1 = "jpmorgan";
        int position1 = 3;
        String exepectdOutput = "namrogpj";
        String actualOutput = StringReversal.reverse(input1,position1);
        Assert.assertEquals(exepectdOutput, actualOutput);
    }

    @Test
    public void testStringReversalWithEvenStringLength(){
        String input1 = "jpmorganchase";
        int position1 = 4;
        String exepectdOutput = "eahocagnrmpsj";
        String actualOutput = StringReversal.reverse(input1,position1);
        Assert.assertEquals(exepectdOutput, actualOutput);
    }
}
