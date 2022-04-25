// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloneJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloneJobArgs Empty = new CloneJobArgs();

    @Import(name="cloneJobId", required=true)
    private Output<String> cloneJobId;

    public Output<String> cloneJobId() {
        return this.cloneJobId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="migratingVmId", required=true)
    private Output<String> migratingVmId;

    public Output<String> migratingVmId() {
        return this.migratingVmId;
    }

    /**
     * The name of the clone.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the clone.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="sourceId", required=true)
    private Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    private CloneJobArgs() {}

    private CloneJobArgs(CloneJobArgs $) {
        this.cloneJobId = $.cloneJobId;
        this.location = $.location;
        this.migratingVmId = $.migratingVmId;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloneJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloneJobArgs $;

        public Builder() {
            $ = new CloneJobArgs();
        }

        public Builder(CloneJobArgs defaults) {
            $ = new CloneJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloneJobId(Output<String> cloneJobId) {
            $.cloneJobId = cloneJobId;
            return this;
        }

        public Builder cloneJobId(String cloneJobId) {
            return cloneJobId(Output.of(cloneJobId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder migratingVmId(Output<String> migratingVmId) {
            $.migratingVmId = migratingVmId;
            return this;
        }

        public Builder migratingVmId(String migratingVmId) {
            return migratingVmId(Output.of(migratingVmId));
        }

        /**
         * @param name The name of the clone.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the clone.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder sourceId(Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        public CloneJobArgs build() {
            $.cloneJobId = Objects.requireNonNull($.cloneJobId, "expected parameter 'cloneJobId' to be non-null");
            $.migratingVmId = Objects.requireNonNull($.migratingVmId, "expected parameter 'migratingVmId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
