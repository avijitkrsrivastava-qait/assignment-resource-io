package com.qainfotech.tap.training.resourceio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Ramandeep RamandeepSingh AT QAInfoTech.com
 */
public class PropertiesOptionsIO {

    public String getOptionValue(String optionKey) throws IOException {

        FileReader fileReaderObject = new FileReader(new File("C:\\Users\\avijitkumar\\Documents\\NetBeansProjects\\assignment-resource-io-master\\src\\main\\resources\\options.properties"));

        Properties p = new Properties();
        p.load(fileReaderObject);

        String s = p.getProperty(optionKey);
        return s;

    }

    public void addOption(String optionKey, Object optionValue) throws IOException {
        FileWriter fileWriterObject = new FileWriter(new File("C:\\Users\\avijitkumar\\Documents\\NetBeansProjects\\assignment-resource-io-master\\src\\main\\resources\\options.properties"), true);
        Properties p = new Properties();
        String s = optionValue.toString();
        p.setProperty(optionKey, s);
        p.store(fileWriterObject, null);
        fileWriterObject.close();

    }
}
