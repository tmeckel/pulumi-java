// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceNetworkSettingsNetworkSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkSettingsNetworkSettingsGetArgs Empty = new ServiceNetworkSettingsNetworkSettingsGetArgs();

    /**
     * The ingress settings for version or service.
     * Default value is `INGRESS_TRAFFIC_ALLOWED_UNSPECIFIED`.
     * Possible values are `INGRESS_TRAFFIC_ALLOWED_UNSPECIFIED`, `INGRESS_TRAFFIC_ALLOWED_ALL`, `INGRESS_TRAFFIC_ALLOWED_INTERNAL_ONLY`, and `INGRESS_TRAFFIC_ALLOWED_INTERNAL_AND_LB`.
     * 
     */
    @InputImport(name="ingressTrafficAllowed")
      private final @Nullable Input<String> ingressTrafficAllowed;

    public Input<String> getIngressTrafficAllowed() {
        return this.ingressTrafficAllowed == null ? Input.empty() : this.ingressTrafficAllowed;
    }

    public ServiceNetworkSettingsNetworkSettingsGetArgs(@Nullable Input<String> ingressTrafficAllowed) {
        this.ingressTrafficAllowed = ingressTrafficAllowed;
    }

    private ServiceNetworkSettingsNetworkSettingsGetArgs() {
        this.ingressTrafficAllowed = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceNetworkSettingsNetworkSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ingressTrafficAllowed;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceNetworkSettingsNetworkSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressTrafficAllowed = defaults.ingressTrafficAllowed;
        }

        public Builder ingressTrafficAllowed(@Nullable Input<String> ingressTrafficAllowed) {
            this.ingressTrafficAllowed = ingressTrafficAllowed;
            return this;
        }

        public Builder ingressTrafficAllowed(@Nullable String ingressTrafficAllowed) {
            this.ingressTrafficAllowed = Input.ofNullable(ingressTrafficAllowed);
            return this;
        }
        public ServiceNetworkSettingsNetworkSettingsGetArgs build() {
            return new ServiceNetworkSettingsNetworkSettingsGetArgs(ingressTrafficAllowed);
        }
    }
}
