// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.GalleryImageVersionPublishingProfileResponse;
import com.pulumi.azurenative.compute.outputs.GalleryImageVersionStorageProfileResponse;
import com.pulumi.azurenative.compute.outputs.ReplicationStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGalleryImageVersionResult {
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * @return The publishing profile of a gallery image Version.
     * 
     */
    private final @Nullable GalleryImageVersionPublishingProfileResponse publishingProfile;
    /**
     * @return This is the replication status of the gallery image version.
     * 
     */
    private final ReplicationStatusResponse replicationStatus;
    /**
     * @return This is the storage profile of a Gallery Image Version.
     * 
     */
    private final GalleryImageVersionStorageProfileResponse storageProfile;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGalleryImageVersionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publishingProfile") @Nullable GalleryImageVersionPublishingProfileResponse publishingProfile,
        @CustomType.Parameter("replicationStatus") ReplicationStatusResponse replicationStatus,
        @CustomType.Parameter("storageProfile") GalleryImageVersionStorageProfileResponse storageProfile,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publishingProfile = publishingProfile;
        this.replicationStatus = replicationStatus;
        this.storageProfile = storageProfile;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The publishing profile of a gallery image Version.
     * 
     */
    public Optional<GalleryImageVersionPublishingProfileResponse> publishingProfile() {
        return Optional.ofNullable(this.publishingProfile);
    }
    /**
     * @return This is the replication status of the gallery image version.
     * 
     */
    public ReplicationStatusResponse replicationStatus() {
        return this.replicationStatus;
    }
    /**
     * @return This is the storage profile of a Gallery Image Version.
     * 
     */
    public GalleryImageVersionStorageProfileResponse storageProfile() {
        return this.storageProfile;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryImageVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable GalleryImageVersionPublishingProfileResponse publishingProfile;
        private ReplicationStatusResponse replicationStatus;
        private GalleryImageVersionStorageProfileResponse storageProfile;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryImageVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publishingProfile = defaults.publishingProfile;
    	      this.replicationStatus = defaults.replicationStatus;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
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
        public Builder publishingProfile(@Nullable GalleryImageVersionPublishingProfileResponse publishingProfile) {
            this.publishingProfile = publishingProfile;
            return this;
        }
        public Builder replicationStatus(ReplicationStatusResponse replicationStatus) {
            this.replicationStatus = Objects.requireNonNull(replicationStatus);
            return this;
        }
        public Builder storageProfile(GalleryImageVersionStorageProfileResponse storageProfile) {
            this.storageProfile = Objects.requireNonNull(storageProfile);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGalleryImageVersionResult build() {
            return new GetGalleryImageVersionResult(id, location, name, provisioningState, publishingProfile, replicationStatus, storageProfile, tags, type);
        }
    }
}
