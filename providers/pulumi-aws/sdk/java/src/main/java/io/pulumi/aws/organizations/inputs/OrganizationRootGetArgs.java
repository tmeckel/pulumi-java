// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.aws.organizations.inputs.OrganizationRootPolicyTypeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationRootGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationRootGetArgs Empty = new OrganizationRootGetArgs();

    /**
     * ARN of the root
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Identifier of the root
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the policy type
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    @InputImport(name="policyTypes")
      private final @Nullable Input<List<OrganizationRootPolicyTypeGetArgs>> policyTypes;

    public Input<List<OrganizationRootPolicyTypeGetArgs>> getPolicyTypes() {
        return this.policyTypes == null ? Input.empty() : this.policyTypes;
    }

    public OrganizationRootGetArgs(
        @Nullable Input<String> arn,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<OrganizationRootPolicyTypeGetArgs>> policyTypes) {
        this.arn = arn;
        this.id = id;
        this.name = name;
        this.policyTypes = policyTypes;
    }

    private OrganizationRootGetArgs() {
        this.arn = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.policyTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationRootGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<OrganizationRootPolicyTypeGetArgs>> policyTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationRootGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.policyTypes = defaults.policyTypes;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder policyTypes(@Nullable Input<List<OrganizationRootPolicyTypeGetArgs>> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }

        public Builder policyTypes(@Nullable List<OrganizationRootPolicyTypeGetArgs> policyTypes) {
            this.policyTypes = Input.ofNullable(policyTypes);
            return this;
        }
        public OrganizationRootGetArgs build() {
            return new OrganizationRootGetArgs(arn, id, name, policyTypes);
        }
    }
}
