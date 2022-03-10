// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs Empty = new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs();

    /**
     * he content type for a field-level encryption content type-profile mapping. Valid value is `application/x-www-form-urlencoded`.
     * 
     */
    @InputImport(name="contentType", required=true)
      private final Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType;
    }

    /**
     * The format for a field-level encryption content type-profile mapping. Valid value is `URLEncoded`.
     * 
     */
    @InputImport(name="format", required=true)
      private final Input<String> format;

    public Input<String> getFormat() {
        return this.format;
    }

    /**
     * ID of profile to use for field-level encryption query argument-profile mapping
     * 
     */
    @InputImport(name="profileId")
      private final @Nullable Input<String> profileId;

    public Input<String> getProfileId() {
        return this.profileId == null ? Input.empty() : this.profileId;
    }

    public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs(
        Input<String> contentType,
        Input<String> format,
        @Nullable Input<String> profileId) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.profileId = profileId;
    }

    private FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs() {
        this.contentType = Input.empty();
        this.format = Input.empty();
        this.profileId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentType;
        private Input<String> format;
        private @Nullable Input<String> profileId;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.format = defaults.format;
    	      this.profileId = defaults.profileId;
        }

        public Builder contentType(Input<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder format(Input<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder format(String format) {
            this.format = Input.of(Objects.requireNonNull(format));
            return this;
        }

        public Builder profileId(@Nullable Input<String> profileId) {
            this.profileId = profileId;
            return this;
        }

        public Builder profileId(@Nullable String profileId) {
            this.profileId = Input.ofNullable(profileId);
            return this;
        }
        public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs build() {
            return new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs(contentType, format, profileId);
        }
    }
}
