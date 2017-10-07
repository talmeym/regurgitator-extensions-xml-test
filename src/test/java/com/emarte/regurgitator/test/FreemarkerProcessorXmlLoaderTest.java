/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerProcessorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class FreemarkerProcessorXmlLoaderTest extends XmlLoaderTest {
    public FreemarkerProcessorXmlLoaderTest() {
        super(new FreemarkerProcessorXmlLoader());
    }

    @Test
    public void testXml_value() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_value.xml", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
    }

    @Test
    public void testXml_file() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_file.xml", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/FreemarkerProcessor_fullLoad.xml");
    }
}
