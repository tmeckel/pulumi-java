// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.FirewallPolicyVpcNetworkScope;
import io.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyAssociationArgs;
import io.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyArgs Empty = new FirewallPolicyArgs();

    /**
     * A list of associations that belong to this firewall policy.
     * 
     */
    @InputImport(name="associations")
    private final @Nullable Input<List<FirewallPolicyAssociationArgs>> associations;

    public Input<List<FirewallPolicyAssociationArgs>> getAssociations() {
        return this.associations == null ? Input.empty() : this.associations;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="parentId")
    private final @Nullable Input<String> parentId;

    public Input<String> getParentId() {
        return this.parentId == null ? Input.empty() : this.parentId;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
     * 
     */
    @InputImport(name="rules")
    private final @Nullable Input<List<FirewallPolicyRuleArgs>> rules;

    public Input<List<FirewallPolicyRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="shortName")
    private final @Nullable Input<String> shortName;

    public Input<String> getShortName() {
        return this.shortName == null ? Input.empty() : this.shortName;
    }

    /**
     * The scope of networks allowed to be associated with the firewall policy. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A firewall policy with the VPC scope set to GLOBAL_VPC_NETWORK is allowed to be attached only to global networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    @InputImport(name="vpcNetworkScope")
    private final @Nullable Input<FirewallPolicyVpcNetworkScope> vpcNetworkScope;

    public Input<FirewallPolicyVpcNetworkScope> getVpcNetworkScope() {
        return this.vpcNetworkScope == null ? Input.empty() : this.vpcNetworkScope;
    }

    public FirewallPolicyArgs(
        @Nullable Input<List<FirewallPolicyAssociationArgs>> associations,
        @Nullable Input<String> description,
        @Nullable Input<String> parentId,
        @Nullable Input<String> requestId,
        @Nullable Input<List<FirewallPolicyRuleArgs>> rules,
        @Nullable Input<String> shortName,
        @Nullable Input<FirewallPolicyVpcNetworkScope> vpcNetworkScope) {
        this.associations = associations;
        this.description = description;
        this.parentId = parentId;
        this.requestId = requestId;
        this.rules = rules;
        this.shortName = shortName;
        this.vpcNetworkScope = vpcNetworkScope;
    }

    private FirewallPolicyArgs() {
        this.associations = Input.empty();
        this.description = Input.empty();
        this.parentId = Input.empty();
        this.requestId = Input.empty();
        this.rules = Input.empty();
        this.shortName = Input.empty();
        this.vpcNetworkScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FirewallPolicyAssociationArgs>> associations;
        private @Nullable Input<String> description;
        private @Nullable Input<String> parentId;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<FirewallPolicyRuleArgs>> rules;
        private @Nullable Input<String> shortName;
        private @Nullable Input<FirewallPolicyVpcNetworkScope> vpcNetworkScope;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.description = defaults.description;
    	      this.parentId = defaults.parentId;
    	      this.requestId = defaults.requestId;
    	      this.rules = defaults.rules;
    	      this.shortName = defaults.shortName;
    	      this.vpcNetworkScope = defaults.vpcNetworkScope;
        }

        public Builder setAssociations(@Nullable Input<List<FirewallPolicyAssociationArgs>> associations) {
            this.associations = associations;
            return this;
        }

        public Builder setAssociations(@Nullable List<FirewallPolicyAssociationArgs> associations) {
            this.associations = Input.ofNullable(associations);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setParentId(@Nullable Input<String> parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setParentId(@Nullable String parentId) {
            this.parentId = Input.ofNullable(parentId);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRules(@Nullable Input<List<FirewallPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<FirewallPolicyRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setShortName(@Nullable Input<String> shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder setShortName(@Nullable String shortName) {
            this.shortName = Input.ofNullable(shortName);
            return this;
        }

        public Builder setVpcNetworkScope(@Nullable Input<FirewallPolicyVpcNetworkScope> vpcNetworkScope) {
            this.vpcNetworkScope = vpcNetworkScope;
            return this;
        }

        public Builder setVpcNetworkScope(@Nullable FirewallPolicyVpcNetworkScope vpcNetworkScope) {
            this.vpcNetworkScope = Input.ofNullable(vpcNetworkScope);
            return this;
        }

        public FirewallPolicyArgs build() {
            return new FirewallPolicyArgs(associations, description, parentId, requestId, rules, shortName, vpcNetworkScope);
        }
    }
}
