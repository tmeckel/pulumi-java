// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The version of the SDK used to run the job.
 * 
 */
public final class SdkVersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final SdkVersionResponse Empty = new SdkVersionResponse();

    /**
     * The support status for this SDK version.
     * 
     */
    @Import(name="sdkSupportStatus", required=true)
    private String sdkSupportStatus;

    /**
     * @return The support status for this SDK version.
     * 
     */
    public String sdkSupportStatus() {
        return this.sdkSupportStatus;
    }

    /**
     * The version of the SDK used to run the job.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The version of the SDK used to run the job.
     * 
     */
    public String version() {
        return this.version;
    }

    /**
     * A readable string describing the version of the SDK.
     * 
     */
    @Import(name="versionDisplayName", required=true)
    private String versionDisplayName;

    /**
     * @return A readable string describing the version of the SDK.
     * 
     */
    public String versionDisplayName() {
        return this.versionDisplayName;
    }

    private SdkVersionResponse() {}

    private SdkVersionResponse(SdkVersionResponse $) {
        this.sdkSupportStatus = $.sdkSupportStatus;
        this.version = $.version;
        this.versionDisplayName = $.versionDisplayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SdkVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SdkVersionResponse $;

        public Builder() {
            $ = new SdkVersionResponse();
        }

        public Builder(SdkVersionResponse defaults) {
            $ = new SdkVersionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param sdkSupportStatus The support status for this SDK version.
         * 
         * @return builder
         * 
         */
        public Builder sdkSupportStatus(String sdkSupportStatus) {
            $.sdkSupportStatus = sdkSupportStatus;
            return this;
        }

        /**
         * @param version The version of the SDK used to run the job.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        /**
         * @param versionDisplayName A readable string describing the version of the SDK.
         * 
         * @return builder
         * 
         */
        public Builder versionDisplayName(String versionDisplayName) {
            $.versionDisplayName = versionDisplayName;
            return this;
        }

        public SdkVersionResponse build() {
            $.sdkSupportStatus = Objects.requireNonNull($.sdkSupportStatus, "expected parameter 'sdkSupportStatus' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            $.versionDisplayName = Objects.requireNonNull($.versionDisplayName, "expected parameter 'versionDisplayName' to be non-null");
            return $;
        }
    }

}
