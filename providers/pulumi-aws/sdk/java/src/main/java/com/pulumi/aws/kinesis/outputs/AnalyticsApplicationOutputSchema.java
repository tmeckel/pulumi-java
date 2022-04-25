// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationOutputSchema {
    /**
     * @return The Format Type of the records on the output stream. Can be `CSV` or `JSON`.
     * 
     */
    private final String recordFormatType;

    @CustomType.Constructor
    private AnalyticsApplicationOutputSchema(@CustomType.Parameter("recordFormatType") String recordFormatType) {
        this.recordFormatType = recordFormatType;
    }

    /**
     * @return The Format Type of the records on the output stream. Can be `CSV` or `JSON`.
     * 
     */
    public String recordFormatType() {
        return this.recordFormatType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder recordFormatType(String recordFormatType) {
            this.recordFormatType = Objects.requireNonNull(recordFormatType);
            return this;
        }        public AnalyticsApplicationOutputSchema build() {
            return new AnalyticsApplicationOutputSchema(recordFormatType);
        }
    }
}
