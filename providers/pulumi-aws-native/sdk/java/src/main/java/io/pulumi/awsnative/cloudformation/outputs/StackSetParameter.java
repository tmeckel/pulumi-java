// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StackSetParameter {
    /**
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
     * 
     */
    private final String parameterKey;
    /**
     * The input value associated with the parameter.
     * 
     */
    private final String parameterValue;

    @OutputCustomType.Constructor
    private StackSetParameter(
        @OutputCustomType.Parameter("parameterKey") String parameterKey,
        @OutputCustomType.Parameter("parameterValue") String parameterValue) {
        this.parameterKey = parameterKey;
        this.parameterValue = parameterValue;
    }

    /**
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
     * 
    */
    public String getParameterKey() {
        return this.parameterKey;
    }
    /**
     * The input value associated with the parameter.
     * 
    */
    public String getParameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterKey;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterKey = defaults.parameterKey;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterKey(String parameterKey) {
            this.parameterKey = Objects.requireNonNull(parameterKey);
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public StackSetParameter build() {
            return new StackSetParameter(parameterKey, parameterValue);
        }
    }
}
