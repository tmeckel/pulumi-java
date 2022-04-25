// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A site for the channel
 * 
 */
public final class SiteResponse extends com.pulumi.resources.InvokeArgs {

    public static final SiteResponse Empty = new SiteResponse();

    /**
     * Entity Tag
     * 
     */
    @Import(name="eTag")
    private @Nullable String eTag;

    /**
     * @return Entity Tag
     * 
     */
    public Optional<String> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * Whether this site is enabled for block user upload.
     * 
     */
    @Import(name="isBlockUserUploadEnabled")
    private @Nullable Boolean isBlockUserUploadEnabled;

    /**
     * @return Whether this site is enabled for block user upload.
     * 
     */
    public Optional<Boolean> isBlockUserUploadEnabled() {
        return Optional.ofNullable(this.isBlockUserUploadEnabled);
    }

    /**
     * Whether this site is enabled for DirectLine channel.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Boolean isEnabled;

    /**
     * @return Whether this site is enabled for DirectLine channel.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this site is enabled for authentication with Bot Framework.
     * 
     */
    @Import(name="isSecureSiteEnabled")
    private @Nullable Boolean isSecureSiteEnabled;

    /**
     * @return Whether this site is enabled for authentication with Bot Framework.
     * 
     */
    public Optional<Boolean> isSecureSiteEnabled() {
        return Optional.ofNullable(this.isSecureSiteEnabled);
    }

    /**
     * Whether this site is token enabled for channel
     * 
     */
    @Import(name="isTokenEnabled")
    private @Nullable Boolean isTokenEnabled;

    /**
     * @return Whether this site is token enabled for channel
     * 
     */
    public Optional<Boolean> isTokenEnabled() {
        return Optional.ofNullable(this.isTokenEnabled);
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @Import(name="isV1Enabled", required=true)
    private Boolean isV1Enabled;

    /**
     * @return Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    public Boolean isV1Enabled() {
        return this.isV1Enabled;
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @Import(name="isV3Enabled", required=true)
    private Boolean isV3Enabled;

    /**
     * @return Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    public Boolean isV3Enabled() {
        return this.isV3Enabled;
    }

    /**
     * Whether this site is enabled for preview versions of Webchat
     * 
     */
    @Import(name="isWebchatPreviewEnabled", required=true)
    private Boolean isWebchatPreviewEnabled;

    /**
     * @return Whether this site is enabled for preview versions of Webchat
     * 
     */
    public Boolean isWebchatPreviewEnabled() {
        return this.isWebchatPreviewEnabled;
    }

    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key2", required=true)
    private String key2;

    /**
     * @return Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public String key2() {
        return this.key2;
    }

    /**
     * Site Id
     * 
     */
    @Import(name="siteId", required=true)
    private String siteId;

    /**
     * @return Site Id
     * 
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Site name
     * 
     */
    @Import(name="siteName", required=true)
    private String siteName;

    /**
     * @return Site name
     * 
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
     * 
     */
    @Import(name="trustedOrigins")
    private @Nullable List<String> trustedOrigins;

    /**
     * @return List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
     * 
     */
    public Optional<List<String>> trustedOrigins() {
        return Optional.ofNullable(this.trustedOrigins);
    }

    private SiteResponse() {}

    private SiteResponse(SiteResponse $) {
        this.eTag = $.eTag;
        this.isBlockUserUploadEnabled = $.isBlockUserUploadEnabled;
        this.isEnabled = $.isEnabled;
        this.isSecureSiteEnabled = $.isSecureSiteEnabled;
        this.isTokenEnabled = $.isTokenEnabled;
        this.isV1Enabled = $.isV1Enabled;
        this.isV3Enabled = $.isV3Enabled;
        this.isWebchatPreviewEnabled = $.isWebchatPreviewEnabled;
        this.key = $.key;
        this.key2 = $.key2;
        this.siteId = $.siteId;
        this.siteName = $.siteName;
        this.trustedOrigins = $.trustedOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteResponse $;

        public Builder() {
            $ = new SiteResponse();
        }

        public Builder(SiteResponse defaults) {
            $ = new SiteResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param eTag Entity Tag
         * 
         * @return builder
         * 
         */
        public Builder eTag(@Nullable String eTag) {
            $.eTag = eTag;
            return this;
        }

        /**
         * @param isBlockUserUploadEnabled Whether this site is enabled for block user upload.
         * 
         * @return builder
         * 
         */
        public Builder isBlockUserUploadEnabled(@Nullable Boolean isBlockUserUploadEnabled) {
            $.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
            return this;
        }

        /**
         * @param isEnabled Whether this site is enabled for DirectLine channel.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isSecureSiteEnabled Whether this site is enabled for authentication with Bot Framework.
         * 
         * @return builder
         * 
         */
        public Builder isSecureSiteEnabled(@Nullable Boolean isSecureSiteEnabled) {
            $.isSecureSiteEnabled = isSecureSiteEnabled;
            return this;
        }

        /**
         * @param isTokenEnabled Whether this site is token enabled for channel
         * 
         * @return builder
         * 
         */
        public Builder isTokenEnabled(@Nullable Boolean isTokenEnabled) {
            $.isTokenEnabled = isTokenEnabled;
            return this;
        }

        /**
         * @param isV1Enabled Whether this site is enabled for Bot Framework V1 protocol.
         * 
         * @return builder
         * 
         */
        public Builder isV1Enabled(Boolean isV1Enabled) {
            $.isV1Enabled = isV1Enabled;
            return this;
        }

        /**
         * @param isV3Enabled Whether this site is enabled for Bot Framework V1 protocol.
         * 
         * @return builder
         * 
         */
        public Builder isV3Enabled(Boolean isV3Enabled) {
            $.isV3Enabled = isV3Enabled;
            return this;
        }

        /**
         * @param isWebchatPreviewEnabled Whether this site is enabled for preview versions of Webchat
         * 
         * @return builder
         * 
         */
        public Builder isWebchatPreviewEnabled(Boolean isWebchatPreviewEnabled) {
            $.isWebchatPreviewEnabled = isWebchatPreviewEnabled;
            return this;
        }

        /**
         * @param key Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param key2 Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder key2(String key2) {
            $.key2 = key2;
            return this;
        }

        /**
         * @param siteId Site Id
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteName Site name
         * 
         * @return builder
         * 
         */
        public Builder siteName(String siteName) {
            $.siteName = siteName;
            return this;
        }

        /**
         * @param trustedOrigins List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
         * 
         * @return builder
         * 
         */
        public Builder trustedOrigins(@Nullable List<String> trustedOrigins) {
            $.trustedOrigins = trustedOrigins;
            return this;
        }

        /**
         * @param trustedOrigins List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
         * 
         * @return builder
         * 
         */
        public Builder trustedOrigins(String... trustedOrigins) {
            return trustedOrigins(List.of(trustedOrigins));
        }

        public SiteResponse build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.isV1Enabled = Objects.requireNonNull($.isV1Enabled, "expected parameter 'isV1Enabled' to be non-null");
            $.isV3Enabled = Objects.requireNonNull($.isV3Enabled, "expected parameter 'isV3Enabled' to be non-null");
            $.isWebchatPreviewEnabled = Codegen.booleanProp("isWebchatPreviewEnabled").arg($.isWebchatPreviewEnabled).def(false).require();
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.key2 = Objects.requireNonNull($.key2, "expected parameter 'key2' to be non-null");
            $.siteId = Objects.requireNonNull($.siteId, "expected parameter 'siteId' to be non-null");
            $.siteName = Objects.requireNonNull($.siteName, "expected parameter 'siteName' to be non-null");
            return $;
        }
    }

}
