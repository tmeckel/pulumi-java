// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiPropertiesResponse Empty = new ApiPropertiesResponse();

    /**
     * Describes the ServerVersion of an a MongoDB account.
     * 
     */
    @Import(name="serverVersion")
    private @Nullable String serverVersion;

    /**
     * @return Describes the ServerVersion of an a MongoDB account.
     * 
     */
    public Optional<String> serverVersion() {
        return Optional.ofNullable(this.serverVersion);
    }

    private ApiPropertiesResponse() {}

    private ApiPropertiesResponse(ApiPropertiesResponse $) {
        this.serverVersion = $.serverVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiPropertiesResponse $;

        public Builder() {
            $ = new ApiPropertiesResponse();
        }

        public Builder(ApiPropertiesResponse defaults) {
            $ = new ApiPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverVersion Describes the ServerVersion of an a MongoDB account.
         * 
         * @return builder
         * 
         */
        public Builder serverVersion(@Nullable String serverVersion) {
            $.serverVersion = serverVersion;
            return this;
        }

        public ApiPropertiesResponse build() {
            return $;
        }
    }

}
