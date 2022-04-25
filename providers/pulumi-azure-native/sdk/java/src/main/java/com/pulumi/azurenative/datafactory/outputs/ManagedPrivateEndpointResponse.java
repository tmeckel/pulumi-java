// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ConnectionStatePropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedPrivateEndpointResponse {
    /**
     * @return The managed private endpoint connection state
     * 
     */
    private final @Nullable ConnectionStatePropertiesResponse connectionState;
    /**
     * @return Fully qualified domain names
     * 
     */
    private final @Nullable List<String> fqdns;
    /**
     * @return The groupId to which the managed private endpoint is created
     * 
     */
    private final @Nullable String groupId;
    /**
     * @return Denotes whether the managed private endpoint is reserved
     * 
     */
    private final Boolean isReserved;
    /**
     * @return The ARM resource ID of the resource to which the managed private endpoint is created
     * 
     */
    private final @Nullable String privateLinkResourceId;
    /**
     * @return The managed private endpoint provisioning state
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private ManagedPrivateEndpointResponse(
        @CustomType.Parameter("connectionState") @Nullable ConnectionStatePropertiesResponse connectionState,
        @CustomType.Parameter("fqdns") @Nullable List<String> fqdns,
        @CustomType.Parameter("groupId") @Nullable String groupId,
        @CustomType.Parameter("isReserved") Boolean isReserved,
        @CustomType.Parameter("privateLinkResourceId") @Nullable String privateLinkResourceId,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.connectionState = connectionState;
        this.fqdns = fqdns;
        this.groupId = groupId;
        this.isReserved = isReserved;
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = provisioningState;
    }

    /**
     * @return The managed private endpoint connection state
     * 
     */
    public Optional<ConnectionStatePropertiesResponse> connectionState() {
        return Optional.ofNullable(this.connectionState);
    }
    /**
     * @return Fully qualified domain names
     * 
     */
    public List<String> fqdns() {
        return this.fqdns == null ? List.of() : this.fqdns;
    }
    /**
     * @return The groupId to which the managed private endpoint is created
     * 
     */
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * @return Denotes whether the managed private endpoint is reserved
     * 
     */
    public Boolean isReserved() {
        return this.isReserved;
    }
    /**
     * @return The ARM resource ID of the resource to which the managed private endpoint is created
     * 
     */
    public Optional<String> privateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }
    /**
     * @return The managed private endpoint provisioning state
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectionStatePropertiesResponse connectionState;
        private @Nullable List<String> fqdns;
        private @Nullable String groupId;
        private Boolean isReserved;
        private @Nullable String privateLinkResourceId;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionState = defaults.connectionState;
    	      this.fqdns = defaults.fqdns;
    	      this.groupId = defaults.groupId;
    	      this.isReserved = defaults.isReserved;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder connectionState(@Nullable ConnectionStatePropertiesResponse connectionState) {
            this.connectionState = connectionState;
            return this;
        }
        public Builder fqdns(@Nullable List<String> fqdns) {
            this.fqdns = fqdns;
            return this;
        }
        public Builder fqdns(String... fqdns) {
            return fqdns(List.of(fqdns));
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder isReserved(Boolean isReserved) {
            this.isReserved = Objects.requireNonNull(isReserved);
            return this;
        }
        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public ManagedPrivateEndpointResponse build() {
            return new ManagedPrivateEndpointResponse(connectionState, fqdns, groupId, isReserved, privateLinkResourceId, provisioningState);
        }
    }
}
