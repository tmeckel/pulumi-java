// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerDeviceArgs Empty = new ContainerDeviceArgs();

    @InputImport(name="containerPath")
      private final @Nullable Input<String> containerPath;

    public Input<String> getContainerPath() {
        return this.containerPath == null ? Input.empty() : this.containerPath;
    }

    @InputImport(name="hostPath", required=true)
      private final Input<String> hostPath;

    public Input<String> getHostPath() {
        return this.hostPath;
    }

    @InputImport(name="permissions")
      private final @Nullable Input<String> permissions;

    public Input<String> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    public ContainerDeviceArgs(
        @Nullable Input<String> containerPath,
        Input<String> hostPath,
        @Nullable Input<String> permissions) {
        this.containerPath = containerPath;
        this.hostPath = Objects.requireNonNull(hostPath, "expected parameter 'hostPath' to be non-null");
        this.permissions = permissions;
    }

    private ContainerDeviceArgs() {
        this.containerPath = Input.empty();
        this.hostPath = Input.empty();
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerPath;
        private Input<String> hostPath;
        private @Nullable Input<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.hostPath = defaults.hostPath;
    	      this.permissions = defaults.permissions;
        }

        public Builder containerPath(@Nullable Input<String> containerPath) {
            this.containerPath = containerPath;
            return this;
        }

        public Builder containerPath(@Nullable String containerPath) {
            this.containerPath = Input.ofNullable(containerPath);
            return this;
        }

        public Builder hostPath(Input<String> hostPath) {
            this.hostPath = Objects.requireNonNull(hostPath);
            return this;
        }

        public Builder hostPath(String hostPath) {
            this.hostPath = Input.of(Objects.requireNonNull(hostPath));
            return this;
        }

        public Builder permissions(@Nullable Input<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable String permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }
        public ContainerDeviceArgs build() {
            return new ContainerDeviceArgs(containerPath, hostPath, permissions);
        }
    }
}
