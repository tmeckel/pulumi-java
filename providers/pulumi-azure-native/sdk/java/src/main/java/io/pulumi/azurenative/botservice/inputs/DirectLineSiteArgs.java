// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="isBlockUserUploadEnabled")
      private final @Nullable Output<Boolean> isBlockUserUploadEnabled;

    public Output<Boolean> getIsBlockUserUploadEnabled() {
        return this.isBlockUserUploadEnabled == null ? Codegen.empty() : this.isBlockUserUploadEnabled;
    }

    /**
     * Whether this site is enabled for DirectLine channel.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this site is enabled for authentication with Bot Framework.
     * 
     */
    @Import(name="isSecureSiteEnabled")
      private final @Nullable Output<Boolean> isSecureSiteEnabled;

    public Output<Boolean> getIsSecureSiteEnabled() {
        return this.isSecureSiteEnabled == null ? Codegen.empty() : this.isSecureSiteEnabled;
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @Import(name="isV1Enabled", required=true)
      private final Output<Boolean> isV1Enabled;

    public Output<Boolean> getIsV1Enabled() {
        return this.isV1Enabled;
    }

    /**
     * Whether this site is enabled for Bot Framework V1 protocol.
     * 
     */
    @Import(name="isV3Enabled", required=true)
      private final Output<Boolean> isV3Enabled;

    public Output<Boolean> getIsV3Enabled() {
        return this.isV3Enabled;
    }

    /**
     * Site name
     * 
     */
    @Import(name="siteName", required=true)
      private final Output<String> siteName;

    public Output<String> getSiteName() {
        return this.siteName;
    }

    /**
     * List of Trusted Origin URLs for this site. This field is applicable only if isSecureSiteEnabled is True.
     * 
     */
    @Import(name="trustedOrigins")
      private final @Nullable Output<List<String>> trustedOrigins;

    public Output<List<String>> getTrustedOrigins() {
        return this.trustedOrigins == null ? Codegen.empty() : this.trustedOrigins;
    }

    public DirectLineSiteArgs(
        @Nullable Output<Boolean> isBlockUserUploadEnabled,
        Output<Boolean> isEnabled,
        @Nullable Output<Boolean> isSecureSiteEnabled,
        Output<Boolean> isV1Enabled,
        Output<Boolean> isV3Enabled,
        Output<String> siteName,
        @Nullable Output<List<String>> trustedOrigins) {
        this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isSecureSiteEnabled = isSecureSiteEnabled;
        this.isV1Enabled = Objects.requireNonNull(isV1Enabled, "expected parameter 'isV1Enabled' to be non-null");
        this.isV3Enabled = Objects.requireNonNull(isV3Enabled, "expected parameter 'isV3Enabled' to be non-null");
        this.siteName = Objects.requireNonNull(siteName, "expected parameter 'siteName' to be non-null");
        this.trustedOrigins = trustedOrigins;
    }

    private DirectLineSiteArgs() {
        this.isBlockUserUploadEnabled = Codegen.empty();
        this.isEnabled = Codegen.empty();
        this.isSecureSiteEnabled = Codegen.empty();
        this.isV1Enabled = Codegen.empty();
        this.isV3Enabled = Codegen.empty();
        this.siteName = Codegen.empty();
        this.trustedOrigins = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isBlockUserUploadEnabled;
        private Output<Boolean> isEnabled;
        private @Nullable Output<Boolean> isSecureSiteEnabled;
        private Output<Boolean> isV1Enabled;
        private Output<Boolean> isV3Enabled;
        private Output<String> siteName;
        private @Nullable Output<List<String>> trustedOrigins;

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

        public Builder isBlockUserUploadEnabled(@Nullable Output<Boolean> isBlockUserUploadEnabled) {
            this.isBlockUserUploadEnabled = isBlockUserUploadEnabled;
            return this;
        }
        public Builder isBlockUserUploadEnabled(@Nullable Boolean isBlockUserUploadEnabled) {
            this.isBlockUserUploadEnabled = Codegen.ofNullable(isBlockUserUploadEnabled);
            return this;
        }
        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public Builder isSecureSiteEnabled(@Nullable Output<Boolean> isSecureSiteEnabled) {
            this.isSecureSiteEnabled = isSecureSiteEnabled;
            return this;
        }
        public Builder isSecureSiteEnabled(@Nullable Boolean isSecureSiteEnabled) {
            this.isSecureSiteEnabled = Codegen.ofNullable(isSecureSiteEnabled);
            return this;
        }
        public Builder isV1Enabled(Output<Boolean> isV1Enabled) {
            this.isV1Enabled = Objects.requireNonNull(isV1Enabled);
            return this;
        }
        public Builder isV1Enabled(Boolean isV1Enabled) {
            this.isV1Enabled = Output.of(Objects.requireNonNull(isV1Enabled));
            return this;
        }
        public Builder isV3Enabled(Output<Boolean> isV3Enabled) {
            this.isV3Enabled = Objects.requireNonNull(isV3Enabled);
            return this;
        }
        public Builder isV3Enabled(Boolean isV3Enabled) {
            this.isV3Enabled = Output.of(Objects.requireNonNull(isV3Enabled));
            return this;
        }
        public Builder siteName(Output<String> siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }
        public Builder siteName(String siteName) {
            this.siteName = Output.of(Objects.requireNonNull(siteName));
            return this;
        }
        public Builder trustedOrigins(@Nullable Output<List<String>> trustedOrigins) {
            this.trustedOrigins = trustedOrigins;
            return this;
        }
        public Builder trustedOrigins(@Nullable List<String> trustedOrigins) {
            this.trustedOrigins = Codegen.ofNullable(trustedOrigins);
            return this;
        }
        public Builder trustedOrigins(String... trustedOrigins) {
            return trustedOrigins(List.of(trustedOrigins));
        }        public DirectLineSiteArgs build() {
            return new DirectLineSiteArgs(isBlockUserUploadEnabled, isEnabled, isSecureSiteEnabled, isV1Enabled, isV3Enabled, siteName, trustedOrigins);
        }
    }
}
