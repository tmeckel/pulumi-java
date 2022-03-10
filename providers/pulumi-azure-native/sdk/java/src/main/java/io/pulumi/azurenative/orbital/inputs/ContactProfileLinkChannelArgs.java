// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.azurenative.orbital.inputs.EndPointArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact Profile Link Channel
 * 
 */
public final class ContactProfileLinkChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactProfileLinkChannelArgs Empty = new ContactProfileLinkChannelArgs();

    /**
     * Bandwidth in MHz
     * 
     */
    @InputImport(name="bandwidthMHz", required=true)
      private final Input<Double> bandwidthMHz;

    public Input<Double> getBandwidthMHz() {
        return this.bandwidthMHz;
    }

    /**
     * Center Frequency in MHz
     * 
     */
    @InputImport(name="centerFrequencyMHz", required=true)
      private final Input<Double> centerFrequencyMHz;

    public Input<Double> getCenterFrequencyMHz() {
        return this.centerFrequencyMHz;
    }

    /**
     * Configuration for decoding
     * 
     */
    @InputImport(name="decodingConfiguration")
      private final @Nullable Input<String> decodingConfiguration;

    public Input<String> getDecodingConfiguration() {
        return this.decodingConfiguration == null ? Input.empty() : this.decodingConfiguration;
    }

    /**
     * Configuration for demodulation
     * 
     */
    @InputImport(name="demodulationConfiguration")
      private final @Nullable Input<String> demodulationConfiguration;

    public Input<String> getDemodulationConfiguration() {
        return this.demodulationConfiguration == null ? Input.empty() : this.demodulationConfiguration;
    }

    /**
     * Configuration for encoding
     * 
     */
    @InputImport(name="encodingConfiguration")
      private final @Nullable Input<String> encodingConfiguration;

    public Input<String> getEncodingConfiguration() {
        return this.encodingConfiguration == null ? Input.empty() : this.encodingConfiguration;
    }

    /**
     * Customer End point to store/retrieve data during a contact.
     * 
     */
    @InputImport(name="endPoint", required=true)
      private final Input<EndPointArgs> endPoint;

    public Input<EndPointArgs> getEndPoint() {
        return this.endPoint;
    }

    /**
     * Configuration for modulation
     * 
     */
    @InputImport(name="modulationConfiguration")
      private final @Nullable Input<String> modulationConfiguration;

    public Input<String> getModulationConfiguration() {
        return this.modulationConfiguration == null ? Input.empty() : this.modulationConfiguration;
    }

    public ContactProfileLinkChannelArgs(
        Input<Double> bandwidthMHz,
        Input<Double> centerFrequencyMHz,
        @Nullable Input<String> decodingConfiguration,
        @Nullable Input<String> demodulationConfiguration,
        @Nullable Input<String> encodingConfiguration,
        Input<EndPointArgs> endPoint,
        @Nullable Input<String> modulationConfiguration) {
        this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz, "expected parameter 'bandwidthMHz' to be non-null");
        this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz, "expected parameter 'centerFrequencyMHz' to be non-null");
        this.decodingConfiguration = decodingConfiguration;
        this.demodulationConfiguration = demodulationConfiguration;
        this.encodingConfiguration = encodingConfiguration;
        this.endPoint = Objects.requireNonNull(endPoint, "expected parameter 'endPoint' to be non-null");
        this.modulationConfiguration = modulationConfiguration;
    }

    private ContactProfileLinkChannelArgs() {
        this.bandwidthMHz = Input.empty();
        this.centerFrequencyMHz = Input.empty();
        this.decodingConfiguration = Input.empty();
        this.demodulationConfiguration = Input.empty();
        this.encodingConfiguration = Input.empty();
        this.endPoint = Input.empty();
        this.modulationConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactProfileLinkChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> bandwidthMHz;
        private Input<Double> centerFrequencyMHz;
        private @Nullable Input<String> decodingConfiguration;
        private @Nullable Input<String> demodulationConfiguration;
        private @Nullable Input<String> encodingConfiguration;
        private Input<EndPointArgs> endPoint;
        private @Nullable Input<String> modulationConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactProfileLinkChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthMHz = defaults.bandwidthMHz;
    	      this.centerFrequencyMHz = defaults.centerFrequencyMHz;
    	      this.decodingConfiguration = defaults.decodingConfiguration;
    	      this.demodulationConfiguration = defaults.demodulationConfiguration;
    	      this.encodingConfiguration = defaults.encodingConfiguration;
    	      this.endPoint = defaults.endPoint;
    	      this.modulationConfiguration = defaults.modulationConfiguration;
        }

        public Builder bandwidthMHz(Input<Double> bandwidthMHz) {
            this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz);
            return this;
        }

        public Builder bandwidthMHz(Double bandwidthMHz) {
            this.bandwidthMHz = Input.of(Objects.requireNonNull(bandwidthMHz));
            return this;
        }

        public Builder centerFrequencyMHz(Input<Double> centerFrequencyMHz) {
            this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz);
            return this;
        }

        public Builder centerFrequencyMHz(Double centerFrequencyMHz) {
            this.centerFrequencyMHz = Input.of(Objects.requireNonNull(centerFrequencyMHz));
            return this;
        }

        public Builder decodingConfiguration(@Nullable Input<String> decodingConfiguration) {
            this.decodingConfiguration = decodingConfiguration;
            return this;
        }

        public Builder decodingConfiguration(@Nullable String decodingConfiguration) {
            this.decodingConfiguration = Input.ofNullable(decodingConfiguration);
            return this;
        }

        public Builder demodulationConfiguration(@Nullable Input<String> demodulationConfiguration) {
            this.demodulationConfiguration = demodulationConfiguration;
            return this;
        }

        public Builder demodulationConfiguration(@Nullable String demodulationConfiguration) {
            this.demodulationConfiguration = Input.ofNullable(demodulationConfiguration);
            return this;
        }

        public Builder encodingConfiguration(@Nullable Input<String> encodingConfiguration) {
            this.encodingConfiguration = encodingConfiguration;
            return this;
        }

        public Builder encodingConfiguration(@Nullable String encodingConfiguration) {
            this.encodingConfiguration = Input.ofNullable(encodingConfiguration);
            return this;
        }

        public Builder endPoint(Input<EndPointArgs> endPoint) {
            this.endPoint = Objects.requireNonNull(endPoint);
            return this;
        }

        public Builder endPoint(EndPointArgs endPoint) {
            this.endPoint = Input.of(Objects.requireNonNull(endPoint));
            return this;
        }

        public Builder modulationConfiguration(@Nullable Input<String> modulationConfiguration) {
            this.modulationConfiguration = modulationConfiguration;
            return this;
        }

        public Builder modulationConfiguration(@Nullable String modulationConfiguration) {
            this.modulationConfiguration = Input.ofNullable(modulationConfiguration);
            return this;
        }
        public ContactProfileLinkChannelArgs build() {
            return new ContactProfileLinkChannelArgs(bandwidthMHz, centerFrequencyMHz, decodingConfiguration, demodulationConfiguration, encodingConfiguration, endPoint, modulationConfiguration);
        }
    }
}
