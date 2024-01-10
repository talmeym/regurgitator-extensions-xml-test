/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.ContainsJsonPathBehaviour_fullLoad;

public class ContainsJsonPathBehaviourXmlLoaderTest extends XmlLoaderTest {
    public ContainsJsonPathBehaviourXmlLoaderTest() {
        super(null);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsJsonPathBehaviour_fullLoad.xml", ContainsJsonPathBehaviour_fullLoad);
    }
}
