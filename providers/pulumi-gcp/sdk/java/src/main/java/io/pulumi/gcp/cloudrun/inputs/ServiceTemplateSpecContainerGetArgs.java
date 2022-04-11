// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerPortGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerResourcesGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerVolumeMountGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerGetArgs Empty = new ServiceTemplateSpecContainerGetArgs();

    /**
     * Arguments to the entrypoint.
     * The docker image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Codegen.empty() : this.args;
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The docker image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="commands")
      private final @Nullable Output<List<String>> commands;

    public Output<List<String>> getCommands() {
        return this.commands == null ? Codegen.empty() : this.commands;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * List of sources to populate environment variables in the container.
     * All invalid keys will be reported as an event when the container is starting.
     * When a key exists in multiple sources, the value associated with the last source will
     * take precedence. Values defined by an Env with a duplicate key will take
     * precedence.
     * Structure is documented below.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @Import(name="envFroms")
      private final @Nullable Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>> envFroms;

    @Deprecated /* Not supported by Cloud Run fully managed */
    public Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>> getEnvFroms() {
        return this.envFroms == null ? Codegen.empty() : this.envFroms;
    }

    /**
     * List of environment variables to set in the container.
     * Structure is documented below.
     * 
     */
    @Import(name="envs")
      private final @Nullable Output<List<ServiceTemplateSpecContainerEnvGetArgs>> envs;

    public Output<List<ServiceTemplateSpecContainerEnvGetArgs>> getEnvs() {
        return this.envs == null ? Codegen.empty() : this.envs;
    }

    /**
     * Docker image name. This is most often a reference to a container located
     * in the container registry, such as gcr.io/cloudrun/hello
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> getImage() {
        return this.image;
    }

    /**
     * List of open ports in the container.
     * More Info:
     * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
     * Structure is documented below.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<ServiceTemplateSpecContainerPortGetArgs>> ports;

    public Output<List<ServiceTemplateSpecContainerPortGetArgs>> getPorts() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    /**
     * Compute Resources required by this container. Used to set values such as max memory
     * More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
     * Structure is documented below.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<ServiceTemplateSpecContainerResourcesGetArgs> resources;

    public Output<ServiceTemplateSpecContainerResourcesGetArgs> getResources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    /**
     * Volume to mount into the container's filesystem.
     * Only supports SecretVolumeSources.
     * Structure is documented below.
     * 
     */
    @Import(name="volumeMounts")
      private final @Nullable Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>> volumeMounts;

    public Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Codegen.empty() : this.volumeMounts;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * Container's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @Import(name="workingDir")
      private final @Nullable Output<String> workingDir;

    @Deprecated /* Not supported by Cloud Run fully managed */
    public Output<String> getWorkingDir() {
        return this.workingDir == null ? Codegen.empty() : this.workingDir;
    }

    public ServiceTemplateSpecContainerGetArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> commands,
        @Nullable Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>> envFroms,
        @Nullable Output<List<ServiceTemplateSpecContainerEnvGetArgs>> envs,
        Output<String> image,
        @Nullable Output<List<ServiceTemplateSpecContainerPortGetArgs>> ports,
        @Nullable Output<ServiceTemplateSpecContainerResourcesGetArgs> resources,
        @Nullable Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>> volumeMounts,
        @Nullable Output<String> workingDir) {
        this.args = args;
        this.commands = commands;
        this.envFroms = envFroms;
        this.envs = envs;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.ports = ports;
        this.resources = resources;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    private ServiceTemplateSpecContainerGetArgs() {
        this.args = Codegen.empty();
        this.commands = Codegen.empty();
        this.envFroms = Codegen.empty();
        this.envs = Codegen.empty();
        this.image = Codegen.empty();
        this.ports = Codegen.empty();
        this.resources = Codegen.empty();
        this.volumeMounts = Codegen.empty();
        this.workingDir = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> commands;
        private @Nullable Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>> envFroms;
        private @Nullable Output<List<ServiceTemplateSpecContainerEnvGetArgs>> envs;
        private Output<String> image;
        private @Nullable Output<List<ServiceTemplateSpecContainerPortGetArgs>> ports;
        private @Nullable Output<ServiceTemplateSpecContainerResourcesGetArgs> resources;
        private @Nullable Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>> volumeMounts;
        private @Nullable Output<String> workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.envFroms = defaults.envFroms;
    	      this.envs = defaults.envs;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Codegen.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder commands(@Nullable Output<List<String>> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(@Nullable List<String> commands) {
            this.commands = Codegen.ofNullable(commands);
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder envFroms(@Nullable Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>> envFroms) {
            this.envFroms = envFroms;
            return this;
        }
        public Builder envFroms(@Nullable List<ServiceTemplateSpecContainerEnvFromGetArgs> envFroms) {
            this.envFroms = Codegen.ofNullable(envFroms);
            return this;
        }
        public Builder envFroms(ServiceTemplateSpecContainerEnvFromGetArgs... envFroms) {
            return envFroms(List.of(envFroms));
        }
        public Builder envs(@Nullable Output<List<ServiceTemplateSpecContainerEnvGetArgs>> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(@Nullable List<ServiceTemplateSpecContainerEnvGetArgs> envs) {
            this.envs = Codegen.ofNullable(envs);
            return this;
        }
        public Builder envs(ServiceTemplateSpecContainerEnvGetArgs... envs) {
            return envs(List.of(envs));
        }
        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
            return this;
        }
        public Builder ports(@Nullable Output<List<ServiceTemplateSpecContainerPortGetArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<ServiceTemplateSpecContainerPortGetArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(ServiceTemplateSpecContainerPortGetArgs... ports) {
            return ports(List.of(ports));
        }
        public Builder resources(@Nullable Output<ServiceTemplateSpecContainerResourcesGetArgs> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable ServiceTemplateSpecContainerResourcesGetArgs resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder volumeMounts(@Nullable Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(@Nullable List<ServiceTemplateSpecContainerVolumeMountGetArgs> volumeMounts) {
            this.volumeMounts = Codegen.ofNullable(volumeMounts);
            return this;
        }
        public Builder volumeMounts(ServiceTemplateSpecContainerVolumeMountGetArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public Builder workingDir(@Nullable Output<String> workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = Codegen.ofNullable(workingDir);
            return this;
        }        public ServiceTemplateSpecContainerGetArgs build() {
            return new ServiceTemplateSpecContainerGetArgs(args, commands, envFroms, envs, image, ports, resources, volumeMounts, workingDir);
        }
    }
}
