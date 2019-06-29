/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.type.BackboneElement;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical 
 * substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt 
 * (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are 
 * not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class SubstanceAmount extends BackboneElement {
    private final Element amount;
    private final CodeableConcept amountType;
    private final String amountText;
    private final ReferenceRange referenceRange;

    private SubstanceAmount(Builder builder) {
        super(builder);
        amount = ValidationSupport.choiceElement(builder.amount, "amount", Quantity.class, Range.class, String.class);
        amountType = builder.amountType;
        amountText = builder.amountText;
        referenceRange = builder.referenceRange;
    }

    /**
     * <p>
     * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be 
     * the average. If only a single definite value for a given element is given, it would be captured in this field.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Element}.
     */
    public Element getAmount() {
        return amount;
    }

    /**
     * <p>
     * Most elements that require a quantitative value will also have a field called amount type. Amount type should always 
     * be specified because the actual value of the amount is often dependent on it. EXAMPLE: In capturing the actual 
     * relative amounts of substances or molecular fragments it is essential to indicate whether the amount refers to a mole 
     * ratio or weight ratio. For any given element an effort should be made to use same the amount type for all related 
     * definitional elements.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getAmountType() {
        return amountType;
    }

    /**
     * <p>
     * A textual comment on a numeric value.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getAmountText() {
        return amountText;
    }

    /**
     * <p>
     * Reference range of possible or expected values.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link ReferenceRange}.
     */
    public ReferenceRange getReferenceRange() {
        return referenceRange;
    }

    @Override
    public void accept(java.lang.String elementName, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, this);
            if (visitor.visit(elementName, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(extension, "extension", visitor, Extension.class);
                accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                accept(amount, "amount", visitor, true);
                accept(amountType, "amountType", visitor);
                accept(amountText, "amountText", visitor);
                accept(referenceRange, "referenceRange", visitor);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        return new Builder().from(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BackboneElement.Builder {
        // optional
        private Element amount;
        private CodeableConcept amountType;
        private String amountText;
        private ReferenceRange referenceRange;

        private Builder() {
            super();
        }

        /**
         * <p>
         * Unique id for the element within a resource (for internal references). This may be any string value that does not 
         * contain spaces.
         * </p>
         * 
         * @param id
         *     Unique id for inter-element referencing
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the element. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the element. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the element and that 
         * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
         * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
         * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
         * extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored even if unrecognized
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Extension... modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the element and that 
         * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
         * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
         * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
         * extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored even if unrecognized
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Collection<Extension> modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be 
         * the average. If only a single definite value for a given element is given, it would be captured in this field.
         * </p>
         * 
         * @param amount
         *     Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be 
         *     the average. If only a single definite value for a given element is given, it would be captured in this field
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder amount(Element amount) {
            this.amount = amount;
            return this;
        }

        /**
         * <p>
         * Most elements that require a quantitative value will also have a field called amount type. Amount type should always 
         * be specified because the actual value of the amount is often dependent on it. EXAMPLE: In capturing the actual 
         * relative amounts of substances or molecular fragments it is essential to indicate whether the amount refers to a mole 
         * ratio or weight ratio. For any given element an effort should be made to use same the amount type for all related 
         * definitional elements.
         * </p>
         * 
         * @param amountType
         *     Most elements that require a quantitative value will also have a field called amount type. Amount type should always 
         *     be specified because the actual value of the amount is often dependent on it. EXAMPLE: In capturing the actual 
         *     relative amounts of substances or molecular fragments it is essential to indicate whether the amount refers to a mole 
         *     ratio or weight ratio. For any given element an effort should be made to use same the amount type for all related 
         *     definitional elements
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder amountType(CodeableConcept amountType) {
            this.amountType = amountType;
            return this;
        }

        /**
         * <p>
         * A textual comment on a numeric value.
         * </p>
         * 
         * @param amountText
         *     A textual comment on a numeric value
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder amountText(String amountText) {
            this.amountText = amountText;
            return this;
        }

        /**
         * <p>
         * Reference range of possible or expected values.
         * </p>
         * 
         * @param referenceRange
         *     Reference range of possible or expected values
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder referenceRange(ReferenceRange referenceRange) {
            this.referenceRange = referenceRange;
            return this;
        }

        @Override
        public SubstanceAmount build() {
            return new SubstanceAmount(this);
        }

        private Builder from(SubstanceAmount substanceAmount) {
            id = substanceAmount.id;
            extension.addAll(substanceAmount.extension);
            modifierExtension.addAll(substanceAmount.modifierExtension);
            amount = substanceAmount.amount;
            amountType = substanceAmount.amountType;
            amountText = substanceAmount.amountText;
            referenceRange = substanceAmount.referenceRange;
            return this;
        }
    }

    /**
     * <p>
     * Reference range of possible or expected values.
     * </p>
     */
    public static class ReferenceRange extends BackboneElement {
        private final Quantity lowLimit;
        private final Quantity highLimit;

        private ReferenceRange(Builder builder) {
            super(builder);
            lowLimit = builder.lowLimit;
            highLimit = builder.highLimit;
        }

        /**
         * <p>
         * Lower limit possible or expected.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Quantity}.
         */
        public Quantity getLowLimit() {
            return lowLimit;
        }

        /**
         * <p>
         * Upper limit possible or expected.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Quantity}.
         */
        public Quantity getHighLimit() {
            return highLimit;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(lowLimit, "lowLimit", visitor);
                    accept(highLimit, "highLimit", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return new Builder().from(this);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder extends BackboneElement.Builder {
            // optional
            private Quantity lowLimit;
            private Quantity highLimit;

            private Builder() {
                super();
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions 
             * SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of 
             * modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions 
             * SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of 
             * modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * Lower limit possible or expected.
             * </p>
             * 
             * @param lowLimit
             *     Lower limit possible or expected
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder lowLimit(Quantity lowLimit) {
                this.lowLimit = lowLimit;
                return this;
            }

            /**
             * <p>
             * Upper limit possible or expected.
             * </p>
             * 
             * @param highLimit
             *     Upper limit possible or expected
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder highLimit(Quantity highLimit) {
                this.highLimit = highLimit;
                return this;
            }

            @Override
            public ReferenceRange build() {
                return new ReferenceRange(this);
            }

            private Builder from(ReferenceRange referenceRange) {
                id = referenceRange.id;
                extension.addAll(referenceRange.extension);
                modifierExtension.addAll(referenceRange.modifierExtension);
                lowLimit = referenceRange.lowLimit;
                highLimit = referenceRange.highLimit;
                return this;
            }
        }
    }
}
