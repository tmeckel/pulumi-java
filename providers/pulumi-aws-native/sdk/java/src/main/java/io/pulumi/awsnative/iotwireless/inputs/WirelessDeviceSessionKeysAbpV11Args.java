// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceSessionKeysAbpV11Args extends io.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceSessionKeysAbpV11Args Empty = new WirelessDeviceSessionKeysAbpV11Args();

    @InputImport(name="appSKey", required=true)
      private final Input<String> appSKey;

    public Input<String> getAppSKey() {
        return this.appSKey;
    }

    @InputImport(name="fNwkSIntKey", required=true)
      private final Input<String> fNwkSIntKey;

    public Input<String> getFNwkSIntKey() {
        return this.fNwkSIntKey;
    }

    @InputImport(name="nwkSEncKey", required=true)
      private final Input<String> nwkSEncKey;

    public Input<String> getNwkSEncKey() {
        return this.nwkSEncKey;
    }

    @InputImport(name="sNwkSIntKey", required=true)
      private final Input<String> sNwkSIntKey;

    public Input<String> getSNwkSIntKey() {
        return this.sNwkSIntKey;
    }

    public WirelessDeviceSessionKeysAbpV11Args(
        Input<String> appSKey,
        Input<String> fNwkSIntKey,
        Input<String> nwkSEncKey,
        Input<String> sNwkSIntKey) {
        this.appSKey = Objects.requireNonNull(appSKey, "expected parameter 'appSKey' to be non-null");
        this.fNwkSIntKey = Objects.requireNonNull(fNwkSIntKey, "expected parameter 'fNwkSIntKey' to be non-null");
        this.nwkSEncKey = Objects.requireNonNull(nwkSEncKey, "expected parameter 'nwkSEncKey' to be non-null");
        this.sNwkSIntKey = Objects.requireNonNull(sNwkSIntKey, "expected parameter 'sNwkSIntKey' to be non-null");
    }

    private WirelessDeviceSessionKeysAbpV11Args() {
        this.appSKey = Input.empty();
        this.fNwkSIntKey = Input.empty();
        this.nwkSEncKey = Input.empty();
        this.sNwkSIntKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceSessionKeysAbpV11Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appSKey;
        private Input<String> fNwkSIntKey;
        private Input<String> nwkSEncKey;
        private Input<String> sNwkSIntKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceSessionKeysAbpV11Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSKey = defaults.appSKey;
    	      this.fNwkSIntKey = defaults.fNwkSIntKey;
    	      this.nwkSEncKey = defaults.nwkSEncKey;
    	      this.sNwkSIntKey = defaults.sNwkSIntKey;
        }

        public Builder appSKey(Input<String> appSKey) {
            this.appSKey = Objects.requireNonNull(appSKey);
            return this;
        }

        public Builder appSKey(String appSKey) {
            this.appSKey = Input.of(Objects.requireNonNull(appSKey));
            return this;
        }

        public Builder fNwkSIntKey(Input<String> fNwkSIntKey) {
            this.fNwkSIntKey = Objects.requireNonNull(fNwkSIntKey);
            return this;
        }

        public Builder fNwkSIntKey(String fNwkSIntKey) {
            this.fNwkSIntKey = Input.of(Objects.requireNonNull(fNwkSIntKey));
            return this;
        }

        public Builder nwkSEncKey(Input<String> nwkSEncKey) {
            this.nwkSEncKey = Objects.requireNonNull(nwkSEncKey);
            return this;
        }

        public Builder nwkSEncKey(String nwkSEncKey) {
            this.nwkSEncKey = Input.of(Objects.requireNonNull(nwkSEncKey));
            return this;
        }

        public Builder sNwkSIntKey(Input<String> sNwkSIntKey) {
            this.sNwkSIntKey = Objects.requireNonNull(sNwkSIntKey);
            return this;
        }

        public Builder sNwkSIntKey(String sNwkSIntKey) {
            this.sNwkSIntKey = Input.of(Objects.requireNonNull(sNwkSIntKey));
            return this;
        }
        public WirelessDeviceSessionKeysAbpV11Args build() {
            return new WirelessDeviceSessionKeysAbpV11Args(appSKey, fNwkSIntKey, nwkSEncKey, sNwkSIntKey);
        }
    }
}
