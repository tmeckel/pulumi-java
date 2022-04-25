// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private link scope resource reference.
 * 
 */
public final class PrivateLinkScopedResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkScopedResourceResponse Empty = new PrivateLinkScopedResourceResponse();

    /**
     * The full resource Id of the private link scope resource.
     * 
     */
    @Import(name="resourceId")
    private @Nullable String resourceId;

    /**
     * @return The full resource Id of the private link scope resource.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The private link scope unique Identifier.
     * 
     */
    @Import(name="scopeId")
    private @Nullable String scopeId;

    /**
     * @return The private link scope unique Identifier.
     * 
     */
    public Optional<String> scopeId() {
        return Optional.ofNullable(this.scopeId);
    }

    private PrivateLinkScopedResourceResponse() {}

    private PrivateLinkScopedResourceResponse(PrivateLinkScopedResourceResponse $) {
        this.resourceId = $.resourceId;
        this.scopeId = $.scopeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkScopedResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkScopedResourceResponse $;

        public Builder() {
            $ = new PrivateLinkScopedResourceResponse();
        }

        public Builder(PrivateLinkScopedResourceResponse defaults) {
            $ = new PrivateLinkScopedResourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId The full resource Id of the private link scope resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param scopeId The private link scope unique Identifier.
         * 
         * @return builder
         * 
         */
        public Builder scopeId(@Nullable String scopeId) {
            $.scopeId = scopeId;
            return this;
        }

        public PrivateLinkScopedResourceResponse build() {
            return $;
        }
    }

}
