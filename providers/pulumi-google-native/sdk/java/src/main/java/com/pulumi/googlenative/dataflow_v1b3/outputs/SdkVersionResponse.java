// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SdkVersionResponse {
    /**
     * @return The support status for this SDK version.
     * 
     */
    private final String sdkSupportStatus;
    /**
     * @return The version of the SDK used to run the job.
     * 
     */
    private final String version;
    /**
     * @return A readable string describing the version of the SDK.
     * 
     */
    private final String versionDisplayName;

    @CustomType.Constructor
    private SdkVersionResponse(
        @CustomType.Parameter("sdkSupportStatus") String sdkSupportStatus,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versionDisplayName") String versionDisplayName) {
        this.sdkSupportStatus = sdkSupportStatus;
        this.version = version;
        this.versionDisplayName = versionDisplayName;
    }

    /**
     * @return The support status for this SDK version.
     * 
     */
    public String sdkSupportStatus() {
        return this.sdkSupportStatus;
    }
    /**
     * @return The version of the SDK used to run the job.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return A readable string describing the version of the SDK.
     * 
     */
    public String versionDisplayName() {
        return this.versionDisplayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SdkVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sdkSupportStatus;
        private String version;
        private String versionDisplayName;

        public Builder() {
    	      // Empty
        }

        public Builder(SdkVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sdkSupportStatus = defaults.sdkSupportStatus;
    	      this.version = defaults.version;
    	      this.versionDisplayName = defaults.versionDisplayName;
        }

        public Builder sdkSupportStatus(String sdkSupportStatus) {
            this.sdkSupportStatus = Objects.requireNonNull(sdkSupportStatus);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versionDisplayName(String versionDisplayName) {
            this.versionDisplayName = Objects.requireNonNull(versionDisplayName);
            return this;
        }        public SdkVersionResponse build() {
            return new SdkVersionResponse(sdkSupportStatus, version, versionDisplayName);
        }
    }
}
