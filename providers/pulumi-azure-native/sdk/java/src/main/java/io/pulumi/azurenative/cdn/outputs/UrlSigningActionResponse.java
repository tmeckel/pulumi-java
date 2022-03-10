// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.UrlSigningActionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlSigningActionResponse {
    /**
     * The name of the action for the delivery rule.
     * Expected value is 'UrlSigning'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the action.
     * 
     */
    private final UrlSigningActionParametersResponse parameters;

    @OutputCustomType.Constructor
    private UrlSigningActionResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") UrlSigningActionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'UrlSigning'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the action.
     * 
    */
    public UrlSigningActionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlSigningActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(UrlSigningActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public UrlSigningActionResponse build() {
            return new UrlSigningActionResponse(name, parameters);
        }
    }
}
