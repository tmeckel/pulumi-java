// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImagePipelineImageTestsConfiguration {
    /**
     * @return Defines if tests should be executed when building this image.
     * 
     */
    private final @Nullable Boolean imageTestsEnabled;
    /**
     * @return The maximum time in minutes that tests are permitted to run.
     * 
     */
    private final @Nullable Integer timeoutMinutes;

    @CustomType.Constructor
    private ImagePipelineImageTestsConfiguration(
        @CustomType.Parameter("imageTestsEnabled") @Nullable Boolean imageTestsEnabled,
        @CustomType.Parameter("timeoutMinutes") @Nullable Integer timeoutMinutes) {
        this.imageTestsEnabled = imageTestsEnabled;
        this.timeoutMinutes = timeoutMinutes;
    }

    /**
     * @return Defines if tests should be executed when building this image.
     * 
     */
    public Optional<Boolean> imageTestsEnabled() {
        return Optional.ofNullable(this.imageTestsEnabled);
    }
    /**
     * @return The maximum time in minutes that tests are permitted to run.
     * 
     */
    public Optional<Integer> timeoutMinutes() {
        return Optional.ofNullable(this.timeoutMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineImageTestsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean imageTestsEnabled;
        private @Nullable Integer timeoutMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineImageTestsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageTestsEnabled = defaults.imageTestsEnabled;
    	      this.timeoutMinutes = defaults.timeoutMinutes;
        }

        public Builder imageTestsEnabled(@Nullable Boolean imageTestsEnabled) {
            this.imageTestsEnabled = imageTestsEnabled;
            return this;
        }
        public Builder timeoutMinutes(@Nullable Integer timeoutMinutes) {
            this.timeoutMinutes = timeoutMinutes;
            return this;
        }        public ImagePipelineImageTestsConfiguration build() {
            return new ImagePipelineImageTestsConfiguration(imageTestsEnabled, timeoutMinutes);
        }
    }
}
