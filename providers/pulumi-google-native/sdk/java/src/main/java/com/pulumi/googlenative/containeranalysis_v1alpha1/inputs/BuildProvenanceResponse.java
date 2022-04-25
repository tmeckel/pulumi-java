// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.ArtifactResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.CommandResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Provenance of a build. Contains all information needed to verify the full details about the build from source to completion.
 * 
 */
public final class BuildProvenanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuildProvenanceResponse Empty = new BuildProvenanceResponse();

    /**
     * Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    @Import(name="buildOptions", required=true)
    private Map<String,String> buildOptions;

    /**
     * @return Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    public Map<String,String> buildOptions() {
        return this.buildOptions;
    }

    /**
     * Version string of the builder at the time this build was executed.
     * 
     */
    @Import(name="builderVersion", required=true)
    private String builderVersion;

    /**
     * @return Version string of the builder at the time this build was executed.
     * 
     */
    public String builderVersion() {
        return this.builderVersion;
    }

    /**
     * Output of the build.
     * 
     */
    @Import(name="builtArtifacts", required=true)
    private List<ArtifactResponse> builtArtifacts;

    /**
     * @return Output of the build.
     * 
     */
    public List<ArtifactResponse> builtArtifacts() {
        return this.builtArtifacts;
    }

    /**
     * Commands requested by the build.
     * 
     */
    @Import(name="commands", required=true)
    private List<CommandResponse> commands;

    /**
     * @return Commands requested by the build.
     * 
     */
    public List<CommandResponse> commands() {
        return this.commands;
    }

    /**
     * Time at which the build was created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    /**
     * @return Time at which the build was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }

    /**
     * E-mail address of the user who initiated this build. Note that this was the user&#39;s e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    @Import(name="creator", required=true)
    private String creator;

    /**
     * @return E-mail address of the user who initiated this build. Note that this was the user&#39;s e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    public String creator() {
        return this.creator;
    }

    /**
     * Time at which execution of the build was finished.
     * 
     */
    @Import(name="finishTime", required=true)
    private String finishTime;

    /**
     * @return Time at which execution of the build was finished.
     * 
     */
    public String finishTime() {
        return this.finishTime;
    }

    /**
     * Google Cloud Storage bucket where logs were written.
     * 
     */
    @Import(name="logsBucket", required=true)
    private String logsBucket;

    /**
     * @return Google Cloud Storage bucket where logs were written.
     * 
     */
    public String logsBucket() {
        return this.logsBucket;
    }

    /**
     * ID of the project.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return ID of the project.
     * 
     */
    public String project() {
        return this.project;
    }

    /**
     * Details of the Source input to the build.
     * 
     */
    @Import(name="sourceProvenance", required=true)
    private SourceResponse sourceProvenance;

    /**
     * @return Details of the Source input to the build.
     * 
     */
    public SourceResponse sourceProvenance() {
        return this.sourceProvenance;
    }

    /**
     * Time at which execution of the build was started.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    /**
     * @return Time at which execution of the build was started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    @Import(name="triggerId", required=true)
    private String triggerId;

    /**
     * @return Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    public String triggerId() {
        return this.triggerId;
    }

    private BuildProvenanceResponse() {}

    private BuildProvenanceResponse(BuildProvenanceResponse $) {
        this.buildOptions = $.buildOptions;
        this.builderVersion = $.builderVersion;
        this.builtArtifacts = $.builtArtifacts;
        this.commands = $.commands;
        this.createTime = $.createTime;
        this.creator = $.creator;
        this.finishTime = $.finishTime;
        this.logsBucket = $.logsBucket;
        this.project = $.project;
        this.sourceProvenance = $.sourceProvenance;
        this.startTime = $.startTime;
        this.triggerId = $.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildProvenanceResponse $;

        public Builder() {
            $ = new BuildProvenanceResponse();
        }

        public Builder(BuildProvenanceResponse defaults) {
            $ = new BuildProvenanceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildOptions Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
         * 
         * @return builder
         * 
         */
        public Builder buildOptions(Map<String,String> buildOptions) {
            $.buildOptions = buildOptions;
            return this;
        }

        /**
         * @param builderVersion Version string of the builder at the time this build was executed.
         * 
         * @return builder
         * 
         */
        public Builder builderVersion(String builderVersion) {
            $.builderVersion = builderVersion;
            return this;
        }

        /**
         * @param builtArtifacts Output of the build.
         * 
         * @return builder
         * 
         */
        public Builder builtArtifacts(List<ArtifactResponse> builtArtifacts) {
            $.builtArtifacts = builtArtifacts;
            return this;
        }

        /**
         * @param builtArtifacts Output of the build.
         * 
         * @return builder
         * 
         */
        public Builder builtArtifacts(ArtifactResponse... builtArtifacts) {
            return builtArtifacts(List.of(builtArtifacts));
        }

        /**
         * @param commands Commands requested by the build.
         * 
         * @return builder
         * 
         */
        public Builder commands(List<CommandResponse> commands) {
            $.commands = commands;
            return this;
        }

        /**
         * @param commands Commands requested by the build.
         * 
         * @return builder
         * 
         */
        public Builder commands(CommandResponse... commands) {
            return commands(List.of(commands));
        }

        /**
         * @param createTime Time at which the build was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param creator E-mail address of the user who initiated this build. Note that this was the user&#39;s e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
         * 
         * @return builder
         * 
         */
        public Builder creator(String creator) {
            $.creator = creator;
            return this;
        }

        /**
         * @param finishTime Time at which execution of the build was finished.
         * 
         * @return builder
         * 
         */
        public Builder finishTime(String finishTime) {
            $.finishTime = finishTime;
            return this;
        }

        /**
         * @param logsBucket Google Cloud Storage bucket where logs were written.
         * 
         * @return builder
         * 
         */
        public Builder logsBucket(String logsBucket) {
            $.logsBucket = logsBucket;
            return this;
        }

        /**
         * @param project ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        /**
         * @param sourceProvenance Details of the Source input to the build.
         * 
         * @return builder
         * 
         */
        public Builder sourceProvenance(SourceResponse sourceProvenance) {
            $.sourceProvenance = sourceProvenance;
            return this;
        }

        /**
         * @param startTime Time at which execution of the build was started.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param triggerId Trigger identifier if the build was triggered automatically; empty if not.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(String triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        public BuildProvenanceResponse build() {
            $.buildOptions = Objects.requireNonNull($.buildOptions, "expected parameter 'buildOptions' to be non-null");
            $.builderVersion = Objects.requireNonNull($.builderVersion, "expected parameter 'builderVersion' to be non-null");
            $.builtArtifacts = Objects.requireNonNull($.builtArtifacts, "expected parameter 'builtArtifacts' to be non-null");
            $.commands = Objects.requireNonNull($.commands, "expected parameter 'commands' to be non-null");
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.creator = Objects.requireNonNull($.creator, "expected parameter 'creator' to be non-null");
            $.finishTime = Objects.requireNonNull($.finishTime, "expected parameter 'finishTime' to be non-null");
            $.logsBucket = Objects.requireNonNull($.logsBucket, "expected parameter 'logsBucket' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.sourceProvenance = Objects.requireNonNull($.sourceProvenance, "expected parameter 'sourceProvenance' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.triggerId = Objects.requireNonNull($.triggerId, "expected parameter 'triggerId' to be non-null");
            return $;
        }
    }

}
