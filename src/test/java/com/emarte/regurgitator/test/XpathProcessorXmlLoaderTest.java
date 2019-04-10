/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XpathProcessorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XpathProcessor_max;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XpathProcessor_min;

public class XpathProcessorXmlLoaderTest extends XmlLoaderTest {
    public XpathProcessorXmlLoaderTest() {
        super(new XpathProcessorXmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/XpathProcessor_min.xml", XpathProcessor_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/XpathProcessor_max.xml", XpathProcessor_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XpathProcessor_fullLoad.xml");
    }
}
