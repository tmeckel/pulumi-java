// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name of the provider to create.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    @InputImport(name="samlMetadataDocument")
      private final @Nullable Input<String> samlMetadataDocument;

    public Input<String> getSamlMetadataDocument() {
        return this.samlMetadataDocument == null ? Input.empty() : this.samlMetadataDocument;
    }

    /**
     * Map of resource tags for the IAM SAML provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The expiration date and time for the SAML provider in RFC1123 format, e.g., `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    @InputImport(name="validUntil")
      private final @Nullable Input<String> validUntil;

    public Input<String> getValidUntil() {
        return this.validUntil == null ? Input.empty() : this.validUntil;
    }

    public SamlProviderState(
        @Nullable Input<String> arn,
        @Nullable Input<String> name,
        @Nullable Input<String> samlMetadataDocument,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> validUntil) {
        this.arn = arn;
        this.name = name;
        this.samlMetadataDocument = samlMetadataDocument;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.validUntil = validUntil;
    }

    private SamlProviderState() {
        this.arn = Input.empty();
        this.name = Input.empty();
        this.samlMetadataDocument = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.validUntil = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamlProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> name;
        private @Nullable Input<String> samlMetadataDocument;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> validUntil;

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

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder samlMetadataDocument(@Nullable Input<String> samlMetadataDocument) {
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }

        public Builder samlMetadataDocument(@Nullable String samlMetadataDocument) {
            this.samlMetadataDocument = Input.ofNullable(samlMetadataDocument);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder validUntil(@Nullable Input<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }

        public Builder validUntil(@Nullable String validUntil) {
            this.validUntil = Input.ofNullable(validUntil);
            return this;
        }
        public SamlProviderState build() {
            return new SamlProviderState(arn, name, samlMetadataDocument, tags, tagsAll, validUntil);
        }
    }
}
