// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LinkedIntegrationRuntimeRbacAuthorizationResponse {
    /**
     * The authorization type for integration runtime sharing.
     * Expected value is 'RBAC'.
     * 
     */
    private final String authorizationType;
    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    private final String resourceId;

    @OutputCustomType.Constructor
    private LinkedIntegrationRuntimeRbacAuthorizationResponse(
        @OutputCustomType.Parameter("authorizationType") String authorizationType,
        @OutputCustomType.Parameter("resourceId") String resourceId) {
        this.authorizationType = authorizationType;
        this.resourceId = resourceId;
    }

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is 'RBAC'.
     * 
    */
    public String getAuthorizationType() {
        return this.authorizationType;
    }
    /**
     * The resource identifier of the integration runtime to be shared.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationType;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public LinkedIntegrationRuntimeRbacAuthorizationResponse build() {
            return new LinkedIntegrationRuntimeRbacAuthorizationResponse(authorizationType, resourceId);
        }
    }
}
