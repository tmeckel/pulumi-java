// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.CustomErrorRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Customize service error responses. For example, list any service specific protobuf types that can appear in error detail lists of error responses. Example: custom_error: types: - google.foo.v1.CustomError - google.foo.v1.AnotherError
 * 
 */
public final class CustomErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomErrorResponse Empty = new CustomErrorResponse();

    /**
     * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @InputImport(name="rules", required=true)
    private final List<CustomErrorRuleResponse> rules;

    public List<CustomErrorRuleResponse> getRules() {
        return this.rules;
    }

    /**
     * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
     * 
     */
    @InputImport(name="types", required=true)
    private final List<String> types;

    public List<String> getTypes() {
        return this.types;
    }

    public CustomErrorResponse(
        List<CustomErrorRuleResponse> rules,
        List<String> types) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
        this.types = Objects.requireNonNull(types, "expected parameter 'types' to be non-null");
    }

    private CustomErrorResponse() {
        this.rules = List.of();
        this.types = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CustomErrorRuleResponse> rules;
        private List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
    	      this.types = defaults.types;
        }

        public Builder setRules(List<CustomErrorRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setTypes(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }

        public CustomErrorResponse build() {
            return new CustomErrorResponse(rules, types);
        }
    }
}
