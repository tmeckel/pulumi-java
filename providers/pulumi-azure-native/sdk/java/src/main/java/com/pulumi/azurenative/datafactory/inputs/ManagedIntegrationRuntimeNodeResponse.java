// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ManagedIntegrationRuntimeErrorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of integration runtime node.
 * 
 */
public final class ManagedIntegrationRuntimeNodeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeNodeResponse Empty = new ManagedIntegrationRuntimeNodeResponse();

    /**
     * The errors that occurred on this integration runtime node.
     * 
     */
    @Import(name="errors")
    private @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors;

    /**
     * @return The errors that occurred on this integration runtime node.
     * 
     */
    public Optional<List<ManagedIntegrationRuntimeErrorResponse>> errors() {
        return Optional.ofNullable(this.errors);
    }

    /**
     * The managed integration runtime node id.
     * 
     */
    @Import(name="nodeId", required=true)
    private String nodeId;

    /**
     * @return The managed integration runtime node id.
     * 
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * The managed integration runtime node status.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The managed integration runtime node status.
     * 
     */
    public String status() {
        return this.status;
    }

    private ManagedIntegrationRuntimeNodeResponse() {}

    private ManagedIntegrationRuntimeNodeResponse(ManagedIntegrationRuntimeNodeResponse $) {
        this.errors = $.errors;
        this.nodeId = $.nodeId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedIntegrationRuntimeNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedIntegrationRuntimeNodeResponse $;

        public Builder() {
            $ = new ManagedIntegrationRuntimeNodeResponse();
        }

        public Builder(ManagedIntegrationRuntimeNodeResponse defaults) {
            $ = new ManagedIntegrationRuntimeNodeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param errors The errors that occurred on this integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder errors(@Nullable List<ManagedIntegrationRuntimeErrorResponse> errors) {
            $.errors = errors;
            return this;
        }

        /**
         * @param errors The errors that occurred on this integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder errors(ManagedIntegrationRuntimeErrorResponse... errors) {
            return errors(List.of(errors));
        }

        /**
         * @param nodeId The managed integration runtime node id.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param status The managed integration runtime node status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public ManagedIntegrationRuntimeNodeResponse build() {
            $.nodeId = Objects.requireNonNull($.nodeId, "expected parameter 'nodeId' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
