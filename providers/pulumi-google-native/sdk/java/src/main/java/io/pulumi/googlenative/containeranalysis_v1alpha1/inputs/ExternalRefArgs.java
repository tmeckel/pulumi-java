// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.ExternalRefCategory;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
 * 
 */
public final class ExternalRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalRefArgs Empty = new ExternalRefArgs();

    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
     * 
     */
    @Import(name="category")
      private final @Nullable Output<ExternalRefCategory> category;

    public Output<ExternalRefCategory> getCategory() {
        return this.category == null ? Codegen.empty() : this.category;
    }

    /**
     * Human-readable information about the purpose and target of the reference
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
     * 
     */
    @Import(name="locator")
      private final @Nullable Output<String> locator;

    public Output<String> getLocator() {
        return this.locator == null ? Codegen.empty() : this.locator;
    }

    /**
     * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ExternalRefArgs(
        @Nullable Output<ExternalRefCategory> category,
        @Nullable Output<String> comment,
        @Nullable Output<String> locator,
        @Nullable Output<String> type) {
        this.category = category;
        this.comment = comment;
        this.locator = locator;
        this.type = type;
    }

    private ExternalRefArgs() {
        this.category = Codegen.empty();
        this.comment = Codegen.empty();
        this.locator = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExternalRefCategory> category;
        private @Nullable Output<String> comment;
        private @Nullable Output<String> locator;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.comment = defaults.comment;
    	      this.locator = defaults.locator;
    	      this.type = defaults.type;
        }

        public Builder category(@Nullable Output<ExternalRefCategory> category) {
            this.category = category;
            return this;
        }
        public Builder category(@Nullable ExternalRefCategory category) {
            this.category = Codegen.ofNullable(category);
            return this;
        }
        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder locator(@Nullable Output<String> locator) {
            this.locator = locator;
            return this;
        }
        public Builder locator(@Nullable String locator) {
            this.locator = Codegen.ofNullable(locator);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ExternalRefArgs build() {
            return new ExternalRefArgs(category, comment, locator, type);
        }
    }
}
