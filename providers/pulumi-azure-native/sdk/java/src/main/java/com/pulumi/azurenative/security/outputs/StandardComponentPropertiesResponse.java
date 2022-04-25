// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StandardComponentPropertiesResponse {
    /**
     * @return Component Key matching componentMetadata
     * 
     */
    private final @Nullable String key;

    @CustomType.Constructor
    private StandardComponentPropertiesResponse(@CustomType.Parameter("key") @Nullable String key) {
        this.key = key;
    }

    /**
     * @return Component Key matching componentMetadata
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardComponentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardComponentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }        public StandardComponentPropertiesResponse build() {
            return new StandardComponentPropertiesResponse(key);
        }
    }
}
