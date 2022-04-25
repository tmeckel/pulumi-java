// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkScopedResourceResponse {
    /**
     * @return The full resource Id of the private link scope resource.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * @return The private link scope unique Identifier.
     * 
     */
    private final @Nullable String scopeId;

    @CustomType.Constructor
    private PrivateLinkScopedResourceResponse(
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("scopeId") @Nullable String scopeId) {
        this.resourceId = resourceId;
        this.scopeId = scopeId;
    }

    /**
     * @return The full resource Id of the private link scope resource.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return The private link scope unique Identifier.
     * 
     */
    public Optional<String> scopeId() {
        return Optional.ofNullable(this.scopeId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkScopedResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String scopeId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkScopedResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.scopeId = defaults.scopeId;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder scopeId(@Nullable String scopeId) {
            this.scopeId = scopeId;
            return this;
        }        public PrivateLinkScopedResourceResponse build() {
            return new PrivateLinkScopedResourceResponse(resourceId, scopeId);
        }
    }
}
