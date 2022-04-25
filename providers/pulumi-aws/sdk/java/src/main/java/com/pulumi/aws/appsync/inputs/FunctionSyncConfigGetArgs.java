// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.aws.appsync.inputs.FunctionSyncConfigLambdaConflictHandlerConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionSyncConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionSyncConfigGetArgs Empty = new FunctionSyncConfigGetArgs();

    /**
     * The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    @Import(name="conflictDetection")
    private @Nullable Output<String> conflictDetection;

    /**
     * @return The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    public Optional<Output<String>> conflictDetection() {
        return Optional.ofNullable(this.conflictDetection);
    }

    /**
     * The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    @Import(name="conflictHandler")
    private @Nullable Output<String> conflictHandler;

    /**
     * @return The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    public Optional<Output<String>> conflictHandler() {
        return Optional.ofNullable(this.conflictHandler);
    }

    /**
     * The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    @Import(name="lambdaConflictHandlerConfig")
    private @Nullable Output<FunctionSyncConfigLambdaConflictHandlerConfigGetArgs> lambdaConflictHandlerConfig;

    /**
     * @return The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    public Optional<Output<FunctionSyncConfigLambdaConflictHandlerConfigGetArgs>> lambdaConflictHandlerConfig() {
        return Optional.ofNullable(this.lambdaConflictHandlerConfig);
    }

    private FunctionSyncConfigGetArgs() {}

    private FunctionSyncConfigGetArgs(FunctionSyncConfigGetArgs $) {
        this.conflictDetection = $.conflictDetection;
        this.conflictHandler = $.conflictHandler;
        this.lambdaConflictHandlerConfig = $.lambdaConflictHandlerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionSyncConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionSyncConfigGetArgs $;

        public Builder() {
            $ = new FunctionSyncConfigGetArgs();
        }

        public Builder(FunctionSyncConfigGetArgs defaults) {
            $ = new FunctionSyncConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conflictDetection The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
         * 
         * @return builder
         * 
         */
        public Builder conflictDetection(@Nullable Output<String> conflictDetection) {
            $.conflictDetection = conflictDetection;
            return this;
        }

        /**
         * @param conflictDetection The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
         * 
         * @return builder
         * 
         */
        public Builder conflictDetection(String conflictDetection) {
            return conflictDetection(Output.of(conflictDetection));
        }

        /**
         * @param conflictHandler The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
         * 
         * @return builder
         * 
         */
        public Builder conflictHandler(@Nullable Output<String> conflictHandler) {
            $.conflictHandler = conflictHandler;
            return this;
        }

        /**
         * @param conflictHandler The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
         * 
         * @return builder
         * 
         */
        public Builder conflictHandler(String conflictHandler) {
            return conflictHandler(Output.of(conflictHandler));
        }

        /**
         * @param lambdaConflictHandlerConfig The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConflictHandlerConfig(@Nullable Output<FunctionSyncConfigLambdaConflictHandlerConfigGetArgs> lambdaConflictHandlerConfig) {
            $.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
            return this;
        }

        /**
         * @param lambdaConflictHandlerConfig The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConflictHandlerConfig(FunctionSyncConfigLambdaConflictHandlerConfigGetArgs lambdaConflictHandlerConfig) {
            return lambdaConflictHandlerConfig(Output.of(lambdaConflictHandlerConfig));
        }

        public FunctionSyncConfigGetArgs build() {
            return $;
        }
    }

}
