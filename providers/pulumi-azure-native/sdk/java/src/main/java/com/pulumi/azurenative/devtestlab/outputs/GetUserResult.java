// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.outputs;

import com.pulumi.azurenative.devtestlab.outputs.UserIdentityResponse;
import com.pulumi.azurenative.devtestlab.outputs.UserSecretStoreResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * @return The creation date of the user profile.
     * 
     */
    private final String createdDate;
    /**
     * @return The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * @return The identity of the user.
     * 
     */
    private final @Nullable UserIdentityResponse identity;
    /**
     * @return The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The secret store of the user.
     * 
     */
    private final @Nullable UserSecretStoreResponse secretStore;
    /**
     * @return The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;
    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable UserIdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("secretStore") @Nullable UserSecretStoreResponse secretStore,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueIdentifier") String uniqueIdentifier) {
        this.createdDate = createdDate;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.secretStore = secretStore;
        this.tags = tags;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * @return The creation date of the user profile.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return The identifier of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the user.
     * 
     */
    public Optional<UserIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The location of the resource.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning status of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The secret store of the user.
     * 
     */
    public Optional<UserSecretStoreResponse> secretStore() {
        return Optional.ofNullable(this.secretStore);
    }
    /**
     * @return The tags of the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private String id;
        private @Nullable UserIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable UserSecretStoreResponse secretStore;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.secretStore = defaults.secretStore;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable UserIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder secretStore(@Nullable UserSecretStoreResponse secretStore) {
            this.secretStore = secretStore;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(createdDate, id, identity, location, name, provisioningState, secretStore, tags, type, uniqueIdentifier);
        }
    }
}
