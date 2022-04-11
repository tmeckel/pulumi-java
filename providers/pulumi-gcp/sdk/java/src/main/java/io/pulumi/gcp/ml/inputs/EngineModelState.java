// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.ml.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.ml.inputs.EngineModelDefaultVersionGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EngineModelState extends io.pulumi.resources.ResourceArgs {

    public static final EngineModelState Empty = new EngineModelState();

    /**
     * The default version of the model. This version will be used to handle
     * prediction requests that do not specify a version.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultVersion")
      private final @Nullable Output<EngineModelDefaultVersionGetArgs> defaultVersion;

    public Output<EngineModelDefaultVersionGetArgs> getDefaultVersion() {
        return this.defaultVersion == null ? Codegen.empty() : this.defaultVersion;
    }

    /**
     * The description specified for the model when it was created.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * One or more labels that you can add, to organize your models.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The name specified for the version when it was created.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
     * 
     */
    @Import(name="onlinePredictionConsoleLogging")
      private final @Nullable Output<Boolean> onlinePredictionConsoleLogging;

    public Output<Boolean> getOnlinePredictionConsoleLogging() {
        return this.onlinePredictionConsoleLogging == null ? Codegen.empty() : this.onlinePredictionConsoleLogging;
    }

    /**
     * If true, online prediction access logs are sent to StackDriver Logging.
     * 
     */
    @Import(name="onlinePredictionLogging")
      private final @Nullable Output<Boolean> onlinePredictionLogging;

    public Output<Boolean> getOnlinePredictionLogging() {
        return this.onlinePredictionLogging == null ? Codegen.empty() : this.onlinePredictionLogging;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The list of regions where the model is going to be deployed.
     * Currently only one region per model is supported
     * 
     */
    @Import(name="regions")
      private final @Nullable Output<String> regions;

    public Output<String> getRegions() {
        return this.regions == null ? Codegen.empty() : this.regions;
    }

    public EngineModelState(
        @Nullable Output<EngineModelDefaultVersionGetArgs> defaultVersion,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> onlinePredictionConsoleLogging,
        @Nullable Output<Boolean> onlinePredictionLogging,
        @Nullable Output<String> project,
        @Nullable Output<String> regions) {
        this.defaultVersion = defaultVersion;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.onlinePredictionConsoleLogging = onlinePredictionConsoleLogging;
        this.onlinePredictionLogging = onlinePredictionLogging;
        this.project = project;
        this.regions = regions;
    }

    private EngineModelState() {
        this.defaultVersion = Codegen.empty();
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.onlinePredictionConsoleLogging = Codegen.empty();
        this.onlinePredictionLogging = Codegen.empty();
        this.project = Codegen.empty();
        this.regions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EngineModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EngineModelDefaultVersionGetArgs> defaultVersion;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> onlinePredictionConsoleLogging;
        private @Nullable Output<Boolean> onlinePredictionLogging;
        private @Nullable Output<String> project;
        private @Nullable Output<String> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(EngineModelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.onlinePredictionConsoleLogging = defaults.onlinePredictionConsoleLogging;
    	      this.onlinePredictionLogging = defaults.onlinePredictionLogging;
    	      this.project = defaults.project;
    	      this.regions = defaults.regions;
        }

        public Builder defaultVersion(@Nullable Output<EngineModelDefaultVersionGetArgs> defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Builder defaultVersion(@Nullable EngineModelDefaultVersionGetArgs defaultVersion) {
            this.defaultVersion = Codegen.ofNullable(defaultVersion);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder onlinePredictionConsoleLogging(@Nullable Output<Boolean> onlinePredictionConsoleLogging) {
            this.onlinePredictionConsoleLogging = onlinePredictionConsoleLogging;
            return this;
        }
        public Builder onlinePredictionConsoleLogging(@Nullable Boolean onlinePredictionConsoleLogging) {
            this.onlinePredictionConsoleLogging = Codegen.ofNullable(onlinePredictionConsoleLogging);
            return this;
        }
        public Builder onlinePredictionLogging(@Nullable Output<Boolean> onlinePredictionLogging) {
            this.onlinePredictionLogging = onlinePredictionLogging;
            return this;
        }
        public Builder onlinePredictionLogging(@Nullable Boolean onlinePredictionLogging) {
            this.onlinePredictionLogging = Codegen.ofNullable(onlinePredictionLogging);
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
        public Builder regions(@Nullable Output<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(@Nullable String regions) {
            this.regions = Codegen.ofNullable(regions);
            return this;
        }        public EngineModelState build() {
            return new EngineModelState(defaultVersion, description, labels, name, onlinePredictionConsoleLogging, onlinePredictionLogging, project, regions);
        }
    }
}
