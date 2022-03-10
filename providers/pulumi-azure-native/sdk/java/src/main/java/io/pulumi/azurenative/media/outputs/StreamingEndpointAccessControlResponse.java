// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AkamaiAccessControlResponse;
import io.pulumi.azurenative.media.outputs.IPAccessControlResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StreamingEndpointAccessControlResponse {
    /**
     * The access control of Akamai
     * 
     */
    private final @Nullable AkamaiAccessControlResponse akamai;
    /**
     * The IP access control of the streaming endpoint.
     * 
     */
    private final @Nullable IPAccessControlResponse ip;

    @OutputCustomType.Constructor
    private StreamingEndpointAccessControlResponse(
        @OutputCustomType.Parameter("akamai") @Nullable AkamaiAccessControlResponse akamai,
        @OutputCustomType.Parameter("ip") @Nullable IPAccessControlResponse ip) {
        this.akamai = akamai;
        this.ip = ip;
    }

    /**
     * The access control of Akamai
     * 
    */
    public Optional<AkamaiAccessControlResponse> getAkamai() {
        return Optional.ofNullable(this.akamai);
    }
    /**
     * The IP access control of the streaming endpoint.
     * 
    */
    public Optional<IPAccessControlResponse> getIp() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingEndpointAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AkamaiAccessControlResponse akamai;
        private @Nullable IPAccessControlResponse ip;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingEndpointAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.akamai = defaults.akamai;
    	      this.ip = defaults.ip;
        }

        public Builder akamai(@Nullable AkamaiAccessControlResponse akamai) {
            this.akamai = akamai;
            return this;
        }

        public Builder ip(@Nullable IPAccessControlResponse ip) {
            this.ip = ip;
            return this;
        }
        public StreamingEndpointAccessControlResponse build() {
            return new StreamingEndpointAccessControlResponse(akamai, ip);
        }
    }
}
