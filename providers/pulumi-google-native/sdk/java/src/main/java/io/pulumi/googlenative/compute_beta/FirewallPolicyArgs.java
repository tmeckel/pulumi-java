// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.inputs.FirewallPolicyAssociationArgs;
import io.pulumi.googlenative.compute_beta.inputs.FirewallPolicyRuleArgs;
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
    @Import(name="associations")
      private final @Nullable Output<List<FirewallPolicyAssociationArgs>> associations;

    public Output<List<FirewallPolicyAssociationArgs>> getAssociations() {
        return this.associations == null ? Codegen.empty() : this.associations;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="parentId")
      private final @Nullable Output<String> parentId;

    public Output<String> getParentId() {
        return this.parentId == null ? Codegen.empty() : this.parentId;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<FirewallPolicyRuleArgs>> rules;

    public Output<List<FirewallPolicyRuleArgs>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="shortName")
      private final @Nullable Output<String> shortName;

    public Output<String> getShortName() {
        return this.shortName == null ? Codegen.empty() : this.shortName;
    }

    public FirewallPolicyArgs(
        @Nullable Output<List<FirewallPolicyAssociationArgs>> associations,
        @Nullable Output<String> description,
        @Nullable Output<String> parentId,
        @Nullable Output<String> requestId,
        @Nullable Output<List<FirewallPolicyRuleArgs>> rules,
        @Nullable Output<String> shortName) {
        this.associations = associations;
        this.description = description;
        this.parentId = parentId;
        this.requestId = requestId;
        this.rules = rules;
        this.shortName = shortName;
    }

    private FirewallPolicyArgs() {
        this.associations = Codegen.empty();
        this.description = Codegen.empty();
        this.parentId = Codegen.empty();
        this.requestId = Codegen.empty();
        this.rules = Codegen.empty();
        this.shortName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirewallPolicyAssociationArgs>> associations;
        private @Nullable Output<String> description;
        private @Nullable Output<String> parentId;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<FirewallPolicyRuleArgs>> rules;
        private @Nullable Output<String> shortName;

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
        }

        public Builder associations(@Nullable Output<List<FirewallPolicyAssociationArgs>> associations) {
            this.associations = associations;
            return this;
        }
        public Builder associations(@Nullable List<FirewallPolicyAssociationArgs> associations) {
            this.associations = Codegen.ofNullable(associations);
            return this;
        }
        public Builder associations(FirewallPolicyAssociationArgs... associations) {
            return associations(List.of(associations));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder parentId(@Nullable Output<String> parentId) {
            this.parentId = parentId;
            return this;
        }
        public Builder parentId(@Nullable String parentId) {
            this.parentId = Codegen.ofNullable(parentId);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder rules(@Nullable Output<List<FirewallPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<FirewallPolicyRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(FirewallPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder shortName(@Nullable Output<String> shortName) {
            this.shortName = shortName;
            return this;
        }
        public Builder shortName(@Nullable String shortName) {
            this.shortName = Codegen.ofNullable(shortName);
            return this;
        }        public FirewallPolicyArgs build() {
            return new FirewallPolicyArgs(associations, description, parentId, requestId, rules, shortName);
        }
    }
}
