/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.XmlSchemaValidatorXmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XmlSchemaValidator;

public class XmlSchemaValidatorXmlLoaderTest extends XmlLoaderTest {
    public XmlSchemaValidatorXmlLoaderTest() {
        super(new XmlSchemaValidatorXmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/XmlSchemaValidator.xml", XmlSchemaValidator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XmlSchemaValidator_fullLoad.xml");
    }
}
