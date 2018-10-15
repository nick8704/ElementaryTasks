package com.anikonets.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileParserTest {

    @Test
    void shouldLineCounting1() {
        int expected = 3;
        int actual = FileParser.lineCounting("test.txt", "LINE");
        assertEquals(expected, actual);
    }

    @Test
    void shouldLineCounting2() {
        int expected = 0;
        int actual = FileParser.lineCounting("test.txt", "Perfect");
        assertEquals(expected, actual);
    }

    @Test
    void shouldLineReplacement() {
        boolean expected = true;
        boolean actual = FileParser.lineReplacement("test.txt", "OLD", "NEW");
        assertEquals(expected, actual);
    }

}