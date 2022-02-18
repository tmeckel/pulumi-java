// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigateway_v1.inputs.ApigatewayApiConfigFileArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An OpenAPI Specification Document describing an API.
 * 
 */
public final class ApigatewayApiConfigOpenApiDocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApigatewayApiConfigOpenApiDocumentArgs Empty = new ApigatewayApiConfigOpenApiDocumentArgs();

    /**
     * The OpenAPI Specification document file.
     * 
     */
    @InputImport(name="document")
    private final @Nullable Input<ApigatewayApiConfigFileArgs> document;

    public Input<ApigatewayApiConfigFileArgs> getDocument() {
        return this.document == null ? Input.empty() : this.document;
    }

    public ApigatewayApiConfigOpenApiDocumentArgs(@Nullable Input<ApigatewayApiConfigFileArgs> document) {
        this.document = document;
    }

    private ApigatewayApiConfigOpenApiDocumentArgs() {
        this.document = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigOpenApiDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApigatewayApiConfigFileArgs> document;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigOpenApiDocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.document = defaults.document;
        }

        public Builder setDocument(@Nullable Input<ApigatewayApiConfigFileArgs> document) {
            this.document = document;
            return this;
        }

        public Builder setDocument(@Nullable ApigatewayApiConfigFileArgs document) {
            this.document = Input.ofNullable(document);
            return this;
        }

        public ApigatewayApiConfigOpenApiDocumentArgs build() {
            return new ApigatewayApiConfigOpenApiDocumentArgs(document);
        }
    }
}
