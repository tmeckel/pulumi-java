// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events.outputs;

import com.pulumi.awsnative.events.enums.ApiDestinationHttpMethod;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApiDestinationResult {
    /**
     * @return The arn of the api destination.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The arn of the connection.
     * 
     */
    private final @Nullable String connectionArn;
    private final @Nullable String description;
    private final @Nullable ApiDestinationHttpMethod httpMethod;
    /**
     * @return Url endpoint to invoke.
     * 
     */
    private final @Nullable String invocationEndpoint;
    private final @Nullable Integer invocationRateLimitPerSecond;

    @CustomType.Constructor
    private GetApiDestinationResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("connectionArn") @Nullable String connectionArn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("httpMethod") @Nullable ApiDestinationHttpMethod httpMethod,
        @CustomType.Parameter("invocationEndpoint") @Nullable String invocationEndpoint,
        @CustomType.Parameter("invocationRateLimitPerSecond") @Nullable Integer invocationRateLimitPerSecond) {
        this.arn = arn;
        this.connectionArn = connectionArn;
        this.description = description;
        this.httpMethod = httpMethod;
        this.invocationEndpoint = invocationEndpoint;
        this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
    }

    /**
     * @return The arn of the api destination.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The arn of the connection.
     * 
     */
    public Optional<String> connectionArn() {
        return Optional.ofNullable(this.connectionArn);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<ApiDestinationHttpMethod> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    /**
     * @return Url endpoint to invoke.
     * 
     */
    public Optional<String> invocationEndpoint() {
        return Optional.ofNullable(this.invocationEndpoint);
    }
    public Optional<Integer> invocationRateLimitPerSecond() {
        return Optional.ofNullable(this.invocationRateLimitPerSecond);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiDestinationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String connectionArn;
        private @Nullable String description;
        private @Nullable ApiDestinationHttpMethod httpMethod;
        private @Nullable String invocationEndpoint;
        private @Nullable Integer invocationRateLimitPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiDestinationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.connectionArn = defaults.connectionArn;
    	      this.description = defaults.description;
    	      this.httpMethod = defaults.httpMethod;
    	      this.invocationEndpoint = defaults.invocationEndpoint;
    	      this.invocationRateLimitPerSecond = defaults.invocationRateLimitPerSecond;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder connectionArn(@Nullable String connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder httpMethod(@Nullable ApiDestinationHttpMethod httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Builder invocationEndpoint(@Nullable String invocationEndpoint) {
            this.invocationEndpoint = invocationEndpoint;
            return this;
        }
        public Builder invocationRateLimitPerSecond(@Nullable Integer invocationRateLimitPerSecond) {
            this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
            return this;
        }        public GetApiDestinationResult build() {
            return new GetApiDestinationResult(arn, connectionArn, description, httpMethod, invocationEndpoint, invocationRateLimitPerSecond);
        }
    }
}
