// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PngLayerArgs extends io.pulumi.resources.ResourceArgs {

    public static final PngLayerArgs Empty = new PngLayerArgs();

    @InputImport(name="height")
    private final @Nullable Input<String> height;

    public Input<String> getHeight() {
        return this.height == null ? Input.empty() : this.height;
    }

    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    @InputImport(name="width")
    private final @Nullable Input<String> width;

    public Input<String> getWidth() {
        return this.width == null ? Input.empty() : this.width;
    }

    public PngLayerArgs(
        @Nullable Input<String> height,
        @Nullable Input<String> label,
        Input<String> odataType,
        @Nullable Input<String> width) {
        this.height = height;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.width = width;
    }

    private PngLayerArgs() {
        this.height = Input.empty();
        this.label = Input.empty();
        this.odataType = Input.empty();
        this.width = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PngLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> height;
        private @Nullable Input<String> label;
        private Input<String> odataType;
        private @Nullable Input<String> width;

        public Builder() {
    	      // Empty
        }

        public Builder(PngLayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.width = defaults.width;
        }

        public Builder setHeight(@Nullable Input<String> height) {
            this.height = height;
            return this;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = Input.ofNullable(height);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setWidth(@Nullable Input<String> width) {
            this.width = width;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = Input.ofNullable(width);
            return this;
        }

        public PngLayerArgs build() {
            return new PngLayerArgs(height, label, odataType, width);
        }
    }
}
