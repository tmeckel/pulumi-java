// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ApiErrorBaseResponse;
import com.pulumi.azurenative.compute.outputs.InnerErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiErrorResponse {
    /**
     * @return The error code.
     * 
     */
    private final @Nullable String code;
    /**
     * @return The Api error details
     * 
     */
    private final @Nullable List<ApiErrorBaseResponse> details;
    /**
     * @return The Api inner error
     * 
     */
    private final @Nullable InnerErrorResponse innererror;
    /**
     * @return The error message.
     * 
     */
    private final @Nullable String message;
    /**
     * @return The target of the particular error.
     * 
     */
    private final @Nullable String target;

    @CustomType.Constructor
    private ApiErrorResponse(
        @CustomType.Parameter("code") @Nullable String code,
        @CustomType.Parameter("details") @Nullable List<ApiErrorBaseResponse> details,
        @CustomType.Parameter("innererror") @Nullable InnerErrorResponse innererror,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("target") @Nullable String target) {
        this.code = code;
        this.details = details;
        this.innererror = innererror;
        this.message = message;
        this.target = target;
    }

    /**
     * @return The error code.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return The Api error details
     * 
     */
    public List<ApiErrorBaseResponse> details() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * @return The Api inner error
     * 
     */
    public Optional<InnerErrorResponse> innererror() {
        return Optional.ofNullable(this.innererror);
    }
    /**
     * @return The error message.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return The target of the particular error.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable List<ApiErrorBaseResponse> details;
        private @Nullable InnerErrorResponse innererror;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.innererror = defaults.innererror;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder details(@Nullable List<ApiErrorBaseResponse> details) {
            this.details = details;
            return this;
        }
        public Builder details(ApiErrorBaseResponse... details) {
            return details(List.of(details));
        }
        public Builder innererror(@Nullable InnerErrorResponse innererror) {
            this.innererror = innererror;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public ApiErrorResponse build() {
            return new ApiErrorResponse(code, details, innererror, message, target);
        }
    }
}
