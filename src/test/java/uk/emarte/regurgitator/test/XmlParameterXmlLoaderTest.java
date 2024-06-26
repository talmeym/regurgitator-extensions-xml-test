/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.core.RegurgitatorException;
import uk.emarte.regurgitator.extensions.XmlParameterXmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class XmlParameterXmlLoaderTest extends XmlLoaderTest {
    public XmlParameterXmlLoaderTest() {
        super(new XmlParameterXmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/XmlParameter_min.xml", XmlParameter_min);
    }

    @Test
    public void testMinimumOptional() throws Exception {
        assertExpectation("classpath:/XmlParameter_min_optional.xml", XmlParameter_min_optional);
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
    public void testMultipleProcessorsFlat() throws Exception {
        assertExpectation("classpath:/XmlParameter_multipleProcessorsFlat.xml", XmlParameter_multipleProcessorsFlat);
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
