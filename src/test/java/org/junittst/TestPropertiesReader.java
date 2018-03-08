package org.junittst;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

@Tag("Properties")
public class TestPropertiesReader {
    private String propFile = "config.properties";

    @Test
    @Tag("store")
    public void TestPropertiesStore() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(propFile);
            prop.load(input);
            System.out.println("tergettstframe=" + prop.getProperty("tergettstframe"));

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    @Test
    @Tag("load")
    public void TestPropetiesLoad() {
        Properties prop = new Properties();
        OutputStream output = null;
        InputStream input = null;
        try {
            output = new FileOutputStream(propFile);
            prop.setProperty("propversion", "0.2 (auto)");
            prop.setProperty("targetunit", "junit (auto)");
            prop.setProperty("tergettstframe", "selenium (auto)");
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
