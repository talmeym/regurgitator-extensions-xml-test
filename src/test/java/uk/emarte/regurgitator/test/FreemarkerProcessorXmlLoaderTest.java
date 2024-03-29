/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.FreemarkerProcessorXmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class FreemarkerProcessorXmlLoaderTest extends XmlLoaderTest {
    public FreemarkerProcessorXmlLoaderTest() {
        super(new FreemarkerProcessorXmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_value.xml", FreemarkerProcessor_value);
    }

    @Test
    public void testValueFlat() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_valueFlat.xml", FreemarkerProcessor_valueFlat);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_file.xml", FreemarkerProcessor_file);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/FreemarkerProcessor_fullLoad.xml");
    }
}
