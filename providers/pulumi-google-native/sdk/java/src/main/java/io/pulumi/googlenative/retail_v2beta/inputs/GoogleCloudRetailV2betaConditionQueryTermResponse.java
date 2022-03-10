// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Query terms that we want to match on.
 * 
 */
public final class GoogleCloudRetailV2betaConditionQueryTermResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaConditionQueryTermResponse Empty = new GoogleCloudRetailV2betaConditionQueryTermResponse();

    /**
     * Whether this is supposed to be a full or partial match.
     * 
     */
    @InputImport(name="fullMatch", required=true)
      private final Boolean fullMatch;

    public Boolean getFullMatch() {
        return this.fullMatch;
    }

    /**
     * The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) "a b c" is 3 terms and allowed, " a b c d" is 4 terms and not allowed for partial match.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public GoogleCloudRetailV2betaConditionQueryTermResponse(
        Boolean fullMatch,
        String value) {
        this.fullMatch = Objects.requireNonNull(fullMatch, "expected parameter 'fullMatch' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudRetailV2betaConditionQueryTermResponse() {
        this.fullMatch = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaConditionQueryTermResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean fullMatch;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaConditionQueryTermResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullMatch = defaults.fullMatch;
    	      this.value = defaults.value;
        }

        public Builder fullMatch(Boolean fullMatch) {
            this.fullMatch = Objects.requireNonNull(fullMatch);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleCloudRetailV2betaConditionQueryTermResponse build() {
            return new GoogleCloudRetailV2betaConditionQueryTermResponse(fullMatch, value);
        }
    }
}
