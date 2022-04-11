// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiKeyArgs Empty = new ApiKeyArgs();

    /**
     * The ID of the associated AppSync API
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The API key description. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    @Import(name="expires")
      private final @Nullable Output<String> expires;

    public Output<String> getExpires() {
        return this.expires == null ? Codegen.empty() : this.expires;
    }

    public ApiKeyArgs(
        Output<String> apiId,
        @Nullable Output<String> description,
        @Nullable Output<String> expires) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.description = description == null ? Codegen.ofNullable("Managed by Pulumi") : description;
        this.expires = expires;
    }

    private ApiKeyArgs() {
        this.apiId = Codegen.empty();
        this.description = Codegen.empty();
        this.expires = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> expires;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.description = defaults.description;
    	      this.expires = defaults.expires;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder expires(@Nullable Output<String> expires) {
            this.expires = expires;
            return this;
        }
        public Builder expires(@Nullable String expires) {
            this.expires = Codegen.ofNullable(expires);
            return this;
        }        public ApiKeyArgs build() {
            return new ApiKeyArgs(apiId, description, expires);
        }
    }
}
