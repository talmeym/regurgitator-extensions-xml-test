package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.ContainsXpathXmlLoader;
import org.dom4j.DocumentException;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class ContainsXpathXmlLoaderTest extends XmlLoaderTest {
	public ContainsXpathXmlLoaderTest() {
		super(new ContainsXpathXmlLoader());
	}

	@Test
	public void testMinXml() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectation("classpath:/ContainsXpath_min.xml", "com.emarte.regurgitator.extensions.ContainsXpath:[{}]");
	}

	@Test
	public void testMaxXml() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectation("classpath:/ContainsXpath_max.xml", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
	}

	@Test
	public void testFullLoad() throws DocumentException, SAXException, IOException, RegurgitatorException {
		loadFile("classpath:/ContainsXpath_fullLoad.xml");
	}
}
