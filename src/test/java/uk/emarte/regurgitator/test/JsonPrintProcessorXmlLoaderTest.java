/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.JsonPrintProcessorXmlLoader;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPrintProcessor;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPrintProcessor_fullLoad;

public class JsonPrintProcessorXmlLoaderTest extends XmlLoaderTest {
    public JsonPrintProcessorXmlLoaderTest() {
        super(new JsonPrintProcessorXmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/JsonPrintProcessor.xml", JsonPrintProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/JsonPrintProcessor_fullLoad.xml", JsonPrintProcessor_fullLoad);
    }
}
