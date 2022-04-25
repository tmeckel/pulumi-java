// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A CAA record.
 * 
 */
public final class CaaRecordResponse extends com.pulumi.resources.InvokeArgs {

    public static final CaaRecordResponse Empty = new CaaRecordResponse();

    /**
     * The flags for this CAA record as an integer between 0 and 255.
     * 
     */
    @Import(name="flags")
    private @Nullable Integer flags;

    /**
     * @return The flags for this CAA record as an integer between 0 and 255.
     * 
     */
    public Optional<Integer> flags() {
        return Optional.ofNullable(this.flags);
    }

    /**
     * The tag for this CAA record.
     * 
     */
    @Import(name="tag")
    private @Nullable String tag;

    /**
     * @return The tag for this CAA record.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * The value for this CAA record.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return The value for this CAA record.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private CaaRecordResponse() {}

    private CaaRecordResponse(CaaRecordResponse $) {
        this.flags = $.flags;
        this.tag = $.tag;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaaRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaaRecordResponse $;

        public Builder() {
            $ = new CaaRecordResponse();
        }

        public Builder(CaaRecordResponse defaults) {
            $ = new CaaRecordResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param flags The flags for this CAA record as an integer between 0 and 255.
         * 
         * @return builder
         * 
         */
        public Builder flags(@Nullable Integer flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param tag The tag for this CAA record.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable String tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param value The value for this CAA record.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public CaaRecordResponse build() {
            return $;
        }
    }

}
