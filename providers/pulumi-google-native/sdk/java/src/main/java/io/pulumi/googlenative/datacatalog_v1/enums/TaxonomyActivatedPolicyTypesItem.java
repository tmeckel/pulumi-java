// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum TaxonomyActivatedPolicyTypesItem {
        /**
         * Unspecified policy type.
         * 
         */
        PolicyTypeUnspecified("POLICY_TYPE_UNSPECIFIED"),
        /**
         * Fine-grained access control policy that enables access control on tagged sub-resources.
         * 
         */
        FineGrainedAccessControl("FINE_GRAINED_ACCESS_CONTROL");

        private final String value;

        TaxonomyActivatedPolicyTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TaxonomyActivatedPolicyTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
