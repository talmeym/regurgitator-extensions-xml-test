package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import org.dom4j.DocumentException;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class ContainsJsonPathXmlLoaderTest extends XmlLoaderTest {
	public ContainsJsonPathXmlLoaderTest() {
		super(null);
	}

	@Test
	public void testFullLoad() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectationFullLoad("classpath:/ContainsJsonPath_fullLoad.xml", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'$.something.something',true,com.emarte.regurgitator.extensions.ContainsJsonPath:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]]]");
	}
}
