// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressFromArgs;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Policy for egress from perimeter. EgressPolicies match requests based on `egress_from` and `egress_to` stanzas. For an EgressPolicy to match, both `egress_from` and `egress_to` stanzas must be matched. If an EgressPolicy matches a request, the request is allowed to span the ServicePerimeter boundary. For example, an EgressPolicy can be used to allow VMs on networks within the ServicePerimeter to access a defined set of projects outside the perimeter in certain contexts (e.g. to read data from a Cloud Storage bucket or query against a BigQuery dataset). EgressPolicies are concerned with the *resources* that a request relates as well as the API services and API actions being used. They do not related to the direction of data movement. More detailed documentation for this concept can be found in the descriptions of EgressFrom and EgressTo.
 * 
 */
public final class EgressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EgressPolicyArgs Empty = new EgressPolicyArgs();

    /**
     * Defines conditions on the source of a request causing this EgressPolicy to apply.
     * 
     */
    @InputImport(name="egressFrom")
    private final @Nullable Input<EgressFromArgs> egressFrom;

    public Input<EgressFromArgs> getEgressFrom() {
        return this.egressFrom == null ? Input.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply.
     * 
     */
    @InputImport(name="egressTo")
    private final @Nullable Input<EgressToArgs> egressTo;

    public Input<EgressToArgs> getEgressTo() {
        return this.egressTo == null ? Input.empty() : this.egressTo;
    }

    public EgressPolicyArgs(
        @Nullable Input<EgressFromArgs> egressFrom,
        @Nullable Input<EgressToArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private EgressPolicyArgs() {
        this.egressFrom = Input.empty();
        this.egressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EgressFromArgs> egressFrom;
        private @Nullable Input<EgressToArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(@Nullable Input<EgressFromArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder setEgressFrom(@Nullable EgressFromArgs egressFrom) {
            this.egressFrom = Input.ofNullable(egressFrom);
            return this;
        }

        public Builder setEgressTo(@Nullable Input<EgressToArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder setEgressTo(@Nullable EgressToArgs egressTo) {
            this.egressTo = Input.ofNullable(egressTo);
            return this;
        }

        public EgressPolicyArgs build() {
            return new EgressPolicyArgs(egressFrom, egressTo);
        }
    }
}
