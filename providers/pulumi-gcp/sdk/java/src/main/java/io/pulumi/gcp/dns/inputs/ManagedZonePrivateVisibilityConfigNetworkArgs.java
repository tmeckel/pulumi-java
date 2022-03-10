// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePrivateVisibilityConfigNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePrivateVisibilityConfigNetworkArgs Empty = new ManagedZonePrivateVisibilityConfigNetworkArgs();

    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    @InputImport(name="networkUrl", required=true)
      private final Input<String> networkUrl;

    public Input<String> getNetworkUrl() {
        return this.networkUrl;
    }

    public ManagedZonePrivateVisibilityConfigNetworkArgs(Input<String> networkUrl) {
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private ManagedZonePrivateVisibilityConfigNetworkArgs() {
        this.networkUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder networkUrl(Input<String> networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }

        public Builder networkUrl(String networkUrl) {
            this.networkUrl = Input.of(Objects.requireNonNull(networkUrl));
            return this;
        }
        public ManagedZonePrivateVisibilityConfigNetworkArgs build() {
            return new ManagedZonePrivateVisibilityConfigNetworkArgs(networkUrl);
        }
    }
}
