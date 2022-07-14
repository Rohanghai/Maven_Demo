package com.lti.entity;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

//Additional support while executing
//a failed assumptions results in test being terminated

class AssumptionsTest {

	 @Test
	    void testOnDev()
	    {
	        System.setProperty("ENV", "DEV");
	        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")),AssumptionsTest::message);
	        System.out.println(" continue execution");
	    }

	    @Test
	    void testOnProd()
	    {
	        System.setProperty("ENV", "PROD");
	        Assumptions.assumeFalse("PROD".equals(System.getProperty("ENV")),AssumptionsTest::message);
	        System.out.println(" don't continue execution");
	    }

	    private static String message() {
	        return "TEST Execution Failed :: ";
	    }
}
