// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum JobDegreeTypesItem {
        /**
         * Default value. Represents no degree, or early childhood education. Maps to ISCED code 0. Ex) Kindergarten
         * 
         */
        DegreeTypeUnspecified("DEGREE_TYPE_UNSPECIFIED"),
        /**
         * Primary education which is typically the first stage of compulsory education. ISCED code 1. Ex) Elementary school
         * 
         */
        PrimaryEducation("PRIMARY_EDUCATION"),
        /**
         * Lower secondary education; First stage of secondary education building on primary education, typically with a more subject-oriented curriculum. ISCED code 2. Ex) Middle school
         * 
         */
        LowerSecondaryEducation("LOWER_SECONDARY_EDUCATION"),
        /**
         * Middle education; Second/final stage of secondary education preparing for tertiary education and/or providing skills relevant to employment. Usually with an increased range of subject options and streams. ISCED code 3. Ex) High school
         * 
         */
        UpperSecondaryEducation("UPPER_SECONDARY_EDUCATION"),
        /**
         * Adult Remedial Education; Programmes providing learning experiences that build on secondary education and prepare for labour market entry and/or tertiary education. The content is broader than secondary but not as complex as tertiary education. ISCED code 4.
         * 
         */
        AdultRemedialEducation("ADULT_REMEDIAL_EDUCATION"),
        /**
         * Associate's or equivalent; Short first tertiary programmes that are typically practically-based, occupationally-specific and prepare for labour market entry. These programmes may also provide a pathway to other tertiary programmes. ISCED code 5.
         * 
         */
        AssociatesOrEquivalent("ASSOCIATES_OR_EQUIVALENT"),
        /**
         * Bachelor's or equivalent; Programmes designed to provide intermediate academic and/or professional knowledge, skills and competencies leading to a first tertiary degree or equivalent qualification. ISCED code 6.
         * 
         */
        BachelorsOrEquivalent("BACHELORS_OR_EQUIVALENT"),
        /**
         * Master's or equivalent; Programmes designed to provide advanced academic and/or professional knowledge, skills and competencies leading to a second tertiary degree or equivalent qualification. ISCED code 7.
         * 
         */
        MastersOrEquivalent("MASTERS_OR_EQUIVALENT"),
        /**
         * Doctoral or equivalent; Programmes designed primarily to lead to an advanced research qualification, usually concluding with the submission and defense of a substantive dissertation of publishable quality based on original research. ISCED code 8.
         * 
         */
        DoctoralOrEquivalent("DOCTORAL_OR_EQUIVALENT");

        private final String value;

        JobDegreeTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobDegreeTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
