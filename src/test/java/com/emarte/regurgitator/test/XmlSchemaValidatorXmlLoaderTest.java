/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlSchemaValidatorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XmlSchemaValidatorXmlLoaderTest extends XmlLoaderTest {
    public XmlSchemaValidatorXmlLoaderTest() {
        super(new XmlSchemaValidatorXmlLoader());
    }

    @Test
    public void testXml() throws Exception {
        assertExpectation("classpath:/XmlSchemaValidator.xml", "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/XmlSchemaValidator_fullLoad.xml");
    }
}
