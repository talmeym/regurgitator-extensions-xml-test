/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XmlSchemaValidatorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XmlSchemaValidator;

public class XmlSchemaValidatorXmlLoaderTest extends XmlLoaderTest {
    public XmlSchemaValidatorXmlLoaderTest() {
        super(new XmlSchemaValidatorXmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/XmlSchemaValidator.xml", XmlSchemaValidator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XmlSchemaValidator_fullLoad.xml");
    }
}
