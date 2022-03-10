// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EnvironmentVariableSetupResponse {
    /**
     * The type of custom setup.
     * Expected value is 'EnvironmentVariableSetup'.
     * 
     */
    private final String type;
    /**
     * The name of the environment variable.
     * 
     */
    private final String variableName;
    /**
     * The value of the environment variable.
     * 
     */
    private final String variableValue;

    @OutputCustomType.Constructor
    private EnvironmentVariableSetupResponse(
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("variableName") String variableName,
        @OutputCustomType.Parameter("variableValue") String variableValue) {
        this.type = type;
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    /**
     * The type of custom setup.
     * Expected value is 'EnvironmentVariableSetup'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The name of the environment variable.
     * 
    */
    public String getVariableName() {
        return this.variableName;
    }
    /**
     * The value of the environment variable.
     * 
    */
    public String getVariableValue() {
        return this.variableValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String variableName;
        private String variableValue;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.variableName = defaults.variableName;
    	      this.variableValue = defaults.variableValue;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder variableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public Builder variableValue(String variableValue) {
            this.variableValue = Objects.requireNonNull(variableValue);
            return this;
        }
        public EnvironmentVariableSetupResponse build() {
            return new EnvironmentVariableSetupResponse(type, variableName, variableValue);
        }
    }
}
