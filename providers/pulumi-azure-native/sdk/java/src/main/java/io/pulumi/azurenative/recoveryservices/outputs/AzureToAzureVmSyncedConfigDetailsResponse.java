// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.InputEndpointResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureToAzureVmSyncedConfigDetailsResponse {
    /**
     * The Azure VM input endpoints.
     * 
     */
    private final @Nullable List<InputEndpointResponse> inputEndpoints;
    /**
     * The Azure VM tags.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor
    private AzureToAzureVmSyncedConfigDetailsResponse(
        @OutputCustomType.Parameter("inputEndpoints") @Nullable List<InputEndpointResponse> inputEndpoints,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.inputEndpoints = inputEndpoints;
        this.tags = tags;
    }

    /**
     * The Azure VM input endpoints.
     * 
    */
    public List<InputEndpointResponse> getInputEndpoints() {
        return this.inputEndpoints == null ? List.of() : this.inputEndpoints;
    }
    /**
     * The Azure VM tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureToAzureVmSyncedConfigDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InputEndpointResponse> inputEndpoints;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureToAzureVmSyncedConfigDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputEndpoints = defaults.inputEndpoints;
    	      this.tags = defaults.tags;
        }

        public Builder inputEndpoints(@Nullable List<InputEndpointResponse> inputEndpoints) {
            this.inputEndpoints = inputEndpoints;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public AzureToAzureVmSyncedConfigDetailsResponse build() {
            return new AzureToAzureVmSyncedConfigDetailsResponse(inputEndpoints, tags);
        }
    }
}
