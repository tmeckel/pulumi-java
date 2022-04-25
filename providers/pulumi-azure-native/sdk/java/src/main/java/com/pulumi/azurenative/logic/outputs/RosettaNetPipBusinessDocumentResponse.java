// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RosettaNetPipBusinessDocumentResponse {
    /**
     * @return The business document description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The business document name.
     * 
     */
    private final String name;
    /**
     * @return The business document version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private RosettaNetPipBusinessDocumentResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("version") String version) {
        this.description = description;
        this.name = name;
        this.version = version;
    }

    /**
     * @return The business document description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The business document name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The business document version.
     * 
     */
    public String version() {
        return this.version;
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
        }        public RosettaNetPipBusinessDocumentResponse build() {
            return new RosettaNetPipBusinessDocumentResponse(description, name, version);
        }
    }
}
