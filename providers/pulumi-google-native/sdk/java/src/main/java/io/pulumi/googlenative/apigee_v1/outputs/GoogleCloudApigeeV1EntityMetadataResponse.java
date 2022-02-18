// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1EntityMetadataResponse {
    /**
     * Time at which the API proxy was created, in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * Time at which the API proxy was most recently modified, in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * The type of entity described
     * 
     */
    private final String subType;

    @OutputCustomType.Constructor({"createdAt","lastModifiedAt","subType"})
    private GoogleCloudApigeeV1EntityMetadataResponse(
        String createdAt,
        String lastModifiedAt,
        String subType) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
        this.subType = Objects.requireNonNull(subType);
    }

    /**
     * Time at which the API proxy was created, in milliseconds since epoch.
     * 
     */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Time at which the API proxy was most recently modified, in milliseconds since epoch.
     * 
     */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * The type of entity described
     * 
     */
    public String getSubType() {
        return this.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1EntityMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String lastModifiedAt;
        private String subType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1EntityMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.subType = defaults.subType;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setSubType(String subType) {
            this.subType = Objects.requireNonNull(subType);
            return this;
        }

        public GoogleCloudApigeeV1EntityMetadataResponse build() {
            return new GoogleCloudApigeeV1EntityMetadataResponse(createdAt, lastModifiedAt, subType);
        }
    }
}
