// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gameservices_v1.outputs.ConditionResponse;
import io.pulumi.googlenative.gameservices_v1.outputs.LogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleResponse {
    /**
     * Required
     * 
     */
    private final String action;
    /**
     * Additional restrictions that must be met. All conditions must pass for the rule to match.
     * 
     */
    private final List<ConditionResponse> conditions;
    /**
     * Human-readable description of the rule.
     * 
     */
    private final String description;
    /**
     * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
     * 
     */
    private final List<String> in;
    /**
     * The config returned to callers of CheckPolicy for any entries that match the LOG action.
     * 
     */
    private final List<LogConfigResponse> logConfig;
    /**
     * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at in the Local IAM documentation (see go/local-iam#features).
     * 
     */
    private final List<String> notIn;
    /**
     * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
     * 
     */
    private final List<String> permissions;

    @OutputCustomType.Constructor({"action","conditions","description","in","logConfig","notIn","permissions"})
    private RuleResponse(
        String action,
        List<ConditionResponse> conditions,
        String description,
        List<String> in,
        List<LogConfigResponse> logConfig,
        List<String> notIn,
        List<String> permissions) {
        this.action = Objects.requireNonNull(action);
        this.conditions = Objects.requireNonNull(conditions);
        this.description = Objects.requireNonNull(description);
        this.in = Objects.requireNonNull(in);
        this.logConfig = Objects.requireNonNull(logConfig);
        this.notIn = Objects.requireNonNull(notIn);
        this.permissions = Objects.requireNonNull(permissions);
    }

    /**
     * Required
     * 
     */
    public String getAction() {
        return this.action;
    }
    /**
     * Additional restrictions that must be met. All conditions must pass for the rule to match.
     * 
     */
    public List<ConditionResponse> getConditions() {
        return this.conditions;
    }
    /**
     * Human-readable description of the rule.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
     * 
     */
    public List<String> getIn() {
        return this.in;
    }
    /**
     * The config returned to callers of CheckPolicy for any entries that match the LOG action.
     * 
     */
    public List<LogConfigResponse> getLogConfig() {
        return this.logConfig;
    }
    /**
     * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at in the Local IAM documentation (see go/local-iam#features).
     * 
     */
    public List<String> getNotIn() {
        return this.notIn;
    }
    /**
     * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
     * 
     */
    public List<String> getPermissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<ConditionResponse> conditions;
        private String description;
        private List<String> in;
        private List<LogConfigResponse> logConfig;
        private List<String> notIn;
        private List<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.in = defaults.in;
    	      this.logConfig = defaults.logConfig;
    	      this.notIn = defaults.notIn;
    	      this.permissions = defaults.permissions;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setConditions(List<ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setIn(List<String> in) {
            this.in = Objects.requireNonNull(in);
            return this;
        }

        public Builder setLogConfig(List<LogConfigResponse> logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }

        public Builder setNotIn(List<String> notIn) {
            this.notIn = Objects.requireNonNull(notIn);
            return this;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public RuleResponse build() {
            return new RuleResponse(action, conditions, description, in, logConfig, notIn, permissions);
        }
    }
}
