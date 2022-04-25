// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MxRecordResponse {
    /**
     * @return The domain name of the mail host for this MX record.
     * 
     */
    private final @Nullable String exchange;
    /**
     * @return The preference value for this MX record.
     * 
     */
    private final @Nullable Integer preference;

    @CustomType.Constructor
    private MxRecordResponse(
        @CustomType.Parameter("exchange") @Nullable String exchange,
        @CustomType.Parameter("preference") @Nullable Integer preference) {
        this.exchange = exchange;
        this.preference = preference;
    }

    /**
     * @return The domain name of the mail host for this MX record.
     * 
     */
    public Optional<String> exchange() {
        return Optional.ofNullable(this.exchange);
    }
    /**
     * @return The preference value for this MX record.
     * 
     */
    public Optional<Integer> preference() {
        return Optional.ofNullable(this.preference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MxRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exchange;
        private @Nullable Integer preference;

        public Builder() {
    	      // Empty
        }

        public Builder(MxRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.preference = defaults.preference;
        }

        public Builder exchange(@Nullable String exchange) {
            this.exchange = exchange;
            return this;
        }
        public Builder preference(@Nullable Integer preference) {
            this.preference = preference;
            return this;
        }        public MxRecordResponse build() {
            return new MxRecordResponse(exchange, preference);
        }
    }
}
