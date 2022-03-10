// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the variable and its new value.
 * 
 */
public final class DetectorModelSetVariable extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelSetVariable Empty = new DetectorModelSetVariable();

    /**
     * The new value of the variable.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    /**
     * The name of the variable.
     * 
     */
    @InputImport(name="variableName", required=true)
      private final String variableName;

    public String getVariableName() {
        return this.variableName;
    }

    public DetectorModelSetVariable(
        String value,
        String variableName) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
    }

    private DetectorModelSetVariable() {
        this.value = null;
        this.variableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSetVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;
        private String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSetVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.variableName = defaults.variableName;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder variableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }
        public DetectorModelSetVariable build() {
            return new DetectorModelSetVariable(value, variableName);
        }
    }
}
