// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetDatetimeOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetDatetimeOptionsArgs Empty = new DatasetDatetimeOptionsArgs();

    /**
     * Date/time format of a date parameter
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return Date/time format of a date parameter
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * Locale code for a date parameter
     * 
     */
    @Import(name="localeCode")
    private @Nullable Output<String> localeCode;

    /**
     * @return Locale code for a date parameter
     * 
     */
    public Optional<Output<String>> localeCode() {
        return Optional.ofNullable(this.localeCode);
    }

    /**
     * Timezone offset
     * 
     */
    @Import(name="timezoneOffset")
    private @Nullable Output<String> timezoneOffset;

    /**
     * @return Timezone offset
     * 
     */
    public Optional<Output<String>> timezoneOffset() {
        return Optional.ofNullable(this.timezoneOffset);
    }

    private DatasetDatetimeOptionsArgs() {}

    private DatasetDatetimeOptionsArgs(DatasetDatetimeOptionsArgs $) {
        this.format = $.format;
        this.localeCode = $.localeCode;
        this.timezoneOffset = $.timezoneOffset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetDatetimeOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetDatetimeOptionsArgs $;

        public Builder() {
            $ = new DatasetDatetimeOptionsArgs();
        }

        public Builder(DatasetDatetimeOptionsArgs defaults) {
            $ = new DatasetDatetimeOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format Date/time format of a date parameter
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Date/time format of a date parameter
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param localeCode Locale code for a date parameter
         * 
         * @return builder
         * 
         */
        public Builder localeCode(@Nullable Output<String> localeCode) {
            $.localeCode = localeCode;
            return this;
        }

        /**
         * @param localeCode Locale code for a date parameter
         * 
         * @return builder
         * 
         */
        public Builder localeCode(String localeCode) {
            return localeCode(Output.of(localeCode));
        }

        /**
         * @param timezoneOffset Timezone offset
         * 
         * @return builder
         * 
         */
        public Builder timezoneOffset(@Nullable Output<String> timezoneOffset) {
            $.timezoneOffset = timezoneOffset;
            return this;
        }

        /**
         * @param timezoneOffset Timezone offset
         * 
         * @return builder
         * 
         */
        public Builder timezoneOffset(String timezoneOffset) {
            return timezoneOffset(Output.of(timezoneOffset));
        }

        public DatasetDatetimeOptionsArgs build() {
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}
