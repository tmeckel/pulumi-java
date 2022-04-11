// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AzureFirewallApplicationRuleArgs;
import io.pulumi.azurenative.network.inputs.AzureFirewallRCActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application rule collection resource.
 * 
 */
public final class AzureFirewallApplicationRuleCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallApplicationRuleCollectionArgs Empty = new AzureFirewallApplicationRuleCollectionArgs();

    /**
     * The action type of a rule collection.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<AzureFirewallRCActionArgs> action;

    public Output<AzureFirewallRCActionArgs> getAction() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Priority of the application rule collection resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * Collection of rules used by a application rule collection.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<AzureFirewallApplicationRuleArgs>> rules;

    public Output<List<AzureFirewallApplicationRuleArgs>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public AzureFirewallApplicationRuleCollectionArgs(
        @Nullable Output<AzureFirewallRCActionArgs> action,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        @Nullable Output<List<AzureFirewallApplicationRuleArgs>> rules) {
        this.action = action;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.rules = rules;
    }

    private AzureFirewallApplicationRuleCollectionArgs() {
        this.action = Codegen.empty();
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallApplicationRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AzureFirewallRCActionArgs> action;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<List<AzureFirewallApplicationRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallApplicationRuleCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rules = defaults.rules;
        }

        public Builder action(@Nullable Output<AzureFirewallRCActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable AzureFirewallRCActionArgs action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder rules(@Nullable Output<List<AzureFirewallApplicationRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<AzureFirewallApplicationRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(AzureFirewallApplicationRuleArgs... rules) {
            return rules(List.of(rules));
        }        public AzureFirewallApplicationRuleCollectionArgs build() {
            return new AzureFirewallApplicationRuleCollectionArgs(action, id, name, priority, rules);
        }
    }
}
