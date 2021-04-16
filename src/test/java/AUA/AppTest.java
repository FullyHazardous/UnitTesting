package AUA;
import AUA.UnderTest;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testcaseFirst()
    {
       if ( UnderTest.CovidIsAHoax == false ){System.out.println("First testcase succeeded");}
    }

    @Test
    public void testcaseSecond()
    {
        if ( UnderTest.NumOfInfected > 1000000 ) System.out.println("Second testcase succeeded");
    }

    @Test
    public void testcaseThird()
    {
        if ( UnderTest.TheGuilty == "George Soros" ) System.out.println("Third testcase succeeded");
    }

    @Test
    public void otherTestcase()
    {
        if ( UnderTest.MasksWork == false ) System.out.println("Fourth testcase succeeded");
    }
}
