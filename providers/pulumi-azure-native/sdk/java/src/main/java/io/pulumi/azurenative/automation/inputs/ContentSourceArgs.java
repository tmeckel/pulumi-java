// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.enums.ContentSourceType;
import io.pulumi.azurenative.automation.inputs.ContentHashArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of the content source.
 * 
 */
public final class ContentSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentSourceArgs Empty = new ContentSourceArgs();

    /**
     * Gets or sets the hash.
     * 
     */
    @InputImport(name="hash")
      private final @Nullable Input<ContentHashArgs> hash;

    public Input<ContentHashArgs> getHash() {
        return this.hash == null ? Input.empty() : this.hash;
    }

    /**
     * Gets or sets the content source type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,ContentSourceType>> type;

    public Input<Either<String,ContentSourceType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Gets or sets the value of the content. This is based on the content source type.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    /**
     * Gets or sets the version of the content.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ContentSourceArgs(
        @Nullable Input<ContentHashArgs> hash,
        @Nullable Input<Either<String,ContentSourceType>> type,
        @Nullable Input<String> value,
        @Nullable Input<String> version) {
        this.hash = hash;
        this.type = type;
        this.value = value;
        this.version = version;
    }

    private ContentSourceArgs() {
        this.hash = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContentHashArgs> hash;
        private @Nullable Input<Either<String,ContentSourceType>> type;
        private @Nullable Input<String> value;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hash = defaults.hash;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.version = defaults.version;
        }

        public Builder hash(@Nullable Input<ContentHashArgs> hash) {
            this.hash = hash;
            return this;
        }

        public Builder hash(@Nullable ContentHashArgs hash) {
            this.hash = Input.ofNullable(hash);
            return this;
        }

        public Builder type(@Nullable Input<Either<String,ContentSourceType>> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable Either<String,ContentSourceType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public ContentSourceArgs build() {
            return new ContentSourceArgs(hash, type, value, version);
        }
    }
}
