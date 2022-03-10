// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudsearch_v1.inputs.DateResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Definition of a single value with generic type.
 * 
 */
public final class ValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValueResponse Empty = new ValueResponse();

    @InputImport(name="booleanValue", required=true)
      private final Boolean booleanValue;

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    @InputImport(name="dateValue", required=true)
      private final DateResponse dateValue;

    public DateResponse getDateValue() {
        return this.dateValue;
    }

    @InputImport(name="doubleValue", required=true)
      private final Double doubleValue;

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    @InputImport(name="integerValue", required=true)
      private final String integerValue;

    public String getIntegerValue() {
        return this.integerValue;
    }

    @InputImport(name="stringValue", required=true)
      private final String stringValue;

    public String getStringValue() {
        return this.stringValue;
    }

    @InputImport(name="timestampValue", required=true)
      private final String timestampValue;

    public String getTimestampValue() {
        return this.timestampValue;
    }

    public ValueResponse(
        Boolean booleanValue,
        DateResponse dateValue,
        Double doubleValue,
        String integerValue,
        String stringValue,
        String timestampValue) {
        this.booleanValue = Objects.requireNonNull(booleanValue, "expected parameter 'booleanValue' to be non-null");
        this.dateValue = Objects.requireNonNull(dateValue, "expected parameter 'dateValue' to be non-null");
        this.doubleValue = Objects.requireNonNull(doubleValue, "expected parameter 'doubleValue' to be non-null");
        this.integerValue = Objects.requireNonNull(integerValue, "expected parameter 'integerValue' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
        this.timestampValue = Objects.requireNonNull(timestampValue, "expected parameter 'timestampValue' to be non-null");
    }

    private ValueResponse() {
        this.booleanValue = null;
        this.dateValue = null;
        this.doubleValue = null;
        this.integerValue = null;
        this.stringValue = null;
        this.timestampValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean booleanValue;
        private DateResponse dateValue;
        private Double doubleValue;
        private String integerValue;
        private String stringValue;
        private String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder booleanValue(Boolean booleanValue) {
            this.booleanValue = Objects.requireNonNull(booleanValue);
            return this;
        }

        public Builder dateValue(DateResponse dateValue) {
            this.dateValue = Objects.requireNonNull(dateValue);
            return this;
        }

        public Builder doubleValue(Double doubleValue) {
            this.doubleValue = Objects.requireNonNull(doubleValue);
            return this;
        }

        public Builder integerValue(String integerValue) {
            this.integerValue = Objects.requireNonNull(integerValue);
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }

        public Builder timestampValue(String timestampValue) {
            this.timestampValue = Objects.requireNonNull(timestampValue);
            return this;
        }
        public ValueResponse build() {
            return new ValueResponse(booleanValue, dateValue, doubleValue, integerValue, stringValue, timestampValue);
        }
    }
}
