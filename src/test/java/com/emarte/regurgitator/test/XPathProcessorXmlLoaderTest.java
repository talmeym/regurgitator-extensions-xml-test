package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XPathProcessorXmlLoader;
import org.dom4j.Element;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XPathProcessorXmlLoaderTest extends XmlBaseTest {

	private XPathProcessorXmlLoader toTest = new XPathProcessorXmlLoader();

	@Test
	public void testXml() throws Exception {
		assertExpectation(getElement("classpath:/XPathProcessor.xml"), "com.emarte.regurgitator.extensions.XPathProcessor:['something.something',{prefix=uri}]");
	}

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation(getElement("classpath:/XPathProcessor_min.xml"), "com.emarte.regurgitator.extensions.XPathProcessor:['something.something',{prefix=uri}]");
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
