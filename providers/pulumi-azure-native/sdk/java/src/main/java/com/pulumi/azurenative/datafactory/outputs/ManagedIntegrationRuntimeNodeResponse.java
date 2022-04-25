// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ManagedIntegrationRuntimeErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagedIntegrationRuntimeNodeResponse {
    /**
     * @return The errors that occurred on this integration runtime node.
     * 
     */
    private final @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors;
    /**
     * @return The managed integration runtime node id.
     * 
     */
    private final String nodeId;
    /**
     * @return The managed integration runtime node status.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private ManagedIntegrationRuntimeNodeResponse(
        @CustomType.Parameter("errors") @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors,
        @CustomType.Parameter("nodeId") String nodeId,
        @CustomType.Parameter("status") String status) {
        this.errors = errors;
        this.nodeId = nodeId;
        this.status = status;
    }

    /**
     * @return The errors that occurred on this integration runtime node.
     * 
     */
    public List<ManagedIntegrationRuntimeErrorResponse> errors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * @return The managed integration runtime node id.
     * 
     */
    public String nodeId() {
        return this.nodeId;
    }
    /**
     * @return The managed integration runtime node status.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors;
        private String nodeId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.nodeId = defaults.nodeId;
    	      this.status = defaults.status;
        }

        public Builder errors(@Nullable List<ManagedIntegrationRuntimeErrorResponse> errors) {
            this.errors = errors;
            return this;
        }
        public Builder errors(ManagedIntegrationRuntimeErrorResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public ManagedIntegrationRuntimeNodeResponse build() {
            return new ManagedIntegrationRuntimeNodeResponse(errors, nodeId, status);
        }
    }
}
