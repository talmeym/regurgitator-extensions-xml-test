package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlParameterXmlLoader;
import org.dom4j.*;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XmlParameterXmlLoaderTest extends XmlBaseTest {

	private XmlParameterXmlLoader toTest = new XmlParameterXmlLoader();

	@Test
	public void testXml() throws Exception {
		assertExpectation(getElement("classpath:/XmlParameter.xml"), "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XPathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],null]");
	}

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation(getElement("classpath:/XmlParameter_min.xml"), "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XPathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],null]");
	}

	@Test(expected = DocumentException.class)
	public void testInvalidXmlEmptyProcessor() throws Exception {
		getElement("classpath:/XmlParameter_emptyProcessor.xml");
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidXmlMissingProcessorClass() throws Exception {
		toTest.load(getElement("classpath:/XmlParameter_missingProcessorClass.xml"), new HashSet<Object>());
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
