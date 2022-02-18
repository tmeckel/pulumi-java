// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.enums.SchemaPackageSchematizedParsingType;
import io.pulumi.googlenative.healthcare_v1.enums.SchemaPackageUnexpectedSegmentHandling;
import io.pulumi.googlenative.healthcare_v1.inputs.Hl7SchemaConfigArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.Hl7TypesConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A schema package contains a set of schemas and type definitions.
 * 
 */
public final class SchemaPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaPackageArgs Empty = new SchemaPackageArgs();

    /**
     * Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent.
     * 
     */
    @InputImport(name="ignoreMinOccurs")
    private final @Nullable Input<Boolean> ignoreMinOccurs;

    public Input<Boolean> getIgnoreMinOccurs() {
        return this.ignoreMinOccurs == null ? Input.empty() : this.ignoreMinOccurs;
    }

    /**
     * Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same message type and trigger event if their VersionSources all match an incoming message.
     * 
     */
    @InputImport(name="schemas")
    private final @Nullable Input<List<Hl7SchemaConfigArgs>> schemas;

    public Input<List<Hl7SchemaConfigArgs>> getSchemas() {
        return this.schemas == null ? Input.empty() : this.schemas;
    }

    /**
     * Determines how messages that fail to parse are handled.
     * 
     */
    @InputImport(name="schematizedParsingType")
    private final @Nullable Input<SchemaPackageSchematizedParsingType> schematizedParsingType;

    public Input<SchemaPackageSchematizedParsingType> getSchematizedParsingType() {
        return this.schematizedParsingType == null ? Input.empty() : this.schematizedParsingType;
    }

    /**
     * Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices with the same type name if their VersionSources all match an incoming message.
     * 
     */
    @InputImport(name="types")
    private final @Nullable Input<List<Hl7TypesConfigArgs>> types;

    public Input<List<Hl7TypesConfigArgs>> getTypes() {
        return this.types == null ? Input.empty() : this.types;
    }

    /**
     * Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    @InputImport(name="unexpectedSegmentHandling")
    private final @Nullable Input<SchemaPackageUnexpectedSegmentHandling> unexpectedSegmentHandling;

    public Input<SchemaPackageUnexpectedSegmentHandling> getUnexpectedSegmentHandling() {
        return this.unexpectedSegmentHandling == null ? Input.empty() : this.unexpectedSegmentHandling;
    }

    public SchemaPackageArgs(
        @Nullable Input<Boolean> ignoreMinOccurs,
        @Nullable Input<List<Hl7SchemaConfigArgs>> schemas,
        @Nullable Input<SchemaPackageSchematizedParsingType> schematizedParsingType,
        @Nullable Input<List<Hl7TypesConfigArgs>> types,
        @Nullable Input<SchemaPackageUnexpectedSegmentHandling> unexpectedSegmentHandling) {
        this.ignoreMinOccurs = ignoreMinOccurs;
        this.schemas = schemas;
        this.schematizedParsingType = schematizedParsingType;
        this.types = types;
        this.unexpectedSegmentHandling = unexpectedSegmentHandling;
    }

    private SchemaPackageArgs() {
        this.ignoreMinOccurs = Input.empty();
        this.schemas = Input.empty();
        this.schematizedParsingType = Input.empty();
        this.types = Input.empty();
        this.unexpectedSegmentHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> ignoreMinOccurs;
        private @Nullable Input<List<Hl7SchemaConfigArgs>> schemas;
        private @Nullable Input<SchemaPackageSchematizedParsingType> schematizedParsingType;
        private @Nullable Input<List<Hl7TypesConfigArgs>> types;
        private @Nullable Input<SchemaPackageUnexpectedSegmentHandling> unexpectedSegmentHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMinOccurs = defaults.ignoreMinOccurs;
    	      this.schemas = defaults.schemas;
    	      this.schematizedParsingType = defaults.schematizedParsingType;
    	      this.types = defaults.types;
    	      this.unexpectedSegmentHandling = defaults.unexpectedSegmentHandling;
        }

        public Builder setIgnoreMinOccurs(@Nullable Input<Boolean> ignoreMinOccurs) {
            this.ignoreMinOccurs = ignoreMinOccurs;
            return this;
        }

        public Builder setIgnoreMinOccurs(@Nullable Boolean ignoreMinOccurs) {
            this.ignoreMinOccurs = Input.ofNullable(ignoreMinOccurs);
            return this;
        }

        public Builder setSchemas(@Nullable Input<List<Hl7SchemaConfigArgs>> schemas) {
            this.schemas = schemas;
            return this;
        }

        public Builder setSchemas(@Nullable List<Hl7SchemaConfigArgs> schemas) {
            this.schemas = Input.ofNullable(schemas);
            return this;
        }

        public Builder setSchematizedParsingType(@Nullable Input<SchemaPackageSchematizedParsingType> schematizedParsingType) {
            this.schematizedParsingType = schematizedParsingType;
            return this;
        }

        public Builder setSchematizedParsingType(@Nullable SchemaPackageSchematizedParsingType schematizedParsingType) {
            this.schematizedParsingType = Input.ofNullable(schematizedParsingType);
            return this;
        }

        public Builder setTypes(@Nullable Input<List<Hl7TypesConfigArgs>> types) {
            this.types = types;
            return this;
        }

        public Builder setTypes(@Nullable List<Hl7TypesConfigArgs> types) {
            this.types = Input.ofNullable(types);
            return this;
        }

        public Builder setUnexpectedSegmentHandling(@Nullable Input<SchemaPackageUnexpectedSegmentHandling> unexpectedSegmentHandling) {
            this.unexpectedSegmentHandling = unexpectedSegmentHandling;
            return this;
        }

        public Builder setUnexpectedSegmentHandling(@Nullable SchemaPackageUnexpectedSegmentHandling unexpectedSegmentHandling) {
            this.unexpectedSegmentHandling = Input.ofNullable(unexpectedSegmentHandling);
            return this;
        }

        public SchemaPackageArgs build() {
            return new SchemaPackageArgs(ignoreMinOccurs, schemas, schematizedParsingType, types, unexpectedSegmentHandling);
        }
    }
}
