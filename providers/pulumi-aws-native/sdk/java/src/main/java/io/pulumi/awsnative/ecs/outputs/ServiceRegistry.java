// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceRegistry {
    private final @Nullable String containerName;
    private final @Nullable Integer containerPort;
    private final @Nullable Integer port;
    private final @Nullable String registryArn;

    @OutputCustomType.Constructor
    private ServiceRegistry(
        @OutputCustomType.Parameter("containerName") @Nullable String containerName,
        @OutputCustomType.Parameter("containerPort") @Nullable Integer containerPort,
        @OutputCustomType.Parameter("port") @Nullable Integer port,
        @OutputCustomType.Parameter("registryArn") @Nullable String registryArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.port = port;
        this.registryArn = registryArn;
    }

    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    public Optional<Integer> getContainerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> getRegistryArn() {
        return Optional.ofNullable(this.registryArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable Integer containerPort;
        private @Nullable Integer port;
        private @Nullable String registryArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.port = defaults.port;
    	      this.registryArn = defaults.registryArn;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder registryArn(@Nullable String registryArn) {
            this.registryArn = registryArn;
            return this;
        }
        public ServiceRegistry build() {
            return new ServiceRegistry(containerName, containerPort, port, registryArn);
        }
    }
}
