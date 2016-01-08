package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XpathProcessorXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XpathProcessorXmlLoaderTest extends XmlLoaderTest {
	public XpathProcessorXmlLoaderTest() {
		super(new XpathProcessorXmlLoader());
	}

	@Test
	public void testXml() throws Exception {
		assertExpectation("classpath:/XpathProcessor.xml", "com.emarte.regurgitator.extensions.XpathProcessor:['something.something',{prefix=uri}]");
	}

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation("classpath:/XpathProcessor_min.xml", "com.emarte.regurgitator.extensions.XpathProcessor:['something.something',{prefix=uri}]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/XpathProcessor_fullLoad.xml");
	}
}
