/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.JsonPathProcessorXmlLoader;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor_fullLoad;

public class JsonPathProcessorXmlLoaderTest extends XmlLoaderTest {
    public JsonPathProcessorXmlLoaderTest() {
        super(new JsonPathProcessorXmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JsonPathProcessor.xml", JsonPathProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/JsonPathProcessor_fullLoad.xml", JsonPathProcessor_fullLoad);
    }
}
