// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A patient identifier and associated type.
 * 
 */
public final class PatientIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatientIdArgs Empty = new PatientIdArgs();

    /**
     * ID type. For example, MRN or NHS.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return ID type. For example, MRN or NHS.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The patient&#39;s unique identifier.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The patient&#39;s unique identifier.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private PatientIdArgs() {}

    private PatientIdArgs(PatientIdArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatientIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatientIdArgs $;

        public Builder() {
            $ = new PatientIdArgs();
        }

        public Builder(PatientIdArgs defaults) {
            $ = new PatientIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type ID type. For example, MRN or NHS.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type ID type. For example, MRN or NHS.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The patient&#39;s unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The patient&#39;s unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public PatientIdArgs build() {
            return $;
        }
    }

}
