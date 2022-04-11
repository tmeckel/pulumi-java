// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SamlProviderState extends io.pulumi.resources.ResourceArgs {

    public static final SamlProviderState Empty = new SamlProviderState();

    /**
     * The ARN assigned by AWS for this provider.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name of the provider to create.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * An XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    @Import(name="samlMetadataDocument")
      private final @Nullable Output<String> samlMetadataDocument;

    public Output<String> getSamlMetadataDocument() {
        return this.samlMetadataDocument == null ? Codegen.empty() : this.samlMetadataDocument;
    }

    /**
     * Map of resource tags for the IAM SAML provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The expiration date and time for the SAML provider in RFC1123 format, e.g., `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    @Import(name="validUntil")
      private final @Nullable Output<String> validUntil;

    public Output<String> getValidUntil() {
        return this.validUntil == null ? Codegen.empty() : this.validUntil;
    }

    public SamlProviderState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<String> samlMetadataDocument,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> validUntil) {
        this.arn = arn;
        this.name = name;
        this.samlMetadataDocument = samlMetadataDocument;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.validUntil = validUntil;
    }

    private SamlProviderState() {
        this.arn = Codegen.empty();
        this.name = Codegen.empty();
        this.samlMetadataDocument = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.validUntil = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamlProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> samlMetadataDocument;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(SamlProviderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder samlMetadataDocument(@Nullable Output<String> samlMetadataDocument) {
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }
        public Builder samlMetadataDocument(@Nullable String samlMetadataDocument) {
            this.samlMetadataDocument = Codegen.ofNullable(samlMetadataDocument);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder validUntil(@Nullable Output<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public Builder validUntil(@Nullable String validUntil) {
            this.validUntil = Codegen.ofNullable(validUntil);
            return this;
        }        public SamlProviderState build() {
            return new SamlProviderState(arn, name, samlMetadataDocument, tags, tagsAll, validUntil);
        }
    }
}
