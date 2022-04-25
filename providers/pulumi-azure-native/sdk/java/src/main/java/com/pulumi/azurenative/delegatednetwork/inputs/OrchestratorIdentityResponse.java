// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.delegatednetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratorIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final OrchestratorIdentityResponse Empty = new OrchestratorIdentityResponse();

    /**
     * The principal id of the system assigned identity which is used by orchestrator.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    /**
     * @return The principal id of the system assigned identity which is used by orchestrator.
     * 
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * The tenant id of the system assigned identity which is used by orchestrator.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    /**
     * @return The tenant id of the system assigned identity which is used by orchestrator.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The type of identity used for orchestrator cluster. Type &#39;SystemAssigned&#39; will use an implicitly created identity orchestrator clusters
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of identity used for orchestrator cluster. Type &#39;SystemAssigned&#39; will use an implicitly created identity orchestrator clusters
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private OrchestratorIdentityResponse() {}

    private OrchestratorIdentityResponse(OrchestratorIdentityResponse $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratorIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratorIdentityResponse $;

        public Builder() {
            $ = new OrchestratorIdentityResponse();
        }

        public Builder(OrchestratorIdentityResponse defaults) {
            $ = new OrchestratorIdentityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The principal id of the system assigned identity which is used by orchestrator.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param tenantId The tenant id of the system assigned identity which is used by orchestrator.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param type The type of identity used for orchestrator cluster. Type &#39;SystemAssigned&#39; will use an implicitly created identity orchestrator clusters
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public OrchestratorIdentityResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
