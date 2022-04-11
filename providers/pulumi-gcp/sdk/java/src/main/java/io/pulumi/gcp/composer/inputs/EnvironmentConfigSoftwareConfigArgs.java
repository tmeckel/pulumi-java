// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigSoftwareConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigSoftwareConfigArgs Empty = new EnvironmentConfigSoftwareConfigArgs();

    @Import(name="airflowConfigOverrides")
      private final @Nullable Output<Map<String,String>> airflowConfigOverrides;

    public Output<Map<String,String>> getAirflowConfigOverrides() {
        return this.airflowConfigOverrides == null ? Codegen.empty() : this.airflowConfigOverrides;
    }

    @Import(name="envVariables")
      private final @Nullable Output<Map<String,String>> envVariables;

    public Output<Map<String,String>> getEnvVariables() {
        return this.envVariables == null ? Codegen.empty() : this.envVariables;
    }

    @Import(name="imageVersion")
      private final @Nullable Output<String> imageVersion;

    public Output<String> getImageVersion() {
        return this.imageVersion == null ? Codegen.empty() : this.imageVersion;
    }

    @Import(name="pypiPackages")
      private final @Nullable Output<Map<String,String>> pypiPackages;

    public Output<Map<String,String>> getPypiPackages() {
        return this.pypiPackages == null ? Codegen.empty() : this.pypiPackages;
    }

    @Import(name="pythonVersion")
      private final @Nullable Output<String> pythonVersion;

    public Output<String> getPythonVersion() {
        return this.pythonVersion == null ? Codegen.empty() : this.pythonVersion;
    }

    @Import(name="schedulerCount")
      private final @Nullable Output<Integer> schedulerCount;

    public Output<Integer> getSchedulerCount() {
        return this.schedulerCount == null ? Codegen.empty() : this.schedulerCount;
    }

    public EnvironmentConfigSoftwareConfigArgs(
        @Nullable Output<Map<String,String>> airflowConfigOverrides,
        @Nullable Output<Map<String,String>> envVariables,
        @Nullable Output<String> imageVersion,
        @Nullable Output<Map<String,String>> pypiPackages,
        @Nullable Output<String> pythonVersion,
        @Nullable Output<Integer> schedulerCount) {
        this.airflowConfigOverrides = airflowConfigOverrides;
        this.envVariables = envVariables;
        this.imageVersion = imageVersion;
        this.pypiPackages = pypiPackages;
        this.pythonVersion = pythonVersion;
        this.schedulerCount = schedulerCount;
    }

    private EnvironmentConfigSoftwareConfigArgs() {
        this.airflowConfigOverrides = Codegen.empty();
        this.envVariables = Codegen.empty();
        this.imageVersion = Codegen.empty();
        this.pypiPackages = Codegen.empty();
        this.pythonVersion = Codegen.empty();
        this.schedulerCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> airflowConfigOverrides;
        private @Nullable Output<Map<String,String>> envVariables;
        private @Nullable Output<String> imageVersion;
        private @Nullable Output<Map<String,String>> pypiPackages;
        private @Nullable Output<String> pythonVersion;
        private @Nullable Output<Integer> schedulerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigSoftwareConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigOverrides = defaults.airflowConfigOverrides;
    	      this.envVariables = defaults.envVariables;
    	      this.imageVersion = defaults.imageVersion;
    	      this.pypiPackages = defaults.pypiPackages;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.schedulerCount = defaults.schedulerCount;
        }

        public Builder airflowConfigOverrides(@Nullable Output<Map<String,String>> airflowConfigOverrides) {
            this.airflowConfigOverrides = airflowConfigOverrides;
            return this;
        }
        public Builder airflowConfigOverrides(@Nullable Map<String,String> airflowConfigOverrides) {
            this.airflowConfigOverrides = Codegen.ofNullable(airflowConfigOverrides);
            return this;
        }
        public Builder envVariables(@Nullable Output<Map<String,String>> envVariables) {
            this.envVariables = envVariables;
            return this;
        }
        public Builder envVariables(@Nullable Map<String,String> envVariables) {
            this.envVariables = Codegen.ofNullable(envVariables);
            return this;
        }
        public Builder imageVersion(@Nullable Output<String> imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public Builder imageVersion(@Nullable String imageVersion) {
            this.imageVersion = Codegen.ofNullable(imageVersion);
            return this;
        }
        public Builder pypiPackages(@Nullable Output<Map<String,String>> pypiPackages) {
            this.pypiPackages = pypiPackages;
            return this;
        }
        public Builder pypiPackages(@Nullable Map<String,String> pypiPackages) {
            this.pypiPackages = Codegen.ofNullable(pypiPackages);
            return this;
        }
        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public Builder pythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = Codegen.ofNullable(pythonVersion);
            return this;
        }
        public Builder schedulerCount(@Nullable Output<Integer> schedulerCount) {
            this.schedulerCount = schedulerCount;
            return this;
        }
        public Builder schedulerCount(@Nullable Integer schedulerCount) {
            this.schedulerCount = Codegen.ofNullable(schedulerCount);
            return this;
        }        public EnvironmentConfigSoftwareConfigArgs build() {
            return new EnvironmentConfigSoftwareConfigArgs(airflowConfigOverrides, envVariables, imageVersion, pypiPackages, pythonVersion, schedulerCount);
        }
    }
}
