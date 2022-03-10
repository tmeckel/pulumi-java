// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.ValidationCAArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification of the MTLSPolicy.
 * 
 */
public final class MTLSPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MTLSPolicyArgs Empty = new MTLSPolicyArgs();

    /**
     *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    @InputImport(name="clientValidationCa")
      private final @Nullable Input<List<ValidationCAArgs>> clientValidationCa;

    public Input<List<ValidationCAArgs>> getClientValidationCa() {
        return this.clientValidationCa == null ? Input.empty() : this.clientValidationCa;
    }

    public MTLSPolicyArgs(@Nullable Input<List<ValidationCAArgs>> clientValidationCa) {
        this.clientValidationCa = clientValidationCa;
    }

    private MTLSPolicyArgs() {
        this.clientValidationCa = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MTLSPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ValidationCAArgs>> clientValidationCa;

        public Builder() {
    	      // Empty
        }

        public Builder(MTLSPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientValidationCa = defaults.clientValidationCa;
        }

        public Builder clientValidationCa(@Nullable Input<List<ValidationCAArgs>> clientValidationCa) {
            this.clientValidationCa = clientValidationCa;
            return this;
        }

        public Builder clientValidationCa(@Nullable List<ValidationCAArgs> clientValidationCa) {
            this.clientValidationCa = Input.ofNullable(clientValidationCa);
            return this;
        }
        public MTLSPolicyArgs build() {
            return new MTLSPolicyArgs(clientValidationCa);
        }
    }
}
