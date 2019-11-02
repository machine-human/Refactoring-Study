package com.chapter04.test02;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MasterTester extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        TestSuite result = new TestSuite();
        result.addTest(new TestSuite(FileReaderTester2.class));
//    result.addTest(new TestSuite(FileWriterTester.class));
        return result;
    }
}
