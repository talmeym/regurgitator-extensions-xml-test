package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.ContainsXpathXmlLoader;
import org.dom4j.*;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class ContainsXpathXmlLoaderTest extends XmlBaseTest {
	ContainsXpathXmlLoader toTest = new ContainsXpathXmlLoader();

	@Test
	public void testXml() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectation(getElement("classpath:/ContainsXpath.xml"), "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}

}
