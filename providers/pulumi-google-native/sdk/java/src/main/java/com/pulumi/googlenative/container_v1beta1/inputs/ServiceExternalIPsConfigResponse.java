// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Config to block services with externalIPs field.
 * 
 */
public final class ServiceExternalIPsConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceExternalIPsConfigResponse Empty = new ServiceExternalIPsConfigResponse();

    /**
     * Whether Services with ExternalIPs field are allowed or not.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether Services with ExternalIPs field are allowed or not.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    private ServiceExternalIPsConfigResponse() {}

    private ServiceExternalIPsConfigResponse(ServiceExternalIPsConfigResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExternalIPsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExternalIPsConfigResponse $;

        public Builder() {
            $ = new ServiceExternalIPsConfigResponse();
        }

        public Builder(ServiceExternalIPsConfigResponse defaults) {
            $ = new ServiceExternalIPsConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether Services with ExternalIPs field are allowed or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public ServiceExternalIPsConfigResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
