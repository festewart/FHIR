/*
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.model.path.function;

import static com.ibm.fhir.model.path.FHIRPathIntegerValue.integerValue;
import static com.ibm.fhir.model.path.util.FHIRPathUtil.empty;
import static com.ibm.fhir.model.path.util.FHIRPathUtil.getStringValue;
import static com.ibm.fhir.model.path.util.FHIRPathUtil.hasStringValue;
import static com.ibm.fhir.model.path.util.FHIRPathUtil.singleton;

import java.util.Collection;
import java.util.List;

import com.ibm.fhir.model.path.FHIRPathNode;
import com.ibm.fhir.model.path.evaluator.FHIRPathEvaluator.EvaluationContext;

public class LengthFunction extends FHIRPathAbstractFunction {
    @Override
    public String getName() {
        return "length";
    }

    @Override
    public int getMinArity() {
        return 0;
    }

    @Override
    public int getMaxArity() {
        return 0;
    }

    @Override
    public Collection<FHIRPathNode> apply(EvaluationContext evaluationContext, Collection<FHIRPathNode> context, List<Collection<FHIRPathNode>> arguments) {
        if (!hasStringValue(context)) {
            return empty();
        }
        return singleton(integerValue(getStringValue(context).length()));
    }
}