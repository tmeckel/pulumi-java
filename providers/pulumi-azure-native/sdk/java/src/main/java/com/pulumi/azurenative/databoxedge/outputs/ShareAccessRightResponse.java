// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ShareAccessRightResponse {
    /**
     * @return Type of access to be allowed on the share for this user.
     * 
     */
    private final String accessType;
    /**
     * @return The share ID.
     * 
     */
    private final String shareId;

    @CustomType.Constructor
    private ShareAccessRightResponse(
        @CustomType.Parameter("accessType") String accessType,
        @CustomType.Parameter("shareId") String shareId) {
        this.accessType = accessType;
        this.shareId = shareId;
    }

    /**
     * @return Type of access to be allowed on the share for this user.
     * 
     */
    public String accessType() {
        return this.accessType;
    }
    /**
     * @return The share ID.
     * 
     */
    public String shareId() {
        return this.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareAccessRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessType;
        private String shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareAccessRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.shareId = defaults.shareId;
        }

        public Builder accessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }
        public Builder shareId(String shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }        public ShareAccessRightResponse build() {
            return new ShareAccessRightResponse(accessType, shareId);
        }
    }
}
