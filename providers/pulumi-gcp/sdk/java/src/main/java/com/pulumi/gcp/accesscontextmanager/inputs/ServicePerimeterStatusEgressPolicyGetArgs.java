// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromGetArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusEgressPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusEgressPolicyGetArgs Empty = new ServicePerimeterStatusEgressPolicyGetArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
    private @Nullable Output<ServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom;

    /**
     * @return Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterStatusEgressPolicyEgressFromGetArgs>> egressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
    private @Nullable Output<ServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo;

    /**
     * @return Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterStatusEgressPolicyEgressToGetArgs>> egressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    private ServicePerimeterStatusEgressPolicyGetArgs() {}

    private ServicePerimeterStatusEgressPolicyGetArgs(ServicePerimeterStatusEgressPolicyGetArgs $) {
        this.egressFrom = $.egressFrom;
        this.egressTo = $.egressTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterStatusEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterStatusEgressPolicyGetArgs $;

        public Builder() {
            $ = new ServicePerimeterStatusEgressPolicyGetArgs();
        }

        public Builder(ServicePerimeterStatusEgressPolicyGetArgs defaults) {
            $ = new ServicePerimeterStatusEgressPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(@Nullable Output<ServicePerimeterStatusEgressPolicyEgressFromGetArgs> egressFrom) {
            $.egressFrom = egressFrom;
            return this;
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(ServicePerimeterStatusEgressPolicyEgressFromGetArgs egressFrom) {
            return egressFrom(Output.of(egressFrom));
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(@Nullable Output<ServicePerimeterStatusEgressPolicyEgressToGetArgs> egressTo) {
            $.egressTo = egressTo;
            return this;
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(ServicePerimeterStatusEgressPolicyEgressToGetArgs egressTo) {
            return egressTo(Output.of(egressTo));
        }

        public ServicePerimeterStatusEgressPolicyGetArgs build() {
            return $;
        }
    }

}
