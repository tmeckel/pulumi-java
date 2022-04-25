// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TagPropertyResponse {
    /**
     * @return Returns the Object ID of the user who added the tag.
     * 
     */
    private final String objectIdentifier;
    /**
     * @return The tag value.
     * 
     */
    private final String tag;
    /**
     * @return Returns the Tenant ID that issued the token for the user who added the tag.
     * 
     */
    private final String tenantId;
    /**
     * @return Returns the date and time the tag was added.
     * 
     */
    private final String timestamp;
    /**
     * @return Returns the User Principal Name of the user who added the tag.
     * 
     */
    private final String upn;

    @CustomType.Constructor
    private TagPropertyResponse(
        @CustomType.Parameter("objectIdentifier") String objectIdentifier,
        @CustomType.Parameter("tag") String tag,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("timestamp") String timestamp,
        @CustomType.Parameter("upn") String upn) {
        this.objectIdentifier = objectIdentifier;
        this.tag = tag;
        this.tenantId = tenantId;
        this.timestamp = timestamp;
        this.upn = upn;
    }

    /**
     * @return Returns the Object ID of the user who added the tag.
     * 
     */
    public String objectIdentifier() {
        return this.objectIdentifier;
    }
    /**
     * @return The tag value.
     * 
     */
    public String tag() {
        return this.tag;
    }
    /**
     * @return Returns the Tenant ID that issued the token for the user who added the tag.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Returns the date and time the tag was added.
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }
    /**
     * @return Returns the User Principal Name of the user who added the tag.
     * 
     */
    public String upn() {
        return this.upn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectIdentifier;
        private String tag;
        private String tenantId;
        private String timestamp;
        private String upn;

        public Builder() {
    	      // Empty
        }

        public Builder(TagPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdentifier = defaults.objectIdentifier;
    	      this.tag = defaults.tag;
    	      this.tenantId = defaults.tenantId;
    	      this.timestamp = defaults.timestamp;
    	      this.upn = defaults.upn;
        }

        public Builder objectIdentifier(String objectIdentifier) {
            this.objectIdentifier = Objects.requireNonNull(objectIdentifier);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        public Builder upn(String upn) {
            this.upn = Objects.requireNonNull(upn);
            return this;
        }        public TagPropertyResponse build() {
            return new TagPropertyResponse(objectIdentifier, tag, tenantId, timestamp, upn);
        }
    }
}
