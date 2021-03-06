/*
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.registry.spec.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ibm.fhir.registry.spec.SpecResourceProvider;
import com.ibm.fhir.registry.spi.FHIRRegistryResourceProvider;

public class SpecResourceProviderTest {
    @Test
    public void testSpecResourceProvider() {
        FHIRRegistryResourceProvider provider = new SpecResourceProvider();
        Assert.assertEquals(provider.getResources().size(), 3370);
    }
}