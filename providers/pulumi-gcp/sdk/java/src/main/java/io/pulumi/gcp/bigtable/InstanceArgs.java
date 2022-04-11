// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * A block of cluster configuration options. This can be specified at least once, and up to 4 times.
     * See structure below.
     * 
     */
    @Import(name="clusters")
      private final @Nullable Output<List<InstanceClusterArgs>> clusters;

    public Output<List<InstanceClusterArgs>> getClusters() {
        return this.clusters == null ? Codegen.empty() : this.clusters;
    }

    /**
     * Whether or not to allow this provider to destroy the instance. Unless this field is set to false
     * in the statefile, a `pulumi destroy` or `pulumi up` that would delete the instance will fail.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Codegen.empty() : this.deletionProtection;
    }

    /**
     * The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The instance type to create. One of `"DEVELOPMENT"` or `"PRODUCTION"`. Defaults to `"PRODUCTION"`.
     * It is recommended to leave this field unspecified since the distinction between `"DEVELOPMENT"` and `"PRODUCTION"` instances is going away,
     * and all instances will become `"PRODUCTION"` instances. This means that new and existing `"DEVELOPMENT"` instances will be converted to
     * `"PRODUCTION"` instances. It is recommended for users to use `"PRODUCTION"` instances in any case, since a 1-node `"PRODUCTION"` instance
     * is functionally identical to a `"DEVELOPMENT"` instance, but without the accompanying restrictions.
     * 
     * @Deprecated
     * It is recommended to leave this field unspecified since the distinction between "DEVELOPMENT" and "PRODUCTION" instances is going away, and all instances will become "PRODUCTION" instances. This means that new and existing "DEVELOPMENT" instances will be converted to "PRODUCTION" instances. It is recommended for users to use "PRODUCTION" instances in any case, since a 1-node "PRODUCTION" instance is functionally identical to a "DEVELOPMENT" instance, but without the accompanying restrictions.
     * 
     */
    @Deprecated /* It is recommended to leave this field unspecified since the distinction between ""DEVELOPMENT"" and ""PRODUCTION"" instances is going away, and all instances will become ""PRODUCTION"" instances. This means that new and existing ""DEVELOPMENT"" instances will be converted to ""PRODUCTION"" instances. It is recommended for users to use ""PRODUCTION"" instances in any case, since a 1-node ""PRODUCTION"" instance is functionally identical to a ""DEVELOPMENT"" instance, but without the accompanying restrictions. */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    @Deprecated /* It is recommended to leave this field unspecified since the distinction between ""DEVELOPMENT"" and ""PRODUCTION"" instances is going away, and all instances will become ""PRODUCTION"" instances. This means that new and existing ""DEVELOPMENT"" instances will be converted to ""PRODUCTION"" instances. It is recommended for users to use ""PRODUCTION"" instances in any case, since a 1-node ""PRODUCTION"" instance is functionally identical to a ""DEVELOPMENT"" instance, but without the accompanying restrictions. */
    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * A set of key/value label pairs to assign to the resource. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public InstanceArgs(
        @Nullable Output<List<InstanceClusterArgs>> clusters,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> displayName,
        @Nullable Output<String> instanceType,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.clusters = clusters;
        this.deletionProtection = deletionProtection;
        this.displayName = displayName;
        this.instanceType = instanceType;
        this.labels = labels;
        this.name = name;
        this.project = project;
    }

    private InstanceArgs() {
        this.clusters = Codegen.empty();
        this.deletionProtection = Codegen.empty();
        this.displayName = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InstanceClusterArgs>> clusters;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusters = defaults.clusters;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.displayName = defaults.displayName;
    	      this.instanceType = defaults.instanceType;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder clusters(@Nullable Output<List<InstanceClusterArgs>> clusters) {
            this.clusters = clusters;
            return this;
        }
        public Builder clusters(@Nullable List<InstanceClusterArgs> clusters) {
            this.clusters = Codegen.ofNullable(clusters);
            return this;
        }
        public Builder clusters(InstanceClusterArgs... clusters) {
            return clusters(List.of(clusters));
        }
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Codegen.ofNullable(deletionProtection);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(clusters, deletionProtection, displayName, instanceType, labels, name, project);
        }
    }
}
