/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.VelocityProcessorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class VelocityProcessorXmlLoaderTest extends XmlLoaderTest {
    public VelocityProcessorXmlLoaderTest() {
        super(new VelocityProcessorXmlLoader());
    }

    @Test
    public void testXml_value() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_value.xml", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
    }

    @Test
    public void testXml_file() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_file.xml", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/VelocityProcessor_fullLoad.xml");
    }
}
