package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.XpathProcessorXmlLoader;
import org.dom4j.Element;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XpathProcessorXmlLoaderTest extends XmlBaseTest {

	private XpathProcessorXmlLoader toTest = new XpathProcessorXmlLoader();

	@Test
	public void testXml() throws Exception {
		assertExpectation(getElement("classpath:/XpathProcessor.xml"), "com.emarte.regurgitator.extensions.XpathProcessor:['something.something',{prefix=uri}]");
	}

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation(getElement("classpath:/XpathProcessor_min.xml"), "com.emarte.regurgitator.extensions.XpathProcessor:['something.something',{prefix=uri}]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		ConfigurationFile.loadFile("classpath:/XpathProcessor_fullLoad.xml");
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
