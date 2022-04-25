// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.AndroidDeviceResponse;
import java.util.List;
import java.util.Objects;


/**
 * A list of Android device configurations in which the test is to be executed.
 * 
 */
public final class AndroidDeviceListResponse extends com.pulumi.resources.InvokeArgs {

    public static final AndroidDeviceListResponse Empty = new AndroidDeviceListResponse();

    /**
     * A list of Android devices.
     * 
     */
    @Import(name="androidDevices", required=true)
    private List<AndroidDeviceResponse> androidDevices;

    /**
     * @return A list of Android devices.
     * 
     */
    public List<AndroidDeviceResponse> androidDevices() {
        return this.androidDevices;
    }

    private AndroidDeviceListResponse() {}

    private AndroidDeviceListResponse(AndroidDeviceListResponse $) {
        this.androidDevices = $.androidDevices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidDeviceListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidDeviceListResponse $;

        public Builder() {
            $ = new AndroidDeviceListResponse();
        }

        public Builder(AndroidDeviceListResponse defaults) {
            $ = new AndroidDeviceListResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param androidDevices A list of Android devices.
         * 
         * @return builder
         * 
         */
        public Builder androidDevices(List<AndroidDeviceResponse> androidDevices) {
            $.androidDevices = androidDevices;
            return this;
        }

        /**
         * @param androidDevices A list of Android devices.
         * 
         * @return builder
         * 
         */
        public Builder androidDevices(AndroidDeviceResponse... androidDevices) {
            return androidDevices(List.of(androidDevices));
        }

        public AndroidDeviceListResponse build() {
            $.androidDevices = Objects.requireNonNull($.androidDevices, "expected parameter 'androidDevices' to be non-null");
            return $;
        }
    }

}
