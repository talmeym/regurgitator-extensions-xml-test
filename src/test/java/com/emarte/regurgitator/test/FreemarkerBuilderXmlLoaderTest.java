package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerBuilderXmlLoader;
import org.dom4j.Element;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class FreemarkerBuilderXmlLoaderTest extends XmlBaseTest {

	private FreemarkerBuilderXmlLoader toTest = new FreemarkerBuilderXmlLoader();

	@Test
	public void testXml_source() throws Exception {
		assertExpectation(getElement("classpath:/FreemarkerBuilder_source.xml"), "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null]]");
	}

	@Test
	public void testXml_value() throws Exception {
		assertExpectation(getElement("classpath:/FreemarkerBuilder_value.xml"), "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}

	@Test
	public void testXml_value_attr() throws Exception {
		assertExpectation(getElement("classpath:/FreemarkerBuilder_valueAttr.xml"), "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}

	@Test
	public void testXml_file() throws Exception {
		assertExpectation(getElement("classpath:/FreemarkerBuilder_file.xml"), "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
