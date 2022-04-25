// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ManagedIntegrationRuntimeStatusResponse;
import com.pulumi.azurenative.datafactory.outputs.SelfHostedIntegrationRuntimeStatusResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIntegrationRuntimeStatusResult {
    /**
     * @return The integration runtime name.
     * 
     */
    private final String name;
    /**
     * @return Integration runtime properties.
     * 
     */
    private final Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties;

    @CustomType.Constructor
    private GetIntegrationRuntimeStatusResult(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties) {
        this.name = name;
        this.properties = properties;
    }

    /**
     * @return The integration runtime name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Integration runtime properties.
     * 
     */
    public Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(Either<ManagedIntegrationRuntimeStatusResponse,SelfHostedIntegrationRuntimeStatusResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public GetIntegrationRuntimeStatusResult build() {
            return new GetIntegrationRuntimeStatusResult(name, properties);
        }
    }
}
