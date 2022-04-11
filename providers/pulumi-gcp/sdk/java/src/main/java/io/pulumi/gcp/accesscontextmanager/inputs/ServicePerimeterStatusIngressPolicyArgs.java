// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusIngressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusIngressPolicyArgs Empty = new ServicePerimeterStatusIngressPolicyArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressFrom")
      private final @Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom;

    public Output<ServicePerimeterStatusIngressPolicyIngressFromArgs> getIngressFrom() {
        return this.ingressFrom == null ? Codegen.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressTo")
      private final @Nullable Output<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo;

    public Output<ServicePerimeterStatusIngressPolicyIngressToArgs> getIngressTo() {
        return this.ingressTo == null ? Codegen.empty() : this.ingressTo;
    }

    public ServicePerimeterStatusIngressPolicyArgs(
        @Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom,
        @Nullable Output<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimeterStatusIngressPolicyArgs() {
        this.ingressFrom = Codegen.empty();
        this.ingressTo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom;
        private @Nullable Output<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder ingressFrom(@Nullable Output<ServicePerimeterStatusIngressPolicyIngressFromArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }
        public Builder ingressFrom(@Nullable ServicePerimeterStatusIngressPolicyIngressFromArgs ingressFrom) {
            this.ingressFrom = Codegen.ofNullable(ingressFrom);
            return this;
        }
        public Builder ingressTo(@Nullable Output<ServicePerimeterStatusIngressPolicyIngressToArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }
        public Builder ingressTo(@Nullable ServicePerimeterStatusIngressPolicyIngressToArgs ingressTo) {
            this.ingressTo = Codegen.ofNullable(ingressTo);
            return this;
        }        public ServicePerimeterStatusIngressPolicyArgs build() {
            return new ServicePerimeterStatusIngressPolicyArgs(ingressFrom, ingressTo);
        }
    }
}
