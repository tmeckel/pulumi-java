// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource Access Rule.
 * 
 */
public final class ResourceAccessRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceAccessRuleResponse Empty = new ResourceAccessRuleResponse();

    /**
     * Resource Id
     * 
     */
    @InputImport(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * Tenant Id
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public ResourceAccessRuleResponse(
        @Nullable String resourceId,
        @Nullable String tenantId) {
        this.resourceId = resourceId;
        this.tenantId = tenantId;
    }

    private ResourceAccessRuleResponse() {
        this.resourceId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAccessRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAccessRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public ResourceAccessRuleResponse build() {
            return new ResourceAccessRuleResponse(resourceId, tenantId);
        }
    }
}
