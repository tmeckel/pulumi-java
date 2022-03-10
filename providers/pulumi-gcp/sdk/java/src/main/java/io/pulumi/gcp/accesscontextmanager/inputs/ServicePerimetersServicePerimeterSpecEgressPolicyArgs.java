// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecEgressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecEgressPolicyArgs Empty = new ServicePerimetersServicePerimeterSpecEgressPolicyArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressFrom")
      private final @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom;

    public Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs> getEgressFrom() {
        return this.egressFrom == null ? Input.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressTo")
      private final @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs> egressTo;

    public Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs> getEgressTo() {
        return this.egressTo == null ? Input.empty() : this.egressTo;
    }

    public ServicePerimetersServicePerimeterSpecEgressPolicyArgs(
        @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom,
        @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimetersServicePerimeterSpecEgressPolicyArgs() {
        this.egressFrom = Input.empty();
        this.egressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecEgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom;
        private @Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecEgressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder egressFrom(@Nullable ServicePerimetersServicePerimeterSpecEgressPolicyEgressFromArgs egressFrom) {
            this.egressFrom = Input.ofNullable(egressFrom);
            return this;
        }

        public Builder egressTo(@Nullable Input<ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder egressTo(@Nullable ServicePerimetersServicePerimeterSpecEgressPolicyEgressToArgs egressTo) {
            this.egressTo = Input.ofNullable(egressTo);
            return this;
        }
        public ServicePerimetersServicePerimeterSpecEgressPolicyArgs build() {
            return new ServicePerimetersServicePerimeterSpecEgressPolicyArgs(egressFrom, egressTo);
        }
    }
}
