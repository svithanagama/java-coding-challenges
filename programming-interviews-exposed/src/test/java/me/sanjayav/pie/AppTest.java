package me.sanjayav.pie;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void testApp()
    {
        Assertions.assertTrue(true);
    }

    @Test
    public void hamcrestWorks()
    {
        MatcherAssert.assertThat(true, CoreMatchers.is(true));
    }
}
