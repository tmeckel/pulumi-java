// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.outputs;

import io.pulumi.awsnative.events.outputs.ConnectionParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionHttpParameters {
    private final @Nullable List<ConnectionParameter> bodyParameters;
    private final @Nullable List<ConnectionParameter> headerParameters;
    private final @Nullable List<ConnectionParameter> queryStringParameters;

    @OutputCustomType.Constructor
    private ConnectionHttpParameters(
        @OutputCustomType.Parameter("bodyParameters") @Nullable List<ConnectionParameter> bodyParameters,
        @OutputCustomType.Parameter("headerParameters") @Nullable List<ConnectionParameter> headerParameters,
        @OutputCustomType.Parameter("queryStringParameters") @Nullable List<ConnectionParameter> queryStringParameters) {
        this.bodyParameters = bodyParameters;
        this.headerParameters = headerParameters;
        this.queryStringParameters = queryStringParameters;
    }

    public List<ConnectionParameter> getBodyParameters() {
        return this.bodyParameters == null ? List.of() : this.bodyParameters;
    }
    public List<ConnectionParameter> getHeaderParameters() {
        return this.headerParameters == null ? List.of() : this.headerParameters;
    }
    public List<ConnectionParameter> getQueryStringParameters() {
        return this.queryStringParameters == null ? List.of() : this.queryStringParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionHttpParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectionParameter> bodyParameters;
        private @Nullable List<ConnectionParameter> headerParameters;
        private @Nullable List<ConnectionParameter> queryStringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionHttpParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyParameters = defaults.bodyParameters;
    	      this.headerParameters = defaults.headerParameters;
    	      this.queryStringParameters = defaults.queryStringParameters;
        }

        public Builder bodyParameters(@Nullable List<ConnectionParameter> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }

        public Builder headerParameters(@Nullable List<ConnectionParameter> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        public Builder queryStringParameters(@Nullable List<ConnectionParameter> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public ConnectionHttpParameters build() {
            return new ConnectionHttpParameters(bodyParameters, headerParameters, queryStringParameters);
        }
    }
}
