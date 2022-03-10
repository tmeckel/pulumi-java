// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VolumeLabel {
    private final String label;
    private final String value;

    @OutputCustomType.Constructor
    private VolumeLabel(
        @OutputCustomType.Parameter("label") String label,
        @OutputCustomType.Parameter("value") String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return this.label;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String label;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.value = defaults.value;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public VolumeLabel build() {
            return new VolumeLabel(label, value);
        }
    }
}
