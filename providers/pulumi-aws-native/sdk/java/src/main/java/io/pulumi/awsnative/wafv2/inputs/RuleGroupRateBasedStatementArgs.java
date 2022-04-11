// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupRateBasedStatementAggregateKeyType;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupForwardedIPConfigurationArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRateBasedStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRateBasedStatementArgs Empty = new RuleGroupRateBasedStatementArgs();

    @Import(name="aggregateKeyType", required=true)
      private final Output<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType;

    public Output<RuleGroupRateBasedStatementAggregateKeyType> getAggregateKeyType() {
        return this.aggregateKeyType;
    }

    @Import(name="forwardedIPConfig")
      private final @Nullable Output<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig;

    public Output<RuleGroupForwardedIPConfigurationArgs> getForwardedIPConfig() {
        return this.forwardedIPConfig == null ? Codegen.empty() : this.forwardedIPConfig;
    }

    @Import(name="limit", required=true)
      private final Output<Integer> limit;

    public Output<Integer> getLimit() {
        return this.limit;
    }

    @Import(name="scopeDownStatement")
      private final @Nullable Output<RuleGroupStatementArgs> scopeDownStatement;

    public Output<RuleGroupStatementArgs> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Codegen.empty() : this.scopeDownStatement;
    }

    public RuleGroupRateBasedStatementArgs(
        Output<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType,
        @Nullable Output<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig,
        Output<Integer> limit,
        @Nullable Output<RuleGroupStatementArgs> scopeDownStatement) {
        this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType, "expected parameter 'aggregateKeyType' to be non-null");
        this.forwardedIPConfig = forwardedIPConfig;
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
    }

    private RuleGroupRateBasedStatementArgs() {
        this.aggregateKeyType = Codegen.empty();
        this.forwardedIPConfig = Codegen.empty();
        this.limit = Codegen.empty();
        this.scopeDownStatement = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRateBasedStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType;
        private @Nullable Output<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig;
        private Output<Integer> limit;
        private @Nullable Output<RuleGroupStatementArgs> scopeDownStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRateBasedStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateKeyType = defaults.aggregateKeyType;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
    	      this.limit = defaults.limit;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
        }

        public Builder aggregateKeyType(Output<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType) {
            this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType);
            return this;
        }
        public Builder aggregateKeyType(RuleGroupRateBasedStatementAggregateKeyType aggregateKeyType) {
            this.aggregateKeyType = Output.of(Objects.requireNonNull(aggregateKeyType));
            return this;
        }
        public Builder forwardedIPConfig(@Nullable Output<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }
        public Builder forwardedIPConfig(@Nullable RuleGroupForwardedIPConfigurationArgs forwardedIPConfig) {
            this.forwardedIPConfig = Codegen.ofNullable(forwardedIPConfig);
            return this;
        }
        public Builder limit(Output<Integer> limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }
        public Builder limit(Integer limit) {
            this.limit = Output.of(Objects.requireNonNull(limit));
            return this;
        }
        public Builder scopeDownStatement(@Nullable Output<RuleGroupStatementArgs> scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }
        public Builder scopeDownStatement(@Nullable RuleGroupStatementArgs scopeDownStatement) {
            this.scopeDownStatement = Codegen.ofNullable(scopeDownStatement);
            return this;
        }        public RuleGroupRateBasedStatementArgs build() {
            return new RuleGroupRateBasedStatementArgs(aggregateKeyType, forwardedIPConfig, limit, scopeDownStatement);
        }
    }
}
