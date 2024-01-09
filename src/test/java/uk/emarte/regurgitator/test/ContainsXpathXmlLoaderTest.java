/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.extensions.ContainsXpathXmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class ContainsXpathXmlLoaderTest extends XmlLoaderTest {
    public ContainsXpathXmlLoaderTest() {
        super(new ContainsXpathXmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_min.xml", ContainsXpath_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_max.xml", ContainsXpath_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad.xml", ContainsXpath_fullLoad);
    }

    @Test
    public void testFullLoad_entityLookup() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad_entityLookup.xml", ContainsXpath_fullLoad_entityLookup);
    }
}
