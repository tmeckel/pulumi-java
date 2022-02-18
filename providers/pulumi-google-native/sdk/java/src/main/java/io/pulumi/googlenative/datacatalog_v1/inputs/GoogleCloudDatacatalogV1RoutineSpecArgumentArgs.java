// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.enums.GoogleCloudDatacatalogV1RoutineSpecArgumentMode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input or output argument of a function or stored procedure.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecArgumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecArgumentArgs Empty = new GoogleCloudDatacatalogV1RoutineSpecArgumentArgs();

    /**
     * Specifies whether the argument is input or output.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode;

    public Input<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public GoogleCloudDatacatalogV1RoutineSpecArgumentArgs(
        @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode,
        @Nullable Input<String> name,
        @Nullable Input<String> type) {
        this.mode = mode;
        this.name = name;
        this.type = type;
    }

    private GoogleCloudDatacatalogV1RoutineSpecArgumentArgs() {
        this.mode = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode;
        private @Nullable Input<String> name;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setMode(@Nullable Input<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable GoogleCloudDatacatalogV1RoutineSpecArgumentMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public GoogleCloudDatacatalogV1RoutineSpecArgumentArgs build() {
            return new GoogleCloudDatacatalogV1RoutineSpecArgumentArgs(mode, name, type);
        }
    }
}
