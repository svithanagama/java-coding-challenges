package me.sanjayav.general;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

class FirstNonRepeatingWordTest
{
    private FirstNonRepeatingWord instance;

    @BeforeEach
    public void setUp()
    {
        instance = new FirstNonRepeatingWord();
    }

    @Test
    public void nullInput() throws Exception
    {
        instance.firstNonRepeatingWord(getFileContent("input.txt"));
    }

    private String getFileContent(String fileName) throws IOException
    {
        return IOUtils.resourceToString(fileName, StandardCharsets.UTF_8, this.getClass().getClassLoader());
    }
}
