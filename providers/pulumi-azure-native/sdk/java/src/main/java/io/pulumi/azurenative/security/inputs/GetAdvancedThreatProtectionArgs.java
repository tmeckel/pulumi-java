// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAdvancedThreatProtectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAdvancedThreatProtectionArgs Empty = new GetAdvancedThreatProtectionArgs();

    /**
     * The identifier of the resource.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Advanced Threat Protection setting name.
     * 
     */
    @InputImport(name="settingName", required=true)
      private final String settingName;

    public String getSettingName() {
        return this.settingName;
    }

    public GetAdvancedThreatProtectionArgs(
        String resourceId,
        String settingName) {
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.settingName = Objects.requireNonNull(settingName, "expected parameter 'settingName' to be non-null");
    }

    private GetAdvancedThreatProtectionArgs() {
        this.resourceId = null;
        this.settingName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedThreatProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceId;
        private String settingName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAdvancedThreatProtectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.settingName = defaults.settingName;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder settingName(String settingName) {
            this.settingName = Objects.requireNonNull(settingName);
            return this;
        }
        public GetAdvancedThreatProtectionArgs build() {
            return new GetAdvancedThreatProtectionArgs(resourceId, settingName);
        }
    }
}
