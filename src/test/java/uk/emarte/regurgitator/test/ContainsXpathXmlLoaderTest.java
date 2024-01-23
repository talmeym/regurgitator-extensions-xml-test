/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.ContainsXpathXmlLoader;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class ContainsXpathXmlLoaderTest extends XmlLoaderTest {
    public ContainsXpathXmlLoaderTest() {
        super(new ContainsXpathXmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_min.xml", ContainsXpathBehaviour_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_max.xml", ContainsXpathBehaviour_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad.xml", ContainsXpathBehaviour_fullLoad);
    }

    @Test
    public void testFullLoad_entityLookup() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad_entityLookup.xml", ContainsXpathBehaviour_fullLoad_entityLookup);
    }
}
