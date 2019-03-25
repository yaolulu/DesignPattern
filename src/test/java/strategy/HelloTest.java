package strategy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void test_sum() {
        Hello hello = new Hello();
        Assert.assertEquals(4, hello.sum(1, 3));
    }

}