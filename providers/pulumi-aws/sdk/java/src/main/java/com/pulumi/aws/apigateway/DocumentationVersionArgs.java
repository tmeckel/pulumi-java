// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentationVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentationVersionArgs Empty = new DocumentationVersionArgs();

    /**
     * The description of the API documentation version.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the API documentation version.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the associated Rest API
     * 
     */
    @Import(name="restApiId", required=true)
    private Output<String> restApiId;

    /**
     * @return The ID of the associated Rest API
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     * The version identifier of the API documentation snapshot.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version identifier of the API documentation snapshot.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private DocumentationVersionArgs() {}

    private DocumentationVersionArgs(DocumentationVersionArgs $) {
        this.description = $.description;
        this.restApiId = $.restApiId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentationVersionArgs $;

        public Builder() {
            $ = new DocumentationVersionArgs();
        }

        public Builder(DocumentationVersionArgs defaults) {
            $ = new DocumentationVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the API documentation version.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the API documentation version.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param restApiId The ID of the associated Rest API
         * 
         * @return builder
         * 
         */
        public Builder restApiId(Output<String> restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        /**
         * @param restApiId The ID of the associated Rest API
         * 
         * @return builder
         * 
         */
        public Builder restApiId(String restApiId) {
            return restApiId(Output.of(restApiId));
        }

        /**
         * @param version The version identifier of the API documentation snapshot.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version identifier of the API documentation snapshot.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DocumentationVersionArgs build() {
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
