// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainMappingSpec {
    /**
     * @return The mode of the certificate.
     * Default value is `AUTOMATIC`.
     * Possible values are `NONE` and `AUTOMATIC`.
     * 
     */
    private final @Nullable String certificateMode;
    /**
     * @return If set, the mapping will override any mapping set before this spec was set.
     * It is recommended that the user leaves this empty to receive an error
     * warning about a potential conflict and only set it once the respective UI
     * has given such a warning.
     * 
     */
    private final @Nullable Boolean forceOverride;
    /**
     * @return The name of the Cloud Run Service that this DomainMapping applies to.
     * The route must exist.
     * 
     */
    private final String routeName;

    @CustomType.Constructor
    private DomainMappingSpec(
        @CustomType.Parameter("certificateMode") @Nullable String certificateMode,
        @CustomType.Parameter("forceOverride") @Nullable Boolean forceOverride,
        @CustomType.Parameter("routeName") String routeName) {
        this.certificateMode = certificateMode;
        this.forceOverride = forceOverride;
        this.routeName = routeName;
    }

    /**
     * @return The mode of the certificate.
     * Default value is `AUTOMATIC`.
     * Possible values are `NONE` and `AUTOMATIC`.
     * 
     */
    public Optional<String> certificateMode() {
        return Optional.ofNullable(this.certificateMode);
    }
    /**
     * @return If set, the mapping will override any mapping set before this spec was set.
     * It is recommended that the user leaves this empty to receive an error
     * warning about a potential conflict and only set it once the respective UI
     * has given such a warning.
     * 
     */
    public Optional<Boolean> forceOverride() {
        return Optional.ofNullable(this.forceOverride);
    }
    /**
     * @return The name of the Cloud Run Service that this DomainMapping applies to.
     * The route must exist.
     * 
     */
    public String routeName() {
        return this.routeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateMode;
        private @Nullable Boolean forceOverride;
        private String routeName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMode = defaults.certificateMode;
    	      this.forceOverride = defaults.forceOverride;
    	      this.routeName = defaults.routeName;
        }

        public Builder certificateMode(@Nullable String certificateMode) {
            this.certificateMode = certificateMode;
            return this;
        }
        public Builder forceOverride(@Nullable Boolean forceOverride) {
            this.forceOverride = forceOverride;
            return this;
        }
        public Builder routeName(String routeName) {
            this.routeName = Objects.requireNonNull(routeName);
            return this;
        }        public DomainMappingSpec build() {
            return new DomainMappingSpec(certificateMode, forceOverride, routeName);
        }
    }
}
