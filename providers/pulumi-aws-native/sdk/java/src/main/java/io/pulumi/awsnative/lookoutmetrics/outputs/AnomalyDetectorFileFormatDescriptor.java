// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorCsvFormatDescriptor;
import io.pulumi.awsnative.lookoutmetrics.outputs.AnomalyDetectorJsonFormatDescriptor;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnomalyDetectorFileFormatDescriptor {
    private final @Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor;
    private final @Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor;

    @OutputCustomType.Constructor
    private AnomalyDetectorFileFormatDescriptor(
        @OutputCustomType.Parameter("csvFormatDescriptor") @Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor,
        @OutputCustomType.Parameter("jsonFormatDescriptor") @Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor) {
        this.csvFormatDescriptor = csvFormatDescriptor;
        this.jsonFormatDescriptor = jsonFormatDescriptor;
    }

    public Optional<AnomalyDetectorCsvFormatDescriptor> getCsvFormatDescriptor() {
        return Optional.ofNullable(this.csvFormatDescriptor);
    }
    public Optional<AnomalyDetectorJsonFormatDescriptor> getJsonFormatDescriptor() {
        return Optional.ofNullable(this.jsonFormatDescriptor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorFileFormatDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor;
        private @Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorFileFormatDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvFormatDescriptor = defaults.csvFormatDescriptor;
    	      this.jsonFormatDescriptor = defaults.jsonFormatDescriptor;
        }

        public Builder csvFormatDescriptor(@Nullable AnomalyDetectorCsvFormatDescriptor csvFormatDescriptor) {
            this.csvFormatDescriptor = csvFormatDescriptor;
            return this;
        }

        public Builder jsonFormatDescriptor(@Nullable AnomalyDetectorJsonFormatDescriptor jsonFormatDescriptor) {
            this.jsonFormatDescriptor = jsonFormatDescriptor;
            return this;
        }
        public AnomalyDetectorFileFormatDescriptor build() {
            return new AnomalyDetectorFileFormatDescriptor(csvFormatDescriptor, jsonFormatDescriptor);
        }
    }
}
