package org.metaborg.spt.testrunner.eclipse.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Container for multiple {@link TestSuiteRun}s.
 */
public class MultiTestSuiteRun {

    public final List<TestSuiteRun> suites = new ArrayList<>();

    private int numFailed = 0;

    /**
     * The number of test cases that failed.
     * 
     * Accumulated over all our test suites.
     */
    public int numFailed() {
        return numFailed;
    }

    /**
     * Our children should notify whenever they have a failing test case run
     */
    protected void fail() {
        numFailed++;
    }

    /**
     * The number of test cases of all our children combined.
     */
    public int numTests() {
        int i = 0;
        for(TestSuiteRun suites : suites) {
            i += suites.tests.size();
        }
        return i;
    }

}
