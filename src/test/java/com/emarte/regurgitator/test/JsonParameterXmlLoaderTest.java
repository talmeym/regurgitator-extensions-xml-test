/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonParameterXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class JsonParameterXmlLoaderTest extends XmlLoaderTest {
    public JsonParameterXmlLoaderTest() {
        super(new JsonParameterXmlLoader());
    }

    @Test
    public void testXml() throws Exception {
        assertExpectation("classpath:/JsonParameter.xml", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],null]");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidXmlMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/JsonParameter_missingProcessorClass.xml");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/JsonParameter.xml");
    }
}
