// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.ArgumentArgs;
import com.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OverrideTaskStepPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final OverrideTaskStepPropertiesArgs Empty = new OverrideTaskStepPropertiesArgs();

    /**
     * Gets or sets the collection of override arguments to be used when
     * executing a build step.
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<List<ArgumentArgs>> arguments;

    /**
     * @return Gets or sets the collection of override arguments to be used when
     * executing a build step.
     * 
     */
    public Optional<Output<List<ArgumentArgs>>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * The source context against which run has to be queued.
     * 
     */
    @Import(name="contextPath")
    private @Nullable Output<String> contextPath;

    /**
     * @return The source context against which run has to be queued.
     * 
     */
    public Optional<Output<String>> contextPath() {
        return Optional.ofNullable(this.contextPath);
    }

    /**
     * The file against which run has to be queued.
     * 
     */
    @Import(name="file")
    private @Nullable Output<String> file;

    /**
     * @return The file against which run has to be queued.
     * 
     */
    public Optional<Output<String>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The name of the target build stage for the docker build.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The name of the target build stage for the docker build.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Base64 encoded update trigger token that will be attached with the base image trigger webhook.
     * 
     */
    @Import(name="updateTriggerToken")
    private @Nullable Output<String> updateTriggerToken;

    /**
     * @return Base64 encoded update trigger token that will be attached with the base image trigger webhook.
     * 
     */
    public Optional<Output<String>> updateTriggerToken() {
        return Optional.ofNullable(this.updateTriggerToken);
    }

    /**
     * The collection of overridable values that can be passed when running a Task.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<SetValueArgs>> values;

    /**
     * @return The collection of overridable values that can be passed when running a Task.
     * 
     */
    public Optional<Output<List<SetValueArgs>>> values() {
        return Optional.ofNullable(this.values);
    }

    private OverrideTaskStepPropertiesArgs() {}

    private OverrideTaskStepPropertiesArgs(OverrideTaskStepPropertiesArgs $) {
        this.arguments = $.arguments;
        this.contextPath = $.contextPath;
        this.file = $.file;
        this.target = $.target;
        this.updateTriggerToken = $.updateTriggerToken;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OverrideTaskStepPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OverrideTaskStepPropertiesArgs $;

        public Builder() {
            $ = new OverrideTaskStepPropertiesArgs();
        }

        public Builder(OverrideTaskStepPropertiesArgs defaults) {
            $ = new OverrideTaskStepPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments Gets or sets the collection of override arguments to be used when
         * executing a build step.
         * 
         * @return builder
         * 
         */
        public Builder arguments(@Nullable Output<List<ArgumentArgs>> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments Gets or sets the collection of override arguments to be used when
         * executing a build step.
         * 
         * @return builder
         * 
         */
        public Builder arguments(List<ArgumentArgs> arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param arguments Gets or sets the collection of override arguments to be used when
         * executing a build step.
         * 
         * @return builder
         * 
         */
        public Builder arguments(ArgumentArgs... arguments) {
            return arguments(List.of(arguments));
        }

        /**
         * @param contextPath The source context against which run has to be queued.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(@Nullable Output<String> contextPath) {
            $.contextPath = contextPath;
            return this;
        }

        /**
         * @param contextPath The source context against which run has to be queued.
         * 
         * @return builder
         * 
         */
        public Builder contextPath(String contextPath) {
            return contextPath(Output.of(contextPath));
        }

        /**
         * @param file The file against which run has to be queued.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<String> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file The file against which run has to be queued.
         * 
         * @return builder
         * 
         */
        public Builder file(String file) {
            return file(Output.of(file));
        }

        /**
         * @param target The name of the target build stage for the docker build.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The name of the target build stage for the docker build.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param updateTriggerToken Base64 encoded update trigger token that will be attached with the base image trigger webhook.
         * 
         * @return builder
         * 
         */
        public Builder updateTriggerToken(@Nullable Output<String> updateTriggerToken) {
            $.updateTriggerToken = updateTriggerToken;
            return this;
        }

        /**
         * @param updateTriggerToken Base64 encoded update trigger token that will be attached with the base image trigger webhook.
         * 
         * @return builder
         * 
         */
        public Builder updateTriggerToken(String updateTriggerToken) {
            return updateTriggerToken(Output.of(updateTriggerToken));
        }

        /**
         * @param values The collection of overridable values that can be passed when running a Task.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<SetValueArgs>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The collection of overridable values that can be passed when running a Task.
         * 
         * @return builder
         * 
         */
        public Builder values(List<SetValueArgs> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The collection of overridable values that can be passed when running a Task.
         * 
         * @return builder
         * 
         */
        public Builder values(SetValueArgs... values) {
            return values(List.of(values));
        }

        public OverrideTaskStepPropertiesArgs build() {
            return $;
        }
    }

}
