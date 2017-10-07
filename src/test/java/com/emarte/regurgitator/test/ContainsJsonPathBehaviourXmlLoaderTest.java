/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import org.dom4j.DocumentException;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

public class ContainsJsonPathBehaviourXmlLoaderTest extends XmlLoaderTest {
    public ContainsJsonPathBehaviourXmlLoaderTest() {
        super(null);
    }

    @Test
    public void testFullLoad() throws DocumentException, SAXException, IOException, RegurgitatorException {
        assertExpectationFullLoad("classpath:/ContainsJsonPathBehaviour_fullLoad.xml", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'$.something.something',true,com.emarte.regurgitator.extensions.ContainsJsonPathBehaviour:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]");
    }
}
