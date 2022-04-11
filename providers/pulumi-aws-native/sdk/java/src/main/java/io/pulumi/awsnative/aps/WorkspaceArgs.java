// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.aps;

import io.pulumi.awsnative.aps.inputs.WorkspaceTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The AMP Workspace alert manager definition data
     * 
     */
    @Import(name="alertManagerDefinition")
      private final @Nullable Output<String> alertManagerDefinition;

    public Output<String> getAlertManagerDefinition() {
        return this.alertManagerDefinition == null ? Codegen.empty() : this.alertManagerDefinition;
    }

    /**
     * AMP Workspace alias.
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Codegen.empty() : this.alias;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<WorkspaceTagArgs>> tags;

    public Output<List<WorkspaceTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public WorkspaceArgs(
        @Nullable Output<String> alertManagerDefinition,
        @Nullable Output<String> alias,
        @Nullable Output<List<WorkspaceTagArgs>> tags) {
        this.alertManagerDefinition = alertManagerDefinition;
        this.alias = alias;
        this.tags = tags;
    }

    private WorkspaceArgs() {
        this.alertManagerDefinition = Codegen.empty();
        this.alias = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alertManagerDefinition;
        private @Nullable Output<String> alias;
        private @Nullable Output<List<WorkspaceTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertManagerDefinition = defaults.alertManagerDefinition;
    	      this.alias = defaults.alias;
    	      this.tags = defaults.tags;
        }

        public Builder alertManagerDefinition(@Nullable Output<String> alertManagerDefinition) {
            this.alertManagerDefinition = alertManagerDefinition;
            return this;
        }
        public Builder alertManagerDefinition(@Nullable String alertManagerDefinition) {
            this.alertManagerDefinition = Codegen.ofNullable(alertManagerDefinition);
            return this;
        }
        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = Codegen.ofNullable(alias);
            return this;
        }
        public Builder tags(@Nullable Output<List<WorkspaceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<WorkspaceTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(WorkspaceTagArgs... tags) {
            return tags(List.of(tags));
        }        public WorkspaceArgs build() {
            return new WorkspaceArgs(alertManagerDefinition, alias, tags);
        }
    }
}
