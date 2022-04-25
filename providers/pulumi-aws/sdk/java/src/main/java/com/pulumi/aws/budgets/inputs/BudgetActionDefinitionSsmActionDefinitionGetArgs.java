// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BudgetActionDefinitionSsmActionDefinitionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionSsmActionDefinitionGetArgs Empty = new BudgetActionDefinitionSsmActionDefinitionGetArgs();

    /**
     * The action subType. Valid values are `STOP_EC2_INSTANCES` or `STOP_RDS_INSTANCES`.
     * 
     */
    @Import(name="actionSubType", required=true)
    private Output<String> actionSubType;

    /**
     * @return The action subType. Valid values are `STOP_EC2_INSTANCES` or `STOP_RDS_INSTANCES`.
     * 
     */
    public Output<String> actionSubType() {
        return this.actionSubType;
    }

    /**
     * The EC2 and RDS instance IDs.
     * 
     */
    @Import(name="instanceIds", required=true)
    private Output<List<String>> instanceIds;

    /**
     * @return The EC2 and RDS instance IDs.
     * 
     */
    public Output<List<String>> instanceIds() {
        return this.instanceIds;
    }

    /**
     * The Region to run the SSM document.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The Region to run the SSM document.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private BudgetActionDefinitionSsmActionDefinitionGetArgs() {}

    private BudgetActionDefinitionSsmActionDefinitionGetArgs(BudgetActionDefinitionSsmActionDefinitionGetArgs $) {
        this.actionSubType = $.actionSubType;
        this.instanceIds = $.instanceIds;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetActionDefinitionSsmActionDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetActionDefinitionSsmActionDefinitionGetArgs $;

        public Builder() {
            $ = new BudgetActionDefinitionSsmActionDefinitionGetArgs();
        }

        public Builder(BudgetActionDefinitionSsmActionDefinitionGetArgs defaults) {
            $ = new BudgetActionDefinitionSsmActionDefinitionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionSubType The action subType. Valid values are `STOP_EC2_INSTANCES` or `STOP_RDS_INSTANCES`.
         * 
         * @return builder
         * 
         */
        public Builder actionSubType(Output<String> actionSubType) {
            $.actionSubType = actionSubType;
            return this;
        }

        /**
         * @param actionSubType The action subType. Valid values are `STOP_EC2_INSTANCES` or `STOP_RDS_INSTANCES`.
         * 
         * @return builder
         * 
         */
        public Builder actionSubType(String actionSubType) {
            return actionSubType(Output.of(actionSubType));
        }

        /**
         * @param instanceIds The EC2 and RDS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(Output<List<String>> instanceIds) {
            $.instanceIds = instanceIds;
            return this;
        }

        /**
         * @param instanceIds The EC2 and RDS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(List<String> instanceIds) {
            return instanceIds(Output.of(instanceIds));
        }

        /**
         * @param instanceIds The EC2 and RDS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }

        /**
         * @param region The Region to run the SSM document.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Region to run the SSM document.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public BudgetActionDefinitionSsmActionDefinitionGetArgs build() {
            $.actionSubType = Objects.requireNonNull($.actionSubType, "expected parameter 'actionSubType' to be non-null");
            $.instanceIds = Objects.requireNonNull($.instanceIds, "expected parameter 'instanceIds' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
