// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.RequestSchemeMatchConditionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryRuleRequestSchemeConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestScheme'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final RequestSchemeMatchConditionParametersResponse parameters;

    @OutputCustomType.Constructor
    private DeliveryRuleRequestSchemeConditionResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") RequestSchemeMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestScheme'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public RequestSchemeMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestSchemeConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestSchemeMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestSchemeConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(RequestSchemeMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public DeliveryRuleRequestSchemeConditionResponse build() {
            return new DeliveryRuleRequestSchemeConditionResponse(name, parameters);
        }
    }
}
