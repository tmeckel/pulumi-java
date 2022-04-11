// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Wrapper for cloud function attributes.
 * 
 */
public final class CloudFunctionEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudFunctionEndpointArgs Empty = new CloudFunctionEndpointArgs();

    /**
     * A [Cloud function](https://cloud.google.com/functions) name.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Codegen.empty() : this.uri;
    }

    public CloudFunctionEndpointArgs(@Nullable Output<String> uri) {
        this.uri = uri;
    }

    private CloudFunctionEndpointArgs() {
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFunctionEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFunctionEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = Codegen.ofNullable(uri);
            return this;
        }        public CloudFunctionEndpointArgs build() {
            return new CloudFunctionEndpointArgs(uri);
        }
    }
}
