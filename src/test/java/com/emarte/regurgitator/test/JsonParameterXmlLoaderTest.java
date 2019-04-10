/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonParameterXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class JsonParameterXmlLoaderTest extends XmlLoaderTest {
    public JsonParameterXmlLoaderTest() {
        super(new JsonParameterXmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/JsonParameter_min.xml", JsonParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/JsonParameter_max.xml", JsonParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/JsonParameter_maxFlat.xml", JsonParameter_maxFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JsonParameter_min.xml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidXmlMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/JsonParameter_missingProcessorClass.xml");
    }
}
