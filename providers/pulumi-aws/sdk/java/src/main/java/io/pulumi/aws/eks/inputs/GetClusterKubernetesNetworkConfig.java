// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterKubernetesNetworkConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterKubernetesNetworkConfig Empty = new GetClusterKubernetesNetworkConfig();

    @InputImport(name="ipFamily", required=true)
      private final String ipFamily;

    public String getIpFamily() {
        return this.ipFamily;
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    @InputImport(name="serviceIpv4Cidr", required=true)
      private final String serviceIpv4Cidr;

    public String getServiceIpv4Cidr() {
        return this.serviceIpv4Cidr;
    }

    public GetClusterKubernetesNetworkConfig(
        String ipFamily,
        String serviceIpv4Cidr) {
        this.ipFamily = Objects.requireNonNull(ipFamily, "expected parameter 'ipFamily' to be non-null");
        this.serviceIpv4Cidr = Objects.requireNonNull(serviceIpv4Cidr, "expected parameter 'serviceIpv4Cidr' to be non-null");
    }

    private GetClusterKubernetesNetworkConfig() {
        this.ipFamily = null;
        this.serviceIpv4Cidr = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterKubernetesNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipFamily;
        private String serviceIpv4Cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterKubernetesNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
        }

        public Builder ipFamily(String ipFamily) {
            this.ipFamily = Objects.requireNonNull(ipFamily);
            return this;
        }

        public Builder serviceIpv4Cidr(String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = Objects.requireNonNull(serviceIpv4Cidr);
            return this;
        }
        public GetClusterKubernetesNetworkConfig build() {
            return new GetClusterKubernetesNetworkConfig(ipFamily, serviceIpv4Cidr);
        }
    }
}
