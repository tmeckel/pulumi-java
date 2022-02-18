// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RuleAction;
import io.pulumi.googlenative.compute_alpha.inputs.ConditionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.LogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<RuleAction> action;

    public Input<RuleAction> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<ConditionArgs>> conditions;

    public Input<List<ConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="ins")
    private final @Nullable Input<List<String>> ins;

    public Input<List<String>> getIns() {
        return this.ins == null ? Input.empty() : this.ins;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="logConfigs")
    private final @Nullable Input<List<LogConfigArgs>> logConfigs;

    public Input<List<LogConfigArgs>> getLogConfigs() {
        return this.logConfigs == null ? Input.empty() : this.logConfigs;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="notIns")
    private final @Nullable Input<List<String>> notIns;

    public Input<List<String>> getNotIns() {
        return this.notIns == null ? Input.empty() : this.notIns;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="permissions")
    private final @Nullable Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    public RuleArgs(
        @Nullable Input<RuleAction> action,
        @Nullable Input<List<ConditionArgs>> conditions,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> ins,
        @Nullable Input<List<LogConfigArgs>> logConfigs,
        @Nullable Input<List<String>> notIns,
        @Nullable Input<List<String>> permissions) {
        this.action = action;
        this.conditions = conditions;
        this.description = description;
        this.ins = ins;
        this.logConfigs = logConfigs;
        this.notIns = notIns;
        this.permissions = permissions;
    }

    private RuleArgs() {
        this.action = Input.empty();
        this.conditions = Input.empty();
        this.description = Input.empty();
        this.ins = Input.empty();
        this.logConfigs = Input.empty();
        this.notIns = Input.empty();
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleAction> action;
        private @Nullable Input<List<ConditionArgs>> conditions;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> ins;
        private @Nullable Input<List<LogConfigArgs>> logConfigs;
        private @Nullable Input<List<String>> notIns;
        private @Nullable Input<List<String>> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.ins = defaults.ins;
    	      this.logConfigs = defaults.logConfigs;
    	      this.notIns = defaults.notIns;
    	      this.permissions = defaults.permissions;
        }

        public Builder setAction(@Nullable Input<RuleAction> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable RuleAction action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
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

        public Builder setIns(@Nullable Input<List<String>> ins) {
            this.ins = ins;
            return this;
        }

        public Builder setIns(@Nullable List<String> ins) {
            this.ins = Input.ofNullable(ins);
            return this;
        }

        public Builder setLogConfigs(@Nullable Input<List<LogConfigArgs>> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }

        public Builder setLogConfigs(@Nullable List<LogConfigArgs> logConfigs) {
            this.logConfigs = Input.ofNullable(logConfigs);
            return this;
        }

        public Builder setNotIns(@Nullable Input<List<String>> notIns) {
            this.notIns = notIns;
            return this;
        }

        public Builder setNotIns(@Nullable List<String> notIns) {
            this.notIns = Input.ofNullable(notIns);
            return this;
        }

        public Builder setPermissions(@Nullable Input<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable List<String> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public RuleArgs build() {
            return new RuleArgs(action, conditions, description, ins, logConfigs, notIns, permissions);
        }
    }
}
