package com.chapter04.test02;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTester2 extends TestCase {

    private FileReader input;
    private FileReader empty;

    public FileReaderTester2(String name) {
        super(name);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(FileReaderTester2.class));
    }

    //테스트 픽스처(test Fixture) : 테스트의 샘플 역할을 하는 객체
    //픽스처 객체 생성
    protected void setUp() {
        try {
            input = new FileReader("data.txt");
            empty = newEmptyFile();

        } catch (IOException e) {
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
        for (int i = 0; i < 4; i++) {
            ch = (char) input.read();
        }
        assertEquals('d', ch);
    }

    private FileReader newEmptyFile() throws IOException {
        File empty = new File("empty.txt");
        FileOutputStream out = new FileOutputStream(empty);
        out.close();
        return new FileReader(empty);
    }

    public void testReadAtEnd() throws IOException {
        int ch = -1234;
        for (int i = 0; i < 141; i++) {
            ch = input.read();
        }
        assertEquals("read at end", -1, input.read());
    }

    public void testReadBoundaries() throws IOException {
        assertEquals("read first char", 'B', input.read());
        int ch;
        for (int i = 0; i < 135; i++) {
            ch = input.read();
        }
        assertEquals("read last char", '6', input.read());
        assertEquals("read at end", -1, input.read());
        assertEquals("read past end", -1, input.read());
    }

    public void testEmptyRead() throws IOException {
        assertEquals(-1, empty.read());
    }

    public void testReadAfterClose() throws IOException {
        input.close();
        try {
            input.read();
            fail("read past end에 예외가 발생하지 않음");
        } catch (IOException io) {
        }
    }
}