// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBasePathMappingResult {
    private final @Nullable String id;
    /**
     * @return The ID of the API.
     * 
     */
    private final @Nullable String restApiId;
    /**
     * @return The name of the API&#39;s stage.
     * 
     */
    private final @Nullable String stage;

    @CustomType.Constructor
    private GetBasePathMappingResult(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("restApiId") @Nullable String restApiId,
        @CustomType.Parameter("stage") @Nullable String stage) {
        this.id = id;
        this.restApiId = restApiId;
        this.stage = stage;
    }

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The ID of the API.
     * 
     */
    public Optional<String> restApiId() {
        return Optional.ofNullable(this.restApiId);
    }
    /**
     * @return The name of the API&#39;s stage.
     * 
     */
    public Optional<String> stage() {
        return Optional.ofNullable(this.stage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBasePathMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String restApiId;
        private @Nullable String stage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBasePathMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.restApiId = defaults.restApiId;
    	      this.stage = defaults.stage;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder restApiId(@Nullable String restApiId) {
            this.restApiId = restApiId;
            return this;
        }
        public Builder stage(@Nullable String stage) {
            this.stage = stage;
            return this;
        }        public GetBasePathMappingResult build() {
            return new GetBasePathMappingResult(id, restApiId, stage);
        }
    }
}
