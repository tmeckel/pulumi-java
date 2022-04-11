// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionSourceRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionSourceRepositoryArgs Empty = new FunctionSourceRepositoryArgs();

    @Import(name="deployedUrl")
      private final @Nullable Output<String> deployedUrl;

    public Output<String> getDeployedUrl() {
        return this.deployedUrl == null ? Codegen.empty() : this.deployedUrl;
    }

    /**
     * The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public FunctionSourceRepositoryArgs(
        @Nullable Output<String> deployedUrl,
        Output<String> url) {
        this.deployedUrl = deployedUrl;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private FunctionSourceRepositoryArgs() {
        this.deployedUrl = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionSourceRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deployedUrl;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionSourceRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployedUrl = defaults.deployedUrl;
    	      this.url = defaults.url;
        }

        public Builder deployedUrl(@Nullable Output<String> deployedUrl) {
            this.deployedUrl = deployedUrl;
            return this;
        }
        public Builder deployedUrl(@Nullable String deployedUrl) {
            this.deployedUrl = Codegen.ofNullable(deployedUrl);
            return this;
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public FunctionSourceRepositoryArgs build() {
            return new FunctionSourceRepositoryArgs(deployedUrl, url);
        }
    }
}
