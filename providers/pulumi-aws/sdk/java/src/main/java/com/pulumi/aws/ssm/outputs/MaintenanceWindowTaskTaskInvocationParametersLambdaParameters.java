// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaintenanceWindowTaskTaskInvocationParametersLambdaParameters {
    /**
     * @return Pass client-specific information to the Lambda function that you are invoking.
     * 
     */
    private final @Nullable String clientContext;
    /**
     * @return JSON to provide to your Lambda function as input.
     * 
     */
    private final @Nullable String payload;
    /**
     * @return Specify a Lambda function version or alias name.
     * 
     */
    private final @Nullable String qualifier;

    @CustomType.Constructor
    private MaintenanceWindowTaskTaskInvocationParametersLambdaParameters(
        @CustomType.Parameter("clientContext") @Nullable String clientContext,
        @CustomType.Parameter("payload") @Nullable String payload,
        @CustomType.Parameter("qualifier") @Nullable String qualifier) {
        this.clientContext = clientContext;
        this.payload = payload;
        this.qualifier = qualifier;
    }

    /**
     * @return Pass client-specific information to the Lambda function that you are invoking.
     * 
     */
    public Optional<String> clientContext() {
        return Optional.ofNullable(this.clientContext);
    }
    /**
     * @return JSON to provide to your Lambda function as input.
     * 
     */
    public Optional<String> payload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * @return Specify a Lambda function version or alias name.
     * 
     */
    public Optional<String> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientContext;
        private @Nullable String payload;
        private @Nullable String qualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersLambdaParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientContext = defaults.clientContext;
    	      this.payload = defaults.payload;
    	      this.qualifier = defaults.qualifier;
        }

        public Builder clientContext(@Nullable String clientContext) {
            this.clientContext = clientContext;
            return this;
        }
        public Builder payload(@Nullable String payload) {
            this.payload = payload;
            return this;
        }
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }        public MaintenanceWindowTaskTaskInvocationParametersLambdaParameters build() {
            return new MaintenanceWindowTaskTaskInvocationParametersLambdaParameters(clientContext, payload, qualifier);
        }
    }
}
