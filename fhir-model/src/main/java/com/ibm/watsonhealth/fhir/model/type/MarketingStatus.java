/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * The marketing status describes the date when a medicinal product is actually put on the market or the date as of which 
 * it is no longer available.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class MarketingStatus extends BackboneElement {
    private final CodeableConcept country;
    private final CodeableConcept jurisdiction;
    private final CodeableConcept status;
    private final Period dateRange;
    private final DateTime restoreDate;

    private MarketingStatus(Builder builder) {
        super(builder);
        country = ValidationSupport.requireNonNull(builder.country, "country");
        jurisdiction = builder.jurisdiction;
        status = ValidationSupport.requireNonNull(builder.status, "status");
        dateRange = ValidationSupport.requireNonNull(builder.dateRange, "dateRange");
        restoreDate = builder.restoreDate;
    }

    /**
     * <p>
     * The country in which the marketing authorisation has been granted shall be specified It should be specified using the 
     * ISO 3166 ‑ 1 alpha-2 code elements.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getCountry() {
        return country;
    }

    /**
     * <p>
     * Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a 
     * jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term 
     * and the controlled term identifier shall be specified.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getJurisdiction() {
        return jurisdiction;
    }

    /**
     * <p>
     * This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more 
     * information and examples.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getStatus() {
        return status;
    }

    /**
     * <p>
     * The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where 
     * applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date 
     * consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers 
     * to the release of the Medicinal Product into the distribution chain.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Period}.
     */
    public Period getDateRange() {
        return dateRange;
    }

    /**
     * <p>
     * The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where 
     * applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date 
     * consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers 
     * to the release of the Medicinal Product into the distribution chain.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link DateTime}.
     */
    public DateTime getRestoreDate() {
        return restoreDate;
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
                accept(country, "country", visitor);
                accept(jurisdiction, "jurisdiction", visitor);
                accept(status, "status", visitor);
                accept(dateRange, "dateRange", visitor);
                accept(restoreDate, "restoreDate", visitor);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        return new Builder(country, status, dateRange).from(this);
    }

    public Builder toBuilder(CodeableConcept country, CodeableConcept status, Period dateRange) {
        return new Builder(country, status, dateRange).from(this);
    }

    public static Builder builder(CodeableConcept country, CodeableConcept status, Period dateRange) {
        return new Builder(country, status, dateRange);
    }

    public static class Builder extends BackboneElement.Builder {
        // required
        private final CodeableConcept country;
        private final CodeableConcept status;
        private final Period dateRange;

        // optional
        private CodeableConcept jurisdiction;
        private DateTime restoreDate;

        private Builder(CodeableConcept country, CodeableConcept status, Period dateRange) {
            super();
            this.country = country;
            this.status = status;
            this.dateRange = dateRange;
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
         * Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a 
         * jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term 
         * and the controlled term identifier shall be specified.
         * </p>
         * 
         * @param jurisdiction
         *     Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a 
         *     jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term 
         *     and the controlled term identifier shall be specified
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder jurisdiction(CodeableConcept jurisdiction) {
            this.jurisdiction = jurisdiction;
            return this;
        }

        /**
         * <p>
         * The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where 
         * applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date 
         * consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers 
         * to the release of the Medicinal Product into the distribution chain.
         * </p>
         * 
         * @param restoreDate
         *     The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where 
         *     applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date 
         *     consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers 
         *     to the release of the Medicinal Product into the distribution chain
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder restoreDate(DateTime restoreDate) {
            this.restoreDate = restoreDate;
            return this;
        }

        @Override
        public MarketingStatus build() {
            return new MarketingStatus(this);
        }

        private Builder from(MarketingStatus marketingStatus) {
            id = marketingStatus.id;
            extension.addAll(marketingStatus.extension);
            modifierExtension.addAll(marketingStatus.modifierExtension);
            jurisdiction = marketingStatus.jurisdiction;
            restoreDate = marketingStatus.restoreDate;
            return this;
        }
    }
}
