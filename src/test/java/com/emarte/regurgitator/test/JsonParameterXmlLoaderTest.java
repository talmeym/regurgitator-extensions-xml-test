package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonParameterXmlLoader;
import org.junit.Test;

public class JsonParameterXmlLoaderTest extends XmlLoaderTest {
	public JsonParameterXmlLoaderTest() {
		super(new JsonParameterXmlLoader());
	}

	@Test
	public void testXml() throws Exception {
		assertExpectation("classpath:/JsonParameter.xml", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],null]");
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidXmlMissingProcessorClass() throws Exception {
		loadFromFile("classpath:/JsonParameter_missingProcessorClass.xml");
	}
}
