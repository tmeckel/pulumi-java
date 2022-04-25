// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiResourceGeneralInformationResponse {
    /**
     * @return The description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return The icon url.
     * 
     */
    private final @Nullable String iconUrl;
    /**
     * @return The release tag.
     * 
     */
    private final @Nullable String releaseTag;
    /**
     * @return The terms of use url.
     * 
     */
    private final @Nullable String termsOfUseUrl;
    /**
     * @return The tier.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private ApiResourceGeneralInformationResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("iconUrl") @Nullable String iconUrl,
        @CustomType.Parameter("releaseTag") @Nullable String releaseTag,
        @CustomType.Parameter("termsOfUseUrl") @Nullable String termsOfUseUrl,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.description = description;
        this.displayName = displayName;
        this.iconUrl = iconUrl;
        this.releaseTag = releaseTag;
        this.termsOfUseUrl = termsOfUseUrl;
        this.tier = tier;
    }

    /**
     * @return The description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The display name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The icon url.
     * 
     */
    public Optional<String> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }
    /**
     * @return The release tag.
     * 
     */
    public Optional<String> releaseTag() {
        return Optional.ofNullable(this.releaseTag);
    }
    /**
     * @return The terms of use url.
     * 
     */
    public Optional<String> termsOfUseUrl() {
        return Optional.ofNullable(this.termsOfUseUrl);
    }
    /**
     * @return The tier.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceGeneralInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String iconUrl;
        private @Nullable String releaseTag;
        private @Nullable String termsOfUseUrl;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceGeneralInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconUrl = defaults.iconUrl;
    	      this.releaseTag = defaults.releaseTag;
    	      this.termsOfUseUrl = defaults.termsOfUseUrl;
    	      this.tier = defaults.tier;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder iconUrl(@Nullable String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public Builder releaseTag(@Nullable String releaseTag) {
            this.releaseTag = releaseTag;
            return this;
        }
        public Builder termsOfUseUrl(@Nullable String termsOfUseUrl) {
            this.termsOfUseUrl = termsOfUseUrl;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public ApiResourceGeneralInformationResponse build() {
            return new ApiResourceGeneralInformationResponse(description, displayName, iconUrl, releaseTag, termsOfUseUrl, tier);
        }
    }
}
