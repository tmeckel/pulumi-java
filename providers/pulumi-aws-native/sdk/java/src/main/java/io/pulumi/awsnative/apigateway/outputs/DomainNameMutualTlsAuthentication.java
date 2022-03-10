// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainNameMutualTlsAuthentication {
    private final @Nullable String truststoreUri;
    private final @Nullable String truststoreVersion;

    @OutputCustomType.Constructor
    private DomainNameMutualTlsAuthentication(
        @OutputCustomType.Parameter("truststoreUri") @Nullable String truststoreUri,
        @OutputCustomType.Parameter("truststoreVersion") @Nullable String truststoreVersion) {
        this.truststoreUri = truststoreUri;
        this.truststoreVersion = truststoreVersion;
    }

    public Optional<String> getTruststoreUri() {
        return Optional.ofNullable(this.truststoreUri);
    }
    public Optional<String> getTruststoreVersion() {
        return Optional.ofNullable(this.truststoreVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameMutualTlsAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String truststoreUri;
        private @Nullable String truststoreVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameMutualTlsAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.truststoreUri = defaults.truststoreUri;
    	      this.truststoreVersion = defaults.truststoreVersion;
        }

        public Builder truststoreUri(@Nullable String truststoreUri) {
            this.truststoreUri = truststoreUri;
            return this;
        }

        public Builder truststoreVersion(@Nullable String truststoreVersion) {
            this.truststoreVersion = truststoreVersion;
            return this;
        }
        public DomainNameMutualTlsAuthentication build() {
            return new DomainNameMutualTlsAuthentication(truststoreUri, truststoreVersion);
        }
    }
}
