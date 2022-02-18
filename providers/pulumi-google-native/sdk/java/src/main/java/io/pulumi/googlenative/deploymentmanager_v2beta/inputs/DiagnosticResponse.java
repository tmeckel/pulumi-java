// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DiagnosticResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiagnosticResponse Empty = new DiagnosticResponse();

    /**
     * JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
     * 
     */
    @InputImport(name="field", required=true)
    private final String field;

    public String getField() {
        return this.field;
    }

    /**
     * Level to record this diagnostic.
     * 
     */
    @InputImport(name="level", required=true)
    private final String level;

    public String getLevel() {
        return this.level;
    }

    public DiagnosticResponse(
        String field,
        String level) {
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
    }

    private DiagnosticResponse() {
        this.field = null;
        this.level = null;
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

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public DiagnosticResponse build() {
            return new DiagnosticResponse(field, level);
        }
    }
}
