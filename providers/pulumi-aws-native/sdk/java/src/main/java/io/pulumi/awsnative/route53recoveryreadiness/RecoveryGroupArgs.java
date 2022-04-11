// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness;

import io.pulumi.awsnative.route53recoveryreadiness.inputs.RecoveryGroupTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecoveryGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecoveryGroupArgs Empty = new RecoveryGroupArgs();

    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    @Import(name="cells")
      private final @Nullable Output<List<String>> cells;

    public Output<List<String>> getCells() {
        return this.cells == null ? Codegen.empty() : this.cells;
    }

    /**
     * The name of the recovery group to create.
     * 
     */
    @Import(name="recoveryGroupName")
      private final @Nullable Output<String> recoveryGroupName;

    public Output<String> getRecoveryGroupName() {
        return this.recoveryGroupName == null ? Codegen.empty() : this.recoveryGroupName;
    }

    /**
     * A collection of tags associated with a resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<RecoveryGroupTagArgs>> tags;

    public Output<List<RecoveryGroupTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RecoveryGroupArgs(
        @Nullable Output<List<String>> cells,
        @Nullable Output<String> recoveryGroupName,
        @Nullable Output<List<RecoveryGroupTagArgs>> tags) {
        this.cells = cells;
        this.recoveryGroupName = recoveryGroupName;
        this.tags = tags;
    }

    private RecoveryGroupArgs() {
        this.cells = Codegen.empty();
        this.recoveryGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cells;
        private @Nullable Output<String> recoveryGroupName;
        private @Nullable Output<List<RecoveryGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.recoveryGroupName = defaults.recoveryGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder cells(@Nullable Output<List<String>> cells) {
            this.cells = cells;
            return this;
        }
        public Builder cells(@Nullable List<String> cells) {
            this.cells = Codegen.ofNullable(cells);
            return this;
        }
        public Builder cells(String... cells) {
            return cells(List.of(cells));
        }
        public Builder recoveryGroupName(@Nullable Output<String> recoveryGroupName) {
            this.recoveryGroupName = recoveryGroupName;
            return this;
        }
        public Builder recoveryGroupName(@Nullable String recoveryGroupName) {
            this.recoveryGroupName = Codegen.ofNullable(recoveryGroupName);
            return this;
        }
        public Builder tags(@Nullable Output<List<RecoveryGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<RecoveryGroupTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(RecoveryGroupTagArgs... tags) {
            return tags(List.of(tags));
        }        public RecoveryGroupArgs build() {
            return new RecoveryGroupArgs(cells, recoveryGroupName, tags);
        }
    }
}
