/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerBuilderXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class FreemarkerBuilderXmlLoaderTest extends XmlLoaderTest {
    public FreemarkerBuilderXmlLoaderTest() {
        super(new FreemarkerBuilderXmlLoader());
    }

    @Test
    public void testXml_source() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_source.xml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
    }

    @Test
    public void testXml_value() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_value.xml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'<something>${something}</something>'],false]");
    }

    @Test
    public void testXml_allContexts() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_allContexts.xml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],true]");
    }

    @Test
    public void testXml_value_attr() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_valueAttr.xml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'<something>${something}</something>'],false]");
    }

    @Test
    public void testXml_file() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_file.xml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/FreemarkerBuilder_fullLoad.xml");
    }
}
