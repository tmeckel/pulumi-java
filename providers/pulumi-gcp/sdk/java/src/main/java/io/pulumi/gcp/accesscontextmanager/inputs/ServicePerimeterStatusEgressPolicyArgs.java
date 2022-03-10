// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusEgressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusEgressPolicyArgs Empty = new ServicePerimeterStatusEgressPolicyArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressFrom")
      private final @Nullable Input<ServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom;

    public Input<ServicePerimeterStatusEgressPolicyEgressFromArgs> getEgressFrom() {
        return this.egressFrom == null ? Input.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressTo")
      private final @Nullable Input<ServicePerimeterStatusEgressPolicyEgressToArgs> egressTo;

    public Input<ServicePerimeterStatusEgressPolicyEgressToArgs> getEgressTo() {
        return this.egressTo == null ? Input.empty() : this.egressTo;
    }

    public ServicePerimeterStatusEgressPolicyArgs(
        @Nullable Input<ServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom,
        @Nullable Input<ServicePerimeterStatusEgressPolicyEgressToArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimeterStatusEgressPolicyArgs() {
        this.egressFrom = Input.empty();
        this.egressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusEgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom;
        private @Nullable Input<ServicePerimeterStatusEgressPolicyEgressToArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusEgressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable Input<ServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder egressFrom(@Nullable ServicePerimeterStatusEgressPolicyEgressFromArgs egressFrom) {
            this.egressFrom = Input.ofNullable(egressFrom);
            return this;
        }

        public Builder egressTo(@Nullable Input<ServicePerimeterStatusEgressPolicyEgressToArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder egressTo(@Nullable ServicePerimeterStatusEgressPolicyEgressToArgs egressTo) {
            this.egressTo = Input.ofNullable(egressTo);
            return this;
        }
        public ServicePerimeterStatusEgressPolicyArgs build() {
            return new ServicePerimeterStatusEgressPolicyArgs(egressFrom, egressTo);
        }
    }
}
