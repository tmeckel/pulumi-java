// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ErrorDetailResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GuestAgentProfileResponse {
    /**
     * The hybrid machine agent full version.
     * 
     */
    private final String agentVersion;
    /**
     * Details about the error state.
     * 
     */
    private final List<ErrorDetailResponse> errorDetails;
    /**
     * The time of the last status change.
     * 
     */
    private final String lastStatusChange;
    /**
     * The status of the hybrid machine agent.
     * 
     */
    private final String status;
    /**
     * Specifies the VM's unique SMBIOS ID.
     * 
     */
    private final String vmUuid;

    @OutputCustomType.Constructor
    private GuestAgentProfileResponse(
        @OutputCustomType.Parameter("agentVersion") String agentVersion,
        @OutputCustomType.Parameter("errorDetails") List<ErrorDetailResponse> errorDetails,
        @OutputCustomType.Parameter("lastStatusChange") String lastStatusChange,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("vmUuid") String vmUuid) {
        this.agentVersion = agentVersion;
        this.errorDetails = errorDetails;
        this.lastStatusChange = lastStatusChange;
        this.status = status;
        this.vmUuid = vmUuid;
    }

    /**
     * The hybrid machine agent full version.
     * 
    */
    public String getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * Details about the error state.
     * 
    */
    public List<ErrorDetailResponse> getErrorDetails() {
        return this.errorDetails;
    }
    /**
     * The time of the last status change.
     * 
    */
    public String getLastStatusChange() {
        return this.lastStatusChange;
    }
    /**
     * The status of the hybrid machine agent.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Specifies the VM's unique SMBIOS ID.
     * 
    */
    public String getVmUuid() {
        return this.vmUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestAgentProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentVersion;
        private List<ErrorDetailResponse> errorDetails;
        private String lastStatusChange;
        private String status;
        private String vmUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestAgentProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.errorDetails = defaults.errorDetails;
    	      this.lastStatusChange = defaults.lastStatusChange;
    	      this.status = defaults.status;
    	      this.vmUuid = defaults.vmUuid;
        }

        public Builder agentVersion(String agentVersion) {
            this.agentVersion = Objects.requireNonNull(agentVersion);
            return this;
        }

        public Builder errorDetails(List<ErrorDetailResponse> errorDetails) {
            this.errorDetails = Objects.requireNonNull(errorDetails);
            return this;
        }

        public Builder lastStatusChange(String lastStatusChange) {
            this.lastStatusChange = Objects.requireNonNull(lastStatusChange);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder vmUuid(String vmUuid) {
            this.vmUuid = Objects.requireNonNull(vmUuid);
            return this;
        }
        public GuestAgentProfileResponse build() {
            return new GuestAgentProfileResponse(agentVersion, errorDetails, lastStatusChange, status, vmUuid);
        }
    }
}
