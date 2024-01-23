/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.JsonSchemaValidatorXmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonSchemaValidator;

public class JsonSchemaValidatorXmlLoaderTest extends XmlLoaderTest {
    public JsonSchemaValidatorXmlLoaderTest() {
        super(new JsonSchemaValidatorXmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/JsonSchemaValidator.xml", JsonSchemaValidator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JsonSchemaValidator_fullLoad.xml");
    }
}
