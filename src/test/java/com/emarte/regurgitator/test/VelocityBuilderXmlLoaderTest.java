package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.*;
import org.dom4j.Element;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class VelocityBuilderXmlLoaderTest extends XmlBaseTest {

	private VelocityBuilderXmlLoader toTest = new VelocityBuilderXmlLoader();

	@Test
	public void testXml_source() throws Exception {
		assertExpectation(getElement("classpath:/VelocityBuilder_source.xml"), "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null]]");
	}

	@Test
	public void testXml_value() throws Exception {
		assertExpectation(getElement("classpath:/VelocityBuilder_value.xml"), "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}

	@Test
	public void testXml_value_attr() throws Exception {
		assertExpectation(getElement("classpath:/VelocityBuilder_value_attr.xml"), "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}

	@Test
	public void testXml_file() throws Exception {
		assertExpectation(getElement("classpath:/VelocityBuilder_file.xml"), "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
