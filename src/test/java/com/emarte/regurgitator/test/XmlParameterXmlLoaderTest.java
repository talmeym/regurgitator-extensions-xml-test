package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlParameterXmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XmlParameterXmlLoaderTest extends XmlLoaderTest {
	public XmlParameterXmlLoaderTest() {
		super(new XmlParameterXmlLoader());
	}

	@Test
	public void testXml() throws Exception {
		assertExpectation("classpath:/XmlParameter.xml", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],null]");
	}

	@Test
	public void testProcessorXml() throws Exception {
		assertExpectation("classpath:/XmlParameter_processor.xml", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation("classpath:/XmlParameter_min.xml", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],null]");
	}

	@Test
	public void testMinimumProcessorXml() throws Exception {
		assertExpectation("classpath:/XmlParameter_minProcessor.xml", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test(expected = RegurgitatorException.class)
	public void testInvalidXmlMissingProcessorClass() throws Exception {
		loadFromFile("classpath:/XmlParameter_missingProcessorClass.xml");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/XmlParameter.xml");
	}
}
