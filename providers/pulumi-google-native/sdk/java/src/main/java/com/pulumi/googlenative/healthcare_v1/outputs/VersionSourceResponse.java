// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VersionSourceResponse {
    /**
     * @return The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
     * 
     */
    private final String mshField;
    /**
     * @return The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private VersionSourceResponse(
        @CustomType.Parameter("mshField") String mshField,
        @CustomType.Parameter("value") String value) {
        this.mshField = mshField;
        this.value = value;
    }

    /**
     * @return The field to extract from the MSH segment. For example, &#34;3.1&#34; or &#34;18[1].1&#34;.
     * 
     */
    public String mshField() {
        return this.mshField;
    }
    /**
     * @return The value to match with the field. For example, &#34;My Application Name&#34; or &#34;2.3&#34;.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mshField;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mshField = defaults.mshField;
    	      this.value = defaults.value;
        }

        public Builder mshField(String mshField) {
            this.mshField = Objects.requireNonNull(mshField);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public VersionSourceResponse build() {
            return new VersionSourceResponse(mshField, value);
        }
    }
}
