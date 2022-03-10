// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The RosettaNet ProcessConfiguration business document settings.
 * 
 */
public final class RosettaNetPipBusinessDocumentResponse extends io.pulumi.resources.InvokeArgs {

    public static final RosettaNetPipBusinessDocumentResponse Empty = new RosettaNetPipBusinessDocumentResponse();

    /**
     * The business document description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The business document name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The business document version.
     * 
     */
    @InputImport(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public RosettaNetPipBusinessDocumentResponse(
        @Nullable String description,
        String name,
        String version) {
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private RosettaNetPipBusinessDocumentResponse() {
        this.description = null;
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipBusinessDocumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipBusinessDocumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public RosettaNetPipBusinessDocumentResponse build() {
            return new RosettaNetPipBusinessDocumentResponse(description, name, version);
        }
    }
}
