// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AwsClusterNetworking {
    /**
     * @return Required. All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    private final List<String> podAddressCidrBlocks;
    /**
     * @return Required. All services in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    private final List<String> serviceAddressCidrBlocks;
    /**
     * @return Required. The VPC associated with the cluster. All component clusters (i.e. control plane and node pools) run on a single VPC. This field cannot be changed after creation.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private AwsClusterNetworking(
        @CustomType.Parameter("podAddressCidrBlocks") List<String> podAddressCidrBlocks,
        @CustomType.Parameter("serviceAddressCidrBlocks") List<String> serviceAddressCidrBlocks,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.podAddressCidrBlocks = podAddressCidrBlocks;
        this.serviceAddressCidrBlocks = serviceAddressCidrBlocks;
        this.vpcId = vpcId;
    }

    /**
     * @return Required. All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    public List<String> podAddressCidrBlocks() {
        return this.podAddressCidrBlocks;
    }
    /**
     * @return Required. All services in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    public List<String> serviceAddressCidrBlocks() {
        return this.serviceAddressCidrBlocks;
    }
    /**
     * @return Required. The VPC associated with the cluster. All component clusters (i.e. control plane and node pools) run on a single VPC. This field cannot be changed after creation.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterNetworking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> podAddressCidrBlocks;
        private List<String> serviceAddressCidrBlocks;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podAddressCidrBlocks = defaults.podAddressCidrBlocks;
    	      this.serviceAddressCidrBlocks = defaults.serviceAddressCidrBlocks;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder podAddressCidrBlocks(List<String> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks);
            return this;
        }
        public Builder podAddressCidrBlocks(String... podAddressCidrBlocks) {
            return podAddressCidrBlocks(List.of(podAddressCidrBlocks));
        }
        public Builder serviceAddressCidrBlocks(List<String> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks);
            return this;
        }
        public Builder serviceAddressCidrBlocks(String... serviceAddressCidrBlocks) {
            return serviceAddressCidrBlocks(List.of(serviceAddressCidrBlocks));
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public AwsClusterNetworking build() {
            return new AwsClusterNetworking(podAddressCidrBlocks, serviceAddressCidrBlocks, vpcId);
        }
    }
}
