/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.VelocityProcessorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.VelocityProcessor_file;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.VelocityProcessor_value;

public class VelocityProcessorXmlLoaderTest extends XmlLoaderTest {
    public VelocityProcessorXmlLoaderTest() {
        super(new VelocityProcessorXmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_value.xml", VelocityProcessor_value);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_file.xml", VelocityProcessor_file);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/VelocityProcessor_fullLoad.xml");
    }
}
