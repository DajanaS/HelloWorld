package com.finki.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    void getTextTest() {
        assertEquals(Application.getText(), "Hello world");
    }
}
