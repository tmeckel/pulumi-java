// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.RequestHeaderMatchConditionParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestHeader condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestHeaderConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleRequestHeaderConditionArgs Empty = new DeliveryRuleRequestHeaderConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestHeader'.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<RequestHeaderMatchConditionParametersArgs> parameters;

    public Output<RequestHeaderMatchConditionParametersArgs> getParameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestHeaderConditionArgs(
        Output<String> name,
        Output<RequestHeaderMatchConditionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestHeaderConditionArgs() {
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestHeaderConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<RequestHeaderMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestHeaderConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(Output<RequestHeaderMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(RequestHeaderMatchConditionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }        public DeliveryRuleRequestHeaderConditionArgs build() {
            return new DeliveryRuleRequestHeaderConditionArgs(name, parameters);
        }
    }
}
