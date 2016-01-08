package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.VelocityProcessorXmlLoader;
import org.junit.Test;

public class VelocityProcessorXmlLoaderTest extends XmlLoaderTest {
	public VelocityProcessorXmlLoaderTest() {
		super(new VelocityProcessorXmlLoader());
	}

	@Test
	public void testXml_value() throws Exception {
		assertExpectation("classpath:/VelocityProcessor_value.xml", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}

	@Test
	public void testXml_file() throws Exception {
		assertExpectation("classpath:/VelocityProcessor_file.xml", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}
}
