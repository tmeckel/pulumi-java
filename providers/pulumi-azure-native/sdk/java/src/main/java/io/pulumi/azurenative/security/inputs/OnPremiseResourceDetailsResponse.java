// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the On Premise resource that was assessed
 * 
 */
public final class OnPremiseResourceDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnPremiseResourceDetailsResponse Empty = new OnPremiseResourceDetailsResponse();

    /**
     * The name of the machine
     * 
     */
    @InputImport(name="machineName", required=true)
      private final String machineName;

    public String getMachineName() {
        return this.machineName;
    }

    /**
     * The platform where the assessed resource resides
     * Expected value is 'OnPremise'.
     * 
     */
    @InputImport(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    /**
     * The oms agent Id installed on the machine
     * 
     */
    @InputImport(name="sourceComputerId", required=true)
      private final String sourceComputerId;

    public String getSourceComputerId() {
        return this.sourceComputerId;
    }

    /**
     * The unique Id of the machine
     * 
     */
    @InputImport(name="vmuuid", required=true)
      private final String vmuuid;

    public String getVmuuid() {
        return this.vmuuid;
    }

    /**
     * Azure resource Id of the workspace the machine is attached to
     * 
     */
    @InputImport(name="workspaceId", required=true)
      private final String workspaceId;

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OnPremiseResourceDetailsResponse(
        String machineName,
        String source,
        String sourceComputerId,
        String vmuuid,
        String workspaceId) {
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceComputerId = Objects.requireNonNull(sourceComputerId, "expected parameter 'sourceComputerId' to be non-null");
        this.vmuuid = Objects.requireNonNull(vmuuid, "expected parameter 'vmuuid' to be non-null");
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
    }

    private OnPremiseResourceDetailsResponse() {
        this.machineName = null;
        this.source = null;
        this.sourceComputerId = null;
        this.vmuuid = null;
        this.workspaceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremiseResourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineName;
        private String source;
        private String sourceComputerId;
        private String vmuuid;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremiseResourceDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineName = defaults.machineName;
    	      this.source = defaults.source;
    	      this.sourceComputerId = defaults.sourceComputerId;
    	      this.vmuuid = defaults.vmuuid;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder machineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder sourceComputerId(String sourceComputerId) {
            this.sourceComputerId = Objects.requireNonNull(sourceComputerId);
            return this;
        }

        public Builder vmuuid(String vmuuid) {
            this.vmuuid = Objects.requireNonNull(vmuuid);
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        public OnPremiseResourceDetailsResponse build() {
            return new OnPremiseResourceDetailsResponse(machineName, source, sourceComputerId, vmuuid, workspaceId);
        }
    }
}
