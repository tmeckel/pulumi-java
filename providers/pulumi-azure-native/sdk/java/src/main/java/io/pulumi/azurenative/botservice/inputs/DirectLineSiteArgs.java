// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A site for the Direct Line channel
 * 
 */
public final class DirectLineSiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectLineSiteArgs Empty = new DirectLineSiteArgs();

    /**
     * Whether this site is enabled for block user upload.
     * 
     */
    @InputImport(name="isBlockUserUploadEnabled")
      private final @Nullable Input<Boolean> isBlockUserUploadEnabled;

    public Input<Boolean> getIsBlockUserUploadEnabled() {
        return this.isBlockUserUploadEnabled == null ? Input.empty() : this.isBlockUserUploadEnabled;
    }

    /**
     * Whether this site is enabled for DirectLine channel.
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this site is enabled for authentication with Bot Framework.
     * 
     */
    @InputImport(name="isSecureSiteEnabled")
      private final @Nullable Input<Boolean> isSecureSiteEnabled;

    public Input<Boolean> getIsSecureSiteEnabled() {
        return this.isSecureSiteEnabled == null ? Input.empty() : this.isSecureSiteEnabled;
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @InputImport(name="isV1Enabled", required=true)
      private final Input<Boolean> isV1Enabled;

    public Input<Boolean> getIsV1Enabled() {
        return this.isV1Enabled;
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @InputImport(name="isV3Enabled", required=true)
      private final Input<Boolean> isV3Enabled;

    public Input<Boolean> getIsV3Enabled() {
        return this.isV3Enabled;
    }

    /**
     * Site name
     * 
     */
    @InputImport(name="siteName", required=true)
      private final Input<String> siteName;

    public Input<String> getSiteName() {
        return this.siteName;
    }

    /**
     * List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
     * 
     */
    @InputImport(name="trustedOrigins")
      private final @Nullable Input<List<String>> trustedOrigins;

    public Input<List<String>> getTrustedOrigins() {
        return this.trustedOrigins == null ? Input.empty() : this.trustedOrigins;
    }

    public DirectLineSiteArgs(
        @Nullable Input<Boolean> isBlockUserUploadEnabled,
        Input<Boolean> isEnabled,
        @Nullable Input<Boolean> isSecureSiteEnabled,
        Input<Boolean> isV1Enabled,
        Input<Boolean> isV3Enabled,
        Input<String> siteName,
        @Nullable Input<List<String>> trustedOrigins) {
        this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isSecureSiteEnabled = isSecureSiteEnabled;
        this.isV1Enabled = Objects.requireNonNull(isV1Enabled, "expected parameter 'isV1Enabled' to be non-null");
        this.isV3Enabled = Objects.requireNonNull(isV3Enabled, "expected parameter 'isV3Enabled' to be non-null");
        this.siteName = Objects.requireNonNull(siteName, "expected parameter 'siteName' to be non-null");
        this.trustedOrigins = trustedOrigins;
    }

    private DirectLineSiteArgs() {
        this.isBlockUserUploadEnabled = Input.empty();
        this.isEnabled = Input.empty();
        this.isSecureSiteEnabled = Input.empty();
        this.isV1Enabled = Input.empty();
        this.isV3Enabled = Input.empty();
        this.siteName = Input.empty();
        this.trustedOrigins = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isBlockUserUploadEnabled;
        private Input<Boolean> isEnabled;
        private @Nullable Input<Boolean> isSecureSiteEnabled;
        private Input<Boolean> isV1Enabled;
        private Input<Boolean> isV3Enabled;
        private Input<String> siteName;
        private @Nullable Input<List<String>> trustedOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isBlockUserUploadEnabled = defaults.isBlockUserUploadEnabled;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isSecureSiteEnabled = defaults.isSecureSiteEnabled;
    	      this.isV1Enabled = defaults.isV1Enabled;
    	      this.isV3Enabled = defaults.isV3Enabled;
    	      this.siteName = defaults.siteName;
    	      this.trustedOrigins = defaults.trustedOrigins;
        }

        public Builder isBlockUserUploadEnabled(@Nullable Input<Boolean> isBlockUserUploadEnabled) {
            this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
            return this;
        }

        public Builder isBlockUserUploadEnabled(@Nullable Boolean isBlockUserUploadEnabled) {
            this.isBlockUserUploadEnabled = Input.ofNullable(isBlockUserUploadEnabled);
            return this;
        }

        public Builder isEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder isSecureSiteEnabled(@Nullable Input<Boolean> isSecureSiteEnabled) {
            this.isSecureSiteEnabled = isSecureSiteEnabled;
            return this;
        }

        public Builder isSecureSiteEnabled(@Nullable Boolean isSecureSiteEnabled) {
            this.isSecureSiteEnabled = Input.ofNullable(isSecureSiteEnabled);
            return this;
        }

        public Builder isV1Enabled(Input<Boolean> isV1Enabled) {
            this.isV1Enabled = Objects.requireNonNull(isV1Enabled);
            return this;
        }

        public Builder isV1Enabled(Boolean isV1Enabled) {
            this.isV1Enabled = Input.of(Objects.requireNonNull(isV1Enabled));
            return this;
        }

        public Builder isV3Enabled(Input<Boolean> isV3Enabled) {
            this.isV3Enabled = Objects.requireNonNull(isV3Enabled);
            return this;
        }

        public Builder isV3Enabled(Boolean isV3Enabled) {
            this.isV3Enabled = Input.of(Objects.requireNonNull(isV3Enabled));
            return this;
        }

        public Builder siteName(Input<String> siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }

        public Builder siteName(String siteName) {
            this.siteName = Input.of(Objects.requireNonNull(siteName));
            return this;
        }

        public Builder trustedOrigins(@Nullable Input<List<String>> trustedOrigins) {
            this.trustedOrigins = trustedOrigins;
            return this;
        }

        public Builder trustedOrigins(@Nullable List<String> trustedOrigins) {
            this.trustedOrigins = Input.ofNullable(trustedOrigins);
            return this;
        }
        public DirectLineSiteArgs build() {
            return new DirectLineSiteArgs(isBlockUserUploadEnabled, isEnabled, isSecureSiteEnabled, isV1Enabled, isV3Enabled, siteName, trustedOrigins);
        }
    }
}
