package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionsTest {

    Assertions assertionsExample = new Assertions();

    @Test
    public void testAssertEquals() {

        int actualResult = assertionsExample.add(15, 10);

        assertEquals(25, actualResult);
    }

    @Test
    public void testAssertTrue() {

        assertTrue(assertionsExample.isEligibleToVote(20));
    }

    @Test
    public void testAssertFalse() {

        assertFalse(assertionsExample.isEligibleToVote(15));
    }

    @Test
    public void testAssertNull() {

        assertNull(assertionsExample.getNullValue());
    }

    @Test
    public void testAssertNotNull() {

        assertNotNull(assertionsExample.getStudentName());
    }
}
