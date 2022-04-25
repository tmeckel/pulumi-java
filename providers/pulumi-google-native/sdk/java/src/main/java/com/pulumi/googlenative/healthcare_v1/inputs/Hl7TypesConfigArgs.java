// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.TypeArgs;
import com.pulumi.googlenative.healthcare_v1.inputs.VersionSourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Root config for HL7v2 datatype definitions for a specific HL7v2 version.
 * 
 */
public final class Hl7TypesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final Hl7TypesConfigArgs Empty = new Hl7TypesConfigArgs();

    /**
     * The HL7v2 type definitions.
     * 
     */
    @Import(name="type")
    private @Nullable Output<List<TypeArgs>> type;

    /**
     * @return The HL7v2 type definitions.
     * 
     */
    public Optional<Output<List<TypeArgs>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The version selectors that this config applies to. A message must match ALL version sources to apply.
     * 
     */
    @Import(name="version")
    private @Nullable Output<List<VersionSourceArgs>> version;

    /**
     * @return The version selectors that this config applies to. A message must match ALL version sources to apply.
     * 
     */
    public Optional<Output<List<VersionSourceArgs>>> version() {
        return Optional.ofNullable(this.version);
    }

    private Hl7TypesConfigArgs() {}

    private Hl7TypesConfigArgs(Hl7TypesConfigArgs $) {
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Hl7TypesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Hl7TypesConfigArgs $;

        public Builder() {
            $ = new Hl7TypesConfigArgs();
        }

        public Builder(Hl7TypesConfigArgs defaults) {
            $ = new Hl7TypesConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The HL7v2 type definitions.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<List<TypeArgs>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The HL7v2 type definitions.
         * 
         * @return builder
         * 
         */
        public Builder type(List<TypeArgs> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The HL7v2 type definitions.
         * 
         * @return builder
         * 
         */
        public Builder type(TypeArgs... type) {
            return type(List.of(type));
        }

        /**
         * @param version The version selectors that this config applies to. A message must match ALL version sources to apply.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<List<VersionSourceArgs>> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version selectors that this config applies to. A message must match ALL version sources to apply.
         * 
         * @return builder
         * 
         */
        public Builder version(List<VersionSourceArgs> version) {
            return version(Output.of(version));
        }

        /**
         * @param version The version selectors that this config applies to. A message must match ALL version sources to apply.
         * 
         * @return builder
         * 
         */
        public Builder version(VersionSourceArgs... version) {
            return version(List.of(version));
        }

        public Hl7TypesConfigArgs build() {
            return $;
        }
    }

}
