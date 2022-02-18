// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.AndroidDeviceResponse;
import io.pulumi.googlenative.testing_v1.outputs.IosDeviceResponse;
import java.util.Objects;

@OutputCustomType
public final class EnvironmentResponse {
    /**
     * An Android device which must be used with an Android test.
     * 
     */
    private final AndroidDeviceResponse androidDevice;
    /**
     * An iOS device which must be used with an iOS test.
     * 
     */
    private final IosDeviceResponse iosDevice;

    @OutputCustomType.Constructor({"androidDevice","iosDevice"})
    private EnvironmentResponse(
        AndroidDeviceResponse androidDevice,
        IosDeviceResponse iosDevice) {
        this.androidDevice = Objects.requireNonNull(androidDevice);
        this.iosDevice = Objects.requireNonNull(iosDevice);
    }

    /**
     * An Android device which must be used with an Android test.
     * 
     */
    public AndroidDeviceResponse getAndroidDevice() {
        return this.androidDevice;
    }
    /**
     * An iOS device which must be used with an iOS test.
     * 
     */
    public IosDeviceResponse getIosDevice() {
        return this.iosDevice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidDeviceResponse androidDevice;
        private IosDeviceResponse iosDevice;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDevice = defaults.androidDevice;
    	      this.iosDevice = defaults.iosDevice;
        }

        public Builder setAndroidDevice(AndroidDeviceResponse androidDevice) {
            this.androidDevice = Objects.requireNonNull(androidDevice);
            return this;
        }

        public Builder setIosDevice(IosDeviceResponse iosDevice) {
            this.iosDevice = Objects.requireNonNull(iosDevice);
            return this;
        }

        public EnvironmentResponse build() {
            return new EnvironmentResponse(androidDevice, iosDevice);
        }
    }
}
