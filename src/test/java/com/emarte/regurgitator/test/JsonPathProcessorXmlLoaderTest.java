package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.JsonPathProcessorXmlLoader;
import org.dom4j.Element;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class JsonPathProcessorXmlLoaderTest extends XmlBaseTest {

	private JsonPathProcessorXmlLoader toTest = new JsonPathProcessorXmlLoader();

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation(getElement("classpath:/JsonPathProcessor.xml"), "com.emarte.regurgitator.extensions.JsonPathProcessor:['something.something']");
	}

	@Test
	public void testFullLoad() throws Exception {
		assertExpectationFullLoad("classpath:/JsonPathProcessor_fullLoad.xml", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['$.something.something']]]]");
	}

	private void assertExpectationFullLoad(String filePath, String expected) throws RegurgitatorException {
		assertEquals(expected, ConfigurationFile.loadFile(filePath).toString());
	}

	private void assertExpectation(Element element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
