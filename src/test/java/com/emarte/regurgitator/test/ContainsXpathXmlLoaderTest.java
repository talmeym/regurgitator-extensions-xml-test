/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.ContainsXpathXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class ContainsXpathXmlLoaderTest extends XmlLoaderTest {
    public ContainsXpathXmlLoaderTest() {
        super(new ContainsXpathXmlLoader());
    }

    @Test
    public void testMinXml() throws Exception {
        assertExpectation("classpath:/ContainsXpath_min.xml", "com.emarte.regurgitator.extensions.ContainsXpath:[{}]");
    }

    @Test
    public void testMaxXml() throws Exception {
        assertExpectation("classpath:/ContainsXpath_max.xml", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/ContainsXpath_fullLoad.xml");
    }

    @Test
    public void testFullLoad_entityLookup() throws Exception {
        loadFile("classpath:/ContainsXpath_fullLoad_entityLookup.xml");
    }
}
