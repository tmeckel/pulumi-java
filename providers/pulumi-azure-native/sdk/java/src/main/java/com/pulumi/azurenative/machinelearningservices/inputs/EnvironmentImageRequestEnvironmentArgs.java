// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionDockerArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionPythonArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionRArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ModelEnvironmentDefinitionSparkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The details of the AZURE ML environment.
 * 
 */
public final class EnvironmentImageRequestEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentImageRequestEnvironmentArgs Empty = new EnvironmentImageRequestEnvironmentArgs();

    /**
     * The definition of a Docker container.
     * 
     */
    @Import(name="docker")
    private @Nullable Output<ModelEnvironmentDefinitionDockerArgs> docker;

    /**
     * @return The definition of a Docker container.
     * 
     */
    public Optional<Output<ModelEnvironmentDefinitionDockerArgs>> docker() {
        return Optional.ofNullable(this.docker);
    }

    /**
     * Definition of environment variables to be defined in the environment.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    /**
     * @return Definition of environment variables to be defined in the environment.
     * 
     */
    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The inferencing stack version added to the image. To avoid adding an inferencing stack, do not set this value. Valid values: &#34;latest&#34;.
     * 
     */
    @Import(name="inferencingStackVersion")
    private @Nullable Output<String> inferencingStackVersion;

    /**
     * @return The inferencing stack version added to the image. To avoid adding an inferencing stack, do not set this value. Valid values: &#34;latest&#34;.
     * 
     */
    public Optional<Output<String>> inferencingStackVersion() {
        return Optional.ofNullable(this.inferencingStackVersion);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Settings for a Python environment.
     * 
     */
    @Import(name="python")
    private @Nullable Output<ModelEnvironmentDefinitionPythonArgs> python;

    /**
     * @return Settings for a Python environment.
     * 
     */
    public Optional<Output<ModelEnvironmentDefinitionPythonArgs>> python() {
        return Optional.ofNullable(this.python);
    }

    /**
     * Settings for a R environment.
     * 
     */
    @Import(name="r")
    private @Nullable Output<ModelEnvironmentDefinitionRArgs> r;

    /**
     * @return Settings for a R environment.
     * 
     */
    public Optional<Output<ModelEnvironmentDefinitionRArgs>> r() {
        return Optional.ofNullable(this.r);
    }

    /**
     * The configuration for a Spark environment.
     * 
     */
    @Import(name="spark")
    private @Nullable Output<ModelEnvironmentDefinitionSparkArgs> spark;

    /**
     * @return The configuration for a Spark environment.
     * 
     */
    public Optional<Output<ModelEnvironmentDefinitionSparkArgs>> spark() {
        return Optional.ofNullable(this.spark);
    }

    /**
     * The environment version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The environment version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private EnvironmentImageRequestEnvironmentArgs() {}

    private EnvironmentImageRequestEnvironmentArgs(EnvironmentImageRequestEnvironmentArgs $) {
        this.docker = $.docker;
        this.environmentVariables = $.environmentVariables;
        this.inferencingStackVersion = $.inferencingStackVersion;
        this.name = $.name;
        this.python = $.python;
        this.r = $.r;
        this.spark = $.spark;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentImageRequestEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentImageRequestEnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentImageRequestEnvironmentArgs();
        }

        public Builder(EnvironmentImageRequestEnvironmentArgs defaults) {
            $ = new EnvironmentImageRequestEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param docker The definition of a Docker container.
         * 
         * @return builder
         * 
         */
        public Builder docker(@Nullable Output<ModelEnvironmentDefinitionDockerArgs> docker) {
            $.docker = docker;
            return this;
        }

        /**
         * @param docker The definition of a Docker container.
         * 
         * @return builder
         * 
         */
        public Builder docker(ModelEnvironmentDefinitionDockerArgs docker) {
            return docker(Output.of(docker));
        }

        /**
         * @param environmentVariables Definition of environment variables to be defined in the environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables Definition of environment variables to be defined in the environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param inferencingStackVersion The inferencing stack version added to the image. To avoid adding an inferencing stack, do not set this value. Valid values: &#34;latest&#34;.
         * 
         * @return builder
         * 
         */
        public Builder inferencingStackVersion(@Nullable Output<String> inferencingStackVersion) {
            $.inferencingStackVersion = inferencingStackVersion;
            return this;
        }

        /**
         * @param inferencingStackVersion The inferencing stack version added to the image. To avoid adding an inferencing stack, do not set this value. Valid values: &#34;latest&#34;.
         * 
         * @return builder
         * 
         */
        public Builder inferencingStackVersion(String inferencingStackVersion) {
            return inferencingStackVersion(Output.of(inferencingStackVersion));
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param python Settings for a Python environment.
         * 
         * @return builder
         * 
         */
        public Builder python(@Nullable Output<ModelEnvironmentDefinitionPythonArgs> python) {
            $.python = python;
            return this;
        }

        /**
         * @param python Settings for a Python environment.
         * 
         * @return builder
         * 
         */
        public Builder python(ModelEnvironmentDefinitionPythonArgs python) {
            return python(Output.of(python));
        }

        /**
         * @param r Settings for a R environment.
         * 
         * @return builder
         * 
         */
        public Builder r(@Nullable Output<ModelEnvironmentDefinitionRArgs> r) {
            $.r = r;
            return this;
        }

        /**
         * @param r Settings for a R environment.
         * 
         * @return builder
         * 
         */
        public Builder r(ModelEnvironmentDefinitionRArgs r) {
            return r(Output.of(r));
        }

        /**
         * @param spark The configuration for a Spark environment.
         * 
         * @return builder
         * 
         */
        public Builder spark(@Nullable Output<ModelEnvironmentDefinitionSparkArgs> spark) {
            $.spark = spark;
            return this;
        }

        /**
         * @param spark The configuration for a Spark environment.
         * 
         * @return builder
         * 
         */
        public Builder spark(ModelEnvironmentDefinitionSparkArgs spark) {
            return spark(Output.of(spark));
        }

        /**
         * @param version The environment version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The environment version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public EnvironmentImageRequestEnvironmentArgs build() {
            return $;
        }
    }

}
