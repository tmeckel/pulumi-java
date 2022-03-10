// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.inputs.AttributeArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.ExprArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a user's consent in terms of the resources that can be accessed and under what conditions.
 * 
 */
public final class GoogleCloudHealthcareV1ConsentPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudHealthcareV1ConsentPolicyArgs Empty = new GoogleCloudHealthcareV1ConsentPolicyArgs();

    /**
     * The request conditions to meet to grant access. In addition to any supported comparison operators, authorization rules may have `IN` operator as well as at most 10 logical operators that are limited to `AND` (`&&`), `OR` (`||`).
     * 
     */
    @InputImport(name="authorizationRule", required=true)
      private final Input<ExprArgs> authorizationRule;

    public Input<ExprArgs> getAuthorizationRule() {
        return this.authorizationRule;
    }

    /**
     * The resources that this policy applies to. A resource is a match if it matches all the attributes listed here. If empty, this policy applies to all User data mappings for the given user.
     * 
     */
    @InputImport(name="resourceAttributes")
      private final @Nullable Input<List<AttributeArgs>> resourceAttributes;

    public Input<List<AttributeArgs>> getResourceAttributes() {
        return this.resourceAttributes == null ? Input.empty() : this.resourceAttributes;
    }

    public GoogleCloudHealthcareV1ConsentPolicyArgs(
        Input<ExprArgs> authorizationRule,
        @Nullable Input<List<AttributeArgs>> resourceAttributes) {
        this.authorizationRule = Objects.requireNonNull(authorizationRule, "expected parameter 'authorizationRule' to be non-null");
        this.resourceAttributes = resourceAttributes;
    }

    private GoogleCloudHealthcareV1ConsentPolicyArgs() {
        this.authorizationRule = Input.empty();
        this.resourceAttributes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1ConsentPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ExprArgs> authorizationRule;
        private @Nullable Input<List<AttributeArgs>> resourceAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1ConsentPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRule = defaults.authorizationRule;
    	      this.resourceAttributes = defaults.resourceAttributes;
        }

        public Builder authorizationRule(Input<ExprArgs> authorizationRule) {
            this.authorizationRule = Objects.requireNonNull(authorizationRule);
            return this;
        }

        public Builder authorizationRule(ExprArgs authorizationRule) {
            this.authorizationRule = Input.of(Objects.requireNonNull(authorizationRule));
            return this;
        }

        public Builder resourceAttributes(@Nullable Input<List<AttributeArgs>> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        public Builder resourceAttributes(@Nullable List<AttributeArgs> resourceAttributes) {
            this.resourceAttributes = Input.ofNullable(resourceAttributes);
            return this;
        }
        public GoogleCloudHealthcareV1ConsentPolicyArgs build() {
            return new GoogleCloudHealthcareV1ConsentPolicyArgs(authorizationRule, resourceAttributes);
        }
    }
}
