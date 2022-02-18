// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.KerberosConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class SecurityConfigResponse {
    /**
     * Optional. Kerberos related configuration.
     * 
     */
    private final KerberosConfigResponse kerberosConfig;

    @OutputCustomType.Constructor({"kerberosConfig"})
    private SecurityConfigResponse(KerberosConfigResponse kerberosConfig) {
        this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
    }

    /**
     * Optional. Kerberos related configuration.
     * 
     */
    public KerberosConfigResponse getKerberosConfig() {
        return this.kerberosConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KerberosConfigResponse kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder setKerberosConfig(KerberosConfigResponse kerberosConfig) {
            this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
            return this;
        }

        public SecurityConfigResponse build() {
            return new SecurityConfigResponse(kerberosConfig);
        }
    }
}
