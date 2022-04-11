// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudbuild_v1alpha1.enums.WorkerPoolRegionsItem;
import io.pulumi.googlenative.cloudbuild_v1alpha1.inputs.WorkerConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkerPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * User-defined name of the `WorkerPool`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The project ID of the GCP project for which the `WorkerPool` is created.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * List of regions to create the `WorkerPool`. Regions can't be empty. If Cloud Build adds a new GCP region in the future, the existing `WorkerPool` will not be enabled in the new region automatically; you must add the new region to the `regions` field to enable the `WorkerPool` in that region.
     * 
     */
    @Import(name="regions")
      private final @Nullable Output<List<WorkerPoolRegionsItem>> regions;

    public Output<List<WorkerPoolRegionsItem>> getRegions() {
        return this.regions == null ? Codegen.empty() : this.regions;
    }

    /**
     * Configuration to be used for a creating workers in the `WorkerPool`.
     * 
     */
    @Import(name="workerConfig")
      private final @Nullable Output<WorkerConfigArgs> workerConfig;

    public Output<WorkerConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Codegen.empty() : this.workerConfig;
    }

    /**
     * Total number of workers to be created across all requested regions.
     * 
     */
    @Import(name="workerCount")
      private final @Nullable Output<String> workerCount;

    public Output<String> getWorkerCount() {
        return this.workerCount == null ? Codegen.empty() : this.workerCount;
    }

    public WorkerPoolArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<WorkerPoolRegionsItem>> regions,
        @Nullable Output<WorkerConfigArgs> workerConfig,
        @Nullable Output<String> workerCount) {
        this.name = name;
        this.project = project;
        this.regions = regions;
        this.workerConfig = workerConfig;
        this.workerCount = workerCount;
    }

    private WorkerPoolArgs() {
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.regions = Codegen.empty();
        this.workerConfig = Codegen.empty();
        this.workerCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<WorkerPoolRegionsItem>> regions;
        private @Nullable Output<WorkerConfigArgs> workerConfig;
        private @Nullable Output<String> workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.regions = defaults.regions;
    	      this.workerConfig = defaults.workerConfig;
    	      this.workerCount = defaults.workerCount;
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
        }
        public Builder regions(@Nullable Output<List<WorkerPoolRegionsItem>> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(@Nullable List<WorkerPoolRegionsItem> regions) {
            this.regions = Codegen.ofNullable(regions);
            return this;
        }
        public Builder regions(WorkerPoolRegionsItem... regions) {
            return regions(List.of(regions));
        }
        public Builder workerConfig(@Nullable Output<WorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }
        public Builder workerConfig(@Nullable WorkerConfigArgs workerConfig) {
            this.workerConfig = Codegen.ofNullable(workerConfig);
            return this;
        }
        public Builder workerCount(@Nullable Output<String> workerCount) {
            this.workerCount = workerCount;
            return this;
        }
        public Builder workerCount(@Nullable String workerCount) {
            this.workerCount = Codegen.ofNullable(workerCount);
            return this;
        }        public WorkerPoolArgs build() {
            return new WorkerPoolArgs(name, project, regions, workerConfig, workerCount);
        }
    }
}
