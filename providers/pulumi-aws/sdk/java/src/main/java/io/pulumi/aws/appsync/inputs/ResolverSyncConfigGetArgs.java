// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.ResolverSyncConfigLambdaConflictHandlerConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverSyncConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverSyncConfigGetArgs Empty = new ResolverSyncConfigGetArgs();

    /**
     * The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    @Import(name="conflictDetection")
      private final @Nullable Output<String> conflictDetection;

    public Output<String> getConflictDetection() {
        return this.conflictDetection == null ? Codegen.empty() : this.conflictDetection;
    }

    /**
     * The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    @Import(name="conflictHandler")
      private final @Nullable Output<String> conflictHandler;

    public Output<String> getConflictHandler() {
        return this.conflictHandler == null ? Codegen.empty() : this.conflictHandler;
    }

    /**
     * The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    @Import(name="lambdaConflictHandlerConfig")
      private final @Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigGetArgs> lambdaConflictHandlerConfig;

    public Output<ResolverSyncConfigLambdaConflictHandlerConfigGetArgs> getLambdaConflictHandlerConfig() {
        return this.lambdaConflictHandlerConfig == null ? Codegen.empty() : this.lambdaConflictHandlerConfig;
    }

    public ResolverSyncConfigGetArgs(
        @Nullable Output<String> conflictDetection,
        @Nullable Output<String> conflictHandler,
        @Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigGetArgs> lambdaConflictHandlerConfig) {
        this.conflictDetection = conflictDetection;
        this.conflictHandler = conflictHandler;
        this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
    }

    private ResolverSyncConfigGetArgs() {
        this.conflictDetection = Codegen.empty();
        this.conflictHandler = Codegen.empty();
        this.lambdaConflictHandlerConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverSyncConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> conflictDetection;
        private @Nullable Output<String> conflictHandler;
        private @Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigGetArgs> lambdaConflictHandlerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverSyncConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictDetection = defaults.conflictDetection;
    	      this.conflictHandler = defaults.conflictHandler;
    	      this.lambdaConflictHandlerConfig = defaults.lambdaConflictHandlerConfig;
        }

        public Builder conflictDetection(@Nullable Output<String> conflictDetection) {
            this.conflictDetection = conflictDetection;
            return this;
        }
        public Builder conflictDetection(@Nullable String conflictDetection) {
            this.conflictDetection = Codegen.ofNullable(conflictDetection);
            return this;
        }
        public Builder conflictHandler(@Nullable Output<String> conflictHandler) {
            this.conflictHandler = conflictHandler;
            return this;
        }
        public Builder conflictHandler(@Nullable String conflictHandler) {
            this.conflictHandler = Codegen.ofNullable(conflictHandler);
            return this;
        }
        public Builder lambdaConflictHandlerConfig(@Nullable Output<ResolverSyncConfigLambdaConflictHandlerConfigGetArgs> lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
            return this;
        }
        public Builder lambdaConflictHandlerConfig(@Nullable ResolverSyncConfigLambdaConflictHandlerConfigGetArgs lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = Codegen.ofNullable(lambdaConflictHandlerConfig);
            return this;
        }        public ResolverSyncConfigGetArgs build() {
            return new ResolverSyncConfigGetArgs(conflictDetection, conflictHandler, lambdaConflictHandlerConfig);
        }
    }
}
