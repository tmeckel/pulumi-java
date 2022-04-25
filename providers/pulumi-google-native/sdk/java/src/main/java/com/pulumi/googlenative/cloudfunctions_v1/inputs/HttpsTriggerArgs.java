// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudfunctions_v1.enums.HttpsTriggerSecurityLevel;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes HttpsTrigger, could be used to connect web hooks to function.
 * 
 */
public final class HttpsTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpsTriggerArgs Empty = new HttpsTriggerArgs();

    /**
     * The security level for the function.
     * 
     */
    @Import(name="securityLevel")
    private @Nullable Output<HttpsTriggerSecurityLevel> securityLevel;

    /**
     * @return The security level for the function.
     * 
     */
    public Optional<Output<HttpsTriggerSecurityLevel>> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }

    private HttpsTriggerArgs() {}

    private HttpsTriggerArgs(HttpsTriggerArgs $) {
        this.securityLevel = $.securityLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpsTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpsTriggerArgs $;

        public Builder() {
            $ = new HttpsTriggerArgs();
        }

        public Builder(HttpsTriggerArgs defaults) {
            $ = new HttpsTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityLevel The security level for the function.
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(@Nullable Output<HttpsTriggerSecurityLevel> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        /**
         * @param securityLevel The security level for the function.
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(HttpsTriggerSecurityLevel securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        public HttpsTriggerArgs build() {
            return $;
        }
    }

}
