// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs Empty = new ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressFrom")
      private final @Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromGetArgs> ingressFrom;

    public Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromGetArgs> getIngressFrom() {
        return this.ingressFrom == null ? Input.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressTo")
      private final @Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs> ingressTo;

    public Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs> getIngressTo() {
        return this.ingressTo == null ? Input.empty() : this.ingressTo;
    }

    public ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs(
        @Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromGetArgs> ingressFrom,
        @Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs() {
        this.ingressFrom = Input.empty();
        this.ingressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromGetArgs> ingressFrom;
        private @Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder ingressFrom(@Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromGetArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder ingressFrom(@Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressFromGetArgs ingressFrom) {
            this.ingressFrom = Input.ofNullable(ingressFrom);
            return this;
        }

        public Builder ingressTo(@Nullable Input<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }

        public Builder ingressTo(@Nullable ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs ingressTo) {
            this.ingressTo = Input.ofNullable(ingressTo);
            return this;
        }
        public ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs build() {
            return new ServicePerimetersServicePerimeterSpecIngressPolicyGetArgs(ingressFrom, ingressTo);
        }
    }
}
