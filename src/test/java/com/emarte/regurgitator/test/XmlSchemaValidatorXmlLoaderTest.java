package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlSchemaValidatorXmlLoader;
import org.dom4j.Element;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XmlSchemaValidatorXmlLoaderTest extends XmlBaseTest {

	private XmlSchemaValidatorXmlLoader toTest = new XmlSchemaValidatorXmlLoader();

	@Test
	public void testXml() throws Exception {
		assertExpectation(getElement("classpath:/XmlSchemaValidator.xml"), "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']");
	}

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation(getElement("classpath:/XmlSchemaValidator_min.xml"), "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']");
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
