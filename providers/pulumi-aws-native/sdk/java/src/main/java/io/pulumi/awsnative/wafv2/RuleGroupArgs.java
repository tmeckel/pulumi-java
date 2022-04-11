// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.wafv2.enums.RuleGroupScope;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomResponseBodiesArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTagArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupVisibilityConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupArgs Empty = new RuleGroupArgs();

    @Import(name="capacity", required=true)
      private final Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity;
    }

    @Import(name="customResponseBodies")
      private final @Nullable Output<RuleGroupCustomResponseBodiesArgs> customResponseBodies;

    public Output<RuleGroupCustomResponseBodiesArgs> getCustomResponseBodies() {
        return this.customResponseBodies == null ? Codegen.empty() : this.customResponseBodies;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Collection of Rules.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RuleGroupRuleArgs>> rules;

    public Output<List<RuleGroupRuleArgs>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    @Import(name="scope", required=true)
      private final Output<RuleGroupScope> scope;

    public Output<RuleGroupScope> getScope() {
        return this.scope;
    }

    @Import(name="tags")
      private final @Nullable Output<List<RuleGroupTagArgs>> tags;

    public Output<List<RuleGroupTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="visibilityConfig", required=true)
      private final Output<RuleGroupVisibilityConfigArgs> visibilityConfig;

    public Output<RuleGroupVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public RuleGroupArgs(
        Output<Integer> capacity,
        @Nullable Output<RuleGroupCustomResponseBodiesArgs> customResponseBodies,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<RuleGroupRuleArgs>> rules,
        Output<RuleGroupScope> scope,
        @Nullable Output<List<RuleGroupTagArgs>> tags,
        Output<RuleGroupVisibilityConfigArgs> visibilityConfig) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.customResponseBodies = customResponseBodies;
        this.description = description;
        this.name = name;
        this.rules = rules;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private RuleGroupArgs() {
        this.capacity = Codegen.empty();
        this.customResponseBodies = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.rules = Codegen.empty();
        this.scope = Codegen.empty();
        this.tags = Codegen.empty();
        this.visibilityConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> capacity;
        private @Nullable Output<RuleGroupCustomResponseBodiesArgs> customResponseBodies;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RuleGroupRuleArgs>> rules;
        private Output<RuleGroupScope> scope;
        private @Nullable Output<List<RuleGroupTagArgs>> tags;
        private Output<RuleGroupVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.customResponseBodies = defaults.customResponseBodies;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder capacity(Output<Integer> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public Builder capacity(Integer capacity) {
            this.capacity = Output.of(Objects.requireNonNull(capacity));
            return this;
        }
        public Builder customResponseBodies(@Nullable Output<RuleGroupCustomResponseBodiesArgs> customResponseBodies) {
            this.customResponseBodies = customResponseBodies;
            return this;
        }
        public Builder customResponseBodies(@Nullable RuleGroupCustomResponseBodiesArgs customResponseBodies) {
            this.customResponseBodies = Codegen.ofNullable(customResponseBodies);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder rules(@Nullable Output<List<RuleGroupRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<RuleGroupRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(RuleGroupRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder scope(Output<RuleGroupScope> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(RuleGroupScope scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder tags(@Nullable Output<List<RuleGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<RuleGroupTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(RuleGroupTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder visibilityConfig(Output<RuleGroupVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public Builder visibilityConfig(RuleGroupVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Output.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }        public RuleGroupArgs build() {
            return new RuleGroupArgs(capacity, customResponseBodies, description, name, rules, scope, tags, visibilityConfig);
        }
    }
}
