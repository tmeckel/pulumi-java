// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ArtifactArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.CommandArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provenance of a build. Contains all information needed to verify the full details about the build from source to completion.
 * 
 */
public final class BuildProvenanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildProvenanceArgs Empty = new BuildProvenanceArgs();

    /**
     * Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    @InputImport(name="buildOptions")
    private final @Nullable Input<Map<String,String>> buildOptions;

    public Input<Map<String,String>> getBuildOptions() {
        return this.buildOptions == null ? Input.empty() : this.buildOptions;
    }

    /**
     * Version string of the builder at the time this build was executed.
     * 
     */
    @InputImport(name="builderVersion")
    private final @Nullable Input<String> builderVersion;

    public Input<String> getBuilderVersion() {
        return this.builderVersion == null ? Input.empty() : this.builderVersion;
    }

    /**
     * Output of the build.
     * 
     */
    @InputImport(name="builtArtifacts")
    private final @Nullable Input<List<ArtifactArgs>> builtArtifacts;

    public Input<List<ArtifactArgs>> getBuiltArtifacts() {
        return this.builtArtifacts == null ? Input.empty() : this.builtArtifacts;
    }

    /**
     * Commands requested by the build.
     * 
     */
    @InputImport(name="commands")
    private final @Nullable Input<List<CommandArgs>> commands;

    public Input<List<CommandArgs>> getCommands() {
        return this.commands == null ? Input.empty() : this.commands;
    }

    /**
     * Time at which the build was created.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * E-mail address of the user who initiated this build. Note that this was the user's e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    @InputImport(name="creator")
    private final @Nullable Input<String> creator;

    public Input<String> getCreator() {
        return this.creator == null ? Input.empty() : this.creator;
    }

    /**
     * Time at which execution of the build was finished.
     * 
     */
    @InputImport(name="finishTime")
    private final @Nullable Input<String> finishTime;

    public Input<String> getFinishTime() {
        return this.finishTime == null ? Input.empty() : this.finishTime;
    }

    /**
     * Unique identifier of the build.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Google Cloud Storage bucket where logs were written.
     * 
     */
    @InputImport(name="logsBucket")
    private final @Nullable Input<String> logsBucket;

    public Input<String> getLogsBucket() {
        return this.logsBucket == null ? Input.empty() : this.logsBucket;
    }

    /**
     * ID of the project.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Details of the Source input to the build.
     * 
     */
    @InputImport(name="sourceProvenance")
    private final @Nullable Input<SourceArgs> sourceProvenance;

    public Input<SourceArgs> getSourceProvenance() {
        return this.sourceProvenance == null ? Input.empty() : this.sourceProvenance;
    }

    /**
     * Time at which execution of the build was started.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    @InputImport(name="triggerId")
    private final @Nullable Input<String> triggerId;

    public Input<String> getTriggerId() {
        return this.triggerId == null ? Input.empty() : this.triggerId;
    }

    public BuildProvenanceArgs(
        @Nullable Input<Map<String,String>> buildOptions,
        @Nullable Input<String> builderVersion,
        @Nullable Input<List<ArtifactArgs>> builtArtifacts,
        @Nullable Input<List<CommandArgs>> commands,
        @Nullable Input<String> createTime,
        @Nullable Input<String> creator,
        @Nullable Input<String> finishTime,
        @Nullable Input<String> id,
        @Nullable Input<String> logsBucket,
        @Nullable Input<String> project,
        @Nullable Input<SourceArgs> sourceProvenance,
        @Nullable Input<String> startTime,
        @Nullable Input<String> triggerId) {
        this.buildOptions = buildOptions;
        this.builderVersion = builderVersion;
        this.builtArtifacts = builtArtifacts;
        this.commands = commands;
        this.createTime = createTime;
        this.creator = creator;
        this.finishTime = finishTime;
        this.id = id;
        this.logsBucket = logsBucket;
        this.project = project;
        this.sourceProvenance = sourceProvenance;
        this.startTime = startTime;
        this.triggerId = triggerId;
    }

    private BuildProvenanceArgs() {
        this.buildOptions = Input.empty();
        this.builderVersion = Input.empty();
        this.builtArtifacts = Input.empty();
        this.commands = Input.empty();
        this.createTime = Input.empty();
        this.creator = Input.empty();
        this.finishTime = Input.empty();
        this.id = Input.empty();
        this.logsBucket = Input.empty();
        this.project = Input.empty();
        this.sourceProvenance = Input.empty();
        this.startTime = Input.empty();
        this.triggerId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildProvenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> buildOptions;
        private @Nullable Input<String> builderVersion;
        private @Nullable Input<List<ArtifactArgs>> builtArtifacts;
        private @Nullable Input<List<CommandArgs>> commands;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> creator;
        private @Nullable Input<String> finishTime;
        private @Nullable Input<String> id;
        private @Nullable Input<String> logsBucket;
        private @Nullable Input<String> project;
        private @Nullable Input<SourceArgs> sourceProvenance;
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> triggerId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildProvenanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildOptions = defaults.buildOptions;
    	      this.builderVersion = defaults.builderVersion;
    	      this.builtArtifacts = defaults.builtArtifacts;
    	      this.commands = defaults.commands;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.finishTime = defaults.finishTime;
    	      this.id = defaults.id;
    	      this.logsBucket = defaults.logsBucket;
    	      this.project = defaults.project;
    	      this.sourceProvenance = defaults.sourceProvenance;
    	      this.startTime = defaults.startTime;
    	      this.triggerId = defaults.triggerId;
        }

        public Builder setBuildOptions(@Nullable Input<Map<String,String>> buildOptions) {
            this.buildOptions = buildOptions;
            return this;
        }

        public Builder setBuildOptions(@Nullable Map<String,String> buildOptions) {
            this.buildOptions = Input.ofNullable(buildOptions);
            return this;
        }

        public Builder setBuilderVersion(@Nullable Input<String> builderVersion) {
            this.builderVersion = builderVersion;
            return this;
        }

        public Builder setBuilderVersion(@Nullable String builderVersion) {
            this.builderVersion = Input.ofNullable(builderVersion);
            return this;
        }

        public Builder setBuiltArtifacts(@Nullable Input<List<ArtifactArgs>> builtArtifacts) {
            this.builtArtifacts = builtArtifacts;
            return this;
        }

        public Builder setBuiltArtifacts(@Nullable List<ArtifactArgs> builtArtifacts) {
            this.builtArtifacts = Input.ofNullable(builtArtifacts);
            return this;
        }

        public Builder setCommands(@Nullable Input<List<CommandArgs>> commands) {
            this.commands = commands;
            return this;
        }

        public Builder setCommands(@Nullable List<CommandArgs> commands) {
            this.commands = Input.ofNullable(commands);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setCreator(@Nullable Input<String> creator) {
            this.creator = creator;
            return this;
        }

        public Builder setCreator(@Nullable String creator) {
            this.creator = Input.ofNullable(creator);
            return this;
        }

        public Builder setFinishTime(@Nullable Input<String> finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        public Builder setFinishTime(@Nullable String finishTime) {
            this.finishTime = Input.ofNullable(finishTime);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLogsBucket(@Nullable Input<String> logsBucket) {
            this.logsBucket = logsBucket;
            return this;
        }

        public Builder setLogsBucket(@Nullable String logsBucket) {
            this.logsBucket = Input.ofNullable(logsBucket);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSourceProvenance(@Nullable Input<SourceArgs> sourceProvenance) {
            this.sourceProvenance = sourceProvenance;
            return this;
        }

        public Builder setSourceProvenance(@Nullable SourceArgs sourceProvenance) {
            this.sourceProvenance = Input.ofNullable(sourceProvenance);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTriggerId(@Nullable Input<String> triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public Builder setTriggerId(@Nullable String triggerId) {
            this.triggerId = Input.ofNullable(triggerId);
            return this;
        }

        public BuildProvenanceArgs build() {
            return new BuildProvenanceArgs(buildOptions, builderVersion, builtArtifacts, commands, createTime, creator, finishTime, id, logsBucket, project, sourceProvenance, startTime, triggerId);
        }
    }
}
