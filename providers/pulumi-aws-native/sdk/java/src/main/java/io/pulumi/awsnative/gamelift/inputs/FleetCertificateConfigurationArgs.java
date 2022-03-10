// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.enums.FleetCertificateConfigurationCertificateType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Information about the use of a TLS/SSL certificate for a fleet. TLS certificate generation is enabled at the fleet level, with one certificate generated for the fleet. When this feature is enabled, the certificate can be retrieved using the GameLift Server SDK call GetInstanceCertificate. All instances in a fleet share the same certificate.
 * 
 */
public final class FleetCertificateConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetCertificateConfigurationArgs Empty = new FleetCertificateConfigurationArgs();

    @InputImport(name="certificateType", required=true)
      private final Input<FleetCertificateConfigurationCertificateType> certificateType;

    public Input<FleetCertificateConfigurationCertificateType> getCertificateType() {
        return this.certificateType;
    }

    public FleetCertificateConfigurationArgs(Input<FleetCertificateConfigurationCertificateType> certificateType) {
        this.certificateType = Objects.requireNonNull(certificateType, "expected parameter 'certificateType' to be non-null");
    }

    private FleetCertificateConfigurationArgs() {
        this.certificateType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetCertificateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FleetCertificateConfigurationCertificateType> certificateType;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetCertificateConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateType = defaults.certificateType;
        }

        public Builder certificateType(Input<FleetCertificateConfigurationCertificateType> certificateType) {
            this.certificateType = Objects.requireNonNull(certificateType);
            return this;
        }

        public Builder certificateType(FleetCertificateConfigurationCertificateType certificateType) {
            this.certificateType = Input.of(Objects.requireNonNull(certificateType));
            return this;
        }
        public FleetCertificateConfigurationArgs build() {
            return new FleetCertificateConfigurationArgs(certificateType);
        }
    }
}
