package com.chapter04.test01;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTester1 extends TestCase {
    FileReader input;

    public FileReaderTester1(String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new FileReaderTester1("testRead"));
        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    //테스트 픽스처(test Fixture) : 테스트의 샘플 역할을 하는 객체
    //픽스처 객체 생성
    protected void setUp() {
        try {
            input = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("테스트 파일을 열 수 없음");
        }
    }

    //픽스처 객체 제거
    protected void tearDown() {
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException("테스트 파일을 닫는 중 에러 발생");
        }
    }

    public void testRead() throws IOException {
        char ch = '&';
        input.close();
        for (int i = 0; i < 4; i++)
            ch = (char) input.read();
        assertEquals ('m', ch);
    }
}


