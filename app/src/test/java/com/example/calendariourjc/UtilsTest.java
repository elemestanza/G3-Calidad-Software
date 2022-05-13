package com.example.calendariourjc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class UtilsTest {

    @Test
    public void checkDescriptionTest(){
       Utils utils = new Utils();
        assertTrue(utils.checkDescription("hola"));
        assertFalse(utils.checkDescription("hol@"));
        assertFalse(utils.checkDescription("hol@ñ"));
        assertFalse(utils.checkDescription("sdfoñff"));
        assertTrue(utils.checkDescription(""));
    }
}
