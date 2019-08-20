/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.test;

import java.io.InputStream;

import com.ibm.watsonhealth.fhir.model.format.Format;
import com.ibm.watsonhealth.fhir.model.generator.FHIRGenerator;
import com.ibm.watsonhealth.fhir.model.parser.FHIRParser;
import com.ibm.watsonhealth.fhir.model.resource.Observation;

public class ObservationReadWriteTest {
    public static void main(String[] args) throws Exception {
        try (InputStream in = ObservationReadWriteTest.class.getClassLoader().getResourceAsStream("JSON/observation-example-f001-glucose.json")) {
            Observation observation = FHIRParser.parser(Format.JSON).parse(in);
            FHIRGenerator.generator(Format.JSON, true).generate(observation, System.out);
        }
    }
}
