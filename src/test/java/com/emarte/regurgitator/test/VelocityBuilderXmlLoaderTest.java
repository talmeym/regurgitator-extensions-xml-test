package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.VelocityBuilderXmlLoader;
import org.junit.Test;

public class VelocityBuilderXmlLoaderTest extends XmlLoaderTest {
	public VelocityBuilderXmlLoaderTest() {
		super(new VelocityBuilderXmlLoader());
	}

	@Test
	public void testXml_source() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_source.xml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
	}

	@Test
	public void testXml_value() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_value.xml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
	}

	@Test
	public void testXml_allContexts() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_allContexts.xml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],true]");
	}

	@Test
	public void testXml_value_attr() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_valueAttr.xml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
	}

	@Test
	public void testXml_file() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_file.xml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
	}
}
