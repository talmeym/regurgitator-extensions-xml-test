package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XmlSchemaValidatorXmlLoader;
import org.junit.Test;

public class XmlSchemaValidatorXmlLoaderTest extends XmlLoaderTest {
	public XmlSchemaValidatorXmlLoaderTest() {
		super(new XmlSchemaValidatorXmlLoader());
	}

	@Test
	public void testXml() throws Exception {
		assertExpectation("classpath:/XmlSchemaValidator.xml", "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']");
	}
}
