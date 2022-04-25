// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Managed application artifact.
 * 
 */
public final class ApplicationArtifactResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationArtifactResponse Empty = new ApplicationArtifactResponse();

    /**
     * The managed application artifact name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The managed application artifact name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The managed application artifact type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The managed application artifact type.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The managed application artifact blob uri.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    /**
     * @return The managed application artifact blob uri.
     * 
     */
    public String uri() {
        return this.uri;
    }

    private ApplicationArtifactResponse() {}

    private ApplicationArtifactResponse(ApplicationArtifactResponse $) {
        this.name = $.name;
        this.type = $.type;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArtifactResponse $;

        public Builder() {
            $ = new ApplicationArtifactResponse();
        }

        public Builder(ApplicationArtifactResponse defaults) {
            $ = new ApplicationArtifactResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The managed application artifact name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type The managed application artifact type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param uri The managed application artifact blob uri.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public ApplicationArtifactResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
