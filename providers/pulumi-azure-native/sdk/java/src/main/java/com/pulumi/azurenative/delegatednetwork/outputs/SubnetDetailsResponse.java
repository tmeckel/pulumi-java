// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.delegatednetwork.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubnetDetailsResponse {
    /**
     * @return subnet arm resource id
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private SubnetDetailsResponse(@CustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * @return subnet arm resource id
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public SubnetDetailsResponse build() {
            return new SubnetDetailsResponse(id);
        }
    }
}
