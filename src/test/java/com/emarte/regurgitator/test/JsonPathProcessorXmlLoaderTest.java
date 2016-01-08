package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.JsonPathProcessorXmlLoader;
import org.junit.Test;

public class JsonPathProcessorXmlLoaderTest extends XmlLoaderTest {
	public JsonPathProcessorXmlLoaderTest() {
		super(new JsonPathProcessorXmlLoader());
	}

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation("classpath:/JsonPathProcessor.xml", "com.emarte.regurgitator.extensions.JsonPathProcessor:['something.something']");
	}

	@Test
	public void testFullLoad() throws Exception {
		assertExpectationFullLoad("classpath:/JsonPathProcessor_fullLoad.xml", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.CreateParameter:['create-param-1',com.emarte.regurgitator.core.ParameterPrototype:['toTest1',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['$.something.something']]]]");
	}


}
