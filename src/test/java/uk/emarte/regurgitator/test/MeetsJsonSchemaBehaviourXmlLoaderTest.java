/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.MeetsJsonSchemaBehaviour_fullLoad;

public class MeetsJsonSchemaBehaviourXmlLoaderTest extends XmlLoaderTest {
    public MeetsJsonSchemaBehaviourXmlLoaderTest() {
        super(null);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/MeetsJsonSchemaBehaviour_fullLoad.xml", MeetsJsonSchemaBehaviour_fullLoad);
    }
}
