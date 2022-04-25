// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ContainerResourcesResponse;
import com.pulumi.azurenative.web.outputs.EnvironmentVarResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerResponse {
    /**
     * @return Container start command arguments.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * @return Container start command.
     * 
     */
    private final @Nullable List<String> command;
    /**
     * @return Container environment variables.
     * 
     */
    private final @Nullable List<EnvironmentVarResponse> env;
    /**
     * @return Container image tag.
     * 
     */
    private final @Nullable String image;
    /**
     * @return Custom container name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Container resource requirements.
     * 
     */
    private final @Nullable ContainerResourcesResponse resources;

    @CustomType.Constructor
    private ContainerResponse(
        @CustomType.Parameter("args") @Nullable List<String> args,
        @CustomType.Parameter("command") @Nullable List<String> command,
        @CustomType.Parameter("env") @Nullable List<EnvironmentVarResponse> env,
        @CustomType.Parameter("image") @Nullable String image,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("resources") @Nullable ContainerResourcesResponse resources) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.image = image;
        this.name = name;
        this.resources = resources;
    }

    /**
     * @return Container start command arguments.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return Container start command.
     * 
     */
    public List<String> command() {
        return this.command == null ? List.of() : this.command;
    }
    /**
     * @return Container environment variables.
     * 
     */
    public List<EnvironmentVarResponse> env() {
        return this.env == null ? List.of() : this.env;
    }
    /**
     * @return Container image tag.
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return Custom container name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Container resource requirements.
     * 
     */
    public Optional<ContainerResourcesResponse> resources() {
        return Optional.ofNullable(this.resources);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> command;
        private @Nullable List<EnvironmentVarResponse> env;
        private @Nullable String image;
        private @Nullable String name;
        private @Nullable ContainerResourcesResponse resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.resources = defaults.resources;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder command(@Nullable List<String> command) {
            this.command = command;
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder env(@Nullable List<EnvironmentVarResponse> env) {
            this.env = env;
            return this;
        }
        public Builder env(EnvironmentVarResponse... env) {
            return env(List.of(env));
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder resources(@Nullable ContainerResourcesResponse resources) {
            this.resources = resources;
            return this;
        }        public ContainerResponse build() {
            return new ContainerResponse(args, command, env, image, name, resources);
        }
    }
}
