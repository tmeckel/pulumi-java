// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BusinessIdentityResponse {
    /**
     * @return The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     * 
     */
    private final String qualifier;
    /**
     * @return The user defined business identity value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private BusinessIdentityResponse(
        @CustomType.Parameter("qualifier") String qualifier,
        @CustomType.Parameter("value") String value) {
        this.qualifier = qualifier;
        this.value = value;
    }

    /**
     * @return The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     * 
     */
    public String qualifier() {
        return this.qualifier;
    }
    /**
     * @return The user defined business identity value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String qualifier;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BusinessIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.qualifier = defaults.qualifier;
    	      this.value = defaults.value;
        }

        public Builder qualifier(String qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public BusinessIdentityResponse build() {
            return new BusinessIdentityResponse(qualifier, value);
        }
    }
}
