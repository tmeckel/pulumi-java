// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIdentityAwareProxyClientArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIdentityAwareProxyClientArgs Empty = new GetIdentityAwareProxyClientArgs();

    @InputImport(name="brandId", required=true)
    private final String brandId;

    public String getBrandId() {
        return this.brandId;
    }

    @InputImport(name="identityAwareProxyClientId", required=true)
    private final String identityAwareProxyClientId;

    public String getIdentityAwareProxyClientId() {
        return this.identityAwareProxyClientId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetIdentityAwareProxyClientArgs(
        String brandId,
        String identityAwareProxyClientId,
        @Nullable String project) {
        this.brandId = Objects.requireNonNull(brandId, "expected parameter 'brandId' to be non-null");
        this.identityAwareProxyClientId = Objects.requireNonNull(identityAwareProxyClientId, "expected parameter 'identityAwareProxyClientId' to be non-null");
        this.project = project;
    }

    private GetIdentityAwareProxyClientArgs() {
        this.brandId = null;
        this.identityAwareProxyClientId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIdentityAwareProxyClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String brandId;
        private String identityAwareProxyClientId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIdentityAwareProxyClientArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brandId = defaults.brandId;
    	      this.identityAwareProxyClientId = defaults.identityAwareProxyClientId;
    	      this.project = defaults.project;
        }

        public Builder setBrandId(String brandId) {
            this.brandId = Objects.requireNonNull(brandId);
            return this;
        }

        public Builder setIdentityAwareProxyClientId(String identityAwareProxyClientId) {
            this.identityAwareProxyClientId = Objects.requireNonNull(identityAwareProxyClientId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetIdentityAwareProxyClientArgs build() {
            return new GetIdentityAwareProxyClientArgs(brandId, identityAwareProxyClientId, project);
        }
    }
}
