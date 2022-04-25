// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiagnosticResponse {
    /**
     * @return JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
     * 
     */
    private final String field;
    /**
     * @return Level to record this diagnostic.
     * 
     */
    private final String level;

    @CustomType.Constructor
    private DiagnosticResponse(
        @CustomType.Parameter("field") String field,
        @CustomType.Parameter("level") String level) {
        this.field = field;
        this.level = level;
    }

    /**
     * @return JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return Level to record this diagnostic.
     * 
     */
    public String level() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String field;
        private String level;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.level = defaults.level;
        }

        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder level(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }        public DiagnosticResponse build() {
            return new DiagnosticResponse(field, level);
        }
    }
}
