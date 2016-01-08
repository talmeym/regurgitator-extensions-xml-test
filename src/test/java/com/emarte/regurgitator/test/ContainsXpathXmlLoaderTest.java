package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.ContainsXpathXmlLoader;
import org.dom4j.DocumentException;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

public class ContainsXpathXmlLoaderTest extends XmlLoaderTest {
	public ContainsXpathXmlLoaderTest() {
		super(new ContainsXpathXmlLoader());
	}

	@Test
	public void testXml() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectation("classpath:/ContainsXpath.xml", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
	}
}
