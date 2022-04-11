// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.EnableStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a lab's announcement banner
 * 
 */
public final class LabAnnouncementPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabAnnouncementPropertiesArgs Empty = new LabAnnouncementPropertiesArgs();

    /**
     * Is the lab announcement active/enabled at this time?
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Either<String,EnableStatus>> enabled;

    public Output<Either<String,EnableStatus>> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The time at which the announcement expires (null for never)
     * 
     */
    @Import(name="expirationDate")
      private final @Nullable Output<String> expirationDate;

    public Output<String> getExpirationDate() {
        return this.expirationDate == null ? Codegen.empty() : this.expirationDate;
    }

    /**
     * Has this announcement expired?
     * 
     */
    @Import(name="expired")
      private final @Nullable Output<Boolean> expired;

    public Output<Boolean> getExpired() {
        return this.expired == null ? Codegen.empty() : this.expired;
    }

    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    @Import(name="markdown")
      private final @Nullable Output<String> markdown;

    public Output<String> getMarkdown() {
        return this.markdown == null ? Codegen.empty() : this.markdown;
    }

    /**
     * The plain text title for the lab announcement
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public LabAnnouncementPropertiesArgs(
        @Nullable Output<Either<String,EnableStatus>> enabled,
        @Nullable Output<String> expirationDate,
        @Nullable Output<Boolean> expired,
        @Nullable Output<String> markdown,
        @Nullable Output<String> title) {
        this.enabled = enabled;
        this.expirationDate = expirationDate;
        this.expired = expired;
        this.markdown = markdown;
        this.title = title;
    }

    private LabAnnouncementPropertiesArgs() {
        this.enabled = Codegen.empty();
        this.expirationDate = Codegen.empty();
        this.expired = Codegen.empty();
        this.markdown = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabAnnouncementPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,EnableStatus>> enabled;
        private @Nullable Output<String> expirationDate;
        private @Nullable Output<Boolean> expired;
        private @Nullable Output<String> markdown;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(LabAnnouncementPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expired = defaults.expired;
    	      this.markdown = defaults.markdown;
    	      this.title = defaults.title;
        }

        public Builder enabled(@Nullable Output<Either<String,EnableStatus>> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Either<String,EnableStatus> enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = Codegen.ofNullable(expirationDate);
            return this;
        }
        public Builder expired(@Nullable Output<Boolean> expired) {
            this.expired = expired;
            return this;
        }
        public Builder expired(@Nullable Boolean expired) {
            this.expired = Codegen.ofNullable(expired);
            return this;
        }
        public Builder markdown(@Nullable Output<String> markdown) {
            this.markdown = markdown;
            return this;
        }
        public Builder markdown(@Nullable String markdown) {
            this.markdown = Codegen.ofNullable(markdown);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public LabAnnouncementPropertiesArgs build() {
            return new LabAnnouncementPropertiesArgs(enabled, expirationDate, expired, markdown, title);
        }
    }
}
