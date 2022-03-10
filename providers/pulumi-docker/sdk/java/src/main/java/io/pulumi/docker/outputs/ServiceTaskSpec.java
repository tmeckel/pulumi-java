// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpec;
import io.pulumi.docker.outputs.ServiceTaskSpecLogDriver;
import io.pulumi.docker.outputs.ServiceTaskSpecPlacement;
import io.pulumi.docker.outputs.ServiceTaskSpecResources;
import io.pulumi.docker.outputs.ServiceTaskSpecRestartPolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTaskSpec {
    private final ServiceTaskSpecContainerSpec containerSpec;
    private final @Nullable Integer forceUpdate;
    private final @Nullable ServiceTaskSpecLogDriver logDriver;
    private final @Nullable List<String> networks;
    private final @Nullable ServiceTaskSpecPlacement placement;
    private final @Nullable ServiceTaskSpecResources resources;
    private final @Nullable ServiceTaskSpecRestartPolicy restartPolicy;
    private final @Nullable String runtime;

    @OutputCustomType.Constructor
    private ServiceTaskSpec(
        @OutputCustomType.Parameter("containerSpec") ServiceTaskSpecContainerSpec containerSpec,
        @OutputCustomType.Parameter("forceUpdate") @Nullable Integer forceUpdate,
        @OutputCustomType.Parameter("logDriver") @Nullable ServiceTaskSpecLogDriver logDriver,
        @OutputCustomType.Parameter("networks") @Nullable List<String> networks,
        @OutputCustomType.Parameter("placement") @Nullable ServiceTaskSpecPlacement placement,
        @OutputCustomType.Parameter("resources") @Nullable ServiceTaskSpecResources resources,
        @OutputCustomType.Parameter("restartPolicy") @Nullable ServiceTaskSpecRestartPolicy restartPolicy,
        @OutputCustomType.Parameter("runtime") @Nullable String runtime) {
        this.containerSpec = containerSpec;
        this.forceUpdate = forceUpdate;
        this.logDriver = logDriver;
        this.networks = networks;
        this.placement = placement;
        this.resources = resources;
        this.restartPolicy = restartPolicy;
        this.runtime = runtime;
    }

    public ServiceTaskSpecContainerSpec getContainerSpec() {
        return this.containerSpec;
    }
    public Optional<Integer> getForceUpdate() {
        return Optional.ofNullable(this.forceUpdate);
    }
    public Optional<ServiceTaskSpecLogDriver> getLogDriver() {
        return Optional.ofNullable(this.logDriver);
    }
    public List<String> getNetworks() {
        return this.networks == null ? List.of() : this.networks;
    }
    public Optional<ServiceTaskSpecPlacement> getPlacement() {
        return Optional.ofNullable(this.placement);
    }
    public Optional<ServiceTaskSpecResources> getResources() {
        return Optional.ofNullable(this.resources);
    }
    public Optional<ServiceTaskSpecRestartPolicy> getRestartPolicy() {
        return Optional.ofNullable(this.restartPolicy);
    }
    public Optional<String> getRuntime() {
        return Optional.ofNullable(this.runtime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTaskSpecContainerSpec containerSpec;
        private @Nullable Integer forceUpdate;
        private @Nullable ServiceTaskSpecLogDriver logDriver;
        private @Nullable List<String> networks;
        private @Nullable ServiceTaskSpecPlacement placement;
        private @Nullable ServiceTaskSpecResources resources;
        private @Nullable ServiceTaskSpecRestartPolicy restartPolicy;
        private @Nullable String runtime;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerSpec = defaults.containerSpec;
    	      this.forceUpdate = defaults.forceUpdate;
    	      this.logDriver = defaults.logDriver;
    	      this.networks = defaults.networks;
    	      this.placement = defaults.placement;
    	      this.resources = defaults.resources;
    	      this.restartPolicy = defaults.restartPolicy;
    	      this.runtime = defaults.runtime;
        }

        public Builder containerSpec(ServiceTaskSpecContainerSpec containerSpec) {
            this.containerSpec = Objects.requireNonNull(containerSpec);
            return this;
        }

        public Builder forceUpdate(@Nullable Integer forceUpdate) {
            this.forceUpdate = forceUpdate;
            return this;
        }

        public Builder logDriver(@Nullable ServiceTaskSpecLogDriver logDriver) {
            this.logDriver = logDriver;
            return this;
        }

        public Builder networks(@Nullable List<String> networks) {
            this.networks = networks;
            return this;
        }

        public Builder placement(@Nullable ServiceTaskSpecPlacement placement) {
            this.placement = placement;
            return this;
        }

        public Builder resources(@Nullable ServiceTaskSpecResources resources) {
            this.resources = resources;
            return this;
        }

        public Builder restartPolicy(@Nullable ServiceTaskSpecRestartPolicy restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder runtime(@Nullable String runtime) {
            this.runtime = runtime;
            return this;
        }
        public ServiceTaskSpec build() {
            return new ServiceTaskSpec(containerSpec, forceUpdate, logDriver, networks, placement, resources, restartPolicy, runtime);
        }
    }
}
