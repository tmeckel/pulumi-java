// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.ContainerPortArgs;
import io.pulumi.googlenative.run_v1.inputs.EnvFromSourceArgs;
import io.pulumi.googlenative.run_v1.inputs.EnvVarArgs;
import io.pulumi.googlenative.run_v1.inputs.ProbeArgs;
import io.pulumi.googlenative.run_v1.inputs.ResourceRequirementsArgs;
import io.pulumi.googlenative.run_v1.inputs.SecurityContextArgs;
import io.pulumi.googlenative.run_v1.inputs.VolumeMountArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single application container. This specifies both the container to run, the command to run in the container and the arguments to supply to it. Note that additional arguments may be supplied by the system to the container at runtime.
 * 
 */
public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * (Optional) Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @InputImport(name="args")
    private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    @InputImport(name="command")
    private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    /**
     * (Optional) List of environment variables to set in the container.
     * 
     */
    @InputImport(name="env")
    private final @Nullable Input<List<EnvVarArgs>> env;

    public Input<List<EnvVarArgs>> getEnv() {
        return this.env == null ? Input.empty() : this.env;
    }

    /**
     * (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @InputImport(name="envFrom")
    private final @Nullable Input<List<EnvFromSourceArgs>> envFrom;

    public Input<List<EnvFromSourceArgs>> getEnvFrom() {
        return this.envFrom == null ? Input.empty() : this.envFrom;
    }

    /**
     * Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @InputImport(name="image")
    private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    @InputImport(name="imagePullPolicy")
    private final @Nullable Input<String> imagePullPolicy;

    public Input<String> getImagePullPolicy() {
        return this.imagePullPolicy == null ? Input.empty() : this.imagePullPolicy;
    }

    /**
     * (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="livenessProbe")
    private final @Nullable Input<ProbeArgs> livenessProbe;

    public Input<ProbeArgs> getLivenessProbe() {
        return this.livenessProbe == null ? Input.empty() : this.livenessProbe;
    }

    /**
     * (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    @InputImport(name="ports")
    private final @Nullable Input<List<ContainerPortArgs>> ports;

    public Input<List<ContainerPortArgs>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    /**
     * (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="readinessProbe")
    private final @Nullable Input<ProbeArgs> readinessProbe;

    public Input<ProbeArgs> getReadinessProbe() {
        return this.readinessProbe == null ? Input.empty() : this.readinessProbe;
    }

    /**
     * (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    @InputImport(name="resources")
    private final @Nullable Input<ResourceRequirementsArgs> resources;

    public Input<ResourceRequirementsArgs> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    /**
     * (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @InputImport(name="securityContext")
    private final @Nullable Input<SecurityContextArgs> securityContext;

    public Input<SecurityContextArgs> getSecurityContext() {
        return this.securityContext == null ? Input.empty() : this.securityContext;
    }

    /**
     * (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @InputImport(name="startupProbe")
    private final @Nullable Input<ProbeArgs> startupProbe;

    public Input<ProbeArgs> getStartupProbe() {
        return this.startupProbe == null ? Input.empty() : this.startupProbe;
    }

    /**
     * (Optional) Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
     */
    @InputImport(name="terminationMessagePath")
    private final @Nullable Input<String> terminationMessagePath;

    public Input<String> getTerminationMessagePath() {
        return this.terminationMessagePath == null ? Input.empty() : this.terminationMessagePath;
    }

    /**
     * (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    @InputImport(name="terminationMessagePolicy")
    private final @Nullable Input<String> terminationMessagePolicy;

    public Input<String> getTerminationMessagePolicy() {
        return this.terminationMessagePolicy == null ? Input.empty() : this.terminationMessagePolicy;
    }

    /**
     * (Optional) Volume to mount into the container's filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container's filesystem.
     * 
     */
    @InputImport(name="volumeMounts")
    private final @Nullable Input<List<VolumeMountArgs>> volumeMounts;

    public Input<List<VolumeMountArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Input.empty() : this.volumeMounts;
    }

    /**
     * (Optional) Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image.
     * 
     */
    @InputImport(name="workingDir")
    private final @Nullable Input<String> workingDir;

    public Input<String> getWorkingDir() {
        return this.workingDir == null ? Input.empty() : this.workingDir;
    }

    public ContainerArgs(
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> command,
        @Nullable Input<List<EnvVarArgs>> env,
        @Nullable Input<List<EnvFromSourceArgs>> envFrom,
        @Nullable Input<String> image,
        @Nullable Input<String> imagePullPolicy,
        @Nullable Input<ProbeArgs> livenessProbe,
        @Nullable Input<String> name,
        @Nullable Input<List<ContainerPortArgs>> ports,
        @Nullable Input<ProbeArgs> readinessProbe,
        @Nullable Input<ResourceRequirementsArgs> resources,
        @Nullable Input<SecurityContextArgs> securityContext,
        @Nullable Input<ProbeArgs> startupProbe,
        @Nullable Input<String> terminationMessagePath,
        @Nullable Input<String> terminationMessagePolicy,
        @Nullable Input<List<VolumeMountArgs>> volumeMounts,
        @Nullable Input<String> workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    private ContainerArgs() {
        this.args = Input.empty();
        this.command = Input.empty();
        this.env = Input.empty();
        this.envFrom = Input.empty();
        this.image = Input.empty();
        this.imagePullPolicy = Input.empty();
        this.livenessProbe = Input.empty();
        this.name = Input.empty();
        this.ports = Input.empty();
        this.readinessProbe = Input.empty();
        this.resources = Input.empty();
        this.securityContext = Input.empty();
        this.startupProbe = Input.empty();
        this.terminationMessagePath = Input.empty();
        this.terminationMessagePolicy = Input.empty();
        this.volumeMounts = Input.empty();
        this.workingDir = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> command;
        private @Nullable Input<List<EnvVarArgs>> env;
        private @Nullable Input<List<EnvFromSourceArgs>> envFrom;
        private @Nullable Input<String> image;
        private @Nullable Input<String> imagePullPolicy;
        private @Nullable Input<ProbeArgs> livenessProbe;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ContainerPortArgs>> ports;
        private @Nullable Input<ProbeArgs> readinessProbe;
        private @Nullable Input<ResourceRequirementsArgs> resources;
        private @Nullable Input<SecurityContextArgs> securityContext;
        private @Nullable Input<ProbeArgs> startupProbe;
        private @Nullable Input<String> terminationMessagePath;
        private @Nullable Input<String> terminationMessagePolicy;
        private @Nullable Input<List<VolumeMountArgs>> volumeMounts;
        private @Nullable Input<String> workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setCommand(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public Builder setEnv(@Nullable Input<List<EnvVarArgs>> env) {
            this.env = env;
            return this;
        }

        public Builder setEnv(@Nullable List<EnvVarArgs> env) {
            this.env = Input.ofNullable(env);
            return this;
        }

        public Builder setEnvFrom(@Nullable Input<List<EnvFromSourceArgs>> envFrom) {
            this.envFrom = envFrom;
            return this;
        }

        public Builder setEnvFrom(@Nullable List<EnvFromSourceArgs> envFrom) {
            this.envFrom = Input.ofNullable(envFrom);
            return this;
        }

        public Builder setImage(@Nullable Input<String> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder setImagePullPolicy(@Nullable Input<String> imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }

        public Builder setImagePullPolicy(@Nullable String imagePullPolicy) {
            this.imagePullPolicy = Input.ofNullable(imagePullPolicy);
            return this;
        }

        public Builder setLivenessProbe(@Nullable Input<ProbeArgs> livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        public Builder setLivenessProbe(@Nullable ProbeArgs livenessProbe) {
            this.livenessProbe = Input.ofNullable(livenessProbe);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<ContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<ContainerPortArgs> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder setReadinessProbe(@Nullable Input<ProbeArgs> readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        public Builder setReadinessProbe(@Nullable ProbeArgs readinessProbe) {
            this.readinessProbe = Input.ofNullable(readinessProbe);
            return this;
        }

        public Builder setResources(@Nullable Input<ResourceRequirementsArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable ResourceRequirementsArgs resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder setSecurityContext(@Nullable Input<SecurityContextArgs> securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        public Builder setSecurityContext(@Nullable SecurityContextArgs securityContext) {
            this.securityContext = Input.ofNullable(securityContext);
            return this;
        }

        public Builder setStartupProbe(@Nullable Input<ProbeArgs> startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }

        public Builder setStartupProbe(@Nullable ProbeArgs startupProbe) {
            this.startupProbe = Input.ofNullable(startupProbe);
            return this;
        }

        public Builder setTerminationMessagePath(@Nullable Input<String> terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }

        public Builder setTerminationMessagePath(@Nullable String terminationMessagePath) {
            this.terminationMessagePath = Input.ofNullable(terminationMessagePath);
            return this;
        }

        public Builder setTerminationMessagePolicy(@Nullable Input<String> terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }

        public Builder setTerminationMessagePolicy(@Nullable String terminationMessagePolicy) {
            this.terminationMessagePolicy = Input.ofNullable(terminationMessagePolicy);
            return this;
        }

        public Builder setVolumeMounts(@Nullable Input<List<VolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder setVolumeMounts(@Nullable List<VolumeMountArgs> volumeMounts) {
            this.volumeMounts = Input.ofNullable(volumeMounts);
            return this;
        }

        public Builder setWorkingDir(@Nullable Input<String> workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        public Builder setWorkingDir(@Nullable String workingDir) {
            this.workingDir = Input.ofNullable(workingDir);
            return this;
        }

        public ContainerArgs build() {
            return new ContainerArgs(args, command, env, envFrom, image, imagePullPolicy, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, terminationMessagePath, terminationMessagePolicy, volumeMounts, workingDir);
        }
    }
}
