// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwaggerSpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SwaggerSpecificationResponse Empty = new SwaggerSpecificationResponse();

    @InputImport(name="apiVersions")
      private final @Nullable List<String> apiVersions;

    public List<String> getApiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }

    @InputImport(name="swaggerSpecFolderUri")
      private final @Nullable String swaggerSpecFolderUri;

    public Optional<String> getSwaggerSpecFolderUri() {
        return this.swaggerSpecFolderUri == null ? Optional.empty() : Optional.ofNullable(this.swaggerSpecFolderUri);
    }

    public SwaggerSpecificationResponse(
        @Nullable List<String> apiVersions,
        @Nullable String swaggerSpecFolderUri) {
        this.apiVersions = apiVersions;
        this.swaggerSpecFolderUri = swaggerSpecFolderUri;
    }

    private SwaggerSpecificationResponse() {
        this.apiVersions = List.of();
        this.swaggerSpecFolderUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwaggerSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiVersions;
        private @Nullable String swaggerSpecFolderUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SwaggerSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersions = defaults.apiVersions;
    	      this.swaggerSpecFolderUri = defaults.swaggerSpecFolderUri;
        }

        public Builder apiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        public Builder swaggerSpecFolderUri(@Nullable String swaggerSpecFolderUri) {
            this.swaggerSpecFolderUri = swaggerSpecFolderUri;
            return this;
        }
        public SwaggerSpecificationResponse build() {
            return new SwaggerSpecificationResponse(apiVersions, swaggerSpecFolderUri);
        }
    }
}
