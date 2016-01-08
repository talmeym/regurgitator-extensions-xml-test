package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.FreemarkerProcessorXmlLoader;
import org.junit.Test;

public class FreemarkerProcessorXmlLoaderTest extends XmlLoaderTest {
	public FreemarkerProcessorXmlLoaderTest() {
		super(new FreemarkerProcessorXmlLoader());
	}

	@Test
	public void testXml_value() throws Exception {
		assertExpectation("classpath:/FreemarkerProcessor_value.xml", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
	}

	@Test
	public void testXml_file() throws Exception {
		assertExpectation("classpath:/FreemarkerProcessor_file.xml", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
	}
}
