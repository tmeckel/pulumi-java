// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConnectionApiKeyAuthParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionApiKeyAuthParametersArgs Empty = new ConnectionApiKeyAuthParametersArgs();

    @InputImport(name="apiKeyName", required=true)
      private final Input<String> apiKeyName;

    public Input<String> getApiKeyName() {
        return this.apiKeyName;
    }

    @InputImport(name="apiKeyValue", required=true)
      private final Input<String> apiKeyValue;

    public Input<String> getApiKeyValue() {
        return this.apiKeyValue;
    }

    public ConnectionApiKeyAuthParametersArgs(
        Input<String> apiKeyName,
        Input<String> apiKeyValue) {
        this.apiKeyName = Objects.requireNonNull(apiKeyName, "expected parameter 'apiKeyName' to be non-null");
        this.apiKeyValue = Objects.requireNonNull(apiKeyValue, "expected parameter 'apiKeyValue' to be non-null");
    }

    private ConnectionApiKeyAuthParametersArgs() {
        this.apiKeyName = Input.empty();
        this.apiKeyValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionApiKeyAuthParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiKeyName;
        private Input<String> apiKeyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionApiKeyAuthParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyName = defaults.apiKeyName;
    	      this.apiKeyValue = defaults.apiKeyValue;
        }

        public Builder apiKeyName(Input<String> apiKeyName) {
            this.apiKeyName = Objects.requireNonNull(apiKeyName);
            return this;
        }

        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = Input.of(Objects.requireNonNull(apiKeyName));
            return this;
        }

        public Builder apiKeyValue(Input<String> apiKeyValue) {
            this.apiKeyValue = Objects.requireNonNull(apiKeyValue);
            return this;
        }

        public Builder apiKeyValue(String apiKeyValue) {
            this.apiKeyValue = Input.of(Objects.requireNonNull(apiKeyValue));
            return this;
        }
        public ConnectionApiKeyAuthParametersArgs build() {
            return new ConnectionApiKeyAuthParametersArgs(apiKeyName, apiKeyValue);
        }
    }
}
