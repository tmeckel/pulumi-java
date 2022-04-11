// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.SsoPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * API portal properties payload
 * 
 */
public final class ApiPortalPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiPortalPropertiesArgs Empty = new ApiPortalPropertiesArgs();

    /**
     * The array of resource Ids of gateway to integrate with API portal.
     * 
     */
    @Import(name="gatewayIds")
      private final @Nullable Output<List<String>> gatewayIds;

    public Output<List<String>> getGatewayIds() {
        return this.gatewayIds == null ? Codegen.empty() : this.gatewayIds;
    }

    /**
     * Indicate if only https is allowed.
     * 
     */
    @Import(name="httpsOnly")
      private final @Nullable Output<Boolean> httpsOnly;

    public Output<Boolean> getHttpsOnly() {
        return this.httpsOnly == null ? Codegen.empty() : this.httpsOnly;
    }

    /**
     * Indicates whether the API portal exposes endpoint.
     * 
     */
    @Import(name="public")
      private final @Nullable Output<Boolean> public_;

    public Output<Boolean> getPublic_() {
        return this.public_ == null ? Codegen.empty() : this.public_;
    }

    /**
     * Collection of OpenAPI source URL locations.
     * 
     */
    @Import(name="sourceUrls")
      private final @Nullable Output<List<String>> sourceUrls;

    public Output<List<String>> getSourceUrls() {
        return this.sourceUrls == null ? Codegen.empty() : this.sourceUrls;
    }

    /**
     * Single sign-on related configuration
     * 
     */
    @Import(name="ssoProperties")
      private final @Nullable Output<SsoPropertiesArgs> ssoProperties;

    public Output<SsoPropertiesArgs> getSsoProperties() {
        return this.ssoProperties == null ? Codegen.empty() : this.ssoProperties;
    }

    public ApiPortalPropertiesArgs(
        @Nullable Output<List<String>> gatewayIds,
        @Nullable Output<Boolean> httpsOnly,
        @Nullable Output<Boolean> public_,
        @Nullable Output<List<String>> sourceUrls,
        @Nullable Output<SsoPropertiesArgs> ssoProperties) {
        this.gatewayIds = gatewayIds;
        this.httpsOnly = httpsOnly;
        this.public_ = public_;
        this.sourceUrls = sourceUrls;
        this.ssoProperties = ssoProperties;
    }

    private ApiPortalPropertiesArgs() {
        this.gatewayIds = Codegen.empty();
        this.httpsOnly = Codegen.empty();
        this.public_ = Codegen.empty();
        this.sourceUrls = Codegen.empty();
        this.ssoProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> gatewayIds;
        private @Nullable Output<Boolean> httpsOnly;
        private @Nullable Output<Boolean> public_;
        private @Nullable Output<List<String>> sourceUrls;
        private @Nullable Output<SsoPropertiesArgs> ssoProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayIds = defaults.gatewayIds;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.public_ = defaults.public_;
    	      this.sourceUrls = defaults.sourceUrls;
    	      this.ssoProperties = defaults.ssoProperties;
        }

        public Builder gatewayIds(@Nullable Output<List<String>> gatewayIds) {
            this.gatewayIds = gatewayIds;
            return this;
        }
        public Builder gatewayIds(@Nullable List<String> gatewayIds) {
            this.gatewayIds = Codegen.ofNullable(gatewayIds);
            return this;
        }
        public Builder gatewayIds(String... gatewayIds) {
            return gatewayIds(List.of(gatewayIds));
        }
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = Codegen.ofNullable(httpsOnly);
            return this;
        }
        public Builder public_(@Nullable Output<Boolean> public_) {
            this.public_ = public_;
            return this;
        }
        public Builder public_(@Nullable Boolean public_) {
            this.public_ = Codegen.ofNullable(public_);
            return this;
        }
        public Builder sourceUrls(@Nullable Output<List<String>> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public Builder sourceUrls(@Nullable List<String> sourceUrls) {
            this.sourceUrls = Codegen.ofNullable(sourceUrls);
            return this;
        }
        public Builder sourceUrls(String... sourceUrls) {
            return sourceUrls(List.of(sourceUrls));
        }
        public Builder ssoProperties(@Nullable Output<SsoPropertiesArgs> ssoProperties) {
            this.ssoProperties = ssoProperties;
            return this;
        }
        public Builder ssoProperties(@Nullable SsoPropertiesArgs ssoProperties) {
            this.ssoProperties = Codegen.ofNullable(ssoProperties);
            return this;
        }        public ApiPortalPropertiesArgs build() {
            return new ApiPortalPropertiesArgs(gatewayIds, httpsOnly, public_, sourceUrls, ssoProperties);
        }
    }
}
