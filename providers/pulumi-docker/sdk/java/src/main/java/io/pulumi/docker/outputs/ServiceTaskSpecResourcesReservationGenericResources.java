// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTaskSpecResourcesReservationGenericResources {
    private final @Nullable List<String> discreteResourcesSpecs;
    private final @Nullable List<String> namedResourcesSpecs;

    @OutputCustomType.Constructor
    private ServiceTaskSpecResourcesReservationGenericResources(
        @OutputCustomType.Parameter("discreteResourcesSpecs") @Nullable List<String> discreteResourcesSpecs,
        @OutputCustomType.Parameter("namedResourcesSpecs") @Nullable List<String> namedResourcesSpecs) {
        this.discreteResourcesSpecs = discreteResourcesSpecs;
        this.namedResourcesSpecs = namedResourcesSpecs;
    }

    public List<String> getDiscreteResourcesSpecs() {
        return this.discreteResourcesSpecs == null ? List.of() : this.discreteResourcesSpecs;
    }
    public List<String> getNamedResourcesSpecs() {
        return this.namedResourcesSpecs == null ? List.of() : this.namedResourcesSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesReservationGenericResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> discreteResourcesSpecs;
        private @Nullable List<String> namedResourcesSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecResourcesReservationGenericResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discreteResourcesSpecs = defaults.discreteResourcesSpecs;
    	      this.namedResourcesSpecs = defaults.namedResourcesSpecs;
        }

        public Builder discreteResourcesSpecs(@Nullable List<String> discreteResourcesSpecs) {
            this.discreteResourcesSpecs = discreteResourcesSpecs;
            return this;
        }

        public Builder namedResourcesSpecs(@Nullable List<String> namedResourcesSpecs) {
            this.namedResourcesSpecs = namedResourcesSpecs;
            return this;
        }
        public ServiceTaskSpecResourcesReservationGenericResources build() {
            return new ServiceTaskSpecResourcesReservationGenericResources(discreteResourcesSpecs, namedResourcesSpecs);
        }
    }
}
