// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the DDoS protection settings of the public IP.
 * 
 */
public final class DdosSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DdosSettingsResponse Empty = new DdosSettingsResponse();

    /**
     * The DDoS custom policy associated with the public IP.
     * 
     */
    @Import(name="ddosCustomPolicy")
    private @Nullable SubResourceResponse ddosCustomPolicy;

    /**
     * @return The DDoS custom policy associated with the public IP.
     * 
     */
    public Optional<SubResourceResponse> ddosCustomPolicy() {
        return Optional.ofNullable(this.ddosCustomPolicy);
    }

    /**
     * Enables DDoS protection on the public IP.
     * 
     */
    @Import(name="protectedIP")
    private @Nullable Boolean protectedIP;

    /**
     * @return Enables DDoS protection on the public IP.
     * 
     */
    public Optional<Boolean> protectedIP() {
        return Optional.ofNullable(this.protectedIP);
    }

    /**
     * The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized.
     * 
     */
    @Import(name="protectionCoverage")
    private @Nullable String protectionCoverage;

    /**
     * @return The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized.
     * 
     */
    public Optional<String> protectionCoverage() {
        return Optional.ofNullable(this.protectionCoverage);
    }

    private DdosSettingsResponse() {}

    private DdosSettingsResponse(DdosSettingsResponse $) {
        this.ddosCustomPolicy = $.ddosCustomPolicy;
        this.protectedIP = $.protectedIP;
        this.protectionCoverage = $.protectionCoverage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DdosSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DdosSettingsResponse $;

        public Builder() {
            $ = new DdosSettingsResponse();
        }

        public Builder(DdosSettingsResponse defaults) {
            $ = new DdosSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddosCustomPolicy The DDoS custom policy associated with the public IP.
         * 
         * @return builder
         * 
         */
        public Builder ddosCustomPolicy(@Nullable SubResourceResponse ddosCustomPolicy) {
            $.ddosCustomPolicy = ddosCustomPolicy;
            return this;
        }

        /**
         * @param protectedIP Enables DDoS protection on the public IP.
         * 
         * @return builder
         * 
         */
        public Builder protectedIP(@Nullable Boolean protectedIP) {
            $.protectedIP = protectedIP;
            return this;
        }

        /**
         * @param protectionCoverage The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized.
         * 
         * @return builder
         * 
         */
        public Builder protectionCoverage(@Nullable String protectionCoverage) {
            $.protectionCoverage = protectionCoverage;
            return this;
        }

        public DdosSettingsResponse build() {
            return $;
        }
    }

}
