// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Issue contract Update Properties.
 * 
 */
public final class KeyVaultLastAccessStatusContractPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultLastAccessStatusContractPropertiesResponse Empty = new KeyVaultLastAccessStatusContractPropertiesResponse();

    /**
     * Last status code for sync and refresh of secret from key vault.
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    /**
     * @return Last status code for sync and refresh of secret from key vault.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Details of the error else empty.
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    /**
     * @return Details of the error else empty.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Last time secret was accessed. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Import(name="timeStampUtc")
    private @Nullable String timeStampUtc;

    /**
     * @return Last time secret was accessed. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    public Optional<String> timeStampUtc() {
        return Optional.ofNullable(this.timeStampUtc);
    }

    private KeyVaultLastAccessStatusContractPropertiesResponse() {}

    private KeyVaultLastAccessStatusContractPropertiesResponse(KeyVaultLastAccessStatusContractPropertiesResponse $) {
        this.code = $.code;
        this.message = $.message;
        this.timeStampUtc = $.timeStampUtc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultLastAccessStatusContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultLastAccessStatusContractPropertiesResponse $;

        public Builder() {
            $ = new KeyVaultLastAccessStatusContractPropertiesResponse();
        }

        public Builder(KeyVaultLastAccessStatusContractPropertiesResponse defaults) {
            $ = new KeyVaultLastAccessStatusContractPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Last status code for sync and refresh of secret from key vault.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        /**
         * @param message Details of the error else empty.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        /**
         * @param timeStampUtc Last time secret was accessed. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
         * 
         * @return builder
         * 
         */
        public Builder timeStampUtc(@Nullable String timeStampUtc) {
            $.timeStampUtc = timeStampUtc;
            return this;
        }

        public KeyVaultLastAccessStatusContractPropertiesResponse build() {
            return $;
        }
    }

}
