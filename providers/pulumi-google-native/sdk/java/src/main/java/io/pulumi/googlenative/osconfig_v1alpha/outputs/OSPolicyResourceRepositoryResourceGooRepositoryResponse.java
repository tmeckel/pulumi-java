// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceRepositoryResourceGooRepositoryResponse {
    /**
     * The name of the repository.
     * 
     */
    private final String name;
    /**
     * The url of the repository.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"name","url"})
    private OSPolicyResourceRepositoryResourceGooRepositoryResponse(
        String name,
        String url) {
        this.name = Objects.requireNonNull(name);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * The name of the repository.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The url of the repository.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceGooRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceGooRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public OSPolicyResourceRepositoryResourceGooRepositoryResponse build() {
            return new OSPolicyResourceRepositoryResourceGooRepositoryResponse(name, url);
        }
    }
}
