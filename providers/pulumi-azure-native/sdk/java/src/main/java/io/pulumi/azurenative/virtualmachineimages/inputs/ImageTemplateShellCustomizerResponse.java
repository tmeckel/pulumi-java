// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Runs a shell script during the customization phase (Linux). Corresponds to Packer shell provisioner. Exactly one of 'scriptUri' or 'inline' can be specified.
 * 
 */
public final class ImageTemplateShellCustomizerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateShellCustomizerResponse Empty = new ImageTemplateShellCustomizerResponse();

    /**
     * Array of shell commands to execute
     * 
     */
    @InputImport(name="inline")
      private final @Nullable List<String> inline;

    public List<String> getInline() {
        return this.inline == null ? List.of() : this.inline;
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * URI of the shell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    @InputImport(name="scriptUri")
      private final @Nullable String scriptUri;

    public Optional<String> getScriptUri() {
        return this.scriptUri == null ? Optional.empty() : Optional.ofNullable(this.scriptUri);
    }

    /**
     * SHA256 checksum of the shell script provided in the scriptUri field
     * 
     */
    @InputImport(name="sha256Checksum")
      private final @Nullable String sha256Checksum;

    public Optional<String> getSha256Checksum() {
        return this.sha256Checksum == null ? Optional.empty() : Optional.ofNullable(this.sha256Checksum);
    }

    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'Shell'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ImageTemplateShellCustomizerResponse(
        @Nullable List<String> inline,
        @Nullable String name,
        @Nullable String scriptUri,
        @Nullable String sha256Checksum,
        String type) {
        this.inline = inline;
        this.name = name;
        this.scriptUri = scriptUri;
        this.sha256Checksum = sha256Checksum == null ? "" : sha256Checksum;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateShellCustomizerResponse() {
        this.inline = List.of();
        this.name = null;
        this.scriptUri = null;
        this.sha256Checksum = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateShellCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> inline;
        private @Nullable String name;
        private @Nullable String scriptUri;
        private @Nullable String sha256Checksum;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateShellCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inline = defaults.inline;
    	      this.name = defaults.name;
    	      this.scriptUri = defaults.scriptUri;
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.type = defaults.type;
        }

        public Builder inline(@Nullable List<String> inline) {
            this.inline = inline;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder scriptUri(@Nullable String scriptUri) {
            this.scriptUri = scriptUri;
            return this;
        }

        public Builder sha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ImageTemplateShellCustomizerResponse build() {
            return new ImageTemplateShellCustomizerResponse(inline, name, scriptUri, sha256Checksum, type);
        }
    }
}
