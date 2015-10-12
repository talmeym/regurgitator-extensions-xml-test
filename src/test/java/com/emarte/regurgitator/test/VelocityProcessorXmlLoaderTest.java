package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.*;
import org.dom4j.Element;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class VelocityProcessorXmlLoaderTest extends XmlBaseTest {

	private VelocityProcessorXmlLoader toTest = new VelocityProcessorXmlLoader();

	@Test
	public void testXml_value() throws Exception {
		assertExpectation(getElement("classpath:/VelocityProcessor_value.xml"), "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}

	@Test
	public void testXml_file() throws Exception {
		assertExpectation(getElement("classpath:/VelocityProcessor_file.xml"), "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
