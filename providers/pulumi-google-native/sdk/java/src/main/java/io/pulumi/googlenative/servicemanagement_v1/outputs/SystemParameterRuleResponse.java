// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.SystemParameterResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SystemParameterRuleResponse {
    /**
     * Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
     * 
     */
    private final List<SystemParameterResponse> parameters;
    /**
     * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
     */
    private final String selector;

    @OutputCustomType.Constructor
    private SystemParameterRuleResponse(
        @OutputCustomType.Parameter("parameters") List<SystemParameterResponse> parameters,
        @OutputCustomType.Parameter("selector") String selector) {
        this.parameters = parameters;
        this.selector = selector;
    }

    /**
     * Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
     * 
    */
    public List<SystemParameterResponse> getParameters() {
        return this.parameters;
    }
    /**
     * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
     * 
    */
    public String getSelector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemParameterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SystemParameterResponse> parameters;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemParameterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.selector = defaults.selector;
        }

        public Builder parameters(List<SystemParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public SystemParameterRuleResponse build() {
            return new SystemParameterRuleResponse(parameters, selector);
        }
    }
}
