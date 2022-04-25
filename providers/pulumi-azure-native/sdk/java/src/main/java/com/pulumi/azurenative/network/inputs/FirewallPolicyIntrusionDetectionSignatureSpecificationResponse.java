// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Intrusion detection signatures specification states.
 * 
 */
public final class FirewallPolicyIntrusionDetectionSignatureSpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyIntrusionDetectionSignatureSpecificationResponse Empty = new FirewallPolicyIntrusionDetectionSignatureSpecificationResponse();

    /**
     * Signature id.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Signature id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The signature state.
     * 
     */
    @Import(name="mode")
    private @Nullable String mode;

    /**
     * @return The signature state.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    private FirewallPolicyIntrusionDetectionSignatureSpecificationResponse() {}

    private FirewallPolicyIntrusionDetectionSignatureSpecificationResponse(FirewallPolicyIntrusionDetectionSignatureSpecificationResponse $) {
        this.id = $.id;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyIntrusionDetectionSignatureSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyIntrusionDetectionSignatureSpecificationResponse $;

        public Builder() {
            $ = new FirewallPolicyIntrusionDetectionSignatureSpecificationResponse();
        }

        public Builder(FirewallPolicyIntrusionDetectionSignatureSpecificationResponse defaults) {
            $ = new FirewallPolicyIntrusionDetectionSignatureSpecificationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Signature id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param mode The signature state.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable String mode) {
            $.mode = mode;
            return this;
        }

        public FirewallPolicyIntrusionDetectionSignatureSpecificationResponse build() {
            return $;
        }
    }

}
