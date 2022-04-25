// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FacebookPageResponse {
    /**
     * @return Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * @return Page id
     * 
     */
    private final String id;

    @CustomType.Constructor
    private FacebookPageResponse(
        @CustomType.Parameter("accessToken") @Nullable String accessToken,
        @CustomType.Parameter("id") String id) {
        this.accessToken = accessToken;
        this.id = id;
    }

    /**
     * @return Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return Page id
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookPageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookPageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.id = defaults.id;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public FacebookPageResponse build() {
            return new FacebookPageResponse(accessToken, id);
        }
    }
}
