package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonParameterXmlLoader;
import org.dom4j.*;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class JsonParameterXmlLoaderTest extends XmlBaseTest {

	private JsonParameterXmlLoader toTest = new JsonParameterXmlLoader();

	@Test
	public void testXml() throws Exception {
		assertExpectation(getElement("classpath:/JsonParameter.xml"), "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],null]");
	}

	@Test(expected = DocumentException.class)
	public void testInvalidXmlEmptyProcessor() throws Exception {
		getElement("classpath:/JsonParameter_emptyProcessor.xml");
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidXmlMissingProcessorClass() throws Exception {
		toTest.load(getElement("classpath:/JsonParameter_missingProcessorClass.xml"), new HashSet<Object>());
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
