// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationDefinitionArtifactResponse {
    /**
     * @return The managed application definition artifact name.
     * 
     */
    private final String name;
    /**
     * @return The managed application definition artifact type.
     * 
     */
    private final String type;
    /**
     * @return The managed application definition artifact blob uri.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private ApplicationDefinitionArtifactResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uri") String uri) {
        this.name = name;
        this.type = type;
        this.uri = uri;
    }

    /**
     * @return The managed application definition artifact name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The managed application definition artifact type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The managed application definition artifact blob uri.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationDefinitionArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationDefinitionArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public ApplicationDefinitionArtifactResponse build() {
            return new ApplicationDefinitionArtifactResponse(name, type, uri);
        }
    }
}
