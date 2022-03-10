// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MapsAccountPropertiesResponse {
    /**
     * A unique identifier for the maps account
     * 
     */
    private final @Nullable String xMsClientId;

    @OutputCustomType.Constructor
    private MapsAccountPropertiesResponse(@OutputCustomType.Parameter("xMsClientId") @Nullable String xMsClientId) {
        this.xMsClientId = xMsClientId;
    }

    /**
     * A unique identifier for the maps account
     * 
    */
    public Optional<String> getXMsClientId() {
        return Optional.ofNullable(this.xMsClientId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MapsAccountPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String xMsClientId;

        public Builder() {
    	      // Empty
        }

        public Builder(MapsAccountPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xMsClientId = defaults.xMsClientId;
        }

        public Builder xMsClientId(@Nullable String xMsClientId) {
            this.xMsClientId = xMsClientId;
            return this;
        }
        public MapsAccountPropertiesResponse build() {
            return new MapsAccountPropertiesResponse(xMsClientId);
        }
    }
}
