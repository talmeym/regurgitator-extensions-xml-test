/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.extensions.FreemarkerBuilderXmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class FreemarkerBuilderXmlLoaderTest extends XmlLoaderTest {
    public FreemarkerBuilderXmlLoaderTest() {
        super(new FreemarkerBuilderXmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_value.xml", FreemarkerBuilder_value);
    }

    @Test
    public void testValueFlat() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_valueFlat.xml", FreemarkerBuilder_valueFlat);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_file.xml", FreemarkerBuilder_file);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_source.xml", FreemarkerBuilder_source);
    }

    @Test
    public void testAllContexts() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_allContexts.xml", FreemarkerBuilder_allContexts);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/FreemarkerBuilder_fullLoad.xml");
    }
}
