// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.inputs.TypeArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.VersionSourceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Root config for HL7v2 datatype definitions for a specific HL7v2 version.
 * 
 */
public final class Hl7TypesConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7TypesConfigArgs Empty = new Hl7TypesConfigArgs();

    /**
     * The HL7v2 type definitions.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<List<TypeArgs>> type;

    public Input<List<TypeArgs>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The version selectors that this config applies to. A message must match ALL version sources to apply.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<List<VersionSourceArgs>> version;

    public Input<List<VersionSourceArgs>> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public Hl7TypesConfigArgs(
        @Nullable Input<List<TypeArgs>> type,
        @Nullable Input<List<VersionSourceArgs>> version) {
        this.type = type;
        this.version = version;
    }

    private Hl7TypesConfigArgs() {
        this.type = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7TypesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TypeArgs>> type;
        private @Nullable Input<List<VersionSourceArgs>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7TypesConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setType(@Nullable Input<List<TypeArgs>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable List<TypeArgs> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVersion(@Nullable Input<List<VersionSourceArgs>> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable List<VersionSourceArgs> version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Hl7TypesConfigArgs build() {
            return new Hl7TypesConfigArgs(type, version);
        }
    }
}
