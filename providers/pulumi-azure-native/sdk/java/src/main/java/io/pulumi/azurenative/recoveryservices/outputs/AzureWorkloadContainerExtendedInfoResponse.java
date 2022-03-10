// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DistributedNodesInfoResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InquiryInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureWorkloadContainerExtendedInfoResponse {
    /**
     * Host Os Name in case of Stand Alone and Cluster Name in case of distributed container.
     * 
     */
    private final @Nullable String hostServerName;
    /**
     * Inquiry Status for the container.
     * 
     */
    private final @Nullable InquiryInfoResponse inquiryInfo;
    /**
     * List of the nodes in case of distributed container.
     * 
     */
    private final @Nullable List<DistributedNodesInfoResponse> nodesList;

    @OutputCustomType.Constructor
    private AzureWorkloadContainerExtendedInfoResponse(
        @OutputCustomType.Parameter("hostServerName") @Nullable String hostServerName,
        @OutputCustomType.Parameter("inquiryInfo") @Nullable InquiryInfoResponse inquiryInfo,
        @OutputCustomType.Parameter("nodesList") @Nullable List<DistributedNodesInfoResponse> nodesList) {
        this.hostServerName = hostServerName;
        this.inquiryInfo = inquiryInfo;
        this.nodesList = nodesList;
    }

    /**
     * Host Os Name in case of Stand Alone and Cluster Name in case of distributed container.
     * 
    */
    public Optional<String> getHostServerName() {
        return Optional.ofNullable(this.hostServerName);
    }
    /**
     * Inquiry Status for the container.
     * 
    */
    public Optional<InquiryInfoResponse> getInquiryInfo() {
        return Optional.ofNullable(this.inquiryInfo);
    }
    /**
     * List of the nodes in case of distributed container.
     * 
    */
    public List<DistributedNodesInfoResponse> getNodesList() {
        return this.nodesList == null ? List.of() : this.nodesList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureWorkloadContainerExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostServerName;
        private @Nullable InquiryInfoResponse inquiryInfo;
        private @Nullable List<DistributedNodesInfoResponse> nodesList;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureWorkloadContainerExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostServerName = defaults.hostServerName;
    	      this.inquiryInfo = defaults.inquiryInfo;
    	      this.nodesList = defaults.nodesList;
        }

        public Builder hostServerName(@Nullable String hostServerName) {
            this.hostServerName = hostServerName;
            return this;
        }

        public Builder inquiryInfo(@Nullable InquiryInfoResponse inquiryInfo) {
            this.inquiryInfo = inquiryInfo;
            return this;
        }

        public Builder nodesList(@Nullable List<DistributedNodesInfoResponse> nodesList) {
            this.nodesList = nodesList;
            return this;
        }
        public AzureWorkloadContainerExtendedInfoResponse build() {
            return new AzureWorkloadContainerExtendedInfoResponse(hostServerName, inquiryInfo, nodesList);
        }
    }
}
