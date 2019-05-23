/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.JsonPrintProcessorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPrintProcessor;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPrintProcessor_fullLoad;

public class JsonPrintProcessorXmlLoaderTest extends XmlLoaderTest {
    public JsonPrintProcessorXmlLoaderTest() {
        super(new JsonPrintProcessorXmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JsonPrintProcessor.xml", JsonPrintProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/JsonPrintProcessor_fullLoad.xml", JsonPrintProcessor_fullLoad);
    }
}
