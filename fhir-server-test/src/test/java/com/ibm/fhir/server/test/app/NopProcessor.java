/*
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.server.test.app;

import com.ibm.fhir.model.resource.Resource;
import com.ibm.fhir.model.spec.test.IExampleProcessor;

/**
 * An implementation of IExampleProcessor which does nothing. On purpose.
 */
public class NopProcessor implements IExampleProcessor {

    /* (non-Javadoc)
     * @see com.ibm.watson.health.fhir.model.spec.test.IExampleProcessor#process(java.lang.String, com.ibm.watson.health.fhir.model.resource.Resource)
     */
    @Override
    public void process(String jsonFile, Resource resource) throws Exception {
        // NOP
    }

}
