/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlParameterXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class XmlParameterXmlLoaderTest extends XmlLoaderTest {
    public XmlParameterXmlLoaderTest() {
        super(new XmlParameterXmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/XmlParameter_min.xml", XmlParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/XmlParameter_max.xml", XmlParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/XmlParameter_maxFlat.xml", XmlParameter_maxFlat);
    }

    @Test
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/XmlParameter_multipleProcessors.xml", XmlParameter_multipleProcessors);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XmlParameter_max.xml");
    }

    @Test(expected = RegurgitatorException.class)
    public void testInvalidXmlMissingProcessorClass() throws Exception {
        loadFromFile("classpath:/XmlParameter_missingProcessorClass.xml");
    }
}
